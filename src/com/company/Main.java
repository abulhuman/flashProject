package com.company;

import java.sql.*;
import java.util.List;

import com.company.model.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        District district =  datasource.queryDistrict(2);
        if (district == null) {
            System.out.println("No district!");
            return;
        }
        System.out.println("District: ");
        System.out.println("ID: " + district.getId() + "\nName: " + district.getName() +
                           "\nZoneId: " + district.getZoneId() + "\nCoordinatorId: " +
                           district.getCoordinatorId());
        Coordinator coordinator = datasource.queryCoordinator(1);
        if (coordinator == null) {
            System.out.println("\nNo Coordinator!");
            return;
        }
        System.out.println("\nCoordinator: ");
        System.out.println("ID: " + coordinator.getId() + "\nName: " + coordinator.getFullName() +
                            "\nUserId: " + coordinator.getUserId());
        Donor donor = datasource.queryDonor(1);
        if(donor == null) {
            System.out.println("\nNo Donor");
            return;
        }
        System.out.println("\nDonor: ");
        System.out.println("ID: " + donor.getId() + "\nCompanyName: " + donor.getCompanyName() +
                           "\nNameInitial: " + donor.getNameInitials() + "\nUserId: " + donor.getUserId()
                           + "\nCoordinatorId: " + donor.getCoordinatorId());
        Education education = datasource.queryEducation(1);
        if (education == null) {
            System.out.println("\nNo Education");
            return;
        }
        System.out.println("\nEducation: ");
        System.out.println("ID: " + education.getId() + "\nEnrollmentStatus: " +
                            education.getEnrollmentStatus().toString().toLowerCase()
                            + "\nSchoolName: " + education.getSchoolName() + "\nSchoolType: " +
                            education.getTypeOfSchool().toString().toLowerCase() + "\nYear: " +
                            education.getYear() + "\nSchoolLeve: "
                            + education.getLevel().toString().toLowerCase() + "\nReason: " +
                            education.getReason());

        Father father = datasource.queryFather(1);
        if (father == null) {
            System.out.println("\nNo Father");
            return;
        }
        System.out.println("\nFather: ");
        System.out.println("ID: " + father.getId() + "\nFirstName: " + father.getFirstName() +
                            "\nLastName: " + father.getLastName() + "\nDateOfBirth: "
                            + father.getDateOfBirth() + "\nDateOfDeath: " + father.getDateOfDeath()
                            + "\nCauseOfDeath: " + father.getCauseOfDeath() + "\nDeathCertificateUrl: "
                            + father.getDeathCertificateUrl());

        Guardian guardian = datasource.queryGuardian(1);
        if (guardian == null) {
            System.out.println("\nNo Guardian");
            return;
        }
        System.out.println("\nGuardian: ");
        System.out.println("ID: " + guardian.getId() + "\n" + "FirstName: " + guardian.getFirstName() + "\n" +
                            "MiddleName: " + guardian.getMiddleName() + "\n" + "LastName: " +
                            guardian.getLastName() + "\n" + "Gender: " + guardian.getGender() + "\n" +
                            "DateOfBirth: " + guardian.getDateOfBirth() + "\n" + "RelationToOrphan: " +
                            guardian.getRelationToOrphan() + "\n" + "E-mail: " + guardian.getEmail() + "\n" +
                            "MobileNumber: " + guardian.getMobileNumber() + "\n" + "TelephoneNumber: " +
                            guardian.getTelephoneNumber() + "\n" + "Nationality: " + guardian.getNationality()
                            + "\n" + "GuardianIdCard: " + guardian.getGuardianIDCardUrl() + "\n" +
                            "GuardianConfirmationLetter: " + guardian.getGuardianConfirmationLetterUrl() + "\n"
                            + "GuardianLegalConfirmationLetter: " + guardian.getGuardianLegalConfirmationLetterUrl());

        // ---------------------------------------------------------------------------------------------------

        DistrictJoin districtJoin = datasource.queryDistrictJoin();
        if(districtJoin == null) {
            System.out.println("No DistrictJoin");
            return;
        }
        System.out.println("\nDistrictJoin: ");
        System.out.println("DistrictName: " + districtJoin.getDistrict().getName() + "\n" +
                            "ZoneName: " + districtJoin.getZone().getName() + "\n" +
                            "Coordinator: " + districtJoin.getCoordinator().getFullName());

        Orphan orphan = datasource.queryOrphan(2);
        if(orphan == null) {
            System.out.println("No Orphan");
            return;
        }
        System.out.println("\nOrphan: ");
        System.out.println("OrphanName: " + orphan.getFirstName() + " " + orphan.getFather().getFirstName() +
                           " " + orphan.getFather().getLastName() + "\n" +
                           "MotherName: " + orphan.getMother().getFirstName() + " " +
                           orphan.getMother().getMiddleName() + " " + orphan.getMother().getLastName() + "\n" +
                           "GuardianName: " + orphan.getGuardian().getFirstName() + " " +
                           orphan.getGuardian().getMiddleName() + " " + orphan.getGuardian().getLastName() + "\n" +
                           "EnrollmentStatus: " + orphan.getEducation().getEnrollmentStatus() + "\n" +
                           "DonorCompanyName: " + orphan.getDonor().getCompanyName() + "\n" +
                           "VillageName: " + orphan.getVillage().getName() + "\n" +
                           "House: " + orphan.getHouse_property().getHousingSituation() + "\n");

    }
}
