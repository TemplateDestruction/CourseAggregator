package com.breakout.bestappone.screen.courses;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.breakout.bestappone.R;
import com.breakout.bestappone.content.udemy.courses.Result;
import com.breakout.bestappone.screen.details.CourseDetailsActivity;
import com.breakout.bestappone.screen.standard.LoadingDialog;
import com.breakout.bestappone.screen.standard.LoadingView;
import com.breakout.bestappone.widget.BaseAdapter;
import com.breakout.bestappone.widget.DividerItemDecoration;
import com.breakout.bestappone.widget.EmptyRecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.Disposable;

public class CoursesActivity extends AppCompatActivity implements CoursesView, BaseAdapter.OnItemClickListener<Result> {

    private LoadingView mLoadingView;

    private CoursesAdapter mAdapter;

    private CoursesPresenter mPresenter;

    private List<Result> coursesList = new ArrayList<>();

    private boolean isLoading = false;

    //    @BindView(R.id.empty)
//    View mEmptyView;
//
//    @BindView(R.id.recyclerView)
//    EmptyRecyclerView mRecyclerView;
    EmptyRecyclerView mRecyclerView;
    View mEmptyView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_activity);
        getResources().getDrawable(R.drawable.default_png);

        mRecyclerView = findViewById(R.id.recyclerView);
        mEmptyView = findViewById(R.id.empty);

        mLoadingView = LoadingDialog.view(getSupportFragmentManager());



        int columnsCount = getResources().getInteger(R.integer.columns_count);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), columnsCount);
        mRecyclerView.setLayoutManager(layoutManager);

        RecyclerView.OnScrollListener scrollListener = new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int visibleItemCount = layoutManager.getChildCount();//смотрим сколько элементов на экране
                int totalItemCount = layoutManager.getItemCount();//сколько всего элементов
                int firstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();//какая позиция первого элемента

                if (!isLoading) {//проверяем, грузим мы что-то или нет, эта переменная должна быть вне класса  OnScrollListener
                    if ((visibleItemCount+firstVisibleItemPosition) >= totalItemCount) {
                        isLoading = true;//ставим флаг что мы попросили еще элемены
                        mPresenter.show();//тут я использовал калбэк который просто говорит наружу что нужно еще элементов и с какой позиции начинать загрузку
                    }
                    isLoading = false;
                }
            }
        };
        mRecyclerView.setOnScrollListener(scrollListener);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this));
        mRecyclerView.setEmptyView(mEmptyView);


        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemViewCacheSize(20);
        mRecyclerView.setDrawingCacheEnabled(true);
        mRecyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        mAdapter = new CoursesAdapter(new ArrayList<>());
        mAdapter.attachToRecyclerView(mRecyclerView);
        mAdapter.setOnItemClickListener(this);



        mPresenter = new CoursesPresenter(this);
        mPresenter.show();
//        mPresenter.show();
//        List<NewCourse> courses = new ArrayList<>();
//        courses.add(new NewCourse("Dich", "DichProject"));
//        courses.add(new NewCourse("Mitch", "MitchProject"));
//        courses.add(new NewCourse("Vich", "VichProject"));
//        courses.add(new NewCourse("Ache", "AcheProject"));
//        courses.add(new NewCourse("Tache", "TacheProject"));
//        courses.add(new NewCourse("Page", "PageProject"));
//        courses.add(new NewCourse("Gage", "GageProject"));
//        courses.add(new NewCourse("Make", "MakeProject"));

    }

    @Override
    public void showCourses(List<Result> courses) {
        System.out.println("WTF WHAT IS");
        coursesList.addAll(courses);
        mAdapter.changeDataSet(coursesList);
    }

    @Override
    public void showDescription() {

    }

    @Override
    public void showError(Throwable throwable) {
        Log.d("CoursesAct", "showError: ERROR LOADING COURSES");
        throwable.fillInStackTrace();
        System.out.println(throwable.getLocalizedMessage());
        System.out.println(throwable.getMessage());
        mAdapter.clear();
    }

    @Override
    public void showLoadingIndicator(Disposable disposable) {
        //make some
        mLoadingView.showLoadingIndicator(disposable);
    }

    @Override
    public void hideLoadingIndicator() {
        mLoadingView.hideLoadingIndicator();
    }

    @Override
    public void onItemClick(@NonNull Result item, View view) {
        mPresenter.onItemClick(item);
    }

    @Override
    public void showDetails(Result course) {
        CourseDetailsActivity.start(this, course);
    }

    @Override
    public void fillCoursesList(List<Result> results) {
        coursesList.addAll(results);
        System.out.println("coursesList size: " + coursesList.size());
    }
}
