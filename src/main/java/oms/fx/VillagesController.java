/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.District;
import oms.model.Village;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static oms.Main.stage;


public class VillagesController implements Initializable {

    public TableView<Village> villagesTable;
    public Button btnShowOrphans;
    @FXML
    private TableColumn<?, ?> colVillageName;
    @FXML
    private TableColumn<?, ?> colNumOfOrphans;
    @FXML
    private Button btnNextVillages;
    @FXML
    private Button btnAddNewVillage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void AddNewVillage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddNewVillage.fxml"));
        Scene scene = new Scene(root);
        Stage stage2= new Stage();
        stage2.setTitle("Add New Village");
        stage2.setScene(scene);
        stage2.show();
    }

    @FXML
    private void GoToAddNewOrphan(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Coordinator.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }

    public void listVillagesByDistrict(District selectedVillage) {
        if (selectedVillage != null) {
            Task<ObservableList<Village>> task = new Task<>() {
                @Override
                protected ObservableList<Village> call() {
                    return FXCollections.observableArrayList(Datasource.getInstance().queryAllVillagesByDistrictId(selectedVillage.getId()));
                }
            };
            villagesTable.itemsProperty().bind(task.valueProperty());
            new Thread(task).start();
        }
    }

    public void listVillagesById(int id) {
        Task<ObservableList<Village>> task = new Task<>() {
            @Override
            protected ObservableList<Village> call() {
                return FXCollections.observableArrayList(Datasource.getInstance().queryAllVillagesById(id));
            }
        };
        villagesTable.itemsProperty().bind(task.valueProperty());
        new Thread(task).start();

    }

    public void showOrphans(ActionEvent actionEvent) throws IOException {
        Stage villagesStage = (Stage) villagesTable.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Coordinator.fxml"));

        Parent root = loader.load();

        CoordinatorController coordinatorController = loader.getController();

        Village village = villagesTable.getSelectionModel().getSelectedItem();

        if (village != null) {
            coordinatorController.listOrphansByVillage(village);

            villagesStage.setTitle("Orphans");
            villagesStage.setScene(new Scene(root));
            villagesStage.show();
        }
    }

    public void backToDistrict(ActionEvent actionEvent) throws IOException {
        Stage districtsStage = (Stage) villagesTable.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Districts.fxml"));

        Parent root = loader.load();

        DistrictsController districtsController = loader.getController();

        districtsController.listDistrictsById(villagesTable.getItems().get(0).getDistrictId());

        districtsStage.setTitle("Districts");
        districtsStage.setScene(new Scene(root));
        districtsStage.show();
    }
}
