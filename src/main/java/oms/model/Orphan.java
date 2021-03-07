package oms.model;

public class Orphan {
    private int id;
    private String firstName;
    private Gender_enum gender;
    private String placeOfBirth;
    private String dateOfBirth;
    private String spokenLanguages;
    private Orphan_religion_enum religion;
    private String birthCertificateUrl;
    private String healthDescription;
    private Orphan_psychologicalStatus_enum psychologicalStatus;
    private Mother mother;
    private Father father;
    private Guardian guardian;
    private Education education;
    private Village village;

    public Orphan() {
        this.mother = new Mother();
        this.father = new Father();
        this.guardian = new Guardian();
        this.education = new Education();
        this.village = new Village();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Orphan_religion_enum getReligion() {
        return religion;
    }

    public void setReligion(Orphan_religion_enum religion) {
        this.religion = religion;
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

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }
}
