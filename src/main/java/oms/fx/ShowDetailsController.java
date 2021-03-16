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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import oms.model.*;

import javax.sql.DataSource;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static oms.Main.stage;


public class ShowDetailsController implements Initializable {

    public ImageView profileImage;
    public TextField childName;
    public TextField orphanGender;
    public TextField orphanAge;
    public TextField orphanPoB;
    public TextField orphanHealth;
    public TextField orphanPsychHealth;
    public TextField orphanLang;
    public TextField enrolStatus;
    public TextField schoolName;
    public TextField eduLevel;
    public TextField eduYear;
    public TextField fatherName;
    public TextField fatherDoB;
    public TextField fatherDoD;
    public TextField motherName;
    public TextField motherDoB;
    public TextField motherVital;
    public TextField motherPhone;
    public TextField fatherCauseOfDeath;
    public TextField fatherMonthlyIncome;
    public TextField motherMaritalStat;
    public TextField motherMonthlyExpense;
    public TextField guardianName;
    public TextField guardianDoB;
    public TextField guardianGender;
    public TextField guardianOrphanRel;
    public TextField guardianNation;
    public TextField guardianEmail;
    public TextField guardianMobile;
    public TextField guardianTelePhone;
    public AnchorPane showDetails;
    public int orphanId;

//    @FXML
//    private Label showDetailsName;
//    @FXML
//    private Label showDetailsGender;
//    @FXML
//    private Label showDetailsAge;
//    @FXML
//    private Label showDetailsPlaceOfBirth;
//    @FXML
//    private Label showDetailsClan;
//    @FXML
//    private Label showDetailsSpokenLanguages;
//    @FXML
//    private Label showDetailsSponsorshipStatus;
//    @FXML
//    private Label showDetailsSponsorshipDate;
//    @FXML
//    private Label showDetailsPysicalHealth;
//    @FXML
//    private Label showDetailsPsychologicalHealth;
//    @FXML
//    private Label showDetailsOtherHealthIssues;
//    @FXML
//    private Label showDetailsEnrollmentStatus;
//    @FXML
//    private Label showDetailsSchoolName;
//    @FXML
//    private Label showDetailsEducationLevel;
//    @FXML
//    private Label showDetailsYear;
//    @FXML
//    private Label showDetailsHobbiesAndAmbitions;
//    @FXML
//    private TableColumn<?, ?> showDetailsMotherJob;
//    @FXML
//    private TableColumn<?, ?> showDetailsMotherStartingDate;
//    @FXML
//    private TableColumn<?, ?> showDetailsMotherMonthlyIncome;
//    @FXML
//    private TableColumn<?, ?> showDetailsMotherEndingDate;
//    @FXML
//    private Label showDetailsFatherName;
//    @FXML
//    private Label showDetailsFatherDoB;
//    @FXML
//    private Label showDetailsFatherDoD;
//    @FXML
//    private Label showDetailsFatherCoD;
//    @FXML
//    private Label showDetailsFatherJob;
//    @FXML
//    private Label showDetailsFatherIncome;
//    @FXML
//    private Label showDetailsMotherName;
//    @FXML
//    private Label showDetailsMotherDoB;
//    @FXML
//    private Label showDetailsMotherVital;
//    @FXML
//    private Label showDetailsMotherPhone;
//    @FXML
//    private Label showDetailsMotherMarital;
//    @FXML
//    private Label showDetailsHouseOwnership;
//    @FXML
//    private Label showDetailsOtherProperties;
//    @FXML
//    private Label showDetailsGuardianName;
//    @FXML
//    private Label showDetailsGuardianDoB;
//    @FXML
//    private Label showDetailsGuardianGender;
//    @FXML
//    private Label showDetailsGuardianRelationToOrphan;
//    @FXML
//    private Label showDetailsGuardianNationality;
//    @FXML
//    private Label showDetailsGuardianAddress;
//    @FXML
//    private Label showDetailsGuardianPOBox;
//    @FXML
//    private Label showDetailsGuardianEmail;
//    @FXML
//    private Label showDetailsGuardianMobile;
//    @FXML
//    private Label showDetailsGuardianTelephone;
//    @FXML
//    private Label showDetailsGuardianJob;
//    @FXML
//    private Label showDetailsGuardianMonthlyExpense;
//    @FXML
//    private ImageView ProfileImage;
//    @FXML
//    private Pane showDetailsPane;
//    @FXML
//    private AnchorPane showDetailsAnchorPane;
//    @FXML
//    private ScrollBar showDetailsScrollBar;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private Desktop desktop = Desktop.getDesktop();
    final FileChooser fileChooser = new FileChooser();
    static FileChooser.ExtensionFilter png = new FileChooser.ExtensionFilter("PNG", "*" +
            ".png");
    static FileChooser.ExtensionFilter jpg = new FileChooser.ExtensionFilter("JPG", "*.jpg");


