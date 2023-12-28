package com.example.scientificcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {

        stg=stage;
        stage.setResizable(true);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Calculator");
        stage.setScene(scene);
        Image image = new Image("file:///C:/Users/danie/Desktop/Razvi/Altele/icon2.png");
        stage.getIcons().add(image);

        stage.show();
    }

    public void changeScene(String fxml,int currentUserId) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        Parent pane = loader.load();
        // Check if the controller of the loaded FXML is an instance of Calculator
        if (loader.getController() instanceof Calculator) {
            Calculator calculatorController = loader.getController();

            // Pass the currentUserId to the Calculator controller
            calculatorController.setCurrentUserId(currentUserId);
            System.out.println(currentUserId);
        }
        if (loader.getController() instanceof CurrencyConverter) {
            CurrencyConverter currencyConverter = loader.getController();

            // Pass the currentUserId to the Calculator controller
            currencyConverter.setCurrentUserId(currentUserId);
            System.out.println(currentUserId);
        }

        if (loader.getController() instanceof DateCalculation) {
            DateCalculation dateCalculation = loader.getController();

            // Pass the currentUserId to the Calculator controller
            dateCalculation.setCurrentUserId(currentUserId);
            System.out.println(currentUserId);
        }
        if (loader.getController() instanceof Programmer) {
            Programmer programmerController = loader.getController();

            // Pass the currentUserId to the Calculator controller
            programmerController.setCurrentUserId(currentUserId);
            System.out.println(currentUserId);
        }
        stg.getScene().setRoot(pane);
    }


    public static void main(String[] args) {
        launch();
    }
}