package oms.model;

public class Education {
    private int id;
    private Education_enrollmentStatus_enum enrollmentStatus;
    private String schoolName;
    private Education_typeOfSchool_enum typeOfSchool;
    private String year;
    private Education_level_enum level;
    private String reason;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Education_enrollmentStatus_enum getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus(Education_enrollmentStatus_enum enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Education_typeOfSchool_enum getTypeOfSchool() {
        return typeOfSchool;
    }

    public void setTypeOfSchool(Education_typeOfSchool_enum typeOfSchool) {
        this.typeOfSchool = typeOfSchool;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Education_level_enum getLevel() {
        return level;
    }

    public void setLevel(Education_level_enum level) {
        this.level = level;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
