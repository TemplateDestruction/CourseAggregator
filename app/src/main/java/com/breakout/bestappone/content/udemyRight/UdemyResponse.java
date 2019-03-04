
package com.breakout.bestappone.content.udemyRight;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UdemyResponse
{

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("udemyCourses")
    @Expose
    private List<UdemyCourse> udemyCourses = null;
    @SerializedName("aggregations")
    @Expose
    private List<Aggregation> aggregations = null;


    public UdemyResponse() {
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<UdemyCourse> getUdemyCourses() {
        return udemyCourses;
    }

    public void setUdemyCourses(List<UdemyCourse> udemyCourses) {
        this.udemyCourses = udemyCourses;
    }

    public List<Aggregation> getAggregations() {
        return aggregations;
    }

    public void setAggregations(List<Aggregation> aggregations) {
        this.aggregations = aggregations;
    }


}
