package oms;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.Orphan;
import org.w3c.dom.ls.LSOutput;


public class Main extends Application {
     public static Stage stage;

    @Override
    public void init() throws Exception {
        super.init();
        if(!Datasource.getInstance().open()){
//            TODO Create popup that says couldn't connect to db
            System.out.print("""

                    >>>>>>>>>>
                    >>>>>>>>>>
                    >>>>>>>>>>
                    [FATAL ERROR]: Couldn't connect to database. Application is exiting!
                    >>>>>>>>>>
                    >>>>>>>>>>
                    >>>>>>>>>>
                    
                    """);

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

        Parent root = FXMLLoader.load(getClass().getResource("fx/LoginPage.fxml"));


        Scene scene = new Scene(root, 1200, 700);

        stage.setTitle("Orphan Department");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
//        Datasource.getInstance().open();
//        System.out.println(Datasource.getInstance().queryOrphan(2));
        launch(args);
    }
    
}
