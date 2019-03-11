package com.breakout.bestappone.screen.courses;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.breakout.bestappone.R;
import com.breakout.bestappone.model.udemy.courses.Result;
import com.breakout.bestappone.utils.Images;

class CoursesHolder extends RecyclerView.ViewHolder {


    private TextView titleText;
    private ImageView courseImage;

    CoursesHolder(@NonNull View itemView) {
        super(itemView);
        titleText = itemView.findViewById(R.id.titleView);
        courseImage = itemView.findViewById(R.id.course_image);
    }

    void bind(Result course) {
        titleText.setText(course.getTitle());
        Images.loadImage(courseImage, course);
        courseImage.setClipToOutline(true);

//        text1.setText(course.getBannerImage());
//        text2.setText(course.getExpectedDurationUnit());
//        text3.setText(course.getExpectedLearning());
//        text4.setText(course.getFaq());
//        text5.setText(course.getHomepage());
//        text6.setText(course.getImage());
//        text7.setText(course.getKey());
//        text8.setText(course.getLevel());
//        text9.setText(course.getProjectDescription());
    }
}
