package oms.fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.Region;
import oms.model.Zone;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class ZonesController implements Initializable {

    @FXML
    public TableView<Zone> zonesTable;

    @FXML
    public Button btnShowDistricts;

    @FXML
    public Button btnAddNewZone;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddNewZone(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddNewZone.fxml"));
        Scene scene = new Scene(root);
        Stage addNewZoneStage= new Stage();
        addNewZoneStage.setTitle("Add New Zone");
        addNewZoneStage.setScene(scene);
        addNewZoneStage.show();
    }

    public void listZonesByRegion(Region selectedRegion) {
        if (selectedRegion != null){
            Task<ObservableList<Zone>> task = new Task<>() {
                @Override
                protected ObservableList<Zone> call() {
                    return FXCollections.observableArrayList(Datasource.getInstance().queryAllZones(selectedRegion.getId()));
                }
            };
        zonesTable.itemsProperty().bind(task.valueProperty());
        new Thread(task).start();
        }
    }

    public void listZonesById(int id){
        Task<ObservableList<Zone>> task = new Task<>() {
            @Override
            protected ObservableList<Zone> call() {
                return FXCollections.observableArrayList(Datasource.getInstance().queryAllZones(id));
            }
        };
        zonesTable.itemsProperty().bind(task.valueProperty());
        new Thread(task).start();
    }

    @FXML
    private void backToRegion(ActionEvent event) throws IOException {
        Stage regionStage = (Stage) zonesTable.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Regions.fxml"));

        Parent root = loader.load();

        RegionController regionController = loader.getController();
        regionController.listRegions();

        Scene scene = new Scene(root);
        regionStage.setTitle("Regions");
        regionStage.setScene(scene);
        regionStage.show();
    }

    public void showDistricts(ActionEvent actionEvent) throws IOException {
        Stage zonesStage = (Stage) zonesTable.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Districts.fxml"));

        Parent root = loader.load();

        DistrictsController districtsController = loader.getController();

        Zone zone = zonesTable.getSelectionModel().getSelectedItem();

        if (zone != null){
            districtsController.listDistrictsByZone(zone);

            zonesStage.setTitle("Zones");
            zonesStage.setScene(new Scene(root));
            zonesStage.show();
        }
    }
}
