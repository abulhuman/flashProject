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
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class GuardianInformationController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private RadioButton Male;
    
    @FXML
    private RadioButton Female;
    @FXML
    private TextField guardianFirstName;
    @FXML
    private TextField guardianAddress;
    @FXML
    private TextField guardianNationality;
    @FXML
    private TextField guardianDateOfBirth;
    @FXML
    private TextField guardianTelephone;
    @FXML
    private TextField guardianJobTitle;
    @FXML
    private TextField guardianLastName;
    @FXML
    private TextField guardianMiddleName;
    @FXML
    private TextField GuardianEmail;
    @FXML
    private TextField guardianPOBox;
    @FXML
    private TextField guardianMobile;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    private void male(ActionEvent event){
        Female.setSelected(false);
        
    }
    
    @FXML
    private void female(ActionEvent event){
        Male.setSelected(false);
        
    }
    
    @FXML
    private void next(ActionEvent event) throws IOException {
        
        
//        Parent root = FXMLLoader.load(getClass().getResource("UploadFile.fxml"));
//        Scene scene = new Scene(root);
//       
////        Stage stage2=new Stage();
//        stage2.setTitle("Upload File");
//        stage2.setScene(scene);
//        stage2.initModality(Modality.APPLICATION_MODAL);
//        stage2.show();
      
         
    }
}
