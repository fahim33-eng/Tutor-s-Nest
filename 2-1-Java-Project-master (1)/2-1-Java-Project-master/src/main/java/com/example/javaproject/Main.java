package com.example.javaproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.paint.Paint;


import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("letsGetStarted.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        String css = this.getClass().getResource("letsGetStarted.css").toExternalForm();
        scene.getStylesheets().add(css);
//        Parent root  = FXMLLoader.load(getClass().getResource("letsGetStarted.fxml"));

        stage.setTitle("Tutor's Nest");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();




    }

    public static void main(String[] args) {

        launch(args);
    }
}