/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms.fx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class UploadFileController implements Initializable {

    @FXML
    private TextField fatherDeathCertificate;
    @FXML
    private TextField childBirthCertificate;
    @FXML
    private TextField childProfilePhoto;
    @FXML
    private TextField guardianConfirmationLetter;
    @FXML
    private TextField guardianIDcardPhotocopied;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
