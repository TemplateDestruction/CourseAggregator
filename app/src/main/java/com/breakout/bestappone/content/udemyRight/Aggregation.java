
package com.breakout.bestappone.content.udemyRight;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Aggregation implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("options")
    @Expose
    private List<Option> options = null;
    public final static Creator<Aggregation> CREATOR = new Creator<Aggregation>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Aggregation createFromParcel(Parcel in) {
            return new Aggregation(in);
        }

        public Aggregation[] newArray(int size) {
            return (new Aggregation[size]);
        }

    }
    ;

    protected Aggregation(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.options, (Option.class.getClassLoader()));
    }

    public Aggregation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(title);
        dest.writeList(options);
    }

    public int describeContents() {
        return  0;
    }

}
