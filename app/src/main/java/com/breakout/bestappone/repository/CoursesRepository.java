package com.breakout.bestappone.repository;

import android.support.annotation.NonNull;

import com.breakout.bestappone.content.rightModel.Result;

import java.util.List;

import io.reactivex.Observable;


public interface CoursesRepository {

    @NonNull
    Observable<List<Result>> getUdemyCourses();

//    @NonNull
//    Observable<>

//    List<UdemyCourse> callUdemy();

}