    public void populateTable(int id) {
        orphanId = id;
        Orphan orphan = Datasource.getInstance().queryOrphan(id);
        try {
            Photos photos = Datasource.getInstance().queryPhotosByOrphanId(orphan.getId());
            Label imageError = new Label();
            if (photos != null) {
                File file = Datasource.getInstance().outputPortraitPhoto(photos.getId());
                if (file == null) {
                    System.out.println("Not a Photo");
                    imageError.setLayoutX(profileImage.getLayoutX());
                    imageError.setLayoutY(profileImage.getLayoutY() + profileImage.getFitHeight());
                    imageError.setText("No image found for this orphan");
                    imageError.setTextFill(Color.web("red",0.75));
                    showDetails.getChildren().add(imageError);
                } else {
                    InputStream stream = new FileInputStream(file.getAbsoluteFile());
                    Image image = new Image(stream);
                    profileImage.setImage(image);
                    profileImage.setPreserveRatio(false);
                    imageError.setText("");
                }
            } else {
                System.out.println("No Photo");
                imageError.setLayoutX(profileImage.getLayoutX());
                imageError.setLayoutY(profileImage.getLayoutY() + profileImage.getFitHeight());
                imageError.setText("No image found for this orphan");
                imageError.setTextFill(Color.web("red",0.75));
                showDetails.getChildren().add(imageError);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Something went Wrong: " + e.getMessage());
        }
        childName.setText(OrphanRow.capitalize(orphan.getFirstName()) + " " + OrphanRow.capitalize(orphan.getFather().getFirstName()));
        orphanGender.setText(orphan.getGender().toString());
        orphanAge.setText("" + OrphanRow.ageCalc(orphan.getDateOfBirth()));
        orphanPoB.setText(OrphanRow.capitalize(orphan.getPlaceOfBirth()));
        orphanLang.setText(orphan.getSpokenLanguages());
        orphanHealth.setText(orphan.getHealthDescription());
        orphanPsychHealth.setText(orphan.getPsychologicalStatus().toString());

        enrolStatus.setText(orphan.getEducation().getEnrollmentStatus().toString());
        schoolName.setText(orphan.getEducation().getSchoolName());
        eduLevel.setText(orphan.getEducation().getLevel().toString());
        eduYear.setText(orphan.getEducation().getYear());

        fatherName.setText(OrphanRow.capitalize(orphan.getFather().getFirstName()) + " " +
                OrphanRow.capitalize(orphan.getFather().getLastName()));
        fatherDoB.setText(orphan.getFather().getDateOfBirth());
        fatherCauseOfDeath.setText(orphan.getFather().getCauseOfDeath());
        fatherDoD.setText(orphan.getFather().getDateOfDeath());

        motherName.setText(OrphanRow.capitalize(orphan.getMother().getFirstName()) + " " +
                OrphanRow.capitalize(orphan.getMother().getMiddleName()) + " " +
                OrphanRow.capitalize(orphan.getMother().getLastName()));
        motherDoB.setText(orphan.getMother().getDateOfBirth());
        motherMaritalStat.setText(orphan.getMother().getMaritalStatus().toString());
        motherPhone.setText(orphan.getMother().getMobileNumber());
        motherVital.setText(orphan.getMother().getVitalStatus().toString());
        motherMonthlyExpense.setText(orphan.getMother().getMonthlyExpense().toString());

        guardianName.setText(OrphanRow.capitalize(orphan.getGuardian().getFirstName()) + " " +
                OrphanRow.capitalize(orphan.getGuardian().getMiddleName()) + " " +
                OrphanRow.capitalize(orphan.getGuardian().getLastName()));
        guardianEmail.setText(orphan.getGuardian().getEmail());
        guardianMobile.setText(orphan.getGuardian().getMobileNumber());
        guardianNation.setText(orphan.getGuardian().getNationality().toString());
        guardianDoB.setText(orphan.getGuardian().getDateOfBirth());
        guardianGender.setText(orphan.getGuardian().getGender().toString());
        guardianOrphanRel.setText(orphan.getGuardian().getRelationToOrphan().toString());
        guardianTelePhone.setText(orphan.getGuardian().getTelephoneNumber());
    }


    public void addEducationalRecords(ActionEvent actionEvent) {
        System.out.println("addEducationalRecordsEvent...");

        int educationId = Datasource.getInstance().queryEducationID(orphanId);

        configureFileChooser(fileChooser);

        Stage stage = new Stage();

        File file = fileChooser.showOpenDialog(stage);

        int educationalRecordId = Datasource.getInstance().inputReportCard(file,
                educationId);

        File output = Datasource.getInstance().outputReportCard(educationalRecordId);

        if (output != null) {
            openFile(output);
            Label imgLabel = new Label();
            imgLabel.setText(output.getAbsoluteFile().getName());
            showDetails.getChildren().add(imgLabel);
        } else System.out.println("null");
    }

    // configuration file for the file choosers in the document section
    private static void configureFileChooser(final FileChooser fileChooser){
        fileChooser.setTitle("View Pictures");
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );
        fileChooser.getExtensionFilters().setAll(jpg, png);
    }

