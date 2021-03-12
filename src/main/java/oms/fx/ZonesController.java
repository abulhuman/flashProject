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


public class ZonesController implements Initializable {

    @FXML
    private TableColumn<?, ?> colZoneName;
    @FXML
    private TableColumn<?, ?> colNumOfDistricts;
    @FXML
    private Button btnAddNewZone;
    @FXML
    private Button btnZonesNext;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddNewZone(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddNewZone.fxml"));
        Scene scene = new Scene(root);
        Stage stage2= new Stage();
        stage2.setTitle("Add New Zone");
        stage2.setScene(scene);
//        stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
    }

    @FXML
    private void GoToDistrict(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Districts.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Districts");
        stage.setScene(scene);
//        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @FXML
    private void BackToRegion(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Regions.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Regions");
        stage.setScene(scene);
//        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
    
}
