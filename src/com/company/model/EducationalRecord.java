package com.company.model;

public class EducationalRecord {
    private int id;
    private String created_at;
    private String updated_at;
    private EducationalRecord_yearDivision_enum yearDivision;
    private EducationalRecord_quarter_enum quarter;
    private EducationalRecord_semester_enum semester;
    private float totalMark;
    private int numberOfSubjects;
    private float average;
    private int rank;
    private String reportCardUrl;
    private float SemesterGPA;
    private float CumulativeGPA;
    private int educationId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setYearDivision(EducationalRecord_yearDivision_enum yearDivision) {
        this.yearDivision = yearDivision;
    }

    public void setQuarter(EducationalRecord_quarter_enum quarter) {
        this.quarter = quarter;
    }

    public void setSemester(EducationalRecord_semester_enum semester) {
        this.semester = semester;
    }

    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setReportCardUrl(String reportCardUrl) {
        this.reportCardUrl = reportCardUrl;
    }

    public void setSemesterGPA(float semesterGPA) {
        SemesterGPA = semesterGPA;
    }

    public void setCumulativeGPA(float cumulativeGPA) {
        CumulativeGPA = cumulativeGPA;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }

    public int getId() {
        return id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public EducationalRecord_yearDivision_enum getYearDivision() {
        return yearDivision;
    }

    public EducationalRecord_quarter_enum getQuarter() {
        return quarter;
    }

    public EducationalRecord_semester_enum getSemester() {
        return semester;
    }

    public float getTotalMark() {
        return totalMark;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public float getAverage() {
        return average;
    }

    public int getRank() {
        return rank;
    }

    public String getReportCardUrl() {
        return reportCardUrl;
    }

    public float getSemesterGPA() {
        return SemesterGPA;
    }

    public float getCumulativeGPA() {
        return CumulativeGPA;
    }

    public int getEducationId() {
        return educationId;
    }
}
