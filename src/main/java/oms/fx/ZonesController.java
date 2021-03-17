package oms.fx;

import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.Region;
import oms.model.Zone;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;


public class ZonesController implements Initializable {
    private Region region;

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

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
    private void addNewZone(ActionEvent event) throws SQLException {
        TextInputDialog newZoneDialog = new TextInputDialog();
        newZoneDialog.setTitle("New Zone");
        newZoneDialog.setHeaderText("New Zone");
        newZoneDialog.setContentText("Name");

        newZoneDialog.getDialogPane().getButtonTypes().remove(ButtonType.CANCEL);

        int currentRegionId = this.getRegion().getId();

        Optional<String> result = newZoneDialog.showAndWait();
        if (result.isPresent() && !result.get().equals("")) {
            int newZoneId = Datasource.getInstance().insertZone(result.get(), currentRegionId);

            Zone newZone = new Zone();

            newZone.setId(newZoneId);
            newZone.setName(result.get());
            newZone.setRegionId(currentRegionId);

            ObservableList<Zone> existingZones = zonesTable.getItems();




            if (existingZones!=null){
                if (!existingZones.contains(newZone))
                    existingZones.add(newZone);
            }
            else {
                zonesTable.itemsProperty().unbind();
//                ArrayList<Zone> newZ = new ArrayList<>();
//                newZ.add(newZone);
//                ObservableValue<ObservableList<Zone>> oz = (ObservableValue<ObservableList<Zone>>) FXCollections.observableArrayList(newZ);//(ObservableValue<Zone>) newZone;
//                zonesTable.itemsProperty().bind(oz);
                zonesTable.setItems((ObservableList<Zone>) newZone);
            }

        }

    }

    public void listZonesByRegion(Region selectedRegion) {
        if (selectedRegion != null){
            this.setRegion(selectedRegion);
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

        RegionsController regionsController = loader.getController();
        regionsController.listRegions();

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
