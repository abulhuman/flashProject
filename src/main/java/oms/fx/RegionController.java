package oms.fx;

import javafx.beans.Observable;
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.Region;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static oms.Main.stage;


public class RegionController implements Initializable {

    public TableView<Region> regionsTable;
    @FXML
    private TableColumn<?, ?> colRegionName;
    @FXML
    private TableColumn<?, ?> colNumOfZones;
    @FXML
    private Button btnAddNewRegion;
    @FXML
    private Button btnRegionNext;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddNewRegion(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddNewRegion.fxml"));
        Scene scene = new Scene(root);
        Stage stage2= new Stage();
        stage2.setTitle("Add New Region");
        stage2.setScene(scene);
//        stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
    }

    @FXML
    private void GoToZone(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Zones.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Zones");
        stage.setScene(scene);
//        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void listRegions(){
        Task<ObservableList<Region>> task = new GetAllRegionsTask();
        regionsTable.itemsProperty().bind(task.valueProperty());

        new Thread(task).start();
    }
    
}

class GetAllRegionsTask extends Task<ObservableList<Region>>{
    @Override
    public ObservableList<Region> call() throws Exception {
        return FXCollections.observableArrayList(Datasource.getInstance().queryAllRegions());
    }
}
