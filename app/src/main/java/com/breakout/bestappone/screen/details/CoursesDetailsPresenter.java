package com.breakout.bestappone.screen.details;

import com.breakout.bestappone.model.udemy.courses.VisibleInstructor;
import com.breakout.bestappone.repository.RepositoryProvider;

import io.reactivex.disposables.Disposable;

class CoursesDetailsPresenter {

    private CourseDetailsView view;


    CoursesDetailsPresenter(CourseDetailsView coursesActivity) {
        view = coursesActivity;
    }

    void show(Integer courseId) {
            Disposable disposable = RepositoryProvider.getCoursesRepository()
                    .getUdemyReviews(courseId)
                    .doOnSubscribe(view::showLoadingIndicator)
                    .doAfterTerminate(view::hideLoadingIndicator)
                    .subscribe(view::showCourseDetails, view::showError);
    }

    void onItemClick(VisibleInstructor item) {
        view.goToProfile(item);
    }

}
