package oms.fx;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.Region;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class AddNewRegionController implements Initializable {

    public TextField newRegionName;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private Region processNewRegion(ActionEvent event) throws SQLException, IOException {
        if (
                newRegionName.getText() != null &&
                CoordinatorController.isValidText(newRegionName.getText())
        ){
            int newRegionId = Datasource.getInstance().insertRegion(newRegionName.getText());

            Region newRegion = new Region();

            newRegion.setId(newRegionId);
            newRegion.setName(newRegionName.getText());

            return newRegion;
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("Regions.fxml"));
//
//            loader.load();
//
//            RegionsController regionsController = loader.getController();
//            regionsController.listRegions();
//            ObservableList<Region> existingItems = regionsController.regionsTable.getItems();
//            existingItems.add(newRegion);
//            regionsController.regionsTable.setItems(existingItems);
////            regionsController.regionsTable.getChildrenUnmodifiable().add(newRegion);
//
////            Stage stage = (Stage) newRegionName.getScene().getWindow();
////            stage.hide();
        }
        return null;
    }
    
}
