package com.company.model;

public class Guardian {
    private int id;
    private String created_at;
    private String updated_at;
    private String firstName;
    private String middleName;
    private String lastName;
    private Gender_enum gender;
    private String dateOfBirth;
    private Guardian_relationToOrphan_enum relationToOrphan;
    private String email;
    private String mobileNumber;
    private String telephoneNumber;
    private Guardian_nationality_enum nationality;
    private String guardianIDCardUrl;
    private String guardianConfirmationLetterUrl;
    private String guardianLegalConfirmationLetterUrl;

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender_enum getGender() {
        return gender;
    }

    public void setGender(Gender_enum gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Guardian_relationToOrphan_enum getRelationToOrphan() {
        return relationToOrphan;
    }

    public void setRelationToOrphan(Guardian_relationToOrphan_enum relationToOrphan) {
        this.relationToOrphan = relationToOrphan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Guardian_nationality_enum getNationality() {
        return nationality;
    }

    public void setNationality(Guardian_nationality_enum nationality) {
        this.nationality = nationality;
    }

    public String getGuardianIDCardUrl() {
        return guardianIDCardUrl;
    }

    public void setGuardianIDCardUrl(String guardianIDCardUrl) {
        this.guardianIDCardUrl = guardianIDCardUrl;
    }

    public String getGuardianConfirmationLetterUrl() {
        return guardianConfirmationLetterUrl;
    }

    public void setGuardianConfirmationLetterUrl(String guardianConfirmationLetterUrl) {
        this.guardianConfirmationLetterUrl = guardianConfirmationLetterUrl;
    }

    public String getGuardianLegalConfirmationLetterUrl() {
        return guardianLegalConfirmationLetterUrl;
    }

    public void setGuardianLegalConfirmationLetterUrl(String guardianLegalConfirmationLetterUrl) {
        this.guardianLegalConfirmationLetterUrl = guardianLegalConfirmationLetterUrl;
    }
}
