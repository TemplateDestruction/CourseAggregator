package com.breakout.bestappone.utils;

import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.breakout.bestappone.model.udemy.courses.Result;
import com.breakout.bestappone.model.udemy.courses.VisibleInstructor;
import com.squareup.picasso.Picasso;

public final class Images {

    private Images() {

    }


    public static void loadImageDetail(@NonNull ImageView imageView, Result course) {
        if (course.getImage480x270().length() > 0) {
            loadImage(imageView, course.getImage480x270());
        }

    }

    public static void loadImgInstructor(@NonNull ImageView imageViewm, VisibleInstructor instructor) {
        if (instructor.getImage100x100().length() > 0) {
            loadImage(imageViewm, instructor.getImage100x100());
        }
    }


    public static void loadImage(@NonNull ImageView imageView, Result course) {
        if (course.getImage125H().length() > 0) {
            loadImage(imageView, course.getImage125H());
        }
    }

    private static void loadImage(@NonNull ImageView imageView, @NonNull String posterPath) {
            String url = "" + posterPath;
        Picasso.get()
                .load(url)
                .fit()
                .into(imageView);
    }

}
