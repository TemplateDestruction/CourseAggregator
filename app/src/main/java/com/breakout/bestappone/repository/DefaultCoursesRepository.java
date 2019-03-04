package com.breakout.bestappone.repository;

import android.support.annotation.NonNull;

import com.breakout.bestappone.api.ApiFactory;
import com.breakout.bestappone.content.rightModel.Example;
import com.breakout.bestappone.content.rightModel.Result;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class DefaultCoursesRepository implements CoursesRepository {

    private int pageNumber = 1;

    @NonNull
    @Override
    public Observable<List<Result>> getUdemyCourses() {
        System.out.println("getUdemyCourses: BEGIN DOWNLOADING");

        return ApiFactory.getEducationService()
                .getUdemyResponse(pageNumber++)
                .flatMap(new Function<Example, ObservableSource<List<Result>>>() {
                    @Override
                    public ObservableSource<List<Result>> apply(Example udemyResponse) {
                        return Observable.just(udemyResponse.getResults());
                    }
                })
                .retry(3)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

    }

    private Observable<List<Result>> allRequests(int pageNumber) {
        return Observable.range(1, 10)
                .flatMap(integer -> {
                    return makeRequest(integer);
                })
                .retry(3)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    private Observable<List<Result>> makeRequest(Integer integer) {
        return ApiFactory.getEducationService()
                .getUdemyResponse(integer)
                .flatMap(new Function<Example, ObservableSource<List<Result>>>() {
                    @Override
                    public ObservableSource<List<Result>> apply(Example udemyResponse) {
                        return Observable.just(udemyResponse.getResults());
                    }
                })
                ;
//               .flatMap(courses -> {
//                   Realm.getDefaultInstance().executeTransaction(realm -> {
//                       realm.clear(NewCourse.class);
//                       realm.copyToRealmOrUpdate(courses);
//                   });
//                   return Observable.just(courses);
//               })

//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(results -> coursesList.addAll(results), throwable -> throwable.fillInStackTrace());
    }

//    public List<UdemyCourse> callUdemy() {
//        EducationService educationService = ApiFactory.getEducationService();
//        educationService.callUdemyResp().enqueue(new Callback<UdemyResponse>() {
//            @Override
//            public void onResponse(@NonNull Call<UdemyResponse> call, @NonNull Response<UdemyResponse> response) {
//                assert response.body() != null;
//                System.out.println("dich " + response.body().toString());
//
//            }
//
//            @Override
//            public void onFailure(@NonNull Call<UdemyResponse> call, @NonNull Throwable t) {
//                t.fillInStackTrace();
//                System.out.println(t.getLocalizedMessage());
//            }
//        });
//        return null;
//    }


}
