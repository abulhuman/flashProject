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
import javafx.stage.Modality;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.Region;

import javax.swing.plaf.basic.BasicTableUI;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;

public class RegionsController implements Initializable {

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
    private void addNewRegion(ActionEvent event) throws SQLException {
        TextInputDialog newRegionDialog = new TextInputDialog();
        newRegionDialog.setTitle("New Region");
        newRegionDialog.setHeaderText("New Region");
        newRegionDialog.setContentText("Name");

        newRegionDialog.getDialogPane().getButtonTypes().remove(ButtonType.CANCEL);

        Optional<String> result = newRegionDialog.showAndWait();
        if (result.isPresent() && !result.get().equals("")){
            int newRegionId = Datasource.getInstance().insertRegion(result.get());

            Region newRegion = new Region();

            newRegion.setId(newRegionId);
            newRegion.setName(result.get());

            ObservableList<Region> existingRegions = regionsTable.getItems();


            if (!existingRegions.contains(newRegion))
            existingRegions.add(newRegion);

        }

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

        task.setOnSucceeded(e -> {
            if (task.valueProperty().get().size() != 0){

                regionsTable.refresh();
            }
        });

        new Thread(task).start();

    }
}

class GetAllRegionsTask extends Task<ObservableList<Region>> {
    @Override
    public ObservableList<Region> call() {
        return FXCollections.observableArrayList(Datasource.getInstance().queryAllRegions());
    }
}