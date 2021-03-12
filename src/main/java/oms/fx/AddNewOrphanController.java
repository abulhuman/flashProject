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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static oms.Main.stage;


public class AddNewOrphanController implements Initializable {

    @FXML
    private TextField search;
    @FXML
    private Button home;
    @FXML
    private Button personal;
//     static Stage stage2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void home(ActionEvent event) throws IOException {
        
        
          Parent root = FXMLLoader.load(getClass().getResource("Coordinator.fxml"));
        Scene scene = new Scene(root);
       
        stage.setTitle("Home");
        stage.setScene(scene);
//          stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
      
         
    }
    
     @FXML
    private void personal(ActionEvent event) throws IOException {
        
        
          Parent root = FXMLLoader.load(getClass().getResource("PersonalInformation.fxml"));
        Scene scene = new Scene(root);
        Stage stage2= new Stage();
        stage2.setTitle("Personal Information");
        stage2.setScene(scene);
//          stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
      
         
    }
    @FXML
    private void healthInformation(ActionEvent event) throws IOException {
        
        
          Parent root = FXMLLoader.load(getClass().getResource("HealthInformation.fxml"));
        Scene scene = new Scene(root);
       
        Stage stage2= new Stage();
        stage2.setTitle("Health Information");
        stage2.setScene(scene);
//          stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
      
         
    }
    @FXML
    private void educationInformation(ActionEvent event) throws IOException {
        
        
          Parent root = FXMLLoader.load(getClass().getResource("EducationInformation.fxml"));
        Scene scene = new Scene(root);
       
        Stage stage2= new Stage();
        stage2.setTitle("Education Information");
        stage2.setScene(scene);
//          stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
      
         
    }
    @FXML
    private void householdInformation(ActionEvent event) throws IOException {
        
        
          Parent root = FXMLLoader.load(getClass().getResource("HouseholdInformation.fxml"));
        Scene scene = new Scene(root);
       
        Stage stage2= new Stage();
        stage2.setTitle("Household Information");
        stage2.setScene(scene);
//          stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
      
         
    }
    @FXML
    private void guardianInformation(ActionEvent event) throws IOException {
        
        
          Parent root = FXMLLoader.load(getClass().getResource("GuardianInformation.fxml"));
        Scene scene = new Scene(root);
       
        Stage stage2= new Stage();
        stage2.setTitle("Guardian Information");
        stage2.setScene(scene);
//          stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
      
         
    }
    @FXML
    private void uploadFile(ActionEvent event) throws IOException {
        
        
          Parent root = FXMLLoader.load(getClass().getResource("UploadFile.fxml"));
        Scene scene = new Scene(root);
//      
        Stage stage2= new Stage();
        stage2.setTitle("Upload File");
        stage2.setScene(scene);
//          stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
      
         
    }
}
