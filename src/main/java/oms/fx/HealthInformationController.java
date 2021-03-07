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


public class HealthInformationController implements Initializable {

    @FXML
    private RadioButton healthy;
    
    @FXML
    private RadioButton disabled;
    
    private RadioButton Sociable;
    
    private RadioButton Notsociable;
    
    private TextField mentiondisability;
    @FXML
    private TextField mentionDisability;
    @FXML
    private RadioButton sociable;
    @FXML
    private RadioButton notsociable;
    @FXML
    private TextArea otherHealthIssues;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    @FXML
    private void healthy(ActionEvent event){
        disabled.setSelected(false);
        mentionDisability.setVisible(false);
    }
    
    @FXML
    private void disabled(ActionEvent event){
        healthy.setSelected(false);
        mentionDisability.setVisible(true);
        
    }
    
    @FXML
    private void sociable(ActionEvent event){
        notsociable.setSelected(false);
    }
    
    
    
    @FXML
    private void next(ActionEvent event) throws IOException {
        
        
//        Parent root = FXMLLoader.load(getClass().getResource("EducationInformation.fxml"));
//        Scene scene = new Scene(root);
//       
////        Stage stage2=new Stage();
//        stage2.setTitle("Education Information");
//        stage2.setScene(scene);
//        stage2.initModality(Modality.APPLICATION_MODAL);
//        stage2.show();
      
         
    }

    @FXML
    private void notsociable(ActionEvent event) {
        sociable.setSelected(false);
    }
}
