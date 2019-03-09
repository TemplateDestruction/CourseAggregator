package com.breakout.bestappone.screen.details.instructors;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.breakout.bestappone.R;
import com.breakout.bestappone.content.udemy.courses.VisibleInstructor;
import com.breakout.bestappone.utils.Images;

import java.lang.ref.WeakReference;

public class InstructorsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    private TextView instructorName;
    private TextView instructorProf;
    private Button instructorProfileBtn;
    private ImageView instructorImg;

    private WeakReference<ClickListener> listenerRef;

    InstructorsHolder(@NonNull View itemView, ClickListener listener) {
        super(itemView);

        listenerRef = new WeakReference<>(listener);
        instructorName = itemView.findViewById(R.id.instructor_name);
        instructorProf = itemView.findViewById(R.id.instructor_prof);
        instructorProfileBtn = itemView.findViewById(R.id.instructor_profile);
        instructorImg = itemView.findViewById(R.id.instructor_img);

        instructorProfileBtn.setOnClickListener(this    );

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
