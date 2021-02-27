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

    public static final String TABLE_FATHER = "father";
    public static final String COLUMN_FATHER_ID = "id";
    public static final String COLUMN_FATHER_CREATED_AT = "created_at";
    public static final String COLUMN_FATHER_UPDATED_AT = "updated_at";
    public static final String COLUMN_FATHER_FIRST_NAME = "firstName";
    public static final String COLUMN_FATHER_LAST_NAME = "lastName";
    public static final String COLUMN_FATHER_DATE_OF_DEATH = "dateOfDeath";
    public static final String COLUMN_FATHER_CAUSE_OF_DEATH = "causeOfDeath";
    public static final String COLUMN_FATHER_DATE_OF_BIRTH = "dateOfBirth";
    public static final String COLUMN_FATHER_DEATH_CERTIFICATE_URL = "deathCertificateUrl";

    public static final String TABLE_GUARDIAN = "guardian";
    public static final String COLUMN_GUARDIAN_ID = "id";
    public static final String COLUMN_GUARDIAN_CREATED_AT = "created_at";
    public static final String COLUMN_GUARDIAN_UPDATED_AT = "updated_at";
    public static final String COLUMN_GUARDIAN_FIRST_NAME = "firstName";
    public static final String COLUMN_GUARDIAN_MIDDLE_NAME = "middleName";
    public static final String COLUMN_GUARDIAN_LAST_NAME = "lastName";
    public static final String COLUMN_GUARDIAN_DATE_OF_BIRTH = "dateOfBirth";
    public static final String COLUMN_GUARDIAN_GENDER = "gender";
    public static final String COLUMN_GUARDIAN_RELATION_TO_ORPHAN = "relationToOrphan";
    public static final String COLUMN_GUARDIAN_EMAIL = "email";
    public static final String COLUMN_GUARDIAN_MOBILE_NUMBER = "mobileNumber";
    public static final String COLUMN_GUARDIAN_TELEPHONE_NUMBER = "telephoneNumber";
    public static final String COLUMN_GUARDIAN_NATIONALITY = "nationality";
    public static final String COLUMN_GUARDIAN_GUARDIAN_ID_CARD_URL = "guardianIdCardUrl";
    public static final String COLUMN_GUARDIAN_GUARDIAN_CONFIRMATION_LETTER_URL = "guardianConfirmationLetterUrl";
    public static final String COLUMN_GUARDIAN_GUARDIAN_LEGAL_CONFIRMATION_LETTER_URL = "guardianLegalConfirmationLetterUrl";

    public static final String TABLE_HEALTH_RECORD = "healthrecord";
    public static final String COLUMN_HEALTH_RECORD_ID = "id";
    public static final String COLUMN_HEALTH_RECORD_CREATED_AT = "created_at";
    public static final String COLUMN_HEALTH_RECORD_UPDATED_AT = "updated_at";
    public static final String COLUMN_HEALTH_RECORD_MEDICAL_CERTIFICATE_URL = "medicalCertificateUrl";
    public static final String COLUMN_HEALTH_RECORD_ORPHAN_ID = "orphanId";

    public static final String TABLE_HOUSE_PROPERTY = "house_property";
    public static final String COLUMN_HOUSE_PROPERTY_ID = "id";
    public static final String COLUMN_HOUSE_PROPERTY_CREATED_AT = "created_at";
    public static final String COLUMN_HOUSE_PROPERTY_UPDATED_AT = "updated_at";
    public static final String COLUMN_HOUSE_PROPERTY_HOUSING_SITUATION = "housingSituation";
    public static final String COLUMN_HOUSE_PROPERTY_OTHER_PROPERTY = "otherProperty";

    public static final String TABLE_MOTHER = "mother";
    public static final String COLUMN_MOTHER_ID = "id";
    public static final String COLUMN_MOTHER_CREATED_AT = "created_at";
    public static final String COLUMN_MOTHER_UPDATED_AT = "updated_at";
    public static final String COLUMN_MOTHER_FIRST_NAME = "firstName";
    public static final String COLUMN_MOTHER_MIDDLE_NAME = "middleName";
    public static final String COLUMN_MOTHER_LAST_NAME = "lastName";
    public static final String COLUMN_MOTHER_DATE_OF_BIRTH = "dateOfBirth";
    public static final String COLUMN_MOTHER_VITAL_STATUS = "vitalStatus";
    public static final String COLUMN_MOTHER_DATE_OF_DEATH = "dateOfDeath";
    public static final String COLUMN_MOTHER_CAUSE_OF_DEATH = "causeOfDeath";
    public static final String COLUMN_MOTHER_MOBILE_NUMBER = "mobileNumber";
    public static final String COLUMN_MOTHER_MARITAL_STATUS = "maritalStatus";
    public static final String COLUMN_MOTHER_CURRENT_JOB_TITLE = "currentJobTitle";
    public static final String COLUMN_MOTHER_MONTHLY_INCOME = "monthlyIncome";
    public static final String COLUMN_MOTHER_MONTHLY_EXPENSE = "monthlyExpense";


}
