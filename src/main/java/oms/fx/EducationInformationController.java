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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static oms.Main.stage2;


public class EducationInformationController implements Initializable {

    @FXML
    private RadioButton Enrolled;
    
    @FXML
    private RadioButton Droppedout;
    
    @FXML
    private RadioButton Unenrolled;
    @FXML
    private TextArea hobbiesAndAmbitions;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void enrolled(ActionEvent event){
        Droppedout.setSelected(false);
        Unenrolled.setSelected(false);
        
    }
    
    @FXML
    private void droppedout(ActionEvent event){
        Enrolled.setSelected(false);
        Unenrolled.setSelected(false);
        
    }
    
    @FXML
    private void unenrolled(ActionEvent event){
        Droppedout.setSelected(false);
        Enrolled.setSelected(false);
        
    }
    
    @FXML
    private void next(ActionEvent event) throws IOException {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("HouseholdInformation.fxml"));
        Scene scene = new Scene(root);
       
//        Stage stage2=new Stage();
        stage2.setTitle("Household Information");
        stage2.setScene(scene);
        stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
      
         
    }
    
}
