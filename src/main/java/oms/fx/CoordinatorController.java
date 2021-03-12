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
import javafx.scene.control.*;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.Orphan;
import oms.model.OrphanRow;
import oms.model.Village;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class CoordinatorController implements Initializable {

    public TextField searchTextField;
    public Button searchButton;
    public TextField childName;
    public TextField fatherName;
    public TextField grandfatherName;
    public TextField childDateOfBirth;
    public TextField childPlaceOfBirth;
    public TextField spokenLanguages;
    public TextField childPlaceOfBirth1;
    public Accordion newOrphanAccordion;
    public Button perInfoNext;
    public TableView<OrphanRow> orphansTable;
    public Button btnBackToVillages;
    public Button showDetails;

    @FXML
    private RadioButton Male;

    @FXML
    private RadioButton Female;
    @FXML
    private TextField search;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void showDetails(ActionEvent event) throws IOException {
        Stage stage = new Stage();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ShowDetails.fxml"));

        Parent root = loader.load();

        OrphanRow selectedRow = orphansTable.getSelectionModel().getSelectedItem();

        ShowDetailsController showDetailsController = loader.getController();

        if (selectedRow != null){
            showDetailsController.populateTable(selectedRow.getId());

            stage.setTitle("Information");
            stage.setScene(new Scene(root));
            stage.show();
        }
    }



    @FXML
    private void male(ActionEvent event){
        Female.setSelected(false);
    }

    @FXML
    private void female(ActionEvent event) {
        Male.setSelected(false);
    }

    public void perInfoNextHandler(ActionEvent actionEvent) {
    }

    public void famInfoNextHandler(ActionEvent actionEvent) {
    }


    public void listOrphansByVillage(Village selectedVillage) {
        if (selectedVillage != null) {
            Task<ObservableList<OrphanRow>> task = new Task<>() {
                @Override
                protected ObservableList<OrphanRow> call() {

                    List<Orphan> orphans = Datasource.getInstance().queryAllOrphans(selectedVillage.getId());

                    List<OrphanRow> rows = new ArrayList<>();

                    for (Orphan orphan :
                            orphans) {
                        OrphanRow row = new OrphanRow(orphan);
                        System.out.println(orphan.getId() + " " + row.getId());
                        System.out.println(orphan.getFirstName() + " " + row.getFullName());
                        System.out.println(orphan.getGender() + " " + row.getGender());
                        System.out.println(orphan.getDateOfBirth() + " " + row.getAge());
                        System.out.println(orphan.getVillage().getId() + " " + row.getVillageId());
                        rows.add(row);
                    }

                    return FXCollections.observableArrayList(rows);
                }
            };
            orphansTable.itemsProperty().bind(task.valueProperty());
            new Thread(task).start();
        }
    }

    public void searchOrphan(ActionEvent actionEvent) {
    }

    public void backToVillages(ActionEvent actionEvent) throws IOException {
        Stage villagesStage = (Stage) orphansTable.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Villages.fxml"));

        Parent root = loader.load();

        VillagesController villagesController = loader.getController();

        System.out.println(orphansTable.getItems().get(0).getVillageId());

        villagesController.listVillagesById(orphansTable.getItems().get(0).getVillageId());

        villagesStage.setTitle("Villages");
        villagesStage.setScene(new Scene(root));
        villagesStage.show();

    }
}
