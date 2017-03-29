package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author felipe
 */
public class Main extends Application {


    private ImageView img_user;



    @Override
    public void start(Stage stage) throws Exception  {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        AnchorPane ap= (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        stage.setTitle("BHILAI STEEL PLANT");


          Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("nevigator.css").toExternalForm());

        stage.setScene(scene);

        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
