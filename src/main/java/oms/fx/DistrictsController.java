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
import javafx.scene.control.TableColumn;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static oms.Main.stage;


public class DistrictsController implements Initializable {

    @FXML
    private TableColumn<?, ?> colDistrictName;
    @FXML
    private TableColumn<?, ?> colNumOfVillages;
    @FXML
    private Button btnAddNewDistrict;
    @FXML
    private Button btnNextDistrict;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackToZone(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Zones.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Zones");
        stage.setScene(scene);
//        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @FXML
    private void AddNewDistrict(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddNewDistrict.fxml"));
        Scene scene = new Scene(root);
        Stage stage2= new Stage();
        stage2.setTitle("Add New District");
        stage2.setScene(scene);
//        stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
    }

    @FXML
    private void GoToVillage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Villages.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Villages");
        stage.setScene(scene);
//        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
    
}
