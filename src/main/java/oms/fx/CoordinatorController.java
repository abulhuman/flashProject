/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.stage.Modality;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static oms.Main.stage;


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

    @FXML
    private RadioButton Male;

    @FXML
    private RadioButton Female;
    @FXML
    private TextField search;
    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> id;
    @FXML
    private TableColumn<?, ?> name;
    @FXML
    private TableColumn<?, ?> age;
    @FXML
    private TableColumn<?, ?> gender;
    @FXML
    private TableColumn<?, ?> sponsorshipStatus;
    @FXML
    private Button showDetails;




    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        System.out.println(" inside controller");
    }    
    @FXML
    private void neworphan(ActionEvent event) throws IOException {
        
        System.out.println(" inside controller");
        Parent root2 = FXMLLoader.load(getClass().getResource("AddNewOrphan.fxml"));
        Scene scene = new Scene(root2);
       
        stage.setTitle("Add New Orphan");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
      
         
    }
    




    @FXML
    private void showDetails(ActionEvent event) throws IOException {
        Parent root3 = FXMLLoader.load(getClass().getResource("ShowDetails.fxml"));
        Scene scene = new Scene(root3);
       
        stage.setTitle("Information");
        stage.setScene(scene);
          stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }



    @FXML
    private void male(ActionEvent event){
        Female.setSelected(false);
    }

    @FXML
    private void female(ActionEvent event){
        Male.setSelected(false);
    }

    public void perInfoNextHandler(ActionEvent actionEvent) {
    }

    public void famInfoNextHandler(ActionEvent actionEvent) {
    }
}
