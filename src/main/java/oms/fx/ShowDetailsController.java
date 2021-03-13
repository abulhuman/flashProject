package oms.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.Orphan;
import oms.model.OrphanRow;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static oms.Main.stage;


public class ShowDetailsController implements Initializable {

    public Label childName;
    public Label orphanGender;
    public Label orphanAge;
    public Label orphanPoB;
    public Label orphanHealth;
    public Label orphanPsychHealth;
    public Label orphanLang;
    public Label enrolStatus;
    public Label schoolName;
    public Label eduLevel;
    public Label eduYear;
    public Label fatherName;
    public Label fatherDoB;
    public Label fatherDoD;
    public Label motherName;
    public Label motherDoB;
    public Label motherVital;
    public Label motherPhone;
    public Label fatherCauseOfDeath;
    public Label fatherMonthlyIncome;
    public Label motherMaritalStat;
    public Label motherMonthlyExpense;
    public Label guardianName;
    public Label guardianDoB;
    public Label guardianGender;
    public Label guardianOrphanRel;
    public Label guardianAddress;
    public Label guardianNation;
    public Label guardianEmail;
    public Label guardianMobile;
    public Label guardianMonthlyExpense;
    public Label guardianTelePhone;
    @FXML
    private Label showDetailsName;
    @FXML
    private Label showDetailsGender;
    @FXML
    private Label showDetailsAge;
    @FXML
    private Label showDetailsPlaceOfBirth;
    @FXML
    private Label showDetailsClan;
    @FXML
    private Label showDetailsSpokenLanguages;
    @FXML
    private Label showDetailsSponsorshipStatus;
    @FXML
    private Label showDetailsSponsorshipDate;
    @FXML
    private Label showDetailsPysicalHealth;
    @FXML
    private Label showDetailsPsychologicalHealth;
    @FXML
    private Label showDetailsOtherHealthIssues;
    @FXML
    private Label showDetailsEnrollmentStatus;
    @FXML
    private Label showDetailsSchoolName;
    @FXML
    private Label showDetailsEducationLevel;
    @FXML
    private Label showDetailsYear;
    @FXML
    private Label showDetailsHobbiesAndAmbitions;
    @FXML
    private TableColumn<?, ?> showDetailsMotherJob;
    @FXML
    private TableColumn<?, ?> showDetailsMotherStartingDate;
    @FXML
    private TableColumn<?, ?> showDetailsMotherMonthlyIncome;
    @FXML
    private TableColumn<?, ?> showDetailsMotherEndingDate;
    @FXML
    private Label showDetailsFatherName;
    @FXML
    private Label showDetailsFatherDoB;
    @FXML
    private Label showDetailsFatherDoD;
    @FXML
    private Label showDetailsFatherCoD;
    @FXML
    private Label showDetailsFatherJob;
    @FXML
    private Label showDetailsFatherIncome;
    @FXML
    private Label showDetailsMotherName;
    @FXML
    private Label showDetailsMotherDoB;
    @FXML
    private Label showDetailsMotherVital;
    @FXML
    private Label showDetailsMotherPhone;
    @FXML
    private Label showDetailsMotherMarital;
    @FXML
    private Label showDetailsHouseOwnership;
    @FXML
    private Label showDetailsOtherProperties;
    @FXML
    private Label showDetailsGuardianName;
    @FXML
    private Label showDetailsGuardianDoB;
    @FXML
    private Label showDetailsGuardianGender;
    @FXML
    private Label showDetailsGuardianRelationToOrphan;
    @FXML
    private Label showDetailsGuardianNationality;
    @FXML
    private Label showDetailsGuardianAddress;
    @FXML
    private Label showDetailsGuardianPOBox;
    @FXML
    private Label showDetailsGuardianEmail;
    @FXML
    private Label showDetailsGuardianMobile;
    @FXML
    private Label showDetailsGuardianTelephone;
    @FXML
    private Label showDetailsGuardianJob;
    @FXML
    private Label showDetailsGuardianMonthlyExpense;
    @FXML
    private ImageView ProfileImage;
    @FXML
    private Pane showDetailsPane;
    @FXML
    private AnchorPane showDetailsAnchorPane;
    @FXML
    private ScrollBar showDetailsScrollBar;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    public void populateTable(int id) {
        Orphan orphan = Datasource.getInstance().queryOrphan(id);
        System.out.println(orphan);
        childName.setText(childName.getText() + " " + OrphanRow.capitalize(orphan.getFirstName()) + " " + OrphanRow.capitalize(orphan.getFather().getFirstName()));
        orphanGender.setText(orphanGender.getText() + " " + orphan.getGender());
        orphanAge.setText(orphanAge.getText() + " " + OrphanRow.ageCalc(orphan.getDateOfBirth()));
        orphanPoB.setText(orphanPoB.getText() + " " + OrphanRow.capitalize(orphan.getPlaceOfBirth()));
        orphanLang.setText(orphanLang.getText() + " " + orphan.getSpokenLanguages());
        orphanHealth.setText(orphanHealth.getText() + " " + orphan.getHealthDescription());
        orphanPsychHealth.setText(orphanPsychHealth.getText() + " " + orphan.getPsychologicalStatus());

        enrolStatus.setText(enrolStatus.getText() + " " + orphan.getEducation().getEnrollmentStatus());
        schoolName.setText(schoolName.getText() + " " + orphan.getEducation().getSchoolName());
        eduLevel.setText(eduLevel.getText() + " " + orphan.getEducation().getLevel());
        eduYear.setText(eduYear.getText() + " " + orphan.getEducation().getYear());

        fatherName.setText(fatherName.getText() + " " +
                OrphanRow.capitalize(orphan.getFather().getFirstName()) + " " +
                OrphanRow.capitalize(orphan.getFather().getLastName()));
        fatherDoB.setText(fatherDoB.getText() + " " + orphan.getFather().getDateOfBirth());
        fatherCauseOfDeath.setText(fatherCauseOfDeath.getText() + " " + orphan.getFather().getCauseOfDeath());
        fatherDoD.setText(fatherDoD.getText() + " " + orphan.getFather().getDateOfDeath());

        motherName.setText(motherName.getText() + " " +
                OrphanRow.capitalize(orphan.getMother().getFirstName()) + " " +
                OrphanRow.capitalize(orphan.getMother().getMiddleName()) + " " +
                OrphanRow.capitalize(orphan.getMother().getLastName()));
        motherDoB.setText(motherDoB.getText() + " " + orphan.getMother().getDateOfBirth());
        motherMaritalStat.setText(motherMaritalStat.getText() + " " + orphan.getMother().getMaritalStatus());
        motherPhone.setText(motherPhone.getText() + " " + orphan.getMother().getMobileNumber());
        motherVital.setText(motherVital.getText() + " " + orphan.getMother().getVitalStatus());
        motherMonthlyExpense.setText(motherMonthlyExpense.getText() + " " + orphan.getMother().getMonthlyExpense());

        guardianName.setText(guardianName.getText() + " " +
                OrphanRow.capitalize(orphan.getGuardian().getFirstName()) + " " +
                OrphanRow.capitalize(orphan.getGuardian().getMiddleName()) + " " +
                OrphanRow.capitalize(orphan.getGuardian().getLastName()));
        guardianEmail.setText(guardianEmail.getText() + " " + orphan.getGuardian().getEmail());
        guardianMobile.setText(guardianMobile.getText() + " " + orphan.getGuardian().getMobileNumber());
        guardianNation.setText(guardianNation.getText() + " " + orphan.getGuardian().getNationality());
        guardianDoB.setText(guardianNation.getText() + " " + orphan.getGuardian().getDateOfBirth());
        guardianGender.setText(guardianGender.getText() + " " + orphan.getGuardian().getGender());
        guardianOrphanRel.setText(guardianOrphanRel.getText() + " " + orphan.getGuardian().getRelationToOrphan());
        guardianTelePhone.setText(guardianTelePhone.getText() + " " + orphan.getGuardian().getTelephoneNumber());
    }

    @FXML
    private void BackToCoordinator(ActionEvent event) throws IOException {

        Parent root5 = FXMLLoader.load(getClass().getResource("Coordinator.fxml"));
        Scene scene5 = new Scene(root5);


        stage.setTitle("Home");
        stage.setScene(scene5);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void addEducationalRecords(ActionEvent actionEvent) throws IOException {

    }

    public void showEducationalRecords(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EducationalRecords.fxml"));

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
