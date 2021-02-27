package com.company.model;

public class Datasource {

    public static final String DB_NAME = "miniDepOrph";
    public static final String DB_USERNAME = "devAdem";
    public static final String DB_PASSWORD = "Shangquan1!";

    public static final String CONNECTION_STRING = "jdbc:mysql://localhost/" + DB_NAME;

    public static final String TABLE_COORDINATOR = "coordinator";
    public static final String COLUMN_COORDINATOR_ID = "id";
    public static final String COLUMN_COORDINATOR_CREATED_AT = "created_at";
    public static final String COLUMN_COORDINATOR_UPDATED_AT = "updated_at";
    public static final String COLUMN_COORDINATOR_FULL_NAME = "fullName";
    public static final String COLUMN_COORDINATOR_USER_ID = "userId";

    public static final String TABLE_DISTRICT = "district";
    public static final String COLUMN_DISTRICT_ID = "id";
    public static final String COLUMN_DISTRICT_CREATED_AT = "created_at";
    public static final String COLUMN_DISTRICT_UPDATED_AT = "updated_at";
    public static final String COLUMN_DISTRICT_NAME = "name";
    public static final String COLUMN_DISTRICT_ZONE_ID = "zoneId";
    public static final String COLUMN_DISTRICT_COORDINATOR_ID = "coordinatorId";

    public static final String TABLE_DONOR = "donor";
    public static final String COLUMN_DONOR_ID = "id";
    public static final String COLUMN_DONOR_CREATED_AT = "created_at";
    public static final String COLUMN_DONOR_UPDATED_AT = "updated_at";
    public static final String COLUMN_DONOR_COMPANY_NAME = "companyName";
    public static final String COLUMN_DONOR_NAME_INITIALS = "nameInitials";
    public static final String COLUMN_DONOR_USER_ID = "userId";
    public static final String COLUMN_DONOR_COORDINATOR_ID = "coordinatorId";

    public static final String TABLE_EDUCATION = "education";
    public static final String COLUMN_EDUCATION_ID = "id";
    public static final String COLUMN_EDUCATION_CREATED_AT = "created_at";
    public static final String COLUMN_EDUCATION_UPDATED_AT = "updated_at";
    public static final String COLUMN_EDUCATION_ENROLLMENT_STATUS = "enrollmentStatus";
    public static final String COLUMN_EDUCATION_SCHOOL_NAME = "schoolName";
    public static final String COLUMN_EDUCATION_TYPE_OF_SCHOOL = "typeOfSchool";
    public static final String COLUMN_EDUCATION_YEAR = "year";
    public static final String COLUMN_EDUCATION_LEVEL = "level";
    public static final String COLUMN_EDUCATION_REASON = "reason";

    public static final String TABLE_EDUCATIONALRECORD = "educationalRecord";
    public static final String COULMN_EDUCATIONALRECORD_ID = "id";
    public static final String COULMN_EDUCATIONALRECORD_CREATED_AT = "created_at";
    public static final String COULMN_EDUCATIONALRECORD_UPDATED_AT = "updated_at";
    public static final String COULMN_EDUCATIONALRECORD_YEARDIVISION = "yearDivision";
    public static final String COULMN_EDUCATIONALRECORD_QUARTER = "quarter";
    public static final String COULMN_EDUCATIONALRECORD_SEMESTER = "semester";
    public static final String COULMN_EDUCATIONALRECORD_TOTAL_MARK = "totalMark";
    public static final String COULMN_EDUCATIONALRECORD_NUMBER_OF_SUBJECTS = "numberOfSubjects";
    public static final String COULMN_EDUCATIONALRECORD_AVERAGE = "average";
    public static final String COULMN_EDUCATIONALRECORD_RANK = "rank";
    public static final String COULMN_EDUCATIONALRECORD_REPORT_CARD_URL = "reportCardUrl";
    public static final String COULMN_EDUCATIONALRECORD_SEMSETER_GPA = "SemesterGPA";
    public static final String COULMN_EDUCATIONALRECORD_CUMULATIVE_GPA = "CumulativeGPA";
    public static final String COULMN_EDUCATIONALRECORD_EDUCATION_ID = "educationId";

    public static final String TABLE_ZONE = "zone";
    public static final String COLUMN_ZONE_ID = "id";
    public static final String COLUMN_ZONE_CREATED_AT = "created_at";
    public static final String COLUMN_ZONE_UPDATED_AT = "updated_at";
    public static final String COLUMN_ZONE_NAME = "name";
    public static final String COLUMN_ZONE_REGION_ID = "regionId";

    public static final String TABLE_VILLAGE = "village";
    public static final String COLUMN_VILLAGE_ID = "id";
    public static final String COLUMN_VILLAGE_CREATED_AT = "created_at";
    public static final String COLUMN_VILLAGE_UPDATED_AT = "updated_at";
    public static final String COLUMN_VILLAGE_REGISTRATION_DATE = "registrationDate";
    public static final String COLUMN_VILLAGE_NAME = "name";
    public static final String COLUMN_VILLAGE_DISTRICT_ID = "districtId";
    public static final String COLUMN_VILLAGE_DONOR_ID = "donorId";
    public static final String COLUMN_VILLAGE_COORDINATOR_ID = "coordinatorId";

}
