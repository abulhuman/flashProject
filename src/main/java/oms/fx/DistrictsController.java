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
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.District;
import oms.model.Zone;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;
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
    private void AddNewDistrict(ActionEvent event) throws IOException, SQLException {
        TextInputDialog newDistrictDialog = new TextInputDialog();
        newDistrictDialog.setTitle("New District");
        newDistrictDialog.setHeaderText("New District");
        newDistrictDialog.setContentText("Name");

        newDistrictDialog.getDialogPane().getButtonTypes().remove(ButtonType.CANCEL);

        int currentZoneId = districtsTable.getItems().get(0).getZoneId();

        Optional<String> result = newDistrictDialog.showAndWait();
        if (result.isPresent() && !result.get().equals("")) {
            int newDistrictId = Datasource.getInstance().insertDistrict(result.get(), currentZoneId);

            District newDistrict = new District();

            newDistrict.setId(newDistrictId);
            newDistrict.setName(result.get());
            newDistrict.setZoneId(currentZoneId);

            ObservableList<District> existingZones = districtsTable.getItems();


            if (!existingZones.contains(newDistrict))
                existingZones.add(newDistrict);


        }
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
