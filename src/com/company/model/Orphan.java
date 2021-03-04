package com.company.model;

public class Orphan {
    private int id;
    private String created_at;
    private String updated_at;
    private String firstName;
    private Gender_enum gender;
    private String placeOfBirth;
    private String dateOfBirth;
    private String spokenLanguages;
    private String gradeAgeMismatchReason;
    private String hobbies;
    private Orphan_religion_enum religion;
    private String idCardUrl;
    private String passportUrl;
    private String thankyouLetterUrl;
    private String birthCertificateUrl;
    private String healthDescription;
    private Orphan_psychologicalStatus_enum psychologicalStatus;
    private Mother mother;
    private Father father;
    private Guardian guardian;
    private Education education;
    private Donor donor;
    private House_property house_property;
    private Village village;

    public Orphan() {
        this.mother = new Mother();
        this.father = new Father();
        this.guardian = new Guardian();
        this.education = new Education();
        this.donor = new Donor();
        this.house_property = new House_property();
        this.village = new Village();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender_enum getGender() {
        return gender;
    }

    public void setGender(Gender_enum gender) {
        this.gender = gender;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(String spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public String getGradeAgeMismatchReason() {
        return gradeAgeMismatchReason;
    }

    public void setGradeAgeMismatchReason(String gradeAgeMismatchReason) {
        this.gradeAgeMismatchReason = gradeAgeMismatchReason;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public Orphan_religion_enum getReligion() {
        return religion;
    }

    public void setReligion(Orphan_religion_enum religion) {
        this.religion = religion;
    }

    public String getIdCardUrl() {
        return idCardUrl;
    }

    public void setIdCardUrl(String idCardUrl) {
        this.idCardUrl = idCardUrl;
    }

    public String getPassportUrl() {
        return passportUrl;
    }

    public void setPassportUrl(String passportUrl) {
        this.passportUrl = passportUrl;
    }

    public String getThankyouLetterUrl() {
        return thankyouLetterUrl;
    }

    public void setThankyouLetterUrl(String thankyouLetterUrl) {
        this.thankyouLetterUrl = thankyouLetterUrl;
    }

    public String getBirthCertificateUrl() {
        return birthCertificateUrl;
    }

    public void setBirthCertificateUrl(String birthCertificateUrl) {
        this.birthCertificateUrl = birthCertificateUrl;
    }

    public String getHealthDescription() {
        return healthDescription;
    }

    public void setHealthDescription(String healthDescription) {
        this.healthDescription = healthDescription;
    }

    public Orphan_psychologicalStatus_enum getPsychologicalStatus() {
        return psychologicalStatus;
    }

    public void setPsychologicalStatus(Orphan_psychologicalStatus_enum psychologicalStatus) {
        this.psychologicalStatus = psychologicalStatus;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public House_property getHouse_property() {
        return house_property;
    }

    public void setHouse_property(House_property house_property) {
        this.house_property = house_property;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }
}
