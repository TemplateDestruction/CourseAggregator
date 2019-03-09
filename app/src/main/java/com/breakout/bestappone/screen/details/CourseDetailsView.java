package com.breakout.bestappone.screen.details;

import com.breakout.bestappone.content.udemy.courses.VisibleInstructor;
import com.breakout.bestappone.content.udemy.reviews.Review;

import java.util.List;

import io.reactivex.disposables.Disposable;

public interface CourseDetailsView {


    void showCourseDetails(List<Review> reviews);

    void showError(Throwable throwable);

    void showLoadingIndicator(Disposable disposable);

    void hideLoadingIndicator();

    void goToProfile(VisibleInstructor item);

}
