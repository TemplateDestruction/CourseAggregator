
package com.breakout.bestappone.content.udacityNew;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("enroll_button_text")
    @Expose
    private String enrollButtonText;
    @SerializedName("expected_duration_in_months")
    @Expose
    private Integer expectedDurationInMonths;
    @SerializedName("is_free_course")
    @Expose
    private Boolean isFreeCourse;
    @SerializedName("skills")
    @Expose
    private List<String> skills = null;
    @SerializedName("sub_domains")
    @Expose
    private List<String> subDomains = null;
    @SerializedName("type")
    @Expose
    private String type;

    public String getEnrollButtonText() {
        return enrollButtonText;
    }

    public void setEnrollButtonText(String enrollButtonText) {
        this.enrollButtonText = enrollButtonText;
    }

    public Integer getExpectedDurationInMonths() {
        return expectedDurationInMonths;
    }

    public void setExpectedDurationInMonths(Integer expectedDurationInMonths) {
        this.expectedDurationInMonths = expectedDurationInMonths;
    }

    public Boolean getIsFreeCourse() {
        return isFreeCourse;
    }

    public void setIsFreeCourse(Boolean isFreeCourse) {
        this.isFreeCourse = isFreeCourse;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getSubDomains() {
        return subDomains;
    }

    public void setSubDomains(List<String> subDomains) {
        this.subDomains = subDomains;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
