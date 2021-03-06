package com.breakout.bestappone.screen.courses;


import com.breakout.bestappone.model.udemy.courses.Result;
import com.breakout.bestappone.screen.standard.LoadingView;

import java.util.List;

public interface CoursesView extends LoadingView {
    void showCourses(List<Result> courses);

    void showError(Throwable throwable);

    void showDetails(Result item);

    void fillCoursesList(List<Result> results);

}
