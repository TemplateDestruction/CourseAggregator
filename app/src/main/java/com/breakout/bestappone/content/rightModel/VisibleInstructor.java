
package com.breakout.bestappone.content.rightModel;

import android.os.Parcel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VisibleInstructor
{

    @SerializedName("_class")
    @Expose
    private String _class;
    @SerializedName("image_100x100")
    @Expose
    private String image100x100;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("job_title")
    @Expose
    private String jobTitle;
    @SerializedName("initials")
    @Expose
    private String initials;
    @SerializedName("image_50x50")
    @Expose
    private String image50x50;


    protected VisibleInstructor(Parcel in) {
    }



    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public String getImage100x100() {
        return image100x100;
    }

    public void setImage100x100(String image100x100) {
        this.image100x100 = image100x100;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getImage50x50() {
        return image50x50;
    }

    public void setImage50x50(String image50x50) {
        this.image50x50 = image50x50;
    }


}
