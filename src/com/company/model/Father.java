package com.company.model;

import java.sql.Blob;

public class Father {
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfDeath;
    private String causeOfDeath;
    private String dateOfBirth;
    private Blob deathCertificate;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Blob getDeathCertificate() {
        return deathCertificate;
    }

    public void setDeathCertificate(Blob deathCertificate) {
        this.deathCertificate = deathCertificate;
    }
}
