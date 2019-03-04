
package com.breakout.bestappone.content.udacityNew;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewExample {

    @SerializedName("cours")
    @Expose
    private List<NewCourse> cours = null;

    public List<NewCourse> getCourses() {
        return cours;
    }

    public void setCours(List<NewCourse> cours) {
        this.cours = cours;
    }

}
