package com.breakout.bestappone.screen.details.reviews;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.breakout.bestappone.R;
import com.breakout.bestappone.content.udemy.reviews.Review;

class ReviewsHolder extends RecyclerView.ViewHolder {


    private TextView reviewUser;
    private RatingBar ratingBar;
    private TextView reviewContent;



    ReviewsHolder(@NonNull View itemView) {
        super(itemView);
        reviewUser = itemView.findViewById(R.id.review_user);
        ratingBar = itemView.findViewById(R.id.ratingBar);
        reviewContent = itemView.findViewById(R.id.review_content);

    }

    void bind(Review review) {
        reviewUser.setText(review.getUser().getDisplayName());
        ratingBar.setRating((float) review.getRating());
        if (review.getContent() != null) {
            reviewContent.setText(review.getContent());
        }
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
