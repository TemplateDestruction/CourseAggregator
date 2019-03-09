package com.breakout.bestappone.utils;

import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.breakout.bestappone.content.udemy.courses.Result;
import com.breakout.bestappone.content.udemy.courses.VisibleInstructor;
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
//        System.out.println("getDrawable: " + imageView.getDrawable());
//        System.out.println("ContextGetDrawable: " + imageView.getContext().getDrawable(R.drawable.default_png));
//        if (imageView.getDrawable() == imageView.getContext().getDrawable(R.drawable.default_png)) {
            String url = "" + posterPath;
        Picasso.get()
                .load(url)
//                .resize(imageView.getWidth(), imageView.getHeight())
//                    .resize(96, 96)
                .fit()
//                .centerCrop()
//                .centerInside()
                .into(imageView);

//        }


//        recyclerView.setHasFixedSize(true);
//recyclerView.setItemViewCacheSize(20);
//recyclerView.setDrawingCacheEnabled(true);
//recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

    }

}
