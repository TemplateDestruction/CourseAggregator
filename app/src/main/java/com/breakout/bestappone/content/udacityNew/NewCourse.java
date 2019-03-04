
package com.breakout.bestappone.content.udacityNew;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewCourse {

    @SerializedName("affiliates")
    @Expose
    private List<Affiliate> affiliates = null;
    @SerializedName("apply_required")
    @Expose
    private Boolean applyRequired;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("banner_image")
    @Expose
    private String bannerImage;
    @SerializedName("capped")
    @Expose
    private Boolean capped;
    @SerializedName("card_image")
    @Expose
    private String cardImage;
    @SerializedName("enables_profiles")
    @Expose
    private Boolean enablesProfiles;
    @SerializedName("expected_duration")
    @Expose
    private Integer expectedDuration;
    @SerializedName("expected_duration_high")
    @Expose
    private Integer expectedDurationHigh;
    @SerializedName("expected_duration_low")
    @Expose
    private Integer expectedDurationLow;
    @SerializedName("expected_duration_unit")
    @Expose
    private String expectedDurationUnit;
    @SerializedName("expected_learning")
    @Expose
    private String expectedLearning;
    @SerializedName("faq")
    @Expose
    private String faq;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("features")
    @Expose
    private Object features;
    @SerializedName("free_preview_enabled")
    @Expose
    private Boolean freePreviewEnabled;
    @SerializedName("full_course_available")
    @Expose
    private Boolean fullCourseAvailable;
    @SerializedName("graduate_groups")
    @Expose
    private List<Object> graduateGroups = null;
    @SerializedName("hero_video")
    @Expose
    private String heroVideo;
    @SerializedName("hero_video_poster")
    @Expose
    private String heroVideoPoster;
    @SerializedName("hero_video_id")
    @Expose
    private String heroVideoId;
    @SerializedName("hiring_affiliates")
    @Expose
    private Object hiringAffiliates;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("instructors")
    @Expose
    private List<Instructor> instructors = null;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("new_release")
    @Expose
    private Boolean newRelease;
    @SerializedName("open_for_enrollment")
    @Expose
    private Boolean openForEnrollment;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("paid_trial_enabled")
    @Expose
    private Boolean paidTrialEnabled;
    @SerializedName("public_listing")
    @Expose
    private Boolean publicListing;
    @SerializedName("program_syllabus")
    @Expose
    private ProgramSyllabus programSyllabus;
    @SerializedName("projects")
    @Expose
    private List<Object> projects = null;
    @SerializedName("related_degree_keys")
    @Expose
    private List<Object> relatedDegreeKeys = null;
    @SerializedName("required_knowledge")
    @Expose
    private String requiredKnowledge;
    @SerializedName("schools")
    @Expose
    private Object schools;
    @SerializedName("seo_title")
    @Expose
    private String seoTitle;
    @SerializedName("seo_description")
    @Expose
    private String seoDescription;
    @SerializedName("seo_keywords")
    @Expose
    private String seoKeywords;
    @SerializedName("selling_points")
    @Expose
    private SellingPoints sellingPoints;
    @SerializedName("short_summary")
    @Expose
    private String shortSummary;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("starter")
    @Expose
    private Boolean starter;
    @SerializedName("student_groups")
    @Expose
    private List<Object> studentGroups = null;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("syllabus")
    @Expose
    private String syllabus;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("tracks")
    @Expose
    private List<Object> tracks = null;
    @SerializedName("why_nd_summary")
    @Expose
    private String whyNdSummary;
    @SerializedName("why_nd_data")
    @Expose
    private String whyNdData;

    public List<Affiliate> getAffiliates() {
        return affiliates;
    }

    public void setAffiliates(List<Affiliate> affiliates) {
        this.affiliates = affiliates;
    }

    public Boolean getApplyRequired() {
        return applyRequired;
    }

    public void setApplyRequired(Boolean applyRequired) {
        this.applyRequired = applyRequired;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public Boolean getCapped() {
        return capped;
    }

    public void setCapped(Boolean capped) {
        this.capped = capped;
    }

    public String getCardImage() {
        return cardImage;
    }

    public void setCardImage(String cardImage) {
        this.cardImage = cardImage;
    }

    public Boolean getEnablesProfiles() {
        return enablesProfiles;
    }

    public void setEnablesProfiles(Boolean enablesProfiles) {
        this.enablesProfiles = enablesProfiles;
    }

    public Integer getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(Integer expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    public Integer getExpectedDurationHigh() {
        return expectedDurationHigh;
    }

    public void setExpectedDurationHigh(Integer expectedDurationHigh) {
        this.expectedDurationHigh = expectedDurationHigh;
    }

    public Integer getExpectedDurationLow() {
        return expectedDurationLow;
    }

    public void setExpectedDurationLow(Integer expectedDurationLow) {
        this.expectedDurationLow = expectedDurationLow;
    }

    public String getExpectedDurationUnit() {
        return expectedDurationUnit;
    }

    public void setExpectedDurationUnit(String expectedDurationUnit) {
        this.expectedDurationUnit = expectedDurationUnit;
    }

    public String getExpectedLearning() {
        return expectedLearning;
    }

    public void setExpectedLearning(String expectedLearning) {
        this.expectedLearning = expectedLearning;
    }

    public String getFaq() {
        return faq;
    }

    public void setFaq(String faq) {
        this.faq = faq;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Object getFeatures() {
        return features;
    }

    public void setFeatures(Object features) {
        this.features = features;
    }

    public Boolean getFreePreviewEnabled() {
        return freePreviewEnabled;
    }

    public void setFreePreviewEnabled(Boolean freePreviewEnabled) {
        this.freePreviewEnabled = freePreviewEnabled;
    }

    public Boolean getFullCourseAvailable() {
        return fullCourseAvailable;
    }

    public void setFullCourseAvailable(Boolean fullCourseAvailable) {
        this.fullCourseAvailable = fullCourseAvailable;
    }

    public List<Object> getGraduateGroups() {
        return graduateGroups;
    }

    public void setGraduateGroups(List<Object> graduateGroups) {
        this.graduateGroups = graduateGroups;
    }

    public String getHeroVideo() {
        return heroVideo;
    }

    public void setHeroVideo(String heroVideo) {
        this.heroVideo = heroVideo;
    }

    public String getHeroVideoPoster() {
        return heroVideoPoster;
    }

    public void setHeroVideoPoster(String heroVideoPoster) {
        this.heroVideoPoster = heroVideoPoster;
    }

    public String getHeroVideoId() {
        return heroVideoId;
    }

    public void setHeroVideoId(String heroVideoId) {
        this.heroVideoId = heroVideoId;
    }

    public Object getHiringAffiliates() {
        return hiringAffiliates;
    }

    public void setHiringAffiliates(Object hiringAffiliates) {
        this.hiringAffiliates = hiringAffiliates;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Boolean getNewRelease() {
        return newRelease;
    }

    public void setNewRelease(Boolean newRelease) {
        this.newRelease = newRelease;
    }

    public Boolean getOpenForEnrollment() {
        return openForEnrollment;
    }

    public void setOpenForEnrollment(Boolean openForEnrollment) {
        this.openForEnrollment = openForEnrollment;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getPaidTrialEnabled() {
        return paidTrialEnabled;
    }

    public void setPaidTrialEnabled(Boolean paidTrialEnabled) {
        this.paidTrialEnabled = paidTrialEnabled;
    }

    public Boolean getPublicListing() {
        return publicListing;
    }

    public void setPublicListing(Boolean publicListing) {
        this.publicListing = publicListing;
    }

    public ProgramSyllabus getProgramSyllabus() {
        return programSyllabus;
    }

    public void setProgramSyllabus(ProgramSyllabus programSyllabus) {
        this.programSyllabus = programSyllabus;
    }

    public List<Object> getProjects() {
        return projects;
    }

    public void setProjects(List<Object> projects) {
        this.projects = projects;
    }

    public List<Object> getRelatedDegreeKeys() {
        return relatedDegreeKeys;
    }

    public void setRelatedDegreeKeys(List<Object> relatedDegreeKeys) {
        this.relatedDegreeKeys = relatedDegreeKeys;
    }

    public String getRequiredKnowledge() {
        return requiredKnowledge;
    }

    public void setRequiredKnowledge(String requiredKnowledge) {
        this.requiredKnowledge = requiredKnowledge;
    }

    public Object getSchools() {
        return schools;
    }

    public void setSchools(Object schools) {
        this.schools = schools;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public SellingPoints getSellingPoints() {
        return sellingPoints;
    }

    public void setSellingPoints(SellingPoints sellingPoints) {
        this.sellingPoints = sellingPoints;
    }

    public String getShortSummary() {
        return shortSummary;
    }

    public void setShortSummary(String shortSummary) {
        this.shortSummary = shortSummary;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getStarter() {
        return starter;
    }

    public void setStarter(Boolean starter) {
        this.starter = starter;
    }

    public List<Object> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<Object> studentGroups) {
        this.studentGroups = studentGroups;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Object> getTracks() {
        return tracks;
    }

    public void setTracks(List<Object> tracks) {
        this.tracks = tracks;
    }

    public String getWhyNdSummary() {
        return whyNdSummary;
    }

    public void setWhyNdSummary(String whyNdSummary) {
        this.whyNdSummary = whyNdSummary;
    }

    public String getWhyNdData() {
        return whyNdData;
    }

    public void setWhyNdData(String whyNdData) {
        this.whyNdData = whyNdData;
    }

}
