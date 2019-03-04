package com.breakout.bestappone.screen.details;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.breakout.bestappone.R;
import com.breakout.bestappone.content.rightModel.Result;
import com.breakout.bestappone.utils.Images;

public class CourseDetailsActivity extends AppCompatActivity {

    ImageView courseView;
    TextView courseTitle;
    TextView summary;
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
        setContentView(R.layout.course_details);

        courseView = findViewById(R.id.detail_image);
        courseTitle = findViewById(R.id.course_title);
        summary = findViewById(R.id.course_summary);

//        course = getIntent().getParcelableExtra("course");
        course = getIntent().getParcelableExtra("course");
        showCourse(course);

    }

    private void showCourse(Result course) {
        courseTitle.setText(course.getTitle());
        summary.setText(course.getPublishedTitle());
        Images.loadImageDetail(courseView, course);
        courseView.setClipToOutline(true);
        System.out.println("COURSE ID: " + course.getId());
    }


    public void onLinkGo(View view) {
        Intent linkGo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com" + course.getUrl()));
        startActivity(linkGo);
    }
}