    // opens the file in windows default app
    private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException e) {
            e.printStackTrace();
//            Logger.getLogger(
//                    FileChooser.class.getName()).log(
//                    Level.SEVERE, null, ex
//            );
        }
    }

    public void showEducationalRecords(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EducationalRecords.fxml"));

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void imageDialogViewer(File file) {
        final Stage birthCertificateDialog = new Stage();
        birthCertificateDialog.initModality(Modality.APPLICATION_MODAL);
//        birthCertificateDialog.initOwner(primaryStage);
        VBox dialogVbox = new VBox(100);

        try {
            FileInputStream stream = new FileInputStream(file.getAbsolutePath());
            Image orphanBirthCertificateImage = new Image(stream, 500, 300, false, false);
            ImageView orphanBirthCertificate = new ImageView();
            orphanBirthCertificate.setImage(orphanBirthCertificateImage);
            dialogVbox.getChildren().add(orphanBirthCertificate);
        } catch (FileNotFoundException e) {
            System.out.println("viewOrphanBirthCertificate failed: " + e.getMessage());
        }

        Scene dialogScene = new Scene(dialogVbox, 500, 300);
        birthCertificateDialog.setScene(dialogScene);
        birthCertificateDialog.show();
    }

    public void viewOrphanBirthCertificate(ActionEvent actionEvent) {
        File birthCertificate = Datasource.getInstance().outputBirthCertificate(orphanId);
        imageDialogViewer(birthCertificate);
    }

    public void viewOrphanPortraitPhoto(ActionEvent actionEvent) {
        Photos photos = Datasource.getInstance().queryPhotosByOrphanId(orphanId);
        File portraitPhoto =
                Datasource.getInstance().outputPortraitPhoto(photos.getId());
        imageDialogViewer(portraitPhoto);
    }

    public void viewOrphanLongPhoto(ActionEvent actionEvent) {
        Photos photos = Datasource.getInstance().queryPhotosByOrphanId(orphanId);
        File longPhoto = Datasource.getInstance().outputLongPhoto(photos.getId());
        imageDialogViewer(longPhoto);
    }

    public void viewFatherDeathCertificate(ActionEvent actionEvent) {
        int fatherId = Datasource.getInstance().queryFatherIDByOrphanId(orphanId);
        if (fatherId == -1) return;
        File fatherDeathCertificate =
                Datasource.getInstance().outputDeathCertificate(fatherId);
        imageDialogViewer(fatherDeathCertificate);
    }

    public void viewGuardianConfirmationLetter(ActionEvent actionEvent) {
        int guardianId = Datasource.getInstance().queryGuardianIDByOrphanId(orphanId);
        if (guardianId == -1) return;
        File guardianConfirmationLetter =
                Datasource.getInstance().outputConfirmationLetter(guardianId);
        imageDialogViewer(guardianConfirmationLetter);
    }

    public void viewGuardianIDCard(ActionEvent actionEvent) {
        int guardianId = Datasource.getInstance().queryGuardianIDByOrphanId(orphanId);
        if (guardianId == -1) return;
        File guardianIDCardLetter =
                Datasource.getInstance().outputIDCard(guardianId);
        imageDialogViewer(guardianIDCardLetter);
    }
}
