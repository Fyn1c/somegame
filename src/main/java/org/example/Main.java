package org.example;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    private FXMLLoader fxmlLoader;
    private Scene scene;
    private Stage stage = new Stage();
    private static Main instance;
    public static synchronized Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        stage.setTitle("SomeGame");

        setFxmlLoader(getClass().getResource("/mainPage.fxml"));
    }

    public static void main(String[] args) {
        launch();
    }

    public void setScene(Parent root){
        stage.close();
        this.scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }

    public Scene getScene() {
        return scene;
    }

    public void setFxmlLoader(URL url) throws IOException{
        getFXMLLoader().setLocation(url);
        setScene(fxmlLoader.load());
    }

    public FXMLLoader getFXMLLoader(){
        if(fxmlLoader == null) fxmlLoader = new FXMLLoader();
        return fxmlLoader;
    }
}