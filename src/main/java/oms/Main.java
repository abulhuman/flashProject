/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oms.model.Datasource;


public class Main extends Application {
     public static Stage stage;
     public static Stage stage2;

    @Override
    public void init() throws Exception {
        super.init();
        if(!Datasource.getInstance().open()){
//            TODO Create popup that says couldn't connect to db
            System.out.print("[FATAL ERROR]: Couldn't connect to database. Application is exiting!");
            Platform.exit();
        }
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        Datasource.getInstance().close();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Main.stage = stage;
//        Parent root = FXMLLoader.load(getClass().getResource("fx/LoginPage.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("fx/ShowDetails.fxml"));



        Scene scene = new Scene(root, 1200, 700);

        stage.setTitle("Orphan Department");
        stage.setScene(scene);
        stage.show();
    }
    


    public static void main(String[] args) {
        launch(args);
    }
    
}
