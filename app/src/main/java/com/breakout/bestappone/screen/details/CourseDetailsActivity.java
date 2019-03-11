package com.breakout.bestappone.screen.details;

import android.app.Activity;
import android.content.Intent;
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
import com.breakout.bestappone.widget.DividerItemDecoration;
import com.breakout.bestappone.widget.EmptyRecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.Disposable;


public class CourseDetailsActivity extends AppCompatActivity implements CourseDetailsView, LoadingView, ClickListener {

    //    @BindView(R.id.detail_image)

    CoursesDetailsPresenter presenter;

    ImageView courseView;
    TextView courseTitle;
    EmptyRecyclerView instructors;
    EmptyRecyclerView reviews;

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

        course = getIntent().getParcelableExtra("course");

        courseView = findViewById(R.id.detail_image);
        courseTitle = findViewById(R.id.course_title);

        dialog = LoadingDialog.view(getSupportFragmentManager());

        instructors = findViewById(R.id.instructors_recycler);
        reviews = findViewById(R.id.reviews_recycler);
        LinearLayoutManager layoutManagerInstructor = new LinearLayoutManager(this);

        instructors.setLayoutManager(layoutManagerInstructor);
        LinearLayoutManager layoutManagerReview = new LinearLayoutManager(this);

        reviews.setLayoutManager(layoutManagerReview);
        reviewsAdapter = new ReviewsAdapter(new ArrayList<>());
        reviewsAdapter.attachToRecyclerView(reviews);

        instructorsAdapter = new InstructorsAdapter(course.getVisibleInstructors());
        instructorsAdapter.attachToRecyclerView(instructors);
        instructorsAdapter.setListener(this);

        instructors.addItemDecoration(new DividerItemDecoration(this));
        instructors.setHasFixedSize(true);
        instructors.setItemViewCacheSize(20);
        instructors.setDrawingCacheEnabled(true);
        instructors.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        reviews.addItemDecoration(new DividerItemDecoration(this));
        reviews.setHasFixedSize(true);
        reviews.setItemViewCacheSize(20);
        reviews.setDrawingCacheEnabled(true);
        reviews.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);


//        course = getIntent().getParcelableExtra("course");

        presenter = new CoursesDetailsPresenter(this);
        presenter.show(course.getId());
//        showCourse(course);

    }

    private void showCourse(Result course) {
        courseTitle.setText(course.getTitle());
        Images.loadImageDetail(courseView, course);
        courseView.setClipToOutline(true);



//        reviews.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, course.get));
        System.out.println("COURSE ID: " + course.getId());
    }


    public void onLinkGo(View view) {
        Intent linkGo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com" + course.getUrl()));
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
        Intent profile = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com" + item.getUrl()));
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
