package com.breakout.bestappone.screen.details.instructors;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.breakout.bestappone.R;
import com.breakout.bestappone.model.udemy.courses.VisibleInstructor;
import com.breakout.bestappone.widget.BaseAdapter;

import java.util.List;

public class InstructorsAdapter extends BaseAdapter<InstructorsHolder, VisibleInstructor>  {

    private ClickListener listener;

    public void setListener(ClickListener listener) {
        this.listener = listener;
    }


    public InstructorsAdapter(@NonNull List<VisibleInstructor> visibleInstructors) {
        super(visibleInstructors);
    }

    @NonNull
    @Override
    public InstructorsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new InstructorsHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.instructor_layout, viewGroup, false), listener);
    }

    @Override
    public void onBindViewHolder(@NonNull InstructorsHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        VisibleInstructor instructor = getItem(position);
        holder.bind(instructor);

    }

    public interface OnItemClickListener{
        void onItemClick(int position, View view);
    }
}
