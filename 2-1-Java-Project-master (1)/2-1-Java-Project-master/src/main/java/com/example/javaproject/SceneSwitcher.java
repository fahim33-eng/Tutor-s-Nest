package com.example.javaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;


//Scene1 = Lets Get Started scene
//Scene2 = Choose profession scene
public class SceneSwitcher {
    private Stage stage;
    private Scene scene;
    private Parent root2;

    public void switchToScene2(ActionEvent event) throws IOException {

            Parent root2 = FXMLLoader.load(getClass().getResource("choose.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();//check
            scene = new Scene(root2, 1000, 600);
            scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
            stage.setTitle("Tutor's Nest");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

    }

    public void switchToScene3_teacherLogin(ActionEvent event) throws IOException{

        Parent root3 = FXMLLoader.load(getClass().getResource("teacherLogin.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root3,1000,600);
        scene.getStylesheets().add(getClass().getResource("application3.css").toExternalForm());
        stage.setTitle("Login");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void switchTeacherLoginToTeacherSignUp(ActionEvent event) throws IOException{

        Parent root3 = FXMLLoader.load(getClass().getResource("teacherSignUp.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root3,1000,600);
        scene.getStylesheets().add(getClass().getResource("application3.css").toExternalForm());
        stage.setTitle("Sign Up");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void LoginToTeacherInfo(ActionEvent event) throws IOException{
        Parent root4 = FXMLLoader.load(getClass().getResource("teacherDashBoard.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root4,1000,600);
        scene.getStylesheets().add(getClass().getResource("application4.css").toExternalForm());
        stage.setTitle("DashBoard");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public void teacherSignUpSecondPage(ActionEvent event) throws Exception {
        Parent root5 = FXMLLoader.load(getClass().getResource("teacherSignUpSecondPage.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root5,1000,600);
        scene.getStylesheets().add(getClass().getResource("teacherSignUpSecondPage.css").toExternalForm());
        stage.setTitle("Sign Up!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public void studentSignUp(ActionEvent event) throws Exception {
        Parent root6 = FXMLLoader.load(getClass().getResource("studentSignUp.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root6,1000,600);
        scene.getStylesheets().add(getClass().getResource("studentSignUp.css").toExternalForm());
        stage.setTitle("Sign Up!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }



}
