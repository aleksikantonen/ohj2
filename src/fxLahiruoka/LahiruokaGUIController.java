package fxLahiruoka;

import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalController;
import javafx.fxml.FXML;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

/**
 * @author aleksikantonen
 * @version 5.6.2024
 */
public class LahiruokaGUIController {
    @FXML
    private TextField textNimi;
    @FXML
    private TextField textYtunnus;
    @FXML
    private TextField textPuhnro;
    @FXML
    private TextField textOsoite;
    @FXML
    private TextField textPostinumero;
    @FXML
    private TextField textKuvaus;

    /*
    @FXML private void handleLisaaMyyja() {
        Dialogs.showMessageDialog("Myyjä lisätty rekisteriin!");
    }
    */

    @FXML private void handleLisaaMyyja() {
        String myyjanNimi = Dialogs.showInputDialog("Anna myyjan nimi", "lahiruoka");
        if ( myyjanNimi == null ) return;
        ModalController.showModal(LahiruokaGUIController.class.getResource("LisaaMyyjaView.fxml"), "Lisää myyjä", null, "");
    }

    @FXML private void handleLisaaTuote() {
        Dialogs.showMessageDialog("Tuote lisätty rekisteriin!");
    }

    // Lisää tietoja ikkuna
    @FXML private void handleTietoja() {
        Dialogs.showMessageDialog("Ei osata vielä tietoja");
        ModalController.showModal(LahiruokaGUIController.class.getResource("AboutView.fxml"), "Lahiruoka", null, "");
    }

    @FXML private void handlePoista() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Valitse");
        alert.setHeaderText(null);
        alert.setContentText("Poistetaanko tuote?");

        ButtonType buttonTypeYes = new ButtonType("Kyllä", ButtonBar.ButtonData.OK_DONE);
        ButtonType buttonTypeCancel = new ButtonType("Ei", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeCancel);

        Optional<ButtonType> result = alert.showAndWait();
        if ( result.get() == buttonTypeYes ) System.out.println("Poistetaan");
    }
    @FXML private void textEtsi() {

    }
}

