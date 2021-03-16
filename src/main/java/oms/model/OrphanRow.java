package oms.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;
import java.time.Period;

public class OrphanRow {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty fullName;
    private final SimpleIntegerProperty age;
    private final SimpleStringProperty gender;
    private final SimpleIntegerProperty villageId;

    public OrphanRow(Orphan orphan) {
        this.id = new SimpleIntegerProperty(orphan.getId());
        this.fullName = new SimpleStringProperty(
                capitalize(orphan.getFirstName()) + " " +
                        capitalize(orphan.getFather().getFirstName()) + " " +
                        capitalize(orphan.getFather().getLastName()));
        this.age = new SimpleIntegerProperty(ageCalc(orphan.getDateOfBirth()));
        this.gender = new SimpleStringProperty(String.valueOf(orphan.getGender()));
        this.villageId = new SimpleIntegerProperty(orphan.getVillage().getId());
    }

    public static int ageCalc(String dateOfBirth) {
        int year = Integer.parseInt(dateOfBirth.substring(0, 4));
        int month = Integer.parseInt(dateOfBirth.substring(5, 7));
        int day = Integer.parseInt(dateOfBirth.substring(8, 10));

        LocalDate localDateOfBirth = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(localDateOfBirth, now);

        return diff.getYears();
    }

    public static String capitalize(String name){
        return String.valueOf(name.toCharArray()[0]).toUpperCase() + name.substring(1);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getFullName() {
        return fullName.get();
    }

    public void setFullName(String fullName) {
        this.fullName.set(fullName);
    }

    public int getAge() {
        return age.get();
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public String getGender() {
        return gender.get();
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public int getVillageId() {
        return villageId.get();
    }

    public void setVillageId(int villageId) {
        this.villageId.set(villageId);
    }
}


//package oms.model;
//
//        import javafx.beans.property.SimpleIntegerProperty;
//        import javafx.beans.property.SimpleStringProperty;
//
//        import java.time.LocalDate;
//        import java.time.Period;
//
//public class OrphanRow {
//    private final SimpleIntegerProperty id;
//    private final SimpleStringProperty fullName;
//    private final SimpleIntegerProperty age;
//    private final SimpleStringProperty gender;
//    private final SimpleIntegerProperty villageId;
//
//    public OrphanRow() {
//        this.id = new SimpleIntegerProperty(0);
//        this.fullName = new SimpleStringProperty("");
//        this.age = new SimpleIntegerProperty(0);
//        this.gender = new SimpleStringProperty("");
//        this.villageId = new SimpleIntegerProperty(0);
//    }
//
//    public static int ageCalc(String dateOfBirth) {
//        int year = Integer.parseInt(dateOfBirth.substring(0, 4));
//        int month = Integer.parseInt(dateOfBirth.substring(5, 7));
//        int day = Integer.parseInt(dateOfBirth.substring(8, 10));
//
//        LocalDate localDateOfBirth = LocalDate.of(year, month, day);
//        LocalDate now = LocalDate.now();
//
//        Period diff = Period.between(localDateOfBirth, now);
//
//        return diff.getYears();
//    }
//
//    public static String capitalize(String name){
//        return String.valueOf(name.toCharArray()[0]).toUpperCase() + name.substring(1);
//    }
//
//    public int getId() {
//        return id.get();
//    }
//
//    public void setId(int id) {
//        this.id.set(id);
//    }
//
//    public String getFullName() {
//        return fullName.get();
//    }
//
//    public void setFullName(String orphanFirstName, String fatherFirstName,
//                            String fatherLastName) {
//        this.fullName.set(capitalize(orphanFirstName + fatherFirstName + fatherLastName));
//    }
//
//    public int getAge() {
//        return age.get();
//    }
//
//    public void setAge(String dateOfBirth) {
//        this.age.set(ageCalc(dateOfBirth));
//    }
//
//    public String getGender() {
//        return gender.get();
//    }
//
//    public void setGender(String gender) {
//        this.gender.set(gender);
//    }
//
//    public int getVillageId() {
//        return villageId.get();
//    }
//
//    public void setVillageId(int villageId) {
//        this.villageId.set(villageId);
//    }
//}
