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
import oms.model.District;
import oms.model.Zone;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class DistrictsController implements Initializable {

    @FXML
    public TableView<District> districtsTable;

    @FXML
    public Button btnShowVillages;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void AddNewDistrict(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddNewDistrict.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Add New District");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void listDistrictsByZone(Zone selectedZone) {
        if (selectedZone != null) {
            Task<ObservableList<District>> task = new Task<>() {
                @Override
                protected ObservableList<District> call() {
                    return FXCollections.observableArrayList(Datasource.getInstance().queryAllDistricts(selectedZone.getId()));
                }
            };
            districtsTable.itemsProperty().bind(task.valueProperty());
            new Thread(task).start();
        }
    }

    public void listDistrictsById(int id) {
        Task<ObservableList<District>> task = new Task<>() {
            @Override
            protected ObservableList<District> call() {
                return FXCollections.observableArrayList(Datasource.getInstance().queryAllDistrictsById(id));
            }
        };
        districtsTable.itemsProperty().bind(task.valueProperty());
        new Thread(task).start();
    }

    @FXML
    public void showVillages(ActionEvent actionEvent) throws IOException {
        Stage districtsStage = (Stage) districtsTable.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Villages.fxml"));

        Parent root = loader.load();

        VillagesController villagesController = loader.getController();

        District district = districtsTable.getSelectionModel().getSelectedItem();

        if (district != null) {
            villagesController.listVillagesByDistrict(district);

            districtsStage.setTitle("Villages");
            districtsStage.setScene(new Scene(root));
            districtsStage.show();
        }
    }

    public void backToZone(ActionEvent actionEvent) throws IOException {
        Stage zonesStage = (Stage) districtsTable.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Zones.fxml"));

        Parent root = loader.load();

        ZonesController zonesController = loader.getController();

        zonesController.listZonesById(districtsTable.getItems().get(0).getZoneId());

        zonesStage.setTitle("Zones");
        zonesStage.setScene(new Scene(root));
        zonesStage.show();
    }
}
