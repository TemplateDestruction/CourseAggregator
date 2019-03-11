package com.breakout.bestappone.screen.details.reviews;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.breakout.bestappone.R;
import com.breakout.bestappone.model.udemy.reviews.Review;
import com.breakout.bestappone.widget.BaseAdapter;

import java.util.List;

public class ReviewsAdapter extends BaseAdapter<ReviewsHolder, Review> {
    public ReviewsAdapter(@NonNull List<Review> reviews) {
        super(reviews);
    }

    @NonNull
    @Override
    public ReviewsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ReviewsHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.review_layout, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewsHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        Review review = getItem(position);
        holder.bind(review);

    }
}
