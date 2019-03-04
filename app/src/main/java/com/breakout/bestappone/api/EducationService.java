package com.breakout.bestappone.api;


import com.breakout.bestappone.content.rightModel.Example;
import com.breakout.bestappone.content.udacityNew.NewExample;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EducationService {



    // udacity request
    // https://www.udacity.com/public-api/v0/courses
    //
//    @GET("/courses")
    @GET("catalog?locale=en-us")
    Observable<NewExample> getCourses();
    // another udacity - https://catalog-api.udacity.com/v1/catalog?locale=en-us


    @GET("https://api.edx.org/catalog/v1/catalogs/")
    Observable<Object> getEdXCourses();

    //endpoint = https://www.udemy.com/api-2.0/
    @GET("courses/?page_size=20")
    Observable<Example> getUdemyResponse(@Query("page") int pageNumber);

//    @GET("courses/")
//    Call<UdemyResponse> callUdemyResp();



    // khan academy
    // TODO: 17.02.2019 не ясно как разделить json
//    @GET("http://www.khanacademy.org/api/v1/topictree")
//    Observable

    // TODO: 17.02.2019 посмотреть сайты агрегаторы и оттуда поискать платформы с открытым api

    // TODO: 24.02.2019 найти api с маленькими картинками и посмореть те, которые мне дали
    // попробовать udacityNew


}
