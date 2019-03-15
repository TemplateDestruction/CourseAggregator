package com.breakout.bestappone.screen.details;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.breakout.bestappone.R;
import com.breakout.bestappone.model.udemy.courses.Result;
import com.breakout.bestappone.model.udemy.courses.VisibleInstructor;
import com.breakout.bestappone.model.udemy.reviews.Review;
import com.breakout.bestappone.screen.details.instructors.ClickListener;
import com.breakout.bestappone.screen.details.instructors.InstructorsAdapter;
import com.breakout.bestappone.screen.details.reviews.ReviewsAdapter;
import com.breakout.bestappone.screen.standard.LoadingDialog;
import com.breakout.bestappone.screen.standard.LoadingView;
import com.breakout.bestappone.utils.Images;
import com.breakout.bestappone.widget.EmptyRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.disposables.Disposable;


public class CourseDetailsActivity extends AppCompatActivity implements CourseDetailsView, LoadingView, ClickListener {

    //    @BindView(R.id.detail_image)

    CoursesDetailsPresenter presenter;

    @BindView(R.id.detail_image) ImageView courseView;
    @BindView(R.id.course_title) TextView courseTitle;
    @BindView(R.id.instructors_recycler) EmptyRecyclerView instructors;
    @BindView(R.id.reviews_recycler) EmptyRecyclerView reviews;

    LoadingView dialog;

    ReviewsAdapter reviewsAdapter;
    InstructorsAdapter instructorsAdapter;

    Result course;

    public static void start(@NonNull Activity activity, Result course) {
        Intent intent = new Intent(activity, CourseDetailsActivity.class);
        intent.putExtra("course", course);
        Log.d("Details", "start: Starting activity");
        activity.startActivity(intent);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_details_reviews);
        ButterKnife.bind(this);

        course = getIntent().getParcelableExtra("course");
        dialog = LoadingDialog.view(getSupportFragmentManager());

        LinearLayoutManager layoutManagerInstructor = new LinearLayoutManager(this);
        instructors.setLayoutManager(layoutManagerInstructor);

        LinearLayoutManager layoutManagerReview = new LinearLayoutManager(this);
        reviews.setLayoutManager(layoutManagerReview);

        reviewsAdapter = new ReviewsAdapter(new ArrayList<>());
        reviewsAdapter.attachToRecyclerView(reviews);

        instructorsAdapter = new InstructorsAdapter(course.getVisibleInstructors());
        instructorsAdapter.attachToRecyclerView(instructors);
        instructorsAdapter.setListener(this);

        instructors.configureRecycler(this);
        reviews.configureRecycler(this);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        presenter = new CoursesDetailsPresenter(this);
        presenter.show(course.getId());

    }



    private void showCourse(Result course) {
        courseTitle.setText(course.getTitle());
        Images.loadImageDetail(courseView, course);
        courseView.setClipToOutline(true);
    }


    public void onLinkGo(View view) {
        Intent linkGo = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.site_url) + course.getUrl()));
        startActivity(linkGo);
    }

    private void showReviews(List<Review> reviewList) {
        reviewsAdapter.changeDataSet(reviewList);
    }

    @Override
    public void showCourseDetails(List<Review> reviews) {
        showCourse(course);
        showReviews(reviews);
    }


    @Override
    public void showLoadingIndicator(Disposable disposable) {
        dialog.showLoadingIndicator(disposable);
    }

    @Override
    public void hideLoadingIndicator() {
        dialog.hideLoadingIndicator();
    }

    @Override
    public void goToProfile(VisibleInstructor item) {
        Intent profile = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.site_url) + item.getUrl()));
        startActivity(profile);
    }

    @Override
    public void showError(Throwable throwable) {
        Toast.makeText(this, "ERROR LOADING", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onPositionClicked(int position) {
        presenter.onItemClick(course.getVisibleInstructors().get(position));
    }

}
