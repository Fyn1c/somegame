package org.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class MainPageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button createLobbyBtn;

    @FXML
    private Button joinToLobbyBtn;

    @FXML
    private Button settingsBtn;

    @FXML
    void createLobbyAction(ActionEvent event) {

    }

    @FXML
    void joinToLobbyAction(ActionEvent event) {

    }

    @FXML
    void settingsAction(ActionEvent event) throws IOException {
        Main.getInstance().setFxmlLoader(getClass().getResource("/settingsPage.fxml"));
    }

    @FXML
    void initialize() {
        assert createLobbyBtn != null : "fx:id=\"createLobbyBtn\" was not injected: check your FXML file 'mainPage.fxml'.";
        assert joinToLobbyBtn != null : "fx:id=\"joinToLobbyBtn\" was not injected: check your FXML file 'mainPage.fxml'.";
        assert settingsBtn != null : "fx:id=\"settingsBtn\" was not injected: check your FXML file 'mainPage.fxml'.";

    }

}


