package com.breakout.bestappone.api;


import com.breakout.bestappone.model.udemy.courses.Example;
import com.breakout.bestappone.model.udemy.reviews.ReviewsResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EducationService {

    //endpoint = https://www.udemy.com/api-2.0/
    @GET("courses/?page_size=20")
    Observable<Example> getUdemyResponse(@Query("page") int pageNumber);

    @GET("courses/{course_id}/reviews/")
    Observable<ReviewsResponse> getUdemyReviews(@Path("course_id") Integer courseId);





}
