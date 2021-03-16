package oms.fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import oms.model.*;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CoordinatorController implements Initializable {

    public TextField searchTextField;
    public Button searchButton;
    public TextField childName;
    public TextField fatherName;
    public TextField grandfatherName;
    public RadioButton Male;
    public RadioButton Female;
    public DatePicker childDateOfBirth;
    public TextField childPlaceOfBirth;
    public TextField spokenLanguages;
    public TextField childHealthDescription;
    public ComboBox<String> childPsychologicalStatus;
    public Accordion newOrphanAccordion;
    public Button perInfoNext;
    public TableView<OrphanRow> orphansTable;
    public Button btnBackToVillages;
    public Button showDetails;
    public ComboBox<String> childEnrollmentStatus;
    public TextField childSchoolName;
    public RadioButton Private;
    public RadioButton Public;
    public ComboBox<String> childEducationLevel;
    public ComboBox<String> childGradeYear;
    public TextField childReason;
    public AnchorPane personalInfo; //
    public DatePicker fatherDateOfBirth;
    public DatePicker fatherDateOfDeath;
    public TextField fatherCauseOfDeath;
    public DatePicker motherDateOfBirth;
    public TextField motherFirstName;
    public TextField motherMiddleName;
    public TextField motherLastName;
    public ComboBox<String> motherVitalStatus;
    public ComboBox<String> motherMaritalStatus;
    public DatePicker motherDateOfDeath;
    public TextField motherMonthlyIncome;
    public TextField motherMobileNumber;
    public TextField motherCauseOfDeath;
    public TextField motherMonthlyExpense;
    public TextField guardianFirstName;
    public TextField guardianMiddleName;
    public TextField guardianLastName;
    public RadioButton MaleGuardian;
    public RadioButton FemaleGuardian;
    public ComboBox<String> guardianRelationToOrphan;
    public DatePicker guardianDateOfBirth;
    public TextField guardianEmail;
    public TextField guardianMobileNumber;
    public ComboBox<String> guardianNationality;
    public TextField guardianTelephoneNumber;
    public Button famInfoNext;
    public AnchorPane documentInfo; //

    // error label fields
    public Label childNameError;
    public Label fatherNameError;
    public Label grandFatherError;
    public Label dateOfBirthError;
    public Label placeOfBirthError;
    public Label spokenLanguagesError;
    public Label healthDescriptionError;
    public Label schoolNameError;
    public Label reasonError;
    public Label genderError;
    public Label schoolTypeError;
    public Label psychologicalStatusError;
    public Label enrollmentStatusError;
    public Label educationLevelError;
    public Label gradeYearError;
    public Label fatherCauseOfDeathError;
    public Label motherFirstNameError;
    public Label motherMiddleNameError;
    public Label motherLastNameError;
    public Label motherVitalStatusError;
    public Label motherMaritalStatusError;
    public Label motherDateOfDeathError;
    public Label motherMonthlyIncomeError;
    public Label motherMobileNumberError;
    public Label motherCauseOfDeathError;
    public Label motherMonthlyExpenseError;
    public Label guardianFirstNameError;
    public Label guardianMiddleNameError;
    public Label guardianLastNameError;
    public Label guardianRelationToOrphanError;
    public Label guardianDateOfBirthError;
    public Label guardianEmailError;
    public Label guardianMobileNumberError;
    public Label guardianNationalityError;
    public Label guardianTelephoneNumberError;
    public Label fatherDateOfBirthError;
    public Label fatherDateOfDeathError;
    public Label motherDateOfBirthError;
    public Label guardianGenderError;
    public ScrollPane familyInfo;

    ToggleGroup Gender;
    ToggleGroup SchoolType;
    ToggleGroup GuardianGender;

    public Orphan orphan;

    @FXML
    private TextField search;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO set userData for the labels to display
//        System.out.println(" inside controller");
        childNameError = new Label();
        fatherNameError = new Label();
        grandFatherError = new Label();
        dateOfBirthError = new Label();
        placeOfBirthError = new Label();
        spokenLanguagesError = new Label();
        healthDescriptionError = new Label();
        schoolNameError = new Label();
        reasonError = new Label();
        genderError = new Label();
        schoolTypeError = new Label();
        psychologicalStatusError = new Label();
        enrollmentStatusError = new Label();
        educationLevelError = new Label();
        gradeYearError = new Label();
        personalInfo.getChildren().addAll(
                childNameError,
                fatherNameError,
                grandFatherError,
                dateOfBirthError,
                placeOfBirthError,
                spokenLanguagesError,
                healthDescriptionError,
                schoolNameError,
                reasonError,
                genderError,
                schoolTypeError,
                psychologicalStatusError,
                enrollmentStatusError,
                educationLevelError,
                gradeYearError
        );

        Gender = new ToggleGroup();
        Gender.setUserData("Gender");
        Male.setToggleGroup(Gender);
        Female.setToggleGroup(Gender);

        SchoolType = new ToggleGroup();
        SchoolType.setUserData("SchoolType");
        Private.setToggleGroup(SchoolType);
        Public.setToggleGroup(SchoolType);

        GuardianGender = new ToggleGroup();
        GuardianGender.setUserData("Gender");
        MaleGuardian.setToggleGroup(GuardianGender);
        FemaleGuardian.setToggleGroup(GuardianGender);


        ObservableList<String> psychologicalStatuses = FXCollections.observableArrayList(
                "Normal", "Isolated", "Stressed", "Sociable", "Unsociable");
        childPsychologicalStatus.getItems().addAll(psychologicalStatuses);
        childPsychologicalStatus.setUserData("Psychological Status");

        ObservableList<String> enrollmentStatuses = FXCollections.observableArrayList(
                "Enrolled", "Unenrolled", "Droppedout");
        childEnrollmentStatus.setItems(enrollmentStatuses);
        childEnrollmentStatus.setUserData("Enrollment Status");

        ObservableList<String> level = FXCollections.observableArrayList("Religious " +
                        "Education", "Preschool", "Grade School", "Undergraduate",
                "Postgraduate", "N/A");
        childEducationLevel.setItems(level);
        childEducationLevel.setUserData("Level");

        ObservableList<String> gradeYear = FXCollections.observableArrayList("1", "2",
                "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
        childGradeYear.setItems(gradeYear);
        childGradeYear.setUserData("Grade/Year");

        ObservableList<String> vitalStatus = FXCollections.observableArrayList("Alive",
                "Passed");
        motherVitalStatus.setItems(vitalStatus);
        motherVitalStatus.setUserData("Vital Status");

        ObservableList<String> martialStatus = FXCollections.observableArrayList(
                "Married", "Widow", "N/A");
        motherMaritalStatus.setItems(martialStatus);
        motherMaritalStatus.setUserData("Martial Status");

        ObservableList<String> relationToOrphan = FXCollections.observableArrayList(
                "Mother",
                "Grandmother",
                "Grandfather",
                "Sister",
                "Brother",
                "Uncle",
                "Aunt",
                "Niece",
                "Nephew",
                "Legalguardian"
        );
        guardianRelationToOrphan.setItems(relationToOrphan);
        guardianRelationToOrphan.setUserData("Relation To Orphan");

        ObservableList<String> nationality = FXCollections.observableArrayList(
                "Djiboutian",
                "Ethiopian",
                "Eritrean",
                "Kenyan",
                "Somali",
                "South Sudanese",
                "Sudanese"
        );
        guardianNationality.setItems(nationality);
        guardianNationality.setUserData("Nationality");

        orphan = new Orphan();

    }

    @FXML
    private void showDetails(ActionEvent event) throws IOException {
        Stage stage = new Stage();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ShowDetails.fxml"));

        Parent root = loader.load();

        OrphanRow selectedRow = orphansTable.getSelectionModel().getSelectedItem();

        ShowDetailsController showDetailsController = loader.getController();

        if (selectedRow != null){
            showDetailsController.populateTable(selectedRow.getId());

            stage.setTitle("Information");
            stage.setScene(new Scene(root));
            stage.show();
        }
    }

    private final Desktop desktop = Desktop.getDesktop();
    final FileChooser fileChooser = new FileChooser();
    static FileChooser.ExtensionFilter png = new FileChooser.ExtensionFilter("PNG", "*" +
            ".png");
    static FileChooser.ExtensionFilter jpg = new FileChooser.ExtensionFilter("JPG", "*.jpg");


    @FXML
    private void male(ActionEvent event) {
        Female.setSelected(false);
    }

    @FXML
    private void female(ActionEvent event) {
        Male.setSelected(false);
    }

    // returns true if the string doesn't contain none alphabet characters except '-' & '/'
    public static Boolean isValidText(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z') && (c != ' ') && (c != '-') && (c != '/')) {
                return false;
            }
        }
        return true;
    }

    // returns true if its a valid name
    private Boolean isValidTF (TextField tf) {
        if (!isValidText(tf.getText())) return false;
        else if(tf.getText().isEmpty()) return false;
        else return tf.getText().length() < 255;
    }

    // adds a label under the text field if the entered value is not valid
    private void validateTF(TextField tf, Label errorLabel) {
        errorLabel.setTranslateY(tf.getLayoutY() + tf.getHeight());
        errorLabel.setTranslateX(tf.getLayoutX());

        if(!isValidTF(tf)) {
            tf.setStyle("-fx-text-box-border: red;");
            errorLabel.setText("Invalid " + tf.getId());
            errorLabel.setTextFill(Color.web("red",0.75));
//            System.out.println("invalid");
//            System.out.println(personalInfo.getChildren().indexOf(errorLabel));
        } else {
//            tf.setStyle("-fx-background-color: linear-gradient(to bottom, " +
//                    "derive(-fx-text-box-border, -10%), -fx-text-box-border)," +
//                    " linear-gradient(from 0px 0px to 0px 5px, derive" +
//                    "(-fx-control-inner-background, -9%), -fx-control-inner-background);" +
//                    "-fx-background-insets: 0, 1; -fx-background-radius: 3, 2; " +
//                    "-fx-text-box-border: rgb(0,255,0);");
            tf.setStyle("-fx-background-color: linear-gradient(to bottom, " +
                    "derive(-fx-text-box-border, -10%), -fx-text-box-border)," +
                    " linear-gradient(from 0px 0px to 0px 5px, derive" +
                    "(-fx-control-inner-background, -9%), -fx-control-inner-background);" +
                    "-fx-background-insets: 0, 1; -fx-background-radius: 3, 2;");
//            personalInfo.getChildren().remove(errorLabel);
            // -----------------------------------------------
//            errorLabel.setText("Valid " + tf.getId());
//            errorLabel.setTextFill(Color.web("green",0));
            // -----------------------------------------------
            errorLabel.setText("");


//            System.out.println("valid");
//            System.out.println(personalInfo.getChildren().indexOf(errorLabel));
        }
    }

    // same as validateTF except it work on existing labels
    private void validateNativeTF(TextField tf, Label errorLabel) {

        if(!isValidTF(tf)) {
            tf.setStyle("-fx-text-box-border: red;");
            errorLabel.setText("Invalid " + tf.getId());
            errorLabel.setTextFill(Color.web("red",0.75));
        } else {
            tf.setStyle("-fx-background-color: linear-gradient(to bottom, " +
                    "derive(-fx-text-box-border, -10%), -fx-text-box-border)," +
                    " linear-gradient(from 0px 0px to 0px 5px, derive" +
                    "(-fx-control-inner-background, -9%), -fx-control-inner-background);" +
                    "-fx-background-insets: 0, 1; -fx-background-radius: 3, 2;");
            errorLabel.setText("");
//            personalInfo.getChildren().remove(errorLabel);
//            errorLabel.setText("Valid " + tf.getId());
//            errorLabel.setTextFill(Color.web("green",0));
        }
    }

    // adds a label under the radio button if nothing is selected
    private void validateRB(ToggleGroup toggleGroup, Label errorLabel) {
        if(toggleGroup.getUserData().toString().contains("Gender")) {
            errorLabel.setTranslateY(Female.getLayoutY() + Female.getHeight());
            errorLabel.setTranslateX(Female.getLayoutX());
        } else if(toggleGroup.getUserData().toString().contains("SchoolType")){
            errorLabel.setTranslateY(Public.getLayoutY() + Public.getHeight());
            errorLabel.setTranslateX(Public.getLayoutX());
        } else {
            errorLabel.setTranslateY(0);
            errorLabel.setTranslateX(0);
        }

        if(toggleGroup.getSelectedToggle() == null) {
//            errorLabel.setText(toggleGroup.getUserData() + " can't be empty!");
            errorLabel.setText("Select " + toggleGroup.getUserData());
            errorLabel.setTextFill(Color.web("red",0.75));
        } else {
//            personalInfo.getChildren().remove(errorLabel);
            errorLabel.setText("");
        }

//        System.out.println(toggleGroup.getUserData());
    }

    // same as validateRB except it work on existing labels
    private void validateNativeRB(ToggleGroup toggleGroup, Label errorLabel) {
        if(toggleGroup.getSelectedToggle() == null) {
//            errorLabel.setText(toggleGroup.getUserData() + " can't be empty!");
            errorLabel.setText("Select " + toggleGroup.getUserData());
            errorLabel.setTextFill(Color.web("red",0.75));
        } else {
            errorLabel.setText("");
        }
    }

    // add a label under the combobox if nothing is selected
    private void validateCB(ComboBox<String> comboBox, Label errorLabel) {
        errorLabel.setTranslateY(comboBox.getLayoutY() + comboBox.getHeight());
        errorLabel.setTranslateX(comboBox.getLayoutX());

        if (comboBox.getSelectionModel().isEmpty()) {
            errorLabel.setText("Select " + comboBox.getUserData());
            errorLabel.setTextFill(Color.web("red",0.75));
        } else {
            personalInfo.getChildren().remove(errorLabel);
        }
    }

    // same as validateCB except it work on existing labels
    private void validateNativeCB(ComboBox<String> comboBox, Label errorLabel) {
        if (comboBox.getSelectionModel().isEmpty()) {
            errorLabel.setText("Select " + comboBox.getUserData());
            errorLabel.setTextFill(Color.web("red",0.75));
        } else {
            errorLabel.setText("");
        }
    }

    // returns true is the date is valid
    static boolean checkDate(String date) {
        String pattern = "(0?[1-9]|1[0-2])\\/(0?[1-9]|[12][0-9]|3[01])\\/([0-9]{4})";
        return date.matches(pattern);
    }

    // returns true if its a valid date and has the set format
    private static boolean isValidDate(String date) {
        boolean status = false;
        if (checkDate(date)) {
            // sets the date format
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            dateFormat.setLenient(false);
            // if the data matches the date format sets status to true else false
            try {
                dateFormat.parse(date);
                status = true;
            } catch (Exception e) {
                status = false;
            }
        }
        return !status;
    }

    // sets the validation for datepicker
    private void isValidDate(DatePicker datePicker, Label errorLabel) {
        if (datePicker.getEditor().getText().length() > 0) {
            if(checkDate(datePicker.getEditor().getText())) {
//                String[] tempDateValues = datePicker.getEditor().getText().split("/");
//                // changed the date format from "MM/dd/yyyy" to "dd/MM/yyyy"
//                String formattedInputDate =
//                        tempDateValues[1]+"/"+tempDateValues[0]+"/"+tempDateValues[2];
                if(isValidDate(datePicker.getEditor().getText())) {
                    datePicker.setStyle("-fx-text-box-border: red;");
                    errorLabel.setText("Invalid date format use (MM/dd/yyyy)");
                    errorLabel.setTextFill(Color.web("red",0.75));
                } else {
                    errorLabel.setText("");
                }
            } else {
                datePicker.setStyle("-fx-text-box-border: red;");
                errorLabel.setText("Enter a valid date");
                errorLabel.setTextFill(Color.web("red",0.75));
            }
        } else {
            datePicker.setStyle("-fx-text-box-border: red;");
            errorLabel.setText(datePicker.getId() + " can't be empty");
            errorLabel.setTextFill(Color.web("red",0.75));
        }
    }

    // sets the label to a position below the datepicker which itr represents
    private void validateDP(DatePicker datePicker, Label errorLabel) {
        errorLabel.setLayoutX(datePicker.getLayoutX());
        errorLabel.setLayoutY(datePicker.getLayoutY() + datePicker.getHeight());

        isValidDate(datePicker, errorLabel);
    }

    // same as validateDP except it work on existing labels
    private void validateNativeDP(DatePicker datePicker, Label errorLabel) {
        isValidDate(datePicker, errorLabel);
    }

    // handles the personal info next button
    public void perInfoNextHandler(ActionEvent actionEvent) {

        // -----------------------------------------------------------------------
        // to set the text field border to red and focus to red
//            childName.setStyle("-fx-text-box-border: red; -fx-focus-color: red");
        // to remove the border color
//            fatherName.setStyle("-fx-background-color: -fx-control-inner-background;");
        // -----------------------------------------------------------------------

        validateTF(childName, childNameError);
        orphan.setFirstName(childName.getText());
        validateTF(fatherName, fatherNameError);
        orphan.getFather().setFirstName(fatherName.getText());
        validateTF(grandfatherName, grandFatherError);
        orphan.getFather().setLastName(grandfatherName.getText());
        validateTF(childPlaceOfBirth, placeOfBirthError);
        orphan.setPlaceOfBirth(childPlaceOfBirth.getText());
        validateTF(spokenLanguages, spokenLanguagesError);
        orphan.setSpokenLanguages(spokenLanguages.getText());
        validateTF(childHealthDescription, healthDescriptionError);
        orphan.setHealthDescription(childHealthDescription.getText());
        validateTF(childSchoolName, schoolNameError);
        orphan.getEducation().setSchoolName(childSchoolName.getText());
        validateTF(childReason, reasonError);
        orphan.getEducation().setReason(childReason.getText());

        validateRB(Gender, genderError);
        validateRB(SchoolType, schoolTypeError);

        validateCB(childPsychologicalStatus, psychologicalStatusError);
        orphan.setPsychologicalStatus(
                childPsychologicalStatus.getSelectionModel().getSelectedItem() == "Normal" ? Orphan_psychologicalStatus_enum.NORMAL :
                        childPsychologicalStatus.getSelectionModel().getSelectedItem() == "Isolated" ? Orphan_psychologicalStatus_enum.ISOLATED :
                                childPsychologicalStatus.getSelectionModel().getSelectedItem() == "Stressed" ? Orphan_psychologicalStatus_enum.STRESSED :
                                        childPsychologicalStatus.getSelectionModel().getSelectedItem() == "Sociable" ? Orphan_psychologicalStatus_enum.OVERLYSOCIABLE :
                                                 Orphan_psychologicalStatus_enum.UNSOCIABLE
                );
        validateCB(childEnrollmentStatus, enrollmentStatusError);
        orphan.getEducation().setEnrollmentStatus(childEnrollmentStatus.getSelectionModel().getSelectedItem() == "Enrolled" ? Education_enrollmentStatus_enum.ENROLLED:
                        childEnrollmentStatus.getSelectionModel().getSelectedItem() == "Unenrolled" ? Education_enrollmentStatus_enum.UNENROLLED:
                                 Education_enrollmentStatus_enum.DROPPEDOUT
                );
        validateCB(childEducationLevel, educationLevelError);
        orphan.getEducation().setLevel(childEducationLevel.getSelectionModel().getSelectedItem() == "ReligiousEducation" ? Education_level_enum.RELIGIOUSEDUCATION :
                        childEducationLevel.getSelectionModel().getSelectedItem() == "Preschool" ? Education_level_enum.PRESCHOOL :
                                childEducationLevel.getSelectionModel().getSelectedItem() == "Gradeschool" ? Education_level_enum.GRADESCHOOL :
                                        childEducationLevel.getSelectionModel().getSelectedItem() == "Undergraduate" ? Education_level_enum.UNDERGRADUATE :
                                                childEducationLevel.getSelectionModel().getSelectedItem() == "Postgraduate" ? Education_level_enum.POSTGRADUATE :
                                                        Education_level_enum.N_A
                );
        validateCB(childGradeYear, gradeYearError);
        orphan.getEducation().setYear(childGradeYear.getSelectionModel().getSelectedItem());

        validateDP(childDateOfBirth, dateOfBirthError);
        orphan.setDateOfBirth(childDateOfBirth.getEditor().getText());
    }

    // handles the family info next button
    public void famInfoNextHandler(ActionEvent actionEvent) {
        validateNativeTF(fatherCauseOfDeath, fatherCauseOfDeathError);
        orphan.getFather().setCauseOfDeath(fatherCauseOfDeath.getText());
        validateNativeTF(motherFirstName, motherFirstNameError);
        orphan.getMother().setFirstName(motherFirstName.getText());
        validateNativeTF(motherMiddleName, motherMiddleNameError);
        orphan.getMother().setMiddleName(motherMiddleName.getText());
        validateNativeTF(motherLastName, motherLastNameError);
        orphan.getMother().setLastName(motherLastName.getText());
        validateNativeTF(motherCauseOfDeath, motherCauseOfDeathError);
        orphan.getMother().setCauseOfDeath(motherCauseOfDeath.getText());
        validateNativeTF(motherMobileNumber, motherMobileNumberError);
        orphan.getMother().setMobileNumber(motherMobileNumber.getText());
        validateNativeTF(motherMonthlyIncome, motherMonthlyIncomeError);
        orphan.getMother().setMonthlyIncome(Float.parseFloat(motherMonthlyIncome.getText()));
        validateNativeTF(motherMonthlyExpense, motherMonthlyExpenseError);
        orphan.getMother().setMonthlyExpense(Float.parseFloat(motherMonthlyExpense.getText()));
        validateNativeTF(guardianFirstName, guardianFirstNameError);
        orphan.getGuardian().setFirstName(guardianFirstName.getText());
        validateNativeTF(guardianMiddleName, guardianMiddleNameError);
        orphan.getGuardian().setMiddleName(guardianMiddleName.getText());
        validateNativeTF(guardianLastName, guardianLastNameError);
        orphan.getGuardian().setLastName(guardianLastName.getText());
        validateNativeTF(guardianEmail, guardianEmailError);
        orphan.getGuardian().setEmail(guardianEmail.getText());
        validateNativeTF(guardianMobileNumber, guardianMobileNumberError);
        orphan.getGuardian().setMobileNumber(guardianMobileNumber.getText());
        validateNativeTF(guardianTelephoneNumber, guardianTelephoneNumberError);
        orphan.getGuardian().setTelephoneNumber(guardianTelephoneNumber.getText());

        validateNativeRB(GuardianGender, guardianGenderError);

        validateNativeCB(motherVitalStatus, motherVitalStatusError);
        orphan.getMother().setVitalStatus(motherVitalStatus.getSelectionModel().getSelectedItem() == "Alive" ? Mother_vitalStatus_enum.ALIVE : Mother_vitalStatus_enum.PASSED );
        validateNativeCB(motherMaritalStatus, motherMaritalStatusError);
        orphan.getMother().setMaritalStatus(motherMaritalStatus.getSelectionModel().getSelectedItem() == "Married" ? Mother_maritalStatus_enum.MARRIED :
                motherMaritalStatus.getSelectionModel().getSelectedItem().equals("Widow") ? Mother_maritalStatus_enum.WIDOW :
                        Mother_maritalStatus_enum.N_A
        );
        validateNativeCB(guardianRelationToOrphan, guardianRelationToOrphanError);
        orphan.getGuardian().setRelationToOrphan(guardianRelationToOrphan.getSelectionModel().getSelectedItem().equals("Mother") ? Guardian_relationToOrphan_enum.MOTHER:
                        guardianRelationToOrphan.getSelectionModel().getSelectedItem() == "Brother" ? Guardian_relationToOrphan_enum.BROTHER:
                                guardianRelationToOrphan.getSelectionModel().getSelectedItem() == "Sister" ? Guardian_relationToOrphan_enum.SISTER:
                                        guardianRelationToOrphan.getSelectionModel().getSelectedItem() == "Aunt" ? Guardian_relationToOrphan_enum.AUNT:
                                                guardianRelationToOrphan.getSelectionModel().getSelectedItem() == "Uncle" ? Guardian_relationToOrphan_enum.UNCLE:
                                                        guardianRelationToOrphan.getSelectionModel().getSelectedItem() == "Grandfather" ? Guardian_relationToOrphan_enum.GRANDFATHER:
                                                                guardianRelationToOrphan.getSelectionModel().getSelectedItem() == "Grandmother" ? Guardian_relationToOrphan_enum.GRANDMOTHER:
                                                                        guardianRelationToOrphan.getSelectionModel().getSelectedItem() == "Niece" ? Guardian_relationToOrphan_enum.NIECE:
                                                                                guardianRelationToOrphan.getSelectionModel().getSelectedItem() == "Nephew" ? Guardian_relationToOrphan_enum.NEPHEW:
                                                                                        Guardian_relationToOrphan_enum.LEGALGUARDIAN
                );
        validateNativeCB(guardianNationality, guardianNationalityError);
        orphan.getGuardian().setNationality(guardianNationality.getSelectionModel().getSelectedItem().equals("Djiboutian") ? Guardian_nationality_enum.DJIBOUTIAN:
                orphan.getGuardian().setNationality(guardianNationality.getSelectionModel().getSelectedItem().equals("Ethiopian") ? Guardian_nationality_enum.ETHIOPIAN:
                        orphan.getGuardian().setNationality(guardianNationality.getSelectionModel().getSelectedItem().equals("Eritrean") ? Guardian_nationality_enum.ERITREAN:
                                orphan.getGuardian().setNationality(guardianNationality.getSelectionModel().getSelectedItem().equals("Kenyan") ? Guardian_nationality_enum.KENYAN:
                                        orphan.getGuardian().setNationality(guardianNationality.getSelectionModel().getSelectedItem().equals("Somali") ? Guardian_nationality_enum.SOMALI:
                                                orphan.getGuardian().setNationality((guardianNationality.getSelectionModel().getSelectedItem().equals("Sudanese"))? Guardian_nationality_enum.SUDANESE: Guardian_nationality_enum.SOUTH_SUDANESE ))))));
        validateNativeDP(fatherDateOfBirth, fatherDateOfBirthError);
        orphan.getFather().setDateOfBirth(fatherDateOfBirth.getEditor().getText());
        validateNativeDP(fatherDateOfDeath, fatherDateOfDeathError);
        orphan.getFather().setDateOfDeath(fatherDateOfDeath.getEditor().getText());
        validateNativeDP(motherDateOfBirth, motherDateOfBirthError);
        orphan.getMother().setDateOfBirth(motherDateOfBirth.getEditor().getText());
        validateNativeDP(motherDateOfDeath, motherDateOfDeathError);
        orphan.getMother().setDateOfDeath(motherDateOfDeath.getEditor().getText());
        validateNativeDP(guardianDateOfBirth, guardianDateOfBirthError);
        orphan.getGuardian().setDateOfBirth(guardianDateOfBirth.getEditor().getText());
    }

    // handles the Birth Certificate file picker
    public void birthCertificateChooser(ActionEvent actionEvent) {
        System.out.println("birthCertificateEvent...");
        int orphanId = 7;

        configureFileChooser(fileChooser);

        Stage stage = new Stage();

        File file = fileChooser.showOpenDialog(stage);

        Datasource.getInstance().inputBirthCertificate(file, orphanId);

        File output = Datasource.getInstance().outputBirthCertificate(orphanId);

        if (output != null) {
            openFile(output);
            Label imgLabel = new Label();
            imgLabel.setText(output.getAbsoluteFile().getName());
            documentInfo.getChildren().add(imgLabel);
        } else System.out.println("null");
    }

    // handles the Portrait Photo file picker
    public void portraitPhotoChooser(ActionEvent actionEvent) {
        System.out.println("portraitPhotoEvent...");

        int id = 1;

        configureFileChooser(fileChooser);

        Stage stage = new Stage();

        File file = fileChooser.showOpenDialog(stage);

        Datasource.getInstance().inputPortraitPhoto(file, id);

        File output = Datasource.getInstance().outputPortraitPhoto(id);

        if (output != null) {
            openFile(output);
            Label imgLabel = new Label();
            imgLabel.setText(output.getAbsoluteFile().getName());
            documentInfo.getChildren().add(imgLabel);
        } else System.out.println("null");
    }

    // handles the Long Photo file picker
    public void longPhotoChooser(ActionEvent actionEvent) {
        System.out.println("longPhotoEvent...");

        int id = 1;

        configureFileChooser(fileChooser);

        Stage stage = new Stage();

        File file = fileChooser.showOpenDialog(stage);

        Datasource.getInstance().inputLongPhoto(file, id);

        File output = Datasource.getInstance().outputLongPhoto(id);

        if (output != null) {
            openFile(output);
            Label imgLabel = new Label();
            imgLabel.setText(output.getAbsoluteFile().getName());
            documentInfo.getChildren().add(imgLabel);
        } else System.out.println("null");
    }

    // handles the  Father Death Certificate file picker
    public void fatherDeathCertificateChooser(ActionEvent actionEvent) {
        System.out.println("fatherDeathCertificateEvent...");

        int id = 2;

        configureFileChooser(fileChooser);

        Stage stage = new Stage();

        File file = fileChooser.showOpenDialog(stage);

        Datasource.getInstance().inputDeathCertificate(file, id);

        File output = Datasource.getInstance().outputDeathCertificate(id);

        if (output != null) {
            openFile(output);
            Label imgLabel = new Label();
            imgLabel.setText(output.getAbsoluteFile().getName());
            documentInfo.getChildren().add(imgLabel);
        } else System.out.println("null");
    }

    // handles the Guardian Confirmation Letter file picker
    public void guardianConfirmationLetterChooser(ActionEvent actionEvent) {
        System.out.println("guardianConfirmationLetterEvent...");

        int id = 3;

        configureFileChooser(fileChooser);

        Stage stage = new Stage();

        File file = fileChooser.showOpenDialog(stage);

        Datasource.getInstance().inputConfirmationLetter(file, id);

        File output = Datasource.getInstance().outputConfirmationLetter(id);

        if (output != null) {
            openFile(output);
            Label imgLabel = new Label();
            imgLabel.setText(output.getAbsoluteFile().getName());
            documentInfo.getChildren().add(imgLabel);
        } else System.out.println("null");
    }

    // handles the Guardian ID Card file picker
    public void guardianIDCardChooser(ActionEvent actionEvent) {
        System.out.println("guardianIDCardEvent...");

        int id = 3;

        configureFileChooser(fileChooser);

        Stage stage = new Stage();

        File file = fileChooser.showOpenDialog(stage);

        Datasource.getInstance().inputIDCard(file, id);

        File output = Datasource.getInstance().outputIDCard(id);

        if (output != null) {
            openFile(output);
            Label imgLabel = new Label();
            imgLabel.setText(output.getAbsoluteFile().getName());
            documentInfo.getChildren().add(imgLabel);
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


    public void listOrphansByVillage(Village selectedVillage) {
        if (selectedVillage != null) {
            Task<ObservableList<OrphanRow>> task = new Task<>() {
                @Override
                protected ObservableList<OrphanRow> call() {

                    List<Orphan> orphans =
                            Datasource.getInstance().queryAllOrphans(selectedVillage.getId());

                    List<OrphanRow> rows = new ArrayList<>();

                    for (Orphan orphan :
                            orphans) {
                        OrphanRow row = new OrphanRow(orphan);
                        rows.add(row);
                    }

                    return FXCollections.observableArrayList(rows);
                }
            };
            orphansTable.itemsProperty().bind(task.valueProperty());
            new Thread(task).start();
        }
    }

    public void searchOrphan(ActionEvent actionEvent) {
    }

    public void backToVillages(ActionEvent actionEvent) throws IOException {
        Stage villagesStage = (Stage) orphansTable.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Villages.fxml"));

        Parent root = loader.load();

        VillagesController villagesController = loader.getController();

        System.out.println(orphansTable.getItems().get(0).getVillageId());

        villagesController.listVillagesById(orphansTable.getItems().get(0).getVillageId());

        villagesStage.setTitle("Villages");
        villagesStage.setScene(new Scene(root));
        villagesStage.show();

    }

}
