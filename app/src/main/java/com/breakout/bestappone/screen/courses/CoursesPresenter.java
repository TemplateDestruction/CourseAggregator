package com.breakout.bestappone.screen.courses;

import com.breakout.bestappone.content.udemy.courses.Result;
import com.breakout.bestappone.repository.RepositoryProvider;

import io.reactivex.disposables.Disposable;

class CoursesPresenter {

    private CoursesView view;


    CoursesPresenter(CoursesView coursesActivity) {
        view = coursesActivity;
    }

    void show() {
//        RepositoryProvider.getCoursesRepository().callUdemy();


            Disposable disposable = RepositoryProvider.getCoursesRepository()
                    .getUdemyCourses()
                    .doOnSubscribe(view::showLoadingIndicator)
                    .doAfterTerminate(view::hideLoadingIndicator)
//                .flatMap(new Function<List<NewCourse>, Observable<List<NewCourse>>>() {
//                    @Override
//                    public Observable<List<NewCourse>> apply(List<NewCourse> courses) throws Exception {
//                        List<NewCourse> coursesList = new ArrayList<>();
//                        courses.add(new NewCourse("Dich", "DichProject"));
//                        courses.add(new NewCourse("Mitch", "MitchProject"));
//                        courses.add(new NewCourse("Vich", "VichProject"));
//                        courses.add(new NewCourse("Ache", "AcheProject"));
//                        courses.add(new NewCourse("Tache", "TacheProject"));
//                        courses.add(new NewCourse("Page", "PageProject"));
//                        courses.add(new NewCourse("Gage", "GageProject"));
//                        courses.add(new NewCourse("Make", "MakeProject"));
//                        return Observable.just(coursesList);
//                    }
//                })
                    .subscribe(view::showCourses, view::showError);
    }



    void onItemClick(Result item) {
        view.showDetails(item);
    }

//    public void show() {
//        view.showCourses();
//    }
}
