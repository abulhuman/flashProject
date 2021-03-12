/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static oms.Main.stage;


public class ShowDetailsController implements Initializable {

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void BackToCoordinator(ActionEvent event)  throws IOException{
        
         Parent root5 = FXMLLoader.load(getClass().getResource("Coordinator.fxml"));
        Scene scene5 = new Scene(root5);
       
        stage.setTitle("Home");
        stage.setScene(scene5);
//        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @FXML
    private void scroll(ScrollEvent event) {
//        showDetailsScrollBar.setContent(showDetailsPane);
    
}
}
