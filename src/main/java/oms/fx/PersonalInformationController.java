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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class PersonalInformationController implements Initializable {

    @FXML
    private RadioButton Male;
    
    @FXML
    private RadioButton Female;
    private Stage stage;
    @FXML
    private TextField childName;
    @FXML
    private TextField fatherName;
    @FXML
    private TextField grandfatherName;
    @FXML
    private TextField childDateOfBirth;
    @FXML
    private TextField childPlaceOfBirth;
    @FXML
    private TextField spokenLanguages;
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
        
        
//        Parent root = FXMLLoader.load(getClass().getResource("HealthInformation.fxml"));
//        Scene scene = new Scene(root);
//       
//         Stage stage2= new Stage();
//        stage2.setTitle("Health Information");
//        stage2.setScene(scene);
//          stage2.initModality(Modality.APPLICATION_MODAL);
//        stage2.show();
      
         
    }
    
}
