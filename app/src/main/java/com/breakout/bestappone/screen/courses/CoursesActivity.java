package com.breakout.bestappone.screen.courses;


import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.breakout.bestappone.R;
import com.breakout.bestappone.model.udemy.courses.Result;
import com.breakout.bestappone.screen.details.CourseDetailsActivity;
import com.breakout.bestappone.screen.standard.LoadingDialog;
import com.breakout.bestappone.screen.standard.LoadingView;
import com.breakout.bestappone.widget.BaseAdapter;
import com.breakout.bestappone.widget.DividerItemDecoration;
import com.breakout.bestappone.widget.EmptyRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.disposables.Disposable;

public class CoursesActivity extends AppCompatActivity implements CoursesView, BaseAdapter.OnItemClickListener<Result> {

    private LoadingView mLoadingView;

    private CoursesAdapter mAdapter;

    private CoursesPresenter mPresenter;

    private List<Result> coursesList = new ArrayList<>();

    private boolean isLoading = false;

    @BindView(R.id.recyclerView) EmptyRecyclerView mRecyclerView;
    @Nullable
    @BindView(R.id.empty)
    View mEmptyView;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_activity);
        ButterKnife.bind(this);

        mLoadingView = LoadingDialog.view(getSupportFragmentManager());

        int columnsCount = getResources().getInteger(R.integer.columns_count);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), columnsCount);
        mRecyclerView.setLayoutManager(layoutManager);

        RecyclerView.OnScrollListener scrollListener = new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int visibleItemCount = layoutManager.getChildCount();
                int totalItemCount = layoutManager.getItemCount();
                int firstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();

                if (!isLoading) {
                    if ((visibleItemCount+firstVisibleItemPosition) >= totalItemCount) {
                        isLoading = true;
                        mPresenter.show();
                    }
                    isLoading = false;
                }
            }
        };
        mRecyclerView.setOnScrollListener(scrollListener);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this));
        mRecyclerView.setEmptyView(mEmptyView);
        mRecyclerView.configureRecycler(this);

        mAdapter = new CoursesAdapter(new ArrayList<>());
        mAdapter.attachToRecyclerView(mRecyclerView);
        mAdapter.setOnItemClickListener(this);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mPresenter = new CoursesPresenter(this);
        mPresenter.show();
    }

    @Override
    public void showCourses(List<Result> courses) {
        coursesList.addAll(courses);
        mAdapter.changeDataSet(coursesList);
    }


    @Override
    public void showError(Throwable throwable) {
        Log.d("CoursesAct", "showError: ERROR LOADING COURSES");
        throwable.fillInStackTrace();
        Toast.makeText(this, "ERROR LOADING", Toast.LENGTH_SHORT).show();
        mAdapter.clear();
        mRecyclerView.setEmptyView(mEmptyView);
    }

    @Override
    public void showLoadingIndicator(Disposable disposable) {
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
    }
}
