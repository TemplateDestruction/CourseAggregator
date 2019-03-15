package com.breakout.bestappone.screen.courses;

import com.breakout.bestappone.model.udemy.courses.Result;
import com.breakout.bestappone.repository.RepositoryProvider;

import io.reactivex.disposables.Disposable;

class CoursesPresenter {

    private CoursesView view;


    CoursesPresenter(CoursesView coursesActivity) {
        view = coursesActivity;
    }

    void show() {
            Disposable disposable = RepositoryProvider.getCoursesRepository()
                    .getUdemyCourses()
                    .doOnSubscribe(view::showLoadingIndicator)
                    .doAfterTerminate(view::hideLoadingIndicator)
                    .subscribe(view::showCourses, view::showError);
    }



    void onItemClick(Result item) {
        view.showDetails(item);
    }

}
