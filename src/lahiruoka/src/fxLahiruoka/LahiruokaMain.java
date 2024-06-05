package fxLahiruoka;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


/**
 * @author aleksikantonen
 * @version 5.6.2024
 */
public class LahiruokaMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader ldr = new FXMLLoader(getClass().getResource("LahiruokaGUIView.fxml"));
            final Pane root = ldr.load();
            //final LahiruokaGUIController lahiruokaCtrl = (LahiruokaGUIController)ldr.getController();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("lahiruoka.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Lahiruoka");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args Ei käytössä
     */
    public static void main(String[] args) {
        launch(args);
    }
}