package com.company;

import com.company.model.Datasource;
import com.company.model.Orphan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Datasource datasource = new Datasource();

        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<Orphan> orphans = datasource.queryAllOrphans(1);

        for (Orphan orphan :
                orphans) {
            System.out.println("id " + orphan.getId());
            System.out.println("cr@ " + orphan.getCreated_at());
            System.out.println("up@ " + orphan.getUpdated_at());
            System.out.println("fn " + orphan.getFirstName());
            System.out.println("g " + orphan.getGender());
            System.out.println("pob " + orphan.getPlaceOfBirth());
            System.out.println("dob " + orphan.getDateOfBirth());
            System.out.println("sl " + orphan.getSpokenLanguages());
            System.out.println("gamr " + orphan.getGradeAgeMismatchReason());
            System.out.println("h " + orphan.getHobbies());
            System.out.println("r " + orphan.getReligion());
            System.out.println("icu " + orphan.getIdCardUrl());
            System.out.println("pu " + orphan.getPassportUrl());
            System.out.println("tylu " + orphan.getThankyouLetterUrl());
            System.out.println("bcu " + orphan.getBirthCertificateUrl());
            System.out.println("hd " + orphan.getHealthDescription());
            System.out.println("ps " + orphan.getPsychologicalStatus());
            System.out.println("sId " + orphan.getSiblingId());
            System.out.println("moId " + orphan.getMotherId());
            System.out.println("faId " + orphan.getFatherId());
            System.out.println("guId " + orphan.getGuardianId());
            System.out.println("edId " + orphan.getEducationId());
            System.out.println("doId " + orphan.getDonorId());
            System.out.println("hopId " + orphan.getHouse_propertyId());
            System.out.println("ViId " + orphan.getVillageId());
        }
        datasource.close();

    }
}
