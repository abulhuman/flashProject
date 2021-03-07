/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class HouseholdInformationController implements Initializable {

    @FXML
    private RadioButton Alive;
    
    @FXML
    private RadioButton Passedaway;
    
    @FXML
    private RadioButton Privatelyowned;
    
    @FXML
    private RadioButton Rental;
    
    @FXML
    private RadioButton Withrelatives;
    
    @FXML
    private RadioButton Dependent;
    
    @FXML
    private RadioButton Other;
    @FXML
    private TextField fatherDateOfBirth;
    @FXML
    private TextField fatherDateOfDeath;
    @FXML
    private TextField fatherCauseOfDeath;
    @FXML
    private TextField jobTitle;
    @FXML
    private TextField monthlyIncome;
    @FXML
    private TextField motherFirstName;
    @FXML
    private TextField motherMiddleName;
    @FXML
    private TextField motherLastName;
    @FXML
    private TextField motherDateOfBirth;
    @FXML
    private TextField otherHousingSituation;
    @FXML
    private TextArea otherPropertiesOwnedByFamily;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    private void alive(ActionEvent event){
        Passedaway.setSelected(false);
        
    }
    
    @FXML
    private void passedaway(ActionEvent event){
        Alive.setSelected(false);
        
    }
    
//    @FXML
//    private void privatelyowned(ActionEvent event){
//        
//        
//    }
    
    @FXML
    private void rental(ActionEvent event){
        Privatelyowned.setSelected(false);
        Withrelatives.setSelected(false);
        Dependent.setSelected(false);
        Other.setSelected(false);
        otherHousingSituation.setVisible(false);
    }
    @FXML
    private void withrelatives(ActionEvent event){
        Rental.setSelected(false);
        Privatelyowned.setSelected(false);
        Dependent.setSelected(false);
        Other.setSelected(false);
        otherHousingSituation.setVisible(false);
    }
    
    @FXML
    private void dependent(ActionEvent event){
        Rental.setSelected(false);
        Withrelatives.setSelected(false);
        Privatelyowned.setSelected(false);
        Other.setSelected(false);
        otherHousingSituation.setVisible(false);
    }
    
    @FXML
    private void other(ActionEvent event){
        Rental.setSelected(false);
        Withrelatives.setSelected(false);
        Dependent.setSelected(false);
        Privatelyowned.setSelected(false);
        otherHousingSituation.setVisible(true);
    }
    
    @FXML
    private void next(ActionEvent event) throws IOException {
        
        
//        Parent root = FXMLLoader.load(getClass().getResource("GuardianInformation.fxml"));
//        Scene scene = new Scene(root);
//       
////        Stage stage2=new Stage();
//        stage2.setTitle("Guardian Information");
//        stage2.setScene(scene);
//        stage2.initModality(Modality.APPLICATION_MODAL);
//        stage2.show();
      
         
    }

    

    @FXML
    private void privatelyowned(ActionEvent event) {
        Rental.setSelected(false);
        Withrelatives.setSelected(false);
        Dependent.setSelected(false);
        Other.setSelected(false);
        otherHousingSituation.setVisible(false);
    }
    
}
