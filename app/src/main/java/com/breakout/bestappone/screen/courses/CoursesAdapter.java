package com.breakout.bestappone.screen.courses;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.breakout.bestappone.R;
import com.breakout.bestappone.content.udemy.courses.Result;
import com.breakout.bestappone.widget.BaseAdapter;

import java.util.List;

public class CoursesAdapter extends BaseAdapter<CoursesHolder, Result> {
    CoursesAdapter(@NonNull List<Result> courses) {
        super(courses);
    }

    @NonNull
    @Override
    public CoursesHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CoursesHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.course_layout, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CoursesHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        Result course = getItem(position);
        holder.bind(course);

    }
}
