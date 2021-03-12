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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegionController implements Initializable {

    @FXML
    public Button btnAddNewRegion;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public TableView<Region> regionsTable;

    @FXML
    public Button btnShowZones;

    @FXML
    private void AddNewRegion(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddNewRegion.fxml"));
        Scene scene = new Scene(root);
        Stage stage2= new Stage();
        stage2.setTitle("Add New Region");
        stage2.setScene(scene);
        stage2.show();
    }

    @FXML
    public void showZones(ActionEvent event) throws IOException {
        Stage regionsStage = (Stage) regionsTable.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Zones.fxml"));

        Parent root = loader.load();

        ZonesController zonesController = loader.getController();

        Region region = regionsTable.getSelectionModel().getSelectedItem();

        if (region != null){
            zonesController.listZonesByRegion(region);

            regionsStage.setTitle("Zones");
            regionsStage.setScene(new Scene(root));
            regionsStage.show();
        }



    }

    public void listRegions() {
        Task<ObservableList<Region>> task = new GetAllRegionsTask();

        regionsTable.itemsProperty().bind(task.valueProperty());

        new Thread(task).start();
    }
}

class GetAllRegionsTask extends Task<ObservableList<Region>> {
    @Override
    public ObservableList<Region> call() {
        return FXCollections.observableArrayList(Datasource.getInstance().queryAllRegions());
    }
}