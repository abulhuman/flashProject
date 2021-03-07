package com.company.model;

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
    public static final String COLUMN_ORPHAN_RELIGION = "religion";
    public static final String COLUMN_ORPHAN_BIRTH_CERTIFICATE = "birthCertificate";
    public static final String COLUMN_ORPHAN_HEALTH_DESCRIPTION = "healthDescription";
    public static final String COLUMN_ORPHAN_PSYCHOLOGICAL_STATUS = "psychologicalStatus";
    public static final String COLUMN_ORPHAN_MOTHER_ID = "motherId";
    public static final String COLUMN_ORPHAN_FATHER_ID = "fatherId";
    public static final String COLUMN_ORPHAN_GUARDIAN_ID = "guardianId";
    public static final String COLUMN_ORPHAN_EDUCATION_ID = "educationId";
    public static final String COLUMN_ORPHAN_VILLAGE_ID = "villageId";

    public static final String TABLE_ORPHAN_PHOTOS = "OrphanPhotos";
    public static final String COLUMN_PHOTOS_ID = "id";
    public static final String COLUMN_PHOTO_PORTRAIT = "photoPortrait";
    public static final String COLUMN_PHOTO_LONG = "photoLong";
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
    public static final String COLUMN_EDUCATIONAL_RECORD_YEAR_DIVISION = "yearDivision";
    public static final String COLUMN_EDUCATIONAL_RECORD_QUARTER = "quarter";
    public static final String COLUMN_EDUCATIONAL_RECORD_SEMESTER = "semester";
    public static final String COLUMN_EDUCATIONAL_RECORD_TOTAL_MARK = "totalMark";
    public static final String COLUMN_EDUCATIONAL_RECORD_NUMBER_OF_SUBJECTS = "numberOfSubjects";
    public static final String COLUMN_EDUCATIONAL_RECORD_AVERAGE = "average";
    public static final String COLUMN_EDUCATIONAL_RECORD_RANK = "rank";
    public static final String COLUMN_EDUCATIONAL_RECORD_REPORT_CARD = "reportCard";
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

    public static final String TABLE_FATHER = "father";
    public static final String COLUMN_FATHER_ID = "id";
    public static final String COLUMN_FATHER_FIRST_NAME = "firstName";
    public static final String COLUMN_FATHER_LAST_NAME = "lastName";
    public static final String COLUMN_FATHER_DATE_OF_DEATH = "dateOfDeath";
    public static final String COLUMN_FATHER_CAUSE_OF_DEATH = "causeOfDeath";
    public static final String COLUMN_FATHER_DATE_OF_BIRTH = "dateOfBirth";
    public static final String COLUMN_FATHER_DEATH_CERTIFICATE = "deathCertificate";

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
    public static final String COLUMN_GUARDIAN_GUARDIAN_ID_CARD = "guardianIdCard";
    public static final String COLUMN_GUARDIAN_GUARDIAN_CONFIRMATION_LETTER= "guardianConfirmationLetter";
    public static final String COLUMN_GUARDIAN_GUARDIAN_LEGAL_CONFIRMATION_LETTER = "guardianLegalConfirmationLetter";

    public static final String TABLE_HEALTH_RECORD = "healthrecord";
    public static final String COLUMN_HEALTH_RECORD_ID = "id";
    public static final String COLUMN_HEALTH_RECORD_MEDICAL_CERTIFICATE = "medicalCertificate";
    public static final String COLUMN_HEALTH_RECORD_ORPHAN_ID = "orphanId";

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

    // Insert strings for prepared SQL statements
    public static final String INSERT_REGION = String.format("INSERT INTO %s (%s) VALUES (?)",
            TABLE_REGION, COLUMN_REGION_NAME);
    public static final String INSERT_ZONE = String.format("INSERT INTO %s (%s, %s) VALUES (?, ?)",
            TABLE_ZONE, COLUMN_ZONE_NAME, COLUMN_ZONE_REGION_ID);

    public static final String INSERT_USER = String.format(
            "INSERT INTO %s (%s, %s) VALUES (?, ?)",
            TABLE_USER,
            COLUMN_USER_EMAIL,
            COLUMN_USER_PASSWORD);
    public static final String INSERT_COORDINATOR = String.format(
            "INSERT INTO %s (%s, %s) VALUES (?, ?)",
            TABLE_COORDINATOR,
            COLUMN_COORDINATOR_FULL_NAME,
            COLUMN_COORDINATOR_USER_ID);

    public static final String INSERT_DISTRICT = String.format(
            "INSERT INTO %s (%s, %s, %s) VALUES (?, ?, ?)",
            TABLE_DISTRICT, COLUMN_DISTRICT_NAME, COLUMN_DISTRICT_ZONE_ID,
            COLUMN_DISTRICT_COORDINATOR_ID);
    public static final String INSERT_VILLAGE = String.format(
            "INSERT INTO %s (%s, %s, %s) VALUES (?, ?, ?)",
            TABLE_VILLAGE, COLUMN_VILLAGE_REGISTRATION_DATE, COLUMN_VILLAGE_NAME,
            COLUMN_VILLAGE_DISTRICT_ID);

    public static final String INSERT_FATHER = String.format(
            "INSERT INTO %s (%s, %s, %s, %s, %s, %s) VALUES (?, ?, ?, ?, ?, ?)",
            TABLE_FATHER, COLUMN_FATHER_FIRST_NAME, COLUMN_FATHER_LAST_NAME,
            COLUMN_FATHER_DATE_OF_DEATH, COLUMN_FATHER_CAUSE_OF_DEATH,
            COLUMN_FATHER_DATE_OF_BIRTH, COLUMN_FATHER_DEATH_CERTIFICATE);
    public static final String INSERT_MOTHER = String.format(
            "INSERT INTO %s (%s,%s, %s,%s, %s,%s, %s,%s, %s,%s, %s, %s) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", TABLE_MOTHER,
            COLUMN_MOTHER_FIRST_NAME, COLUMN_MOTHER_MIDDLE_NAME, COLUMN_MOTHER_LAST_NAME,
            COLUMN_MOTHER_VITAL_STATUS, COLUMN_MOTHER_DATE_OF_BIRTH, COLUMN_MOTHER_DATE_OF_DEATH,
            COLUMN_MOTHER_CAUSE_OF_DEATH, COLUMN_MOTHER_MOBILE_NUMBER, COLUMN_MOTHER_MARITAL_STATUS,
            COLUMN_MOTHER_CURRENT_JOB_TITLE, COLUMN_MOTHER_MONTHLY_INCOME, COLUMN_MOTHER_MONTHLY_EXPENSE);
    public static final String INSERT_GUARDIAN = String.format(
            "INSERT INTO %s (%s,%s, %s,%s, %s,%s, %s,%s, %s,%s, %s, %s, %s) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", TABLE_GUARDIAN,
            COLUMN_GUARDIAN_FIRST_NAME, COLUMN_GUARDIAN_MIDDLE_NAME, COLUMN_GUARDIAN_LAST_NAME,
            COLUMN_GUARDIAN_GENDER, COLUMN_GUARDIAN_DATE_OF_BIRTH, COLUMN_GUARDIAN_RELATION_TO_ORPHAN,
            COLUMN_GUARDIAN_EMAIL, COLUMN_GUARDIAN_MOBILE_NUMBER, COLUMN_GUARDIAN_TELEPHONE_NUMBER,
            COLUMN_GUARDIAN_NATIONALITY, COLUMN_GUARDIAN_GUARDIAN_ID_CARD,
            COLUMN_GUARDIAN_GUARDIAN_CONFIRMATION_LETTER,
            COLUMN_GUARDIAN_GUARDIAN_LEGAL_CONFIRMATION_LETTER);
    public static final String INSERT_EDUCATION = String.format(
            "INSERT INTO %s (%s, %s, %s, %s, %s, %s) VALUES (?, ?, ?, ?, ?, ?)",
            TABLE_EDUCATION, COLUMN_EDUCATION_ENROLLMENT_STATUS, COLUMN_EDUCATION_SCHOOL_NAME,
            COLUMN_EDUCATION_TYPE_OF_SCHOOL, COLUMN_EDUCATION_YEAR, COLUMN_EDUCATION_LEVEL,
            COLUMN_EDUCATION_REASON);
    public static final String INSERT_ORPHAN = String.format(
            "INSERT INTO %s (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s, %s, %s, %s, %s) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
            TABLE_ORPHAN, COLUMN_ORPHAN_FIRST_NAME, COLUMN_ORPHAN_GENDER, COLUMN_ORPHAN_PLACE_OF_BIRTH,
            COLUMN_ORPHAN_DATE_OF_BIRTH, COLUMN_ORPHAN_SPOKEN_LANGUAGE, COLUMN_ORPHAN_RELIGION,
            COLUMN_ORPHAN_BIRTH_CERTIFICATE, COLUMN_ORPHAN_HEALTH_DESCRIPTION,
            COLUMN_ORPHAN_PSYCHOLOGICAL_STATUS, COLUMN_ORPHAN_FATHER_ID, COLUMN_ORPHAN_MOTHER_ID,
            COLUMN_ORPHAN_GUARDIAN_ID, COLUMN_ORPHAN_EDUCATION_ID, COLUMN_ORPHAN_VILLAGE_ID
    );

    // Query strings for prepared SQL statements
    public static final String QUERY_REGION = String.format(
            "SELECT %s FROM %s WHERE %s = ?",
            COLUMN_REGION_ID, TABLE_REGION,
            COLUMN_REGION_NAME
    );
    public static final String QUERY_ZONE = String.format(
            "SELECT %s FROM %s WHERE %s = ?",
            COLUMN_ZONE_ID, TABLE_ZONE,
            COLUMN_ZONE_NAME
    );

    public static final String QUERY_USER = String.format(
            "SELECT %s FROM %s WHERE %s = ?",
            COLUMN_USER_ID,
            TABLE_USER,
            COLUMN_USER_EMAIL);
    public static final String QUERY_COORDINATOR = String.format(
            "SELECT %s FROM %s WHERE %s = ?",
            COLUMN_COORDINATOR_ID,
            TABLE_COORDINATOR,
            COLUMN_COORDINATOR_USER_ID);

    public static final String QUERY_DISTRICT = String.format(
            "SELECT %s FROM %s WHERE %s = ?",
            COLUMN_DISTRICT_ID, TABLE_DISTRICT,
            COLUMN_DISTRICT_NAME
    );
    public static final String QUERY_VILLAGE = String.format(
            "SELECT %s FROM %s WHERE %s = ?",
            COLUMN_VILLAGE_ID, TABLE_VILLAGE,
            COLUMN_VILLAGE_NAME
    );
    public static final String QUERY_FATHER = String.format(
            "SELECT %s FROM %s WHERE %s = ? AND %s = ?",
            COLUMN_FATHER_ID,
            TABLE_FATHER,
            COLUMN_FATHER_FIRST_NAME,
            COLUMN_FATHER_LAST_NAME);
    public static final String QUERY_MOTHER = String.format(
            "SELECT %s FROM %s WHERE %s = ? AND %s = ? AND %s = ?",
            COLUMN_MOTHER_ID,
            TABLE_MOTHER,
            COLUMN_MOTHER_FIRST_NAME,
            COLUMN_MOTHER_MIDDLE_NAME,
            COLUMN_MOTHER_LAST_NAME);
    public static final String QUERY_GUARDIAN = String.format(
            "SELECT %s FROM %s WHERE %s = ? AND %s = ? AND %s = ?",
            COLUMN_GUARDIAN_ID,
            TABLE_GUARDIAN,
            COLUMN_GUARDIAN_FIRST_NAME,
            COLUMN_GUARDIAN_MIDDLE_NAME,
            COLUMN_GUARDIAN_LAST_NAME);
    // String constant QUERY_EDUCATION and PreparedStatement
    // queryEducation skipped because Orphan[1:1]Education
    // and there is no need to check for duplicates

    public static final String QUERY_ORPHAN = String.format(
            "SELECT %s FROM %s WHERE %s = ? AND %s = ? AND %s = ?",
            COLUMN_ORPHAN_ID, TABLE_ORPHAN, COLUMN_ORPHAN_FIRST_NAME,
            COLUMN_ORPHAN_GENDER, COLUMN_ORPHAN_PLACE_OF_BIRTH
    );


    private Connection conn;

    private PreparedStatement insertIntoRegions;
    private PreparedStatement insertIntoZones;

    private PreparedStatement insertIntoUsers;
    private PreparedStatement insertIntoCoordinators;

    private PreparedStatement insertIntoDistricts;
    private PreparedStatement insertIntoVillages;

    private PreparedStatement insertIntoFathers;
    private PreparedStatement insertIntoMothers;
    private PreparedStatement insertIntoGuardians;
    private PreparedStatement insertIntoEducations;

    private PreparedStatement insertIntoOrphans;

    private PreparedStatement queryRegion;
    private PreparedStatement queryZone;

    private PreparedStatement queryUser;
    private PreparedStatement queryCoordinator;

    private PreparedStatement queryDistrict;
    private PreparedStatement queryVillage;

    private PreparedStatement queryFather;
    private PreparedStatement queryMother;
    private PreparedStatement queryGuardian;

    private PreparedStatement queryOrphan;


    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING, DB_USER, DB_PASSWORD);

            insertIntoRegions = conn.prepareStatement(INSERT_REGION, Statement.RETURN_GENERATED_KEYS);
            insertIntoZones = conn.prepareStatement(INSERT_ZONE, Statement.RETURN_GENERATED_KEYS);

            insertIntoUsers = conn.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);
            insertIntoCoordinators = conn.prepareStatement(INSERT_COORDINATOR, Statement.RETURN_GENERATED_KEYS);

            insertIntoDistricts = conn.prepareStatement(INSERT_DISTRICT, Statement.RETURN_GENERATED_KEYS);
            insertIntoVillages = conn.prepareStatement(INSERT_VILLAGE, Statement.RETURN_GENERATED_KEYS);

            insertIntoFathers = conn.prepareStatement(INSERT_FATHER, Statement.RETURN_GENERATED_KEYS);
            insertIntoMothers = conn.prepareStatement(INSERT_MOTHER, Statement.RETURN_GENERATED_KEYS);
            insertIntoGuardians = conn.prepareStatement(INSERT_GUARDIAN, Statement.RETURN_GENERATED_KEYS);
            insertIntoEducations = conn.prepareStatement(INSERT_EDUCATION, Statement.RETURN_GENERATED_KEYS);

            insertIntoOrphans = conn.prepareStatement(INSERT_ORPHAN);

            queryRegion = conn.prepareStatement(QUERY_REGION);
            queryZone = conn.prepareStatement(QUERY_ZONE);

            queryUser = conn.prepareStatement(QUERY_USER);
            queryCoordinator = conn.prepareStatement(QUERY_COORDINATOR);

            queryDistrict = conn.prepareStatement(QUERY_DISTRICT);
            queryVillage = conn.prepareStatement(QUERY_VILLAGE);

            queryFather = conn.prepareStatement(QUERY_FATHER);
            queryMother = conn.prepareStatement(QUERY_MOTHER);
            queryGuardian = conn.prepareStatement(QUERY_GUARDIAN);

            queryOrphan = conn.prepareStatement(QUERY_ORPHAN);

            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if (insertIntoRegions != null) insertIntoRegions.close();
            if (insertIntoZones != null) insertIntoZones.close();

            if (insertIntoUsers != null) insertIntoUsers.close();
            if (insertIntoCoordinators != null) insertIntoCoordinators.close();

            if (insertIntoDistricts != null) insertIntoDistricts.close();
            if (insertIntoVillages != null) insertIntoVillages.close();

            if (insertIntoFathers != null) insertIntoFathers.close();
            if (insertIntoMothers != null) insertIntoMothers.close();
            if (insertIntoGuardians != null) insertIntoGuardians.close();
            if (insertIntoEducations != null) insertIntoEducations.close();

            if (insertIntoOrphans != null) insertIntoOrphans.close();

            if (queryRegion != null) queryRegion.close();
            if (queryZone != null) queryZone.close();

            if (queryUser != null) queryUser.close();
            if (queryCoordinator != null) queryCoordinator.close();

            if (queryDistrict != null) queryDistrict.close();
            if (queryVillage != null) queryVillage.close();

            if (queryFather != null) queryFather.close();
            if (queryMother != null) queryMother.close();
            if (queryGuardian != null) queryGuardian.close();

            if (queryOrphan != null) queryOrphan.close();

            if (conn != null) conn.close();

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

                Orphan_religion_enum religion = switch (results.getString(COLUMN_ORPHAN_RELIGION)) {
                    case "Christianity" -> Orphan_religion_enum.CHRISTIANITY;
                    case "Buddhism" -> Orphan_religion_enum.BUDDHISM;
                    case "Hinduism" -> Orphan_religion_enum.HINDUISM;
                    case "Judaism" -> Orphan_religion_enum.JUDAISM;
                    case "Other" -> Orphan_religion_enum.OTHER;
                    default -> Orphan_religion_enum.ISLAM;
                };

                orphan.setReligion(religion);

                orphan.setBirthCertificate(results.getBlob(COLUMN_ORPHAN_BIRTH_CERTIFICATE));
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
                educationalRecord.setReportCard(results.getBlob(COLUMN_EDUCATIONAL_RECORD_REPORT_CARD));
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
            father.setDeathCertificate(result.getBlob(COLUMN_FATHER_DEATH_CERTIFICATE));

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
            orphan.setReligion(switch (result.getString("orphanReligion")) {
                case "Christianity" -> Orphan_religion_enum.CHRISTIANITY;
                case "Islam" -> Orphan_religion_enum.ISLAM;
                case "Buddhism" -> Orphan_religion_enum.BUDDHISM;
                case "Hinduism" -> Orphan_religion_enum.HINDUISM;
                case "Judaism" -> Orphan_religion_enum.JUDAISM;
                default ->  Orphan_religion_enum.OTHER;
            });
            orphan.setBirthCertificate(result.getBlob("orphanBirthCertificate"));
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
            orphan.getFather().setDeathCertificate(result.getBlob("fatherDeathCertificate"));
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
            orphan.getVillage().setName(result.getString("villageName"));
            orphan.getVillage().setRegistrationDate(result.getString("villageRegistrationDate"));
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

    private int searchCoordinatorIdByFullName(String fullName) throws SQLException {
        queryCoordinator.setString(1, fullName);

        ResultSet results = queryCoordinator.executeQuery();
        if (results.next()) return results.getInt(1);
        else throw new SQLException("Couldn't find a coordinator with that name");
    }

    private int searchRegionIdByName(String name) throws SQLException {
        // sets the first question mark with name field
        queryRegion.setString(1, name);
        // executes the name set statement
        ResultSet results = queryRegion.executeQuery();
        // if the name exists return the id which is basicly what the statement does
        if (results.next()) return results.getInt(1);
        else throw new SQLException("Couldn't find a region with that name");
    }

    private int searchZoneIdByName(String name) throws SQLException {
        queryZone.setString(1, name);

        ResultSet results = queryZone.executeQuery();
        if (results.next()) return results.getInt(1);
        else throw new SQLException("Couldn't find a zone with that name");
    }

    private int searchDistrictIdByName(String districtName) throws SQLException {
        queryDistrict.setString(1, districtName);

        ResultSet results = queryDistrict.executeQuery();
        if (results.next()) return results.getInt(1);
        else throw new SQLException("Couldn't find a district with that name");
    }

    private int searchVillageIdByName(String name) throws SQLException {
        queryVillage.setString(1, name);

        ResultSet results = queryVillage.executeQuery();
        if (results.next()) return results.getInt(1);
        else throw new SQLException("Couldn't find a village with that name");
    }

    public int insertRegion(String name) throws SQLException {
        // sets the first question mark with name field
        queryRegion.setString(1, name);
        // executes the name set statement
        ResultSet results = queryRegion.executeQuery();

        // if the name exists return the id which is basicly what the statement does
        if (results.next()) return results.getInt(COLUMN_REGION_ID);
        else {
            // assigns the name field to the first place of the question mark in the prepared
            // statement 'insertIntoRegion'
            insertIntoRegions.setString(1, name);

            // executes the prepared statement returns the rows affected by the statement
            int affectedRows = insertIntoRegions.executeUpdate();

            if (affectedRows != 1) throw new SQLException("Couldn't insert region!");

            // gets the generated keys of the affected rows
            ResultSet generatedKeys = insertIntoRegions.getGeneratedKeys();

            // gets the value of the affected row, first column
            if (generatedKeys.next()) return generatedKeys.getInt(1);
            else throw new SQLException("Couldn't get id for region");

        }
    }

    public int insertZone(String zoneName, String regionName, int regionId) throws SQLException {
        // Search a zone with name provided in the arguments
        queryZone.setString(1, zoneName);
        ResultSet results = queryZone.executeQuery();

        // If a zone with the name provided exists
        // Return its id
        if (results.next()) return results.getInt(COLUMN_ZONE_ID);
        else { // Insert a new zone
            // Set zoneName as the first parameter of the prepared statement
            insertIntoZones.setString(1, zoneName);

            // Set regionId as the second parameter of the prepared statement
            // if it is not provided as an argument
            insertIntoZones.setInt(2, regionId != 0 ? regionId : searchRegionIdByName(regionName));


            int affectedRows = insertIntoZones.executeUpdate();

            if (affectedRows != 1) throw new SQLException("Couldn't insert zone!");

            ResultSet generatedKeys = insertIntoZones.getGeneratedKeys();

            if (generatedKeys.next()) return generatedKeys.getInt(1);
            else throw new SQLException("Couldn't get id for zone");

        }
    }


    private int insertUser(String email, String password) throws SQLException {
        queryUser.setString(1, email);
        ResultSet results = queryUser.executeQuery();

        // If a user with the email provided exists
        // Return its id
        if (results.next()) return results.getInt(COLUMN_USER_ID);
        else {
            // Insert a new user and return its ID
            insertIntoUsers.setString(1, email);
            insertIntoUsers.setString(2, password);

            int affectedRows = insertIntoUsers.executeUpdate();

            // If there is no new insertion, i.e., a failed query, throw an SQLException
            if (affectedRows != 1) throw new SQLException("Couldn't insert user!");

            // Get the generated ID from the DB
            ResultSet generatedKeys = insertIntoUsers.getGeneratedKeys();

            // If we succeed to get the ID return it
            if (generatedKeys.next()) return generatedKeys.getInt(1);

                // If no ID was found throw an SQLException
            else throw new SQLException("Couldn't get id for user");
        }
    }

    public void insertCoordinator(String fullName, String email, String password) {
        try { // Trying to perform a manual transaction
            // Set commit mode to manual
            conn.setAutoCommit(false);

            // Create a user and get its id
            int userId = insertUser(email, password);

            insertIntoCoordinators.setString(1, fullName);
            insertIntoCoordinators.setInt(2, userId);

            int affectedRows = insertIntoCoordinators.executeUpdate();

            if (affectedRows == 1) conn.commit();
            else throw new SQLException("Coordinator insert failed!");


        } catch (SQLException ex1) {
            System.out.println("Insert Coordinator exception: " + ex1.getMessage());
            try {
                System.out.println("Performing Rollback!");
                conn.rollback();
            } catch (SQLException ex2) {
                System.out.println("[SOMETHING WENT REALLY BAD!!] Insert Coordinator exception: " + ex2.getMessage());
            }
        } finally {
            try {
                System.out.println("Resetting default commit behaviour");
                conn.setAutoCommit(true);
            } catch (SQLException e) {
                System.out.println("Couldn't reset auto-commit! " + e.getMessage());
            }
        }
    }


    public int insertDistrict(
            String districtName, int coordinatorId, String fullName,
            int zoneId, String zoneName) throws SQLException {
        // check if the district already exists
        queryDistrict.setString(1, districtName);
        ResultSet results = queryDistrict.executeQuery();

        // if it does return the that row's id
        if (results.next()) return results.getInt(COLUMN_DISTRICT_ID);
        // else create a new one
        else {
            insertIntoDistricts.setString(1, districtName);
            insertIntoDistricts.setInt(2, zoneId != 0 ?
                    zoneId : searchZoneIdByName(zoneName));
            insertIntoDistricts.setInt(3, coordinatorId != 0 ?
                    coordinatorId : searchCoordinatorIdByFullName(fullName));

            int affectedRows = insertIntoDistricts.executeUpdate();

            if (affectedRows != 1) throw new SQLException("Couldn't insert district!");

            ResultSet generatedKeys = insertIntoDistricts.getGeneratedKeys();

            if (generatedKeys.next()) return generatedKeys.getInt(1);
            else throw new SQLException("Couldn't get id for district");

        }
    }

    public int insertVillage(
            String villageName, String registrationDate,
            int districtId, String districtName) throws SQLException {
        queryVillage.setString(1, villageName);
        ResultSet results = queryVillage.executeQuery();

        if (results.next()) return results.getInt(COLUMN_VILLAGE_ID);
        else {
            insertIntoVillages.setString(1, registrationDate);
            insertIntoVillages.setString(2, villageName);
            insertIntoVillages.setInt(3, districtId != 0 ?
                    districtId : searchDistrictIdByName(districtName));

            int affectedRows = insertIntoVillages.executeUpdate();

            if (affectedRows != 1) throw new SQLException("Couldn't insert village!");

            ResultSet generatedKeys = insertIntoVillages.getGeneratedKeys();

            if (generatedKeys.next()) return generatedKeys.getInt(1);
            else throw new SQLException("Couldn't get id for village!");
        }
    }

    private int insertFather(
            String firstName,
            String lastName,
            String dateOfDeath,
            String causeOfDeath,
            String dateOfBirth,
            String deathCertificateUrl
    ) throws SQLException {
        queryFather.setString(1, firstName);
        queryFather.setString(2, lastName);
        ResultSet results = queryFather.executeQuery();

        if (results.next()) return results.getInt(COLUMN_FATHER_ID);
        else {
            insertIntoFathers.setString(1, firstName);
            insertIntoFathers.setString(2, lastName);
            insertIntoFathers.setString(3, dateOfDeath);
            insertIntoFathers.setString(4, causeOfDeath);
            insertIntoFathers.setString(5, dateOfBirth);
            insertIntoFathers.setString(6, deathCertificateUrl);

            int affectedRows = insertIntoFathers.executeUpdate();

            if (affectedRows != 1) throw new SQLException("Couldn't insert father!");

            ResultSet generatedKeys = insertIntoFathers.getGeneratedKeys();

            if (generatedKeys.next()) return generatedKeys.getInt(1);
            else throw new SQLException("Couldn't get id for father");

        }
    }

    private int insertMother(
            String firstName,
            String middleName,
            String lastName,
            Mother_vitalStatus_enum vitalStatus,
            String dateOfBirth,
            String dateOfDeath,
            String causeOfDeath,
            String mobileNumber,
            Mother_maritalStatus_enum maritalStatus,
            String currentJobTitle,
            Float monthlyIncome,
            Float monthlyExpense
    ) throws SQLException {
        queryMother.setString(1, firstName);
        queryMother.setString(2, middleName);
        queryMother.setString(3, lastName);
        ResultSet results = queryMother.executeQuery();

        if (results.next()) return results.getInt(COLUMN_MOTHER_ID);
        else {
            insertIntoMothers.setString(1, firstName);
            insertIntoMothers.setString(2, middleName);
            insertIntoMothers.setString(3, lastName);
            insertIntoMothers.setString(4, String.valueOf(vitalStatus));
            insertIntoMothers.setString(5, dateOfBirth);
            insertIntoMothers.setString(6, dateOfDeath);
            insertIntoMothers.setString(7, causeOfDeath);
            insertIntoMothers.setString(8, mobileNumber);
            insertIntoMothers.setString(9, String.valueOf(maritalStatus));
            insertIntoMothers.setString(10, currentJobTitle);
            insertIntoMothers.setFloat(11, monthlyIncome);
            insertIntoMothers.setFloat(12, monthlyExpense);

            int affectedRows = insertIntoMothers.executeUpdate();

            if (affectedRows != 1) throw new SQLException("Couldn't insert mother!");

            ResultSet generatedKeys = insertIntoMothers.getGeneratedKeys();

            if (generatedKeys.next()) return generatedKeys.getInt(1);
            else throw new SQLException("Couldn't get id for mother");

        }
    }

    private int insertGuardian(
            String firstName,
            String middleName,
            String lastName,
            Gender_enum gender,
            String dateOfBirth,
            Guardian_relationToOrphan_enum relationToOrphan,
            String email,
            String mobileNumber,
            String telephoneNumber,
            Guardian_nationality_enum nationality,
            String guardianIDCardUrl,
            String guardianConfirmationLetter,
            String guardianLegalConfirmationLetter
    ) throws SQLException {
        queryGuardian.setString(1, firstName);
        queryGuardian.setString(2, middleName);
        queryGuardian.setString(3, lastName);
        ResultSet results = queryGuardian.executeQuery();

        if (results.next()) return results.getInt(COLUMN_GUARDIAN_ID);
        else {
            insertIntoGuardians.setString(1, firstName);
            insertIntoGuardians.setString(2, middleName);
            insertIntoGuardians.setString(3, lastName);
            insertIntoGuardians.setString(4, String.valueOf(gender));
            insertIntoGuardians.setString(5, dateOfBirth);
            insertIntoGuardians.setString(6, String.valueOf(relationToOrphan));
            insertIntoGuardians.setString(7, email);
            insertIntoGuardians.setString(8, mobileNumber);
            insertIntoGuardians.setString(9, telephoneNumber);
            insertIntoGuardians.setString(10, String.valueOf(nationality));
            insertIntoGuardians.setString(11, guardianIDCardUrl);
            insertIntoGuardians.setString(12, guardianConfirmationLetter);
            insertIntoGuardians.setString(13, guardianLegalConfirmationLetter);

            int affectedRows = insertIntoGuardians.executeUpdate();

            if (affectedRows != 1) throw new SQLException("Couldn't insert guardian!");

            ResultSet generatedKeys = insertIntoGuardians.getGeneratedKeys();

            if (generatedKeys.next()) return generatedKeys.getInt(1);
            else throw new SQLException("Couldn't get id for guardian");

        }
    }

    private int insertEducation(
            Education_enrollmentStatus_enum enrollmentStatus,
            String schoolName,
            Education_typeOfSchool_enum typeOfSchool,
            String year,
            Education_level_enum level,
            String reason
    ) throws SQLException {
        insertIntoEducations.setString(1, String.valueOf(enrollmentStatus));
        insertIntoEducations.setString(2, schoolName);
        insertIntoEducations.setString(3, String.valueOf(typeOfSchool));
        insertIntoEducations.setString(4, year);
        insertIntoEducations.setString(5, String.valueOf(level));
        insertIntoEducations.setString(6, reason);

        int affectedRows = insertIntoEducations.executeUpdate();

        if (affectedRows != 1) throw new SQLException("Couldn't insert education!");

        ResultSet generatedKeys = insertIntoEducations.getGeneratedKeys();

        if (generatedKeys.next()) return generatedKeys.getInt(1);
        else throw new SQLException("Couldn't get id for education");
    }

    public void insertOrphan(
            String orphanFirstName,
            Gender_enum orphanGender,
            String orphanPlaceOfBirth,
            String orphanDateOfBirth,
            String orphanSpokenLanguages,
            Orphan_religion_enum orphanReligion,
            String orphanBirthCertificateUrl,
            String orphanHealthDescription,
            Orphan_psychologicalStatus_enum orphanPsychologicalStatus,

            String villageName,
            int villageId,

            String fatherFirstName,
            String fatherLastName,
            String fatherDateOfDeath,
            String fatherCauseOfDeath,
            String fatherDateOfBirth,
            String fatherDeathCertificateUrl,

            String motherFirstName,
            String motherMiddleName,
            String motherLastName,
            Mother_vitalStatus_enum motherVitalStatus,
            String motherDateOfBirth,
            String motherDateOfDeath,
            String motherCauseOfDeath,
            String motherMobileNumber,
            Mother_maritalStatus_enum motherMaritalStatus,
            String motherCurrentJobTitle,
            Float motherMonthlyIncome,
            Float motherMonthlyExpense,

            String guardianFirstName,
            String guardianMiddleName,
            String guardianLastName,
            Gender_enum guardianGender,
            String guardianDateOfBirth,
            Guardian_relationToOrphan_enum guardianRelationToOrphan,
            String guardianEmail,
            String guardianMobileNumber,
            String guardianTelephoneNumber,
            Guardian_nationality_enum guardianNationality,
            String guardianIDCardUrl,
            String guardianConfirmationLetter,
            String guardianLegalConfirmationLetter,

            Education_enrollmentStatus_enum educationEnrollmentStatus,
            String educationSchoolName,
            Education_typeOfSchool_enum educationTypeOfSchool,
            String educationYear,
            Education_level_enum educationLevel,
            String educationReason
    )  {
        try {
            conn.setAutoCommit(false);

            int fatherId = insertFather(
                    fatherFirstName, fatherLastName, fatherDateOfDeath, fatherCauseOfDeath,
                    fatherDateOfBirth, fatherDeathCertificateUrl);
            int motherId = insertMother(motherFirstName, motherMiddleName, motherLastName,
                    motherVitalStatus, motherDateOfBirth, motherDateOfDeath, motherCauseOfDeath,
                    motherMobileNumber, motherMaritalStatus, motherCurrentJobTitle, motherMonthlyIncome,
                    motherMonthlyExpense);
            int guardianId = insertGuardian(guardianFirstName, guardianMiddleName, guardianLastName, guardianGender,
                    guardianDateOfBirth, guardianRelationToOrphan, guardianEmail, guardianMobileNumber,
                    guardianTelephoneNumber, guardianNationality, guardianIDCardUrl, guardianConfirmationLetter,
                    guardianLegalConfirmationLetter);
            int educationId = insertEducation(educationEnrollmentStatus, educationSchoolName, educationTypeOfSchool,
                    educationYear, educationLevel, educationReason);

            insertIntoOrphans.setString(1, orphanFirstName);
            insertIntoOrphans.setString(2, String.valueOf(orphanGender));
            insertIntoOrphans.setString(3, orphanPlaceOfBirth);
            insertIntoOrphans.setString(4, orphanDateOfBirth);
            insertIntoOrphans.setString(5, orphanSpokenLanguages);
            insertIntoOrphans.setString(6, String.valueOf(orphanReligion));
            insertIntoOrphans.setString(7, orphanBirthCertificateUrl);
            insertIntoOrphans.setString(8, orphanHealthDescription);
            insertIntoOrphans.setString(9, String.valueOf(orphanPsychologicalStatus));
            insertIntoOrphans.setInt(10, fatherId);
            insertIntoOrphans.setInt(11, motherId);
            insertIntoOrphans.setInt(12, guardianId);
            insertIntoOrphans.setInt(13, educationId);
            insertIntoOrphans.setInt(14, villageId != 0 ?
                    villageId : searchVillageIdByName(villageName));

            int affectedRows = insertIntoOrphans.executeUpdate();

            if (affectedRows == 1) conn.commit();
            else throw new SQLException("Orphan Insert Failed");

        } catch (SQLException ex1) {
            System.out.println("Insert Orphan Exception: " + ex1.getMessage());
            try {
                System.out.println("Performing Rollback!");
                conn.rollback();
            } catch (SQLException ex2) {
                System.out.println("[SOMETHING WENT REALLY BAD!!] Insert Orphan exception: " + ex2.getMessage());

            }
        } finally {
            try {
                System.out.println("Resetting default commit behaviour.");
                conn.setAutoCommit(true);
            } catch (SQLException e) {
                System.out.println("Couldn't reset auto-commit!" + e.getMessage());
            }
        }
    }

}
