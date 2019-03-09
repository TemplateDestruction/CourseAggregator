package com.breakout.bestappone.screen.details;

import com.breakout.bestappone.content.udemy.courses.VisibleInstructor;
import com.breakout.bestappone.repository.RepositoryProvider;

import io.reactivex.disposables.Disposable;

class CoursesDetailsPresenter {

    private CourseDetailsView view;


    CoursesDetailsPresenter(CourseDetailsView coursesActivity) {
        view = coursesActivity;
    }

    void show(Integer courseId) {
//        RepositoryProvider.getCoursesRepository().callUdemy();


            Disposable disposable = RepositoryProvider.getCoursesRepository()
                    .getUdemyReviews(courseId)
                    .doOnSubscribe(view::showLoadingIndicator)
                    .doAfterTerminate(view::hideLoadingIndicator)
//                .flatMap(new Function<List<NewCourse>, Observable<List<NewCourse>>>() {
//                    @Override
//                    public Observable<List<NewCourse>> apply(List<NewCourse> courses) throws Exception {
//
//                        return Observable.just(coursesList);
//                    }
//                })
                    .subscribe(view::showCourseDetails, view::showError);
    }

    void onItemClick(VisibleInstructor item) {
        view.goToProfile(item);
    }





//    public void show() {
//        view.showCourses();
//    }
}
