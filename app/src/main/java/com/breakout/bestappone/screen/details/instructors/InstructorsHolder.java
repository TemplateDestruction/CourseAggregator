package com.breakout.bestappone.screen.details.instructors;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.breakout.bestappone.R;
import com.breakout.bestappone.model.udemy.courses.VisibleInstructor;
import com.breakout.bestappone.utils.Images;

import java.lang.ref.WeakReference;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InstructorsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    @BindView(R.id.instructor_name) protected TextView instructorName;
    @BindView(R.id.instructor_prof) protected TextView instructorProf;
    @BindView(R.id.instructor_profile) protected Button instructorProfileBtn;
    @BindView(R.id.instructor_img) protected ImageView instructorImg;

    private WeakReference<ClickListener> listenerRef;

    InstructorsHolder(@NonNull View itemView, ClickListener listener) {
        super(itemView);
        listenerRef = new WeakReference<>(listener);
        ButterKnife.bind(this, itemView);
        instructorProfileBtn.setOnClickListener(this);
    }

    void bind(VisibleInstructor instructor) {
        instructorName.setText(instructor.getTitle());
        instructorProf.setText(instructor.getJobTitle());
        Images.loadImgInstructor(instructorImg, instructor);
        instructorImg.setClipToOutline(true);
    }

    @Override
    public void onClick(View v) {
        listenerRef.get().onPositionClicked(getAdapterPosition());
    }
}
