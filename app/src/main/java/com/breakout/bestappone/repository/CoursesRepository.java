package com.breakout.bestappone.repository;

import android.support.annotation.NonNull;

import com.breakout.bestappone.content.udemy.courses.Result;
import com.breakout.bestappone.content.udemy.reviews.Review;

import java.util.List;

import io.reactivex.Observable;


public interface CoursesRepository {

    @NonNull
    Observable<List<Result>> getUdemyCourses();

    @NonNull
    Observable<List<Review>> getUdemyReviews(Integer courseId);
//    @NonNull
//    Observable<>

//    List<UdemyCourse> callUdemy();

}
