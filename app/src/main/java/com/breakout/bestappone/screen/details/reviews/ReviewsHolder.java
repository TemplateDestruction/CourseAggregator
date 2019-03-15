package com.breakout.bestappone.screen.details.reviews;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.breakout.bestappone.R;
import com.breakout.bestappone.model.udemy.reviews.Review;

import butterknife.BindView;
import butterknife.ButterKnife;

class ReviewsHolder extends RecyclerView.ViewHolder {


    @BindView(R.id.review_user) protected TextView reviewUser;
    @BindView(R.id.ratingBar) protected RatingBar ratingBar;
    @BindView(R.id.review_content) protected TextView reviewContent;

    ReviewsHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    void bind(Review review) {
        reviewUser.setText(review.getUser().getDisplayName());
        ratingBar.setRating((float) review.getRating());
        if (review.getContent() != null) {
            reviewContent.setText(review.getContent());
        }
    }
}
