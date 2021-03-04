package com.company.model;

import javax.lang.model.element.NestingKind;
import java.security.Guard;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {

    public static final String DB_NAME = "OMS";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "w@duuminMySQL";

    public static final String CONNECTION_STRING = "jdbc:mysql://localhost/" + DB_NAME;

    public static final String TABLE_ORPHAN = "orphan";
    public static final String COLUMN_ORPHAN_ID = "id";
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
    public static final String COLUMN_PHOTO_PORTRAIT_URL = "photoPortraitUrl";
    public static final String COLUMN_PHOTO_LONG_URL = "photoLongUrl";
    public static final String COLUMN_PHOTOS_ORPHAN_ID = "orphanId";

    public static final String TABLE_REGION = "region";
    public static final String COLUMN_REGION_ID = "id";
    public static final String COLUMN_REGION_NAME = "name";

    public static final String TABLE_USER = "user";
    public static final String COLUMN_USER_ID = "id";
    public static final String COLUMN_USER_EMAIL = "email";
    public static final String COLUMN_USER_PASSWORD = "password";

    public static final String TABLE_COORDINATOR = "coordinator";
    public static final String COLUMN_COORDINATOR_ID = "id";
    public static final String COLUMN_COORDINATOR_FULL_NAME = "fullName";
    public static final String COLUMN_COORDINATOR_USER_ID = "userId";

    public static final String TABLE_DISTRICT = "district";
    public static final String COLUMN_DISTRICT_ID = "id";
    public static final String COLUMN_DISTRICT_NAME = "name";
    public static final String COLUMN_DISTRICT_ZONE_ID = "zoneId";
    public static final String COLUMN_DISTRICT_COORDINATOR_ID = "coordinatorId";

    public static final String TABLE_DONOR = "donor";
    public static final String COLUMN_DONOR_ID = "id";
    public static final String COLUMN_DONOR_COMPANY_NAME = "companyName";
    public static final String COLUMN_DONOR_NAME_INITIALS = "nameInitials";
    public static final String COLUMN_DONOR_USER_ID = "userId";
    public static final String COLUMN_DONOR_COORDINATOR_ID = "coordinatorId";

    public static final String TABLE_EDUCATION = "education";
    public static final String COLUMN_EDUCATION_ID = "id";
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
    public static final String COLUMN_ZONE_NAME = "name";
    public static final String COLUMN_ZONE_REGION_ID = "regionId";

    public static final String TABLE_VILLAGE = "village";
    public static final String COLUMN_VILLAGE_ID = "id";
    public static final String COLUMN_VILLAGE_REGISTRATION_DATE = "registrationDate";
    public static final String COLUMN_VILLAGE_NAME = "name";
    public static final String COLUMN_VILLAGE_DISTRICT_ID = "districtId";
    public static final String COLUMN_VILLAGE_DONOR_ID = "donorId";
    public static final String COLUMN_VILLAGE_COORDINATOR_ID = "coordinatorId";

    public static final String TABLE_FATHER = "father";
    public static final String COLUMN_FATHER_ID = "id";
    public static final String COLUMN_FATHER_FIRST_NAME = "firstName";
    public static final String COLUMN_FATHER_LAST_NAME = "lastName";
    public static final String COLUMN_FATHER_DATE_OF_DEATH = "dateOfDeath";
    public static final String COLUMN_FATHER_CAUSE_OF_DEATH = "causeOfDeath";
    public static final String COLUMN_FATHER_DATE_OF_BIRTH = "dateOfBirth";
    public static final String COLUMN_FATHER_DEATH_CERTIFICATE_URL = "deathCertificateUrl";

    public static final String TABLE_GUARDIAN = "guardian";
    public static final String COLUMN_GUARDIAN_ID = "id";
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
    public static final String COLUMN_HEALTH_RECORD_MEDICAL_CERTIFICATE_URL = "medicalCertificateUrl";
    public static final String COLUMN_HEALTH_RECORD_ORPHAN_ID = "orphanId";

    public static final String TABLE_HOUSE_PROPERTY = "house_property";
    public static final String COLUMN_HOUSE_PROPERTY_ID = "id";
    public static final String COLUMN_HOUSE_PROPERTY_HOUSING_SITUATION = "housingSituation";
    public static final String COLUMN_HOUSE_PROPERTY_OTHER_PROPERTY = "otherProperty";

    public static final String TABLE_MOTHER = "mother";
    public static final String COLUMN_MOTHER_ID = "id";
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
            conn = DriverManager.getConnection(CONNECTION_STRING, DB_USER, DB_PASSWORD);
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

    // Query District by Id
    public District queryDistrict(int id) {
        final String sqlQueryDistrict = "SELECT id, name, zoneId, coordinatorId FROM "
                + TABLE_DISTRICT + " WHERE id=" + id;
        try (Statement statement = conn.createStatement();
             ResultSet result = statement.executeQuery(sqlQueryDistrict)) {

            result.next(); // coz the first result is the titles/headers
            District district = new District();
            // getInt fetches the district id from the database setId sets the id of the district object
            district.setId(result.getInt(COLUMN_DISTRICT_ID));
            district.setName(result.getString(COLUMN_DISTRICT_NAME));
            district.setZoneId(result.getInt(COLUMN_DISTRICT_ZONE_ID));
            district.setCoordinatorId(result.getInt(COLUMN_DISTRICT_COORDINATOR_ID));

            return district;

        } catch (SQLException e) {
            System.out.println("districtQuery failed: " + e.getMessage());
            return null;
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

//                orphan.setMotherId(results.getInt(COLUMN_ORPHAN_MOTHER_ID));
//                orphan.setFatherId(results.getInt(COLUMN_ORPHAN_FATHER_ID));
//                orphan.setGuardianId(results.getInt(COLUMN_ORPHAN_GUARDIAN_ID));
//                orphan.setEducationId(results.getInt(COLUMN_ORPHAN_EDUCATION_ID));
//                orphan.setDonorId(results.getInt(COLUMN_ORPHAN_DONOR_ID));
//                orphan.setHouse_propertyId(results.getInt(COLUMN_ORPHAN_HOUSE_PROPERTY_ID));
//                orphan.setVillageId(results.getInt(COLUMN_ORPHAN_VILLAGE_ID));

                orphans.add(orphan);
            }

            return orphans;

        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public Coordinator queryCoordinator(int id) {
        final String sqlQueryCoordinator = "SELECT id, fullName, userId FROM "
                                            + TABLE_COORDINATOR + " WHERE id=" + id;
        try(Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sqlQueryCoordinator)) {

            result.next();
            Coordinator coordinator = new Coordinator();
            coordinator.setId(result.getInt(COLUMN_COORDINATOR_ID));
            coordinator.setFullName(result.getString(COLUMN_COORDINATOR_FULL_NAME));
            coordinator.setUserId(result.getInt(COLUMN_COORDINATOR_USER_ID));

            return coordinator;

        } catch (SQLException e) {
            System.out.println("coordinatorQuery failed: " + e.getMessage());
            return null;
        }
    }

    public Donor queryDonor(int id) {
        final String sqlQueryDonor = "SELECT id, companyName, nameInitials, userId, coordinatorId " +
                                      "FROM " + TABLE_DONOR + " WHERE id=" + id;
        try(Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sqlQueryDonor)) {

            result.next();
            Donor donor = new Donor();
            donor.setId(result.getInt(COLUMN_DISTRICT_ID));
            donor.setCompanyName(result.getString(COLUMN_DONOR_COMPANY_NAME));
            donor.setNameInitials(result.getString(COLUMN_DONOR_NAME_INITIALS));
            donor.setUserId(result.getInt(COLUMN_DONOR_USER_ID));
            donor.setCoordinatorId(result.getInt(COLUMN_DONOR_COORDINATOR_ID));

            return donor;

        } catch (SQLException e) {
            System.out.println("donorQuery failed: " + e.getMessage());
            return null;
        }

    }

    public Education queryEducation(int id) {
        final String sqlQueryEducation = "SELECT id, enrollmentStatus, schoolName, typeOfSchool, " +
                "year, level, reason FROM " + TABLE_EDUCATION + " WHERE id=" + id;
        try (Statement statement = conn.createStatement();
             ResultSet result = statement.executeQuery(sqlQueryEducation)) {

            result.next();
            Education education = new Education();
            education.setId(result.getInt(COLUMN_EDUCATION_ID));
            Education_enrollmentStatus_enum enrollmentStatus = Education_enrollmentStatus_enum.UNENROLLED;
            switch (result.getString(COLUMN_EDUCATION_ENROLLMENT_STATUS)) {
                case "enrolled":
                    enrollmentStatus = Education_enrollmentStatus_enum.ENROLLED;
                    break;
                case "droppedout":
                    enrollmentStatus = Education_enrollmentStatus_enum.DROPPEDOUT;
                    break;
            }
            education.setEnrollmentStatus(enrollmentStatus);
            education.setSchoolName(result.getString(COLUMN_EDUCATION_SCHOOL_NAME));
            education.setTypeOfSchool(result.getString(COLUMN_EDUCATION_TYPE_OF_SCHOOL).equals("private") ?
                    Education_typeOfSchool_enum.PRIVATE : Education_typeOfSchool_enum.PUBLIC);
            education.setYear(result.getString(COLUMN_EDUCATION_YEAR));
            Education_level_enum level = switch (result.getString(COLUMN_EDUCATION_LEVEL)) {
                case "religiousEducation" -> Education_level_enum.RELIGIOUSEDUCATION;
                case "preSchool" -> Education_level_enum.PRESCHOOL;
                case "gradeSchool" -> Education_level_enum.GRADESCHOOL;
                case "underGraduate" -> Education_level_enum.UNDERGRADUATE;
                case "postGraduate" -> Education_level_enum.POSTGRADUATE;
                default -> Education_level_enum.N_A;
            };
            education.setLevel(level);
            education.setReason(result.getString(COLUMN_EDUCATION_REASON));

            return education;

        } catch (SQLException e) {
            System.out.println("EductionQuery failed: " + e.getMessage());
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

    public Father queryFather(int id) {
        final String sqlQueryFather = "SELECT * FROM " + TABLE_FATHER + " WHERE id=" + id;

        try (Statement statement = conn.createStatement();
             ResultSet result = statement.executeQuery(sqlQueryFather)) {

            result.next();
            Father father = new Father();
            father.setId(result.getInt(COLUMN_FATHER_ID));
            father.setFirstName(result.getString(COLUMN_FATHER_FIRST_NAME));
            father.setLastName(result.getString(COLUMN_FATHER_LAST_NAME));
            father.setDateOfBirth(result.getString(COLUMN_FATHER_DATE_OF_BIRTH));
            father.setDateOfDeath(result.getString(COLUMN_FATHER_DATE_OF_DEATH));
            father.setCauseOfDeath(result.getString(COLUMN_FATHER_CAUSE_OF_DEATH));
            father.setDeathCertificateUrl(result.getString(COLUMN_FATHER_DEATH_CERTIFICATE_URL));

            return father;

        } catch (SQLException e) {
            System.out.println("FatherQuery failed: " + e.getMessage());
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

    public Guardian queryGuardian(int id) {
        final String sqlqueryGuardian = "SELECT * FROM " + TABLE_GUARDIAN + " WHERE id=" + id;

        try (Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sqlqueryGuardian)) {

            result.next();
            Guardian guardian = new Guardian();
            guardian.setId(result.getInt(COLUMN_GUARDIAN_ID));
            guardian.setFirstName(result.getString(COLUMN_GUARDIAN_FIRST_NAME));
            guardian.setMiddleName(result.getString(COLUMN_GUARDIAN_MIDDLE_NAME));
            guardian.setLastName(result.getString(COLUMN_GUARDIAN_LAST_NAME));
            guardian.setGender(result.getString(COLUMN_GUARDIAN_GENDER).equals("M") ?
                                Gender_enum.M : Gender_enum.F);
            guardian.setDateOfBirth(result.getString(COLUMN_GUARDIAN_DATE_OF_BIRTH));
            Guardian_relationToOrphan_enum relationToOrphan = switch (result.getString(COLUMN_GUARDIAN_RELATION_TO_ORPHAN)) {
                case "mother" -> Guardian_relationToOrphan_enum.MOTHER;
                case "grandmother" -> Guardian_relationToOrphan_enum.GRANDMOTHER ;
                case "grandfather" -> Guardian_relationToOrphan_enum.GRANDFATHER;
                case "sister" -> Guardian_relationToOrphan_enum.SISTER;
                case "brother" -> Guardian_relationToOrphan_enum.BROTHER;
                case "uncle" -> Guardian_relationToOrphan_enum.UNCLE;
                case "aunt" -> Guardian_relationToOrphan_enum.AUNT;
                case "niece" -> Guardian_relationToOrphan_enum.NIECE;
                case "nephew" -> Guardian_relationToOrphan_enum.NEPHEW;
                default -> Guardian_relationToOrphan_enum.LEGALGUARDIAN;
            };
            guardian.setRelationToOrphan(relationToOrphan);
            guardian.setEmail(result.getString(COLUMN_GUARDIAN_EMAIL));
            guardian.setMobileNumber(result.getString(COLUMN_GUARDIAN_MOBILE_NUMBER));
            guardian.setTelephoneNumber(result.getString(COLUMN_GUARDIAN_TELEPHONE_NUMBER));
            Guardian_nationality_enum nationality = switch (result.getString(COLUMN_GUARDIAN_NATIONALITY)) {
                case "DJIBOUTIAN" -> Guardian_nationality_enum.DJIBOUTIAN;
                case "ETHIOPIAN" -> Guardian_nationality_enum.ETHIOPIAN;
                case "ERITREAN" -> Guardian_nationality_enum.ERITREAN;
                case "KENYAN" -> Guardian_nationality_enum.KENYAN;
                case "SOMALI" -> Guardian_nationality_enum.SOMALI;
                case "SOUTH-SUDANESE" -> Guardian_nationality_enum.SOUTH_SUDANESE;
                default -> Guardian_nationality_enum.SUDANESE;
            };
            guardian.setNationality(nationality);
            guardian.setGuardianIDCardUrl(result.getString(COLUMN_GUARDIAN_GUARDIAN_ID_CARD_URL));
            guardian.setGuardianConfirmationLetterUrl(result.getString(COLUMN_GUARDIAN_GUARDIAN_CONFIRMATION_LETTER_URL));
            guardian.setGuardianLegalConfirmationLetterUrl(result.getString(COLUMN_GUARDIAN_GUARDIAN_LEGAL_CONFIRMATION_LETTER_URL));

            return guardian;

        } catch (SQLException e) {
            System.out.println("GuardianQuery failed: " + e.getMessage());
            return null;
        }
    }

    public DistrictJoin queryDistrictJoin() {
        final String sqlQueryDistrictJoin = "SELECT d.name AS district_name, z.name AS zone_name, c.fullName AS coordinator_Name" +
                " FROM district d" +
                " JOIN coordinator c ON c.id = d.coordinatorId" +
                " JOIN zone z ON d.zoneId = z.id";
        try(Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sqlQueryDistrictJoin)) {

            result.next();
            District district = new District();
            district.setName(result.getString("district_name"));
            Zone zone = new Zone();
            zone.setName(result.getString("zone_name"));
            Coordinator coordinator = new Coordinator();
            coordinator.setFullName(result.getString("coordinator_Name"));
            DistrictJoin districtJoin = new DistrictJoin();
            districtJoin.setDistrict(district);
            districtJoin.setZone(zone);
            districtJoin.setCoordinator(coordinator);

            return districtJoin;

        } catch (SQLException e) {
            System.out.println("DistrictJoinQuery failed: " + e.getMessage());
            return null;
        }
    }

    public Orphan queryOrphan (int id) {
        final String sqlQueryOrphan = "select o.id, o.firstName as orphanFirstName, o.gender as orphanGender, o.placeOfBirth as orphanPlaceOfBirth," +
                " o.dateOfBirth as orphanDateOfBirth, o.spokenLanguages as orphanSpokenLanguages," +
                " o.gradeAgeMismatchReason as orphanGradeAgeMismatchReason, o.hobbies as orphanHobbies," +
                " o.religion as orphanReligion, o.birthCertificateUrl as orphanBirthCertificateUrl," +
                " o.healthDescription as orphanHealthDescription, o.psychologicalStatus as orphanPsychologicalStatus," +
                " m.firstName as motherFirstName, m.middleName as motherMiddleName, m.lastName as motherLastName," +
                " m.dateOfBirth as motherDateOfBirth, m.vitalStatus as motherVitalStatus, m.dateOfDeath as motherDateOfDeath," +
                " m.causeOfDeath as motherCauseOfDeath, m.mobileNumber as motherMobileNumber," +
                " m.maritalStatus as motherMaritalStatus, m.currentJobTitle as motherCurrentJobTitle," +
                " m.monthlyIncome as motherMonthlyIncome, m.monthlyExpense as motherMonthlyExpense," +
                " f.firstName as fatherFirstName, f.lastName as fatherLastName, f.dateOfBirth as fatherDateOfBirth," +
                " f.dateOfDeath as fatherDateOfDeath, f.causeOfDeath as fatherCauseOfDeath," +
                " f.deathCertificateUrl as fatherDeathCertificateUrl, g.firstName as guardianFirstName," +
                " g.middleName as guardianMiddleName, g.lastName as guardianLastName, g.gender as guardianGender," +
                " g.dateOfBirth as guardianDateOfBirth,g.relationToOrphan as guardianRelationToOrphan," +
                " g.email as guardianEmail, g.mobileNumber as guardianMobileNumber," +
                " g.telephoneNumber as guardianTelephoneNumber, g.nationality as guardianNationality," +
                " g.guardianIDCardUrl , g.guardianConfirmationLetterUrl, g.guardianLegalConfirmationLetterUrl," +
                " e.enrollmentStatus educationEnrollmentStatus, e.schoolName as educationSchoolName," +
                " e.typeOfSchool as educationTypeOfSchool, e.year as educationYear, e.level as educationLevel," +
                " e.reason as educationReason, d.companyName as donorCompanyName,d.nameInitials as donorNameInitials," +
                " v.name as villageName, v.registrationDate as villageRegistrationDate," +
                " hp.housingSituation, hp.otherProperty  as housingSituationOtherProperty" +
                " from orphan o" +
                " join mother m on o.motherId = m.id" +
                " join father f on o.fatherId = f.id" +
                " join guardian g on o.guardianId = g.id" +
                " join education e on o.educationId = e.id" +
                " join donor d on o.donorId = d.id" +
                " join village v on o.villageId = v.id" +
                " join house_property hp on o.house_PropertyId = hp.id" +
                " where o.id=" + id;
        try (Statement statement = conn.createStatement();
             ResultSet result = statement.executeQuery(sqlQueryOrphan)) {

            result.next();
            Orphan orphan = new Orphan();
            orphan.setId(result.getInt("id"));
            orphan.setFirstName(result.getString("orphanFirstName"));
            orphan.setGender(result.getString("orphanGender").equals("M") ? Gender_enum.M : Gender_enum.F);
            orphan.setDateOfBirth(result.getString("orphanDateOfBirth"));
            orphan.setSpokenLanguages(result.getString("orphanSpokenLanguages"));
            orphan.setGradeAgeMismatchReason(result.getString("orphanGradeAgeMismatchReason"));
            orphan.setHobbies(result.getString("orphanHobbies"));
            orphan.setReligion(switch (result.getString("orphanReligion")) {
                case "Christianity" -> Orphan_religion_enum.CHRISTIANITY;
                case "Islam" -> Orphan_religion_enum.ISLAM;
                case "Buddhism" -> Orphan_religion_enum.BUDDHISM;
                case "Hinduism" -> Orphan_religion_enum.HINDUISM;
                case "Judaism" -> Orphan_religion_enum.JUDAISM;
                default ->  Orphan_religion_enum.OTHER;
            });
            orphan.setBirthCertificateUrl(result.getString("orphanBirthCertificateUrl"));
            orphan.setHealthDescription(result.getString("orphanHealthDescription"));
            orphan.setPsychologicalStatus(switch (result.getString("orphanPsychologicalStatus")) {
               case "isolated" -> Orphan_psychologicalStatus_enum.ISOLATED;
               case "stressed" -> Orphan_psychologicalStatus_enum.STRESSED;
               case "unsociable" -> Orphan_psychologicalStatus_enum.UNSOCIABLE;
               case "overlysociable" -> Orphan_psychologicalStatus_enum.OVERLYSOCIABLE;
               default -> Orphan_psychologicalStatus_enum.NORMAL;
            });
            orphan.getMother().setFirstName(result.getString("motherFirstName"));
            orphan.getMother().setMiddleName(result.getString("motherMiddleName"));
            orphan.getMother().setLastName(result.getString("motherLastName"));
            orphan.getMother().setDateOfBirth((result.getString("motherDateOfBirth")));
            orphan.getMother().setVitalStatus(result.getString("motherVitalStatus").equals("alive") ?
                                              Mother_vitalStatus_enum.ALIVE : Mother_vitalStatus_enum.PASSED);
            orphan.getMother().setDateOfDeath(result.getString("motherDateOfDeath"));
            orphan.getMother().setCauseOfDeath(result.getString("motherCauseOfDeath"));
            orphan.getMother().setMobileNumber(result.getString("motherMobileNumber"));
            orphan.getMother().setMaritalStatus(switch (result.getString("motherMaritalStatus")) {
                case "married" -> Mother_maritalStatus_enum.MARRIED;
                case "widow" -> Mother_maritalStatus_enum.WIDOW;
                default -> Mother_maritalStatus_enum.N_A;
            });
            orphan.getMother().setCurrentJobTitle(result.getString("motherCurrentJobTitle"));
            orphan.getMother().setMonthlyIncome(result.getFloat("motherMonthlyIncome"));
            orphan.getMother().setMonthlyExpense(result.getFloat("motherMonthlyExpense"));
            orphan.getFather().setFirstName(result.getString("fatherFirstName"));
            orphan.getFather().setLastName(result.getString("fatherLastName"));
            orphan.getFather().setDateOfBirth(result.getString("fatherDateOfBirth"));
            orphan.getFather().setDateOfDeath(result.getString("fatherDateOfDeath"));
            orphan.getFather().setCauseOfDeath(result.getString("fatherCauseOfDeath"));
            orphan.getFather().setDeathCertificateUrl(result.getString("fatherDeathCertificateUrl"));
            orphan.getGuardian().setFirstName(result.getString("guardianFirstName"));
            orphan.getGuardian().setMiddleName(result.getString("guardianMiddleName"));
            orphan.getGuardian().setLastName(result.getString("guardianLastName"));
            orphan.getGuardian().setGender(result.getString("guardianGender").equals("M") ?
                                           Gender_enum.M : Gender_enum.F);
            orphan.getGuardian().setDateOfBirth(result.getString("guardianDateOfBirth"));
            orphan.getGuardian().setRelationToOrphan(switch (result.getString("guardianRelationToOrphan")) {
                case "mother" -> Guardian_relationToOrphan_enum.MOTHER;
                case "grandmother" -> Guardian_relationToOrphan_enum.GRANDMOTHER ;
                case "grandfather" -> Guardian_relationToOrphan_enum.GRANDFATHER;
                case "sister" -> Guardian_relationToOrphan_enum.SISTER;
                case "brother" -> Guardian_relationToOrphan_enum.BROTHER;
                case "uncle" -> Guardian_relationToOrphan_enum.UNCLE;
                case "aunt" -> Guardian_relationToOrphan_enum.AUNT;
                case "niece" -> Guardian_relationToOrphan_enum.NIECE;
                case "nephew" -> Guardian_relationToOrphan_enum.NEPHEW;
                default -> Guardian_relationToOrphan_enum.LEGALGUARDIAN;
            });
            orphan.getGuardian().setEmail(result.getString("guardianEmail"));
            orphan.getGuardian().setMobileNumber(result.getString("guardianMobileNumber"));
            orphan.getGuardian().setTelephoneNumber(result.getString("guardianTelephoneNumber"));
            Guardian_nationality_enum nationality = switch (result.getString("guardianNationality")) {
                case "DJIBOUTIAN" -> Guardian_nationality_enum.DJIBOUTIAN;
                case "ETHIOPIAN" -> Guardian_nationality_enum.ETHIOPIAN;
                case "ERITREAN" -> Guardian_nationality_enum.ERITREAN;
                case "KENYAN" -> Guardian_nationality_enum.KENYAN;
                case "SOMALI" -> Guardian_nationality_enum.SOMALI;
                case "SOUTH-SUDANESE" -> Guardian_nationality_enum.SOUTH_SUDANESE;
                default -> Guardian_nationality_enum.SUDANESE;
            };
            orphan.getGuardian().setNationality(nationality);
            orphan.getGuardian().setGuardianIDCardUrl(result.getString("guardianIDCardUrl"));
            orphan.getGuardian().setGuardianConfirmationLetterUrl(result.getString("guardianConfirmationLetterUrl"));
            orphan.getGuardian().setGuardianLegalConfirmationLetterUrl(result.getString("guardianLegalConfirmationLetterUrl"));
            Education_enrollmentStatus_enum enrollmentStatus = Education_enrollmentStatus_enum.UNENROLLED;
            switch (result.getString("educationEnrollmentStatus")){
                case "enrolled":
                    enrollmentStatus = Education_enrollmentStatus_enum.ENROLLED;
                    break;
                case "droppedout":
                    enrollmentStatus = Education_enrollmentStatus_enum.DROPPEDOUT;
                    break;
            }
            orphan.getEducation().setEnrollmentStatus(enrollmentStatus);
            orphan.getEducation().setSchoolName(result.getString("educationSchoolName"));
            orphan.getEducation().setTypeOfSchool(result.getString("educationTypeOfSchool").equals("private") ?
                    Education_typeOfSchool_enum.PRIVATE : Education_typeOfSchool_enum.PUBLIC);
            orphan.getEducation().setYear(result.getString("educationYear"));
            Education_level_enum level = switch (result.getString("educationLevel")) {
                case "religiousEducation" -> Education_level_enum.RELIGIOUSEDUCATION;
                case "preSchool" -> Education_level_enum.PRESCHOOL;
                case "gradeSchool" -> Education_level_enum.GRADESCHOOL;
                case "underGraduate" -> Education_level_enum.UNDERGRADUATE;
                case "postGraduate" -> Education_level_enum.POSTGRADUATE;
                default -> Education_level_enum.N_A;
            };
            orphan.getEducation().setLevel(level);
            orphan.getEducation().setReason(result.getString("educationReason"));
            orphan.getDonor().setCompanyName(result.getString("donorCompanyName"));
            orphan.getDonor().setNameInitials(result.getString("donorNameInitials"));
            orphan.getVillage().setName(result.getString("villageName"));
            orphan.getVillage().setRegistrationDate(result.getString("villageRegistrationDate"));
            orphan.getHouse_property().setHousingSituation(result.getString("housingSituation"));
            orphan.getHouse_property().setHousingSituation(result.getString("housingSituationOtherProperty"));
            return orphan;
        } catch (SQLException e) {
            System.out.println("OrphanQuery failed: " + e.getMessage());
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
