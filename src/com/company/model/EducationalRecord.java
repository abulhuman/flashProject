package com.company.model;

public class EducationalRecord {
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EducationalRecord_yearDivision_enum getYearDivision() {
        return yearDivision;
    }

    public void setYearDivision(EducationalRecord_yearDivision_enum yearDivision) {
        this.yearDivision = yearDivision;
    }

    public EducationalRecord_quarter_enum getQuarter() {
        return quarter;
    }

    public void setQuarter(EducationalRecord_quarter_enum quarter) {
        this.quarter = quarter;
    }

    public EducationalRecord_semester_enum getSemester() {
        return semester;
    }

    public void setSemester(EducationalRecord_semester_enum semester) {
        this.semester = semester;
    }

    public float getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getReportCardUrl() {
        return reportCardUrl;
    }

    public void setReportCardUrl(String reportCardUrl) {
        this.reportCardUrl = reportCardUrl;
    }

    public float getSemesterGPA() {
        return SemesterGPA;
    }

    public void setSemesterGPA(float semesterGPA) {
        SemesterGPA = semesterGPA;
    }

    public float getCumulativeGPA() {
        return CumulativeGPA;
    }

    public void setCumulativeGPA(float cumulativeGPA) {
        CumulativeGPA = cumulativeGPA;
    }

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }
}
