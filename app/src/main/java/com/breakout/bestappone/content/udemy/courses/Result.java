
package com.breakout.bestappone.content.udemy.courses;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Result implements Parcelable
{

    @SerializedName("_class")
    @Expose
    private String _class;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("is_paid")
    @Expose
    private Boolean isPaid;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("price_detail")
    @Expose
    private PriceDetail priceDetail;
    @SerializedName("visible_instructors")
    @Expose
    private List<VisibleInstructor> visibleInstructors = new ArrayList<>();
    @SerializedName("image_125_H")
    @Expose
    private String image125H;
    @SerializedName("image_240x135")
    @Expose
    private String image240x135;
    @SerializedName("is_practice_test_course")
    @Expose
    private Boolean isPracticeTestCourse;
    @SerializedName("image_480x270")
    @Expose
    private String image480x270;
    @SerializedName("published_title")
    @Expose
    private String publishedTitle;
    @SerializedName("predictive_score")
    @Expose
    private Object predictiveScore;
    @SerializedName("relevancy_score")
    @Expose
    private Double relevancyScore;
    @SerializedName("input_features")
    @Expose
    private Object inputFeatures;
    @SerializedName("lecture_search_result")
    @Expose
    private Object lectureSearchResult;
    @SerializedName("curriculum_lectures")
    @Expose
    private List<Object> curriculumLectures = null;
    @SerializedName("order_in_results")
    @Expose
    private Object orderInResults;
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;

    protected Result(Parcel in) {
        id = in.readInt();
        title = in.readString();
        image125H = in.readString();
        publishedTitle = in.readString();
        url = in.readString();
        image480x270 = in.readString();
        in.readList(visibleInstructors, VisibleInstructor.class.getClassLoader());

    }

    public Result() {
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public PriceDetail getPriceDetail() {
        return priceDetail;
    }

    public void setPriceDetail(PriceDetail priceDetail) {
        this.priceDetail = priceDetail;
    }

    public List<VisibleInstructor> getVisibleInstructors() {
        return visibleInstructors;
    }

    public void setVisibleInstructors(List<VisibleInstructor> visibleInstructors) {
        this.visibleInstructors = visibleInstructors;
    }

    public String getImage125H() {
        return image125H;
    }

    public void setImage125H(String image125H) {
        this.image125H = image125H;
    }

    public String getImage240x135() {
        return image240x135;
    }

    public void setImage240x135(String image240x135) {
        this.image240x135 = image240x135;
    }

    public Boolean getIsPracticeTestCourse() {
        return isPracticeTestCourse;
    }

    public void setIsPracticeTestCourse(Boolean isPracticeTestCourse) {
        this.isPracticeTestCourse = isPracticeTestCourse;
    }

    public String getImage480x270() {
        return image480x270;
    }

    public void setImage480x270(String image480x270) {
        this.image480x270 = image480x270;
    }

    public String getPublishedTitle() {
        return publishedTitle;
    }

    public void setPublishedTitle(String publishedTitle) {
        this.publishedTitle = publishedTitle;
    }

    public Object getPredictiveScore() {
        return predictiveScore;
    }

    public void setPredictiveScore(Object predictiveScore) {
        this.predictiveScore = predictiveScore;
    }

    public Double getRelevancyScore() {
        return relevancyScore;
    }

    public void setRelevancyScore(Double relevancyScore) {
        this.relevancyScore = relevancyScore;
    }

    public Object getInputFeatures() {
        return inputFeatures;
    }

    public void setInputFeatures(Object inputFeatures) {
        this.inputFeatures = inputFeatures;
    }

    public Object getLectureSearchResult() {
        return lectureSearchResult;
    }

    public void setLectureSearchResult(Object lectureSearchResult) {
        this.lectureSearchResult = lectureSearchResult;
    }

    public List<Object> getCurriculumLectures() {
        return curriculumLectures;
    }

    public void setCurriculumLectures(List<Object> curriculumLectures) {
        this.curriculumLectures = curriculumLectures;
    }

    public Object getOrderInResults() {
        return orderInResults;
    }

    public void setOrderInResults(Object orderInResults) {
        this.orderInResults = orderInResults;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(image125H);
        dest.writeString(publishedTitle);
        dest.writeString(url);
        dest.writeString(image480x270);
        dest.writeList(visibleInstructors);
//        dest.writeTypedList();

    }

    public int describeContents() {
        return  0;
    }

}
