package com.example.scientificcalculator;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ResourceBundle;

public class DateCalculation  {
    private double x,y;
    private double num1,num2,result;
    private String operator;
    @FXML
    private Pane btnProgrammer;


    @FXML
    private Pane btnLogOut;
    @FXML
    private Pane btn0;

    @FXML
    private Pane btn1;

    @FXML
    private Pane btn2;

    @FXML
    private Pane btn3;

    @FXML
    private Pane btn4;

    @FXML
    private Pane btn5;

    @FXML
    private Pane btn6;

    @FXML
    private Pane btn7;

    @FXML
    private Pane btn8;

    @FXML
    private Pane btn9;




    @FXML
    private Pane btnEquals;

    @FXML
    private ImageView btnMinimize;

    @FXML
    private DatePicker datePicker1;

    @FXML
    private DatePicker datePicker2;

    @FXML
    private Label lblResult;

    @FXML
    private Label lblTitle;
    @FXML
    private Pane btnDelete;
    @FXML
    private Pane btnPoint;


    @FXML
    private Pane titlePane;
    @FXML
    private Pane btnCalculator;
    @FXML
    private Pane btnCalculate;


    private int currentUserId;  // Store the currently logged-in user's ID

    // Constructor to receive the currentUserId


    public void setCurrentUserId(int currentUserId) {
        this.currentUserId = currentUserId;
    }






    @FXML
    void onLogOutClicked(MouseEvent event) {
        if (event.getSource() instanceof Pane) {
            Pane clickedPane = (Pane) event.getSource();

            // Get the label inside the pane
            Label clickedLabel = (Label) clickedPane.getChildren().get(0);

            // Get the text of the label and concatenate it to lblResult
            String labelText = clickedLabel.getText();
            System.out.println(labelText);
            if(labelText.equals("Log Out")){
                HelloApplication app = new HelloApplication();
                try {
                    app.changeScene("hello-view.fxml",currentUserId);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @FXML
    void onCalculatorClicked(MouseEvent event) {
        if (event.getSource() instanceof Pane) {
            Pane clickedPane = (Pane) event.getSource();

            // Get the label inside the pane
            Label clickedLabel = (Label) clickedPane.getChildren().get(0);

            // Get the text of the label and concatenate it to lblResult
            String labelText = clickedLabel.getText();
            System.out.println(labelText);
            if(labelText.equals("Calculator")){
                HelloApplication app = new HelloApplication();
                try {
                    app.changeScene("Calculator.fxml",currentUserId);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @FXML
    void onCurrency(MouseEvent event) {
        if (event.getSource() instanceof Pane) {
            Pane clickedPane = (Pane) event.getSource();

            // Get the label inside the pane
            Label clickedLabel = (Label) clickedPane.getChildren().get(0);

            // Get the text of the label and concatenate it to lblResult
            String labelText = clickedLabel.getText();
            System.out.println(labelText);
            if(labelText.equals("Currency Converter")){
                HelloApplication app = new HelloApplication();
                try {
                    app.changeScene("CurrencyConverter.fxml",currentUserId);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    @FXML
    void onProgrammer(MouseEvent event) {
        if (event.getSource() instanceof Pane) {
            Pane clickedPane = (Pane) event.getSource();

            // Get the label inside the pane
            Label clickedLabel = (Label) clickedPane.getChildren().get(0);

            // Get the text of the label and concatenate it to lblResult
            String labelText = clickedLabel.getText();
            System.out.println(labelText);
            if(labelText.equals("Programmer")){
                HelloApplication app = new HelloApplication();
                try {
                    app.changeScene("Programmer.fxml",currentUserId);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    @FXML
    void onCalculateClicked(MouseEvent event) {
        if (event.getSource() instanceof Pane) {
            Pane clickedPane = (Pane) event.getSource();

            // Get the label inside the pane
            Label clickedLabel = (Label) clickedPane.getChildren().get(0);

            // Get the text of the label and concatenate it to lblResult
            String labelText = clickedLabel.getText();
            System.out.println(labelText);
            if (labelText.equals("Calculate")) {
                if (datePicker1.getValue() != null && datePicker2.getValue() != null) {
                    LocalDate startDate = datePicker1.getValue();
                    LocalDate endDate = datePicker2.getValue();

                    // Get the total days difference
                    long totalDaysDifference = java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);

                    // Calculate years, months, and remaining days
                    long yearsDifference = totalDaysDifference / 365;
                    long remainingDays = totalDaysDifference % 365;
                    long monthsDifference = remainingDays / 30;
                    long daysDifference = remainingDays % 30;

                    // Display the result in lblResult
                    lblResult.setText(String.format("%d years, %d months, %d days.", yearsDifference, monthsDifference, daysDifference));
                } else {
                    // Handle the case where one or both datePickers have not been selected
                    lblResult.setText("Please select both dates");
                }

            }
        }
    }




}