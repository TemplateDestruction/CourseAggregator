
package com.breakout.bestappone.content.udacityNew;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProgramSyllabus {

    @SerializedName("detail_pdf_url")
    @Expose
    private String detailPdfUrl;
    @SerializedName("lessons")
    @Expose
    private List<Lesson> lessons = null;
    @SerializedName("syllabus_prep")
    @Expose
    private String syllabusPrep;
    @SerializedName("syllabus_prereq")
    @Expose
    private String syllabusPrereq;
    @SerializedName("projects")
    @Expose
    private Object projects;
    @SerializedName("related_courses")
    @Expose
    private Object relatedCourses;
    @SerializedName("terms")
    @Expose
    private Object terms;
    @SerializedName("preview_url")
    @Expose
    private String previewUrl;

    public String getDetailPdfUrl() {
        return detailPdfUrl;
    }

    public void setDetailPdfUrl(String detailPdfUrl) {
        this.detailPdfUrl = detailPdfUrl;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public String getSyllabusPrep() {
        return syllabusPrep;
    }

    public void setSyllabusPrep(String syllabusPrep) {
        this.syllabusPrep = syllabusPrep;
    }

    public String getSyllabusPrereq() {
        return syllabusPrereq;
    }

    public void setSyllabusPrereq(String syllabusPrereq) {
        this.syllabusPrereq = syllabusPrereq;
    }

    public Object getProjects() {
        return projects;
    }

    public void setProjects(Object projects) {
        this.projects = projects;
    }

    public Object getRelatedCourses() {
        return relatedCourses;
    }

    public void setRelatedCourses(Object relatedCourses) {
        this.relatedCourses = relatedCourses;
    }

    public Object getTerms() {
        return terms;
    }

    public void setTerms(Object terms) {
        this.terms = terms;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

}
