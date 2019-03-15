package com.breakout.bestappone.repository;

import android.support.annotation.NonNull;

import com.breakout.bestappone.api.ApiFactory;
import com.breakout.bestappone.model.udemy.courses.Result;
import com.breakout.bestappone.model.udemy.reviews.Review;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class DefaultCoursesRepository implements CoursesRepository {

    private int pageNumber = 1;

    @NonNull
    @Override
    public Observable<List<Result>> getUdemyCourses() {
        System.out.println("getUdemyCourses: BEGIN DOWNLOADING");

        return ApiFactory.getEducationService()
                .getUdemyResponse(pageNumber++)
                .flatMap(udemyResponse -> Observable.just(udemyResponse.getResults()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

    }

    @NonNull
    @Override
    public Observable<List<Review>> getUdemyReviews(Integer courseId) {
        return ApiFactory.getEducationService()
                .getUdemyReviews(courseId)
                .flatMap(reviewsResponse -> Observable.just(reviewsResponse.getReviews()))
                .onErrorResumeNext(throwable -> {
                    System.out.println("ERROR REVIEWS: " + throwable.getLocalizedMessage());
                    return null;
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }




}
