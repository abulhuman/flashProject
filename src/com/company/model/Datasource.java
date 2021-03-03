package com.company.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {

    public static final String DB_NAME = "miniDepOrph";
    public static final String DB_USERNAME = "devAdem";
    public static final String DB_PASSWORD = "Shangquan1!";

    public static final String CONNECTION_STRING = "jdbc:mysql://localhost/" + DB_NAME;

    public static final String TABLE_ORPHAN = "orphan";
    public static final String COLUMN_ORPHAN_ID = "id";
    public static final String COLUMN_ORPHAN_CREATED_AT = "created_at";
    public static final String COLUMN_ORPHAN_UPDATED_AT = "updated_at";
    public static final String COLUMN_ORPHAN_FIRST_NAME = "firstName";
    public static final String COLUMN_ORPHAN_GENDER = "gender";
    public static final String COLUMN_ORPHAN_PLACE_OF_BIRTH = "placeOfBirth";
    public static final String COLUMN_ORPHAN_DATE_OF_BIRTH = "dateOfBirth";
    public static final String COLUMN_ORPHAN_SPOKEN_LANGUAGE = "spokenLanguages";
    public static final String COLUMN_ORPHAN_GRADE_AGE_MISMATCH_REASON = "gradeAgeMismatchReason";
    public static final String COLUMN_ORPHAN_HOBBIES = "hobbies";
    public static final String COLUMN_ORPHAN_ORPHAN_RELIGION = "religion";
    public static final String COLUMN_ORPHAN_ID_CARD_URL = "idCardUrl";
    public static final String COLUMN_ORPHAN_PASSPORT_URL = "passportUrl";
    public static final String COLUMN_ORPHAN_THANK_YOU_LATTER_URL = "thankyouLetterUrl";
    public static final String COLUMN_ORPHAN_BIRTH_CERTIFICATE_URL = "birthCertificateUrl";
    public static final String COLUMN_ORPHAN_HEALTH_DESCRIPTION = "healthDescription";
    public static final String COLUMN_ORPHAN_PSYCHOLOGICAL_STATUS = "psychologicalStatus";
    public static final String COLUMN_ORPHAN_SIBLING_ID = "siblingId";
    public static final String COLUMN_ORPHAN_MOTHER_ID = "motherId";
    public static final String COLUMN_ORPHAN_FATHER_ID = "fatherId";
    public static final String COLUMN_ORPHAN_GUARDIAN_ID = "guardianId";
    public static final String COLUMN_ORPHAN_EDUCATION_ID = "educationId";
    public static final String COLUMN_ORPHAN_DONOR_ID = "donorId";
    public static final String COLUMN_ORPHAN_HOUSE_PROPERTY_ID = "house_propertyId";
    public static final String COLUMN_ORPHAN_VILLAGE_ID = "villageId";

    public static final String TABLE_ORPHAN_PHOTOS = "OrphanPhotos";
    public static final String COLUMN_PHOTOS_ID = "id";
    public static final String COLUMN_PHOTOS_CREATED_AT = "created_at";
    public static final String COLUMN_PHOTOS_UPDATE_AT = "updated_at";
    public static final String COLUMN_PHOTO_PORTRAIT_URL = "photoPortraitUrl";
    public static final String COLUMN_PHOTO_LONG_URL = "photoLongUrl";
    public static final String COLUMN_PHOTOS_ORPHAN_ID = "orphanId";

    public static final String TABLE_REGION = "region";
    public static final String COLUMN_REGION_ID = "id";
    public static final String COLUMN_REGION_CREATED_AT = "created_at";
    public static final String COLUMN_REGION_UPDATED_AT = "updated_at";
    public static final String COLUMN_REGION_NAME = "name";

    public static final String TABLE_USER = "user";
    public static final String COLUMN_USER_ID = "id";
    public static final String COLUMN_USER_CREATED_AT = "created_at";
    public static final String COLUMN_USER_UPDATED_AT = "updated_at";
    public static final String COLUMN_USER_EMAIL = "email";
    public static final String COLUMN_USER_PASSWORD = "password";

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

    public static final String TABLE_EDUCATIONAL_RECORD = "educationalRecord";
    public static final String COLUMN_EDUCATIONAL_RECORD_ID = "id";
    public static final String COLUMN_EDUCATIONAL_RECORD_CREATED_AT = "created_at";
    public static final String COLUMN_EDUCATIONAL_RECORD_UPDATED_AT = "updated_at";
    public static final String COLUMN_EDUCATIONAL_RECORD_YEAR_DIVISION = "yearDivision";
    public static final String COLUMN_EDUCATIONAL_RECORD_QUARTER = "quarter";
    public static final String COLUMN_EDUCATIONAL_RECORD_SEMESTER = "semester";
    public static final String COLUMN_EDUCATIONAL_RECORD_TOTAL_MARK = "totalMark";
    public static final String COLUMN_EDUCATIONAL_RECORD_NUMBER_OF_SUBJECTS = "numberOfSubjects";
    public static final String COLUMN_EDUCATIONAL_RECORD_AVERAGE = "average";
    public static final String COLUMN_EDUCATIONAL_RECORD_RANK = "rank";
    public static final String COLUMN_EDUCATIONAL_RECORD_REPORT_CARD_URL = "reportCardUrl";
    public static final String COLUMN_EDUCATIONAL_RECORD_SEMESTER_GPA = "SemesterGPA";
    public static final String COLUMN_EDUCATIONAL_RECORD_CUMULATIVE_GPA = "CumulativeGPA";
    public static final String COLUMN_EDUCATIONAL_RECORD_EDUCATION_ID = "educationId";

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

    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING, DB_USERNAME, DB_PASSWORD);
            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }

    public List<Orphan> queryAllOrphans(int villageId) {
        try (
                Statement statement = conn.createStatement();
                ResultSet results = statement.executeQuery(String.format("SELECT * FROM %s WHERE %s = %s",
                        TABLE_ORPHAN,
                        COLUMN_ORPHAN_VILLAGE_ID,
                        villageId))
        ) {
            List<Orphan> orphans = new ArrayList<>();
            while (results.next()) {
                Orphan orphan = new Orphan();
                orphan.setId(results.getInt(COLUMN_ORPHAN_ID));
                orphan.setCreated_at(results.getString(COLUMN_ORPHAN_CREATED_AT));
                orphan.setUpdated_at(results.getString(COLUMN_ORPHAN_UPDATED_AT));
                orphan.setFirstName(results.getString(COLUMN_ORPHAN_FIRST_NAME));
                orphan.setGender(results.getString(COLUMN_ORPHAN_GENDER).equals("F") ? Gender_enum.F : Gender_enum.M);
                orphan.setPlaceOfBirth(results.getString(COLUMN_ORPHAN_PLACE_OF_BIRTH));
                orphan.setDateOfBirth(results.getString(COLUMN_ORPHAN_DATE_OF_BIRTH));
                orphan.setSpokenLanguages(results.getString(COLUMN_ORPHAN_SPOKEN_LANGUAGE));
                orphan.setGradeAgeMismatchReason(results.getString(COLUMN_ORPHAN_GRADE_AGE_MISMATCH_REASON));
                orphan.setHobbies(results.getString(COLUMN_ORPHAN_HOBBIES));

                Orphan_religion_enum religion = switch (results.getString(COLUMN_ORPHAN_ORPHAN_RELIGION)) {
                    case "Christianity" -> Orphan_religion_enum.CHRISTIANITY;
                    case "Buddhism" -> Orphan_religion_enum.BUDDHISM;
                    case "Hinduism" -> Orphan_religion_enum.HINDUISM;
                    case "Judaism" -> Orphan_religion_enum.JUDAISM;
                    case "Other" -> Orphan_religion_enum.OTHER;
                    default -> Orphan_religion_enum.ISLAM;
                };

                orphan.setReligion(religion);

                orphan.setIdCardUrl(results.getString(COLUMN_ORPHAN_ID_CARD_URL));
                orphan.setPassportUrl(results.getString(COLUMN_ORPHAN_PASSPORT_URL));
                orphan.setThankyouLetterUrl(results.getString(COLUMN_ORPHAN_THANK_YOU_LATTER_URL));
                orphan.setBirthCertificateUrl(results.getString(COLUMN_ORPHAN_BIRTH_CERTIFICATE_URL));
                orphan.setHealthDescription(results.getString(COLUMN_ORPHAN_HEALTH_DESCRIPTION));

                Orphan_psychologicalStatus_enum pschStat = switch (results.getString(COLUMN_ORPHAN_PSYCHOLOGICAL_STATUS)) {
                    case "isolated" -> Orphan_psychologicalStatus_enum.ISOLATED;
                    case "stressed" -> Orphan_psychologicalStatus_enum.STRESSED;
                    case "unsociable" -> Orphan_psychologicalStatus_enum.UNSOCIABLE;
                    case "overlysociable" -> Orphan_psychologicalStatus_enum.OVERLYSOCIABLE;
                    default -> Orphan_psychologicalStatus_enum.NORMAL;
                };

                orphan.setPsychologicalStatus(pschStat);

                orphan.setSiblingId(results.getInt(COLUMN_ORPHAN_SIBLING_ID));
                orphan.setMotherId(results.getInt(COLUMN_ORPHAN_MOTHER_ID));
                orphan.setFatherId(results.getInt(COLUMN_ORPHAN_FATHER_ID));
                orphan.setGuardianId(results.getInt(COLUMN_ORPHAN_GUARDIAN_ID));
                orphan.setEducationId(results.getInt(COLUMN_ORPHAN_EDUCATION_ID));
                orphan.setDonorId(results.getInt(COLUMN_ORPHAN_DONOR_ID));
                orphan.setHouse_propertyId(results.getInt(COLUMN_ORPHAN_HOUSE_PROPERTY_ID));
                orphan.setVillageId(results.getInt(COLUMN_ORPHAN_VILLAGE_ID));

                orphans.add(orphan);
            }

            return orphans;

        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public List<EducationalRecord> queryAllEducationalRecords(int educationId) {
        final String sqlDml = String.format("SELECT * FROM %s WHERE %s = %s",
                TABLE_EDUCATIONAL_RECORD,
                COLUMN_EDUCATIONAL_RECORD_EDUCATION_ID,
                educationId);
        try (
                Statement statement = conn.createStatement();
                ResultSet results = statement.executeQuery(sqlDml)
        ) {
            List<EducationalRecord> educationalRecords = new ArrayList<>();

            while (results.next()) {
                EducationalRecord educationalRecord = new EducationalRecord();
                educationalRecord.setId(results.getInt(COLUMN_EDUCATIONAL_RECORD_ID));
                educationalRecord.setCreated_at(results.getString(COLUMN_EDUCATIONAL_RECORD_CREATED_AT));
                educationalRecord.setUpdated_at(results.getString(COLUMN_EDUCATIONAL_RECORD_UPDATED_AT));
                educationalRecord.setYearDivision(
                        results.getString(COLUMN_EDUCATIONAL_RECORD_YEAR_DIVISION).equals("semester") ?
                                EducationalRecord_yearDivision_enum.SEMESTER :
                                EducationalRecord_yearDivision_enum.QUARTER_TERM
                );
                educationalRecord.setQuarter(
                        results.getString(COLUMN_EDUCATIONAL_RECORD_QUARTER).equals("first") ?
                                EducationalRecord_quarter_enum.FIRST :
                                EducationalRecord_quarter_enum.SECOND
                );

                EducationalRecord_semester_enum semester = switch (results.getString(COLUMN_EDUCATIONAL_RECORD_SEMESTER)) {
                    case "first" -> EducationalRecord_semester_enum.FIRST;
                    case "second" -> EducationalRecord_semester_enum.SECOND;
                    case "third" -> EducationalRecord_semester_enum.THIRD;
                    default -> EducationalRecord_semester_enum.FOURTH;
                };

                educationalRecord.setSemester(semester);

                educationalRecord.setTotalMark(results.getFloat(COLUMN_EDUCATIONAL_RECORD_TOTAL_MARK));
                educationalRecord.setNumberOfSubjects(results.getInt(COLUMN_EDUCATIONAL_RECORD_NUMBER_OF_SUBJECTS));
                educationalRecord.setAverage(results.getFloat(COLUMN_EDUCATIONAL_RECORD_AVERAGE));
                educationalRecord.setRank(results.getInt(COLUMN_EDUCATIONAL_RECORD_RANK));
                educationalRecord.setReportCardUrl(results.getString(COLUMN_EDUCATIONAL_RECORD_REPORT_CARD_URL));
                educationalRecord.setSemesterGPA(results.getFloat(COLUMN_EDUCATIONAL_RECORD_SEMESTER_GPA));
                educationalRecord.setCumulativeGPA(results.getFloat(COLUMN_EDUCATIONAL_RECORD_CUMULATIVE_GPA));
                educationalRecord.setEducationId(results.getInt(COLUMN_EDUCATIONAL_RECORD_EDUCATION_ID));

                educationalRecords.add(educationalRecord);
            }

            return educationalRecords;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }

    }

    public List<Region> queryAllRegions() {
        try (
                Statement statement = conn.createStatement();
                ResultSet results = statement.executeQuery(String.format("SELECT * FROM %s", TABLE_REGION))
        ) {
            List<Region> regions = new ArrayList<>();

            while (results.next()) {
                Region region = new Region();
                region.setId(results.getInt(COLUMN_REGION_ID));
                region.setCreated_at(results.getString(COLUMN_REGION_CREATED_AT));
                region.setUpdated_at(results.getString(COLUMN_REGION_UPDATED_AT));
                region.setName(results.getString(COLUMN_REGION_NAME));

                regions.add(region);
            }

            return regions;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public List<Zone> queryAllZones(int regionId) {
        try (
                Statement statement = conn.createStatement();
                ResultSet results = statement.executeQuery(String.format("SELECT * FROM %s WHERE %s = %s",
                        TABLE_ZONE,
                        COLUMN_ZONE_REGION_ID,
                        regionId))
        ) {
            List<Zone> zones = new ArrayList<>();

            while (results.next()) {
                Zone zone = new Zone();
                zone.setId(results.getInt(COLUMN_ZONE_ID));
                zone.setCreated_at(results.getString(COLUMN_ZONE_CREATED_AT));
                zone.setUpdated_at(results.getString(COLUMN_ZONE_UPDATED_AT));
                zone.setName(results.getString(COLUMN_ZONE_NAME));
                zone.setRegionId(results.getInt(COLUMN_ZONE_REGION_ID));

                zones.add(zone);
            }

            return zones;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public List<District> queryAllDistricts(int zoneId) {
        try (
                Statement statement = conn.createStatement();
                ResultSet results = statement.executeQuery(String.format("SELECT * FROM %s WHERE %s = %s",
                        TABLE_DISTRICT,
                        COLUMN_DISTRICT_ZONE_ID,
                        zoneId))
        ) {
            List<District> districts = new ArrayList<>();
            while (results.next()) {
                District district = new District();
                district.setId(results.getInt(COLUMN_DISTRICT_ID));
                district.setCreated_at(results.getString(COLUMN_DISTRICT_CREATED_AT));
                district.setUpdated_at(results.getString(COLUMN_DISTRICT_UPDATED_AT));
                district.setName(results.getString(COLUMN_DISTRICT_NAME));
                district.setCoordinatorId(results.getInt(COLUMN_DISTRICT_COORDINATOR_ID));
                district.setZoneId(results.getInt(COLUMN_DISTRICT_ZONE_ID));

                districts.add(district);
            }

            return districts;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public List<Village> queryAllVillages(int districtId) {
        try (
                Statement statement = conn.createStatement();
                ResultSet results = statement.executeQuery(String.format("SELECT * FROM %s WHERE %s = %s",
                        TABLE_VILLAGE,
                        COLUMN_VILLAGE_DISTRICT_ID,
                        districtId))
        ) {
            List<Village> villages = new ArrayList<>();

            while (results.next()) {
                Village village = new Village();
                village.setId(results.getInt(COLUMN_VILLAGE_ID));
                village.setCreated_at(results.getString(COLUMN_VILLAGE_CREATED_AT));
                village.setUpdated_at(results.getString(COLUMN_VILLAGE_UPDATED_AT));
                village.setRegistrationDate(results.getString(COLUMN_VILLAGE_REGISTRATION_DATE));
                village.setName(results.getString(COLUMN_VILLAGE_NAME));
                village.setDistrictId(results.getInt(COLUMN_VILLAGE_DISTRICT_ID));
                village.setDonorId(results.getInt(COLUMN_VILLAGE_DONOR_ID));
                village.setCoordinatorId(results.getInt(COLUMN_VILLAGE_COORDINATOR_ID));

                villages.add(village);
            }

            return villages;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }

    }

    public List<User> queryAllUsers() {
        try (
                Statement statement = conn.createStatement();
                ResultSet results = statement.executeQuery(String.format("SELECT * FROM %s", TABLE_USER))
        ) {
            List<User> users = new ArrayList<>();

            while (results.next()) {
                User user = new User();
                user.setId(results.getInt(COLUMN_USER_ID));
                user.setCreated_at(results.getString(COLUMN_USER_CREATED_AT));
                user.setUpdated_at(results.getString(COLUMN_USER_UPDATED_AT));
                user.setEmail(results.getString(COLUMN_USER_EMAIL));
                user.setPassword(results.getString(COLUMN_USER_PASSWORD));

                users.add(user);
            }

            return users;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }


    }

    public List<Coordinator> queryAllCoordinators(int userId) {
        try (
                Statement statement = conn.createStatement();
                ResultSet results = statement.executeQuery(String.format("SELECT * FROM %s", TABLE_COORDINATOR))
        ) {
            List<Coordinator> coordinators = new ArrayList<>();

            while (results.next()) {
                Coordinator coordinator = new Coordinator();

                coordinator.setId(results.getInt(COLUMN_COORDINATOR_ID));
                coordinator.setCreated_at(results.getString(COLUMN_COORDINATOR_CREATED_AT));
                coordinator.setUpdated_at(results.getString(COLUMN_COORDINATOR_UPDATED_AT));
                coordinator.setFullName(results.getString(COLUMN_COORDINATOR_FULL_NAME));
                coordinator.setUserId(results.getInt(COLUMN_COORDINATOR_USER_ID));

                coordinators.add(coordinator);
            }

            return coordinators;
        } catch (SQLException e) {
            System.out.println("Query Failed: " + e.getMessage());
            return null;
        }
    }

}
