package com.breakout.bestappone.screen.courses;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.breakout.bestappone.R;
import com.breakout.bestappone.model.udemy.courses.Result;
import com.breakout.bestappone.utils.Images;

import butterknife.BindView;
import butterknife.ButterKnife;

class CoursesHolder extends RecyclerView.ViewHolder {


    @BindView(R.id.titleView) protected TextView titleText;
    @BindView(R.id.course_image) protected ImageView courseImage;

    CoursesHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    void bind(Result course) {
        titleText.setText(course.getTitle());
        Images.loadImage(courseImage, course);
        courseImage.setClipToOutline(true);


    }
}
