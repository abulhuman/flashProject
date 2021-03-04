package com.company.model;

public class Mother {
    private int id;
    private String created_at;
    private String updated_at;
    private String firstName;
    private String middleName;
    private String lastName;
    private Mother_vitalStatus_enum vitalStatus;
    private String dateOfBirth;
    private String dateOfDeath;
    private String causeOfDeath;
    private String mobileNumber;
    private Mother_maritalStatus_enum maritalStatus;
    private String currentJobTitle;
    private float monthlyIncome;
    private float monthlyExpense;

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

    public Mother_vitalStatus_enum getVitalStatus() {
        return vitalStatus;
    }

    public void setVitalStatus(Mother_vitalStatus_enum vitalStatus) {
        this.vitalStatus = vitalStatus;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Mother_maritalStatus_enum getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Mother_maritalStatus_enum maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCurrentJobTitle() {
        return currentJobTitle;
    }

    public void setCurrentJobTitle(String currentJobTitle) {
        this.currentJobTitle = currentJobTitle;
    }

    public Float getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Float monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public Float getMonthlyExpense() {
        return monthlyExpense;
    }

    public void setMonthlyExpense(Float monthlyExpense) {
        this.monthlyExpense = monthlyExpense;
    }
}
