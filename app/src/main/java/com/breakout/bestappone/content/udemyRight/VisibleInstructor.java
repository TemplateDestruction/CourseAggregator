
package com.breakout.bestappone.content.udemyRight;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VisibleInstructor implements Parcelable
{

    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("image_50x50")
    @Expose
    private String image50x50;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("_class")
    @Expose
    private String _class;
    @SerializedName("initials")
    @Expose
    private String initials;
    @SerializedName("job_title")
    @Expose
    private String jobTitle;
    @SerializedName("image_100x100")
    @Expose
    private String image100x100;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    public final static Creator<VisibleInstructor> CREATOR = new Creator<VisibleInstructor>() {


        @SuppressWarnings({
            "unchecked"
        })
        public VisibleInstructor createFromParcel(Parcel in) {
            return new VisibleInstructor(in);
        }

        public VisibleInstructor[] newArray(int size) {
            return (new VisibleInstructor[size]);
        }

    }
    ;

    protected VisibleInstructor(Parcel in) {
        this.displayName = ((String) in.readValue((String.class.getClassLoader())));
        this.image50x50 = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this._class = ((String) in.readValue((String.class.getClassLoader())));
        this.initials = ((String) in.readValue((String.class.getClassLoader())));
        this.jobTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.image100x100 = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    public VisibleInstructor() {
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getImage50x50() {
        return image50x50;
    }

    public void setImage50x50(String image50x50) {
        this.image50x50 = image50x50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(displayName);
        dest.writeValue(image50x50);
        dest.writeValue(name);
        dest.writeValue(_class);
        dest.writeValue(initials);
        dest.writeValue(jobTitle);
        dest.writeValue(image100x100);
        dest.writeValue(title);
        dest.writeValue(url);
    }

    public int describeContents() {
        return  0;
    }

}
