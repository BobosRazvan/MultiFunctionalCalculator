package com.example.scientificcalculator;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CurrencyConverter  {
    private double x,y;
    private double num1,num2,result;
    private String operator;



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
    private Pane btnClear;

    @FXML
    private ImageView btnClose;


    @FXML
    private Pane btnEquals;

    @FXML
    private ImageView btnMinimize;


    @FXML
    private Pane btnDelete;
    @FXML
    private Pane btnPoint;

    @FXML
    private Label lblResult;
    @FXML
    private Label lblConversed;
    @FXML
    private ComboBox<String> comboBox1;
    @FXML
    private ComboBox<String> comboBox2;
    @FXML
    private Pane titlePane;
    @FXML
    private Pane btnCalculator;
    @FXML
    private Pane btnDate;
    @FXML
    private Pane btnProgrammer;
    public String from;
    public String to;

    private int currentUserId;  // Store the currently logged-in user's ID

    // Constructor to receive the currentUserId


    public void setCurrentUserId(int currentUserId) {
        this.currentUserId = currentUserId;
    }




    @FXML
    private void initializeComboBox1() {

        List<String> currencies = JavaPostgreSql.getCurrencies();
        //System.out.println(currencies);
        ObservableList<String> currencyList = FXCollections.observableArrayList(currencies);

        comboBox1.setItems(currencyList);


        comboBox1.setValue("Default Currency");
        // Add a selection change listener to comboBox1
        comboBox1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // Handle the selection change
                handleComboBox1SelectionChange(newValue);
            }
        });
    }

    private void handleComboBox1SelectionChange(String selectedCurrency) {
        // You can use the selectedCurrency as needed
        System.out.println("Selected Currency: " + selectedCurrency);
        from=selectedCurrency;
    }

    @FXML
    private void initializeComboBox2() {

        List<String> currencies = JavaPostgreSql.getCurrencies();
        //System.out.println(currencies);
        ObservableList<String> currencyList = FXCollections.observableArrayList(currencies);

        comboBox2.setItems(currencyList);


        comboBox2.setValue("Default Currency");

        comboBox2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // Handle the selection change
                handleComboBox2SelectionChange(newValue);
            }
        });
    }
    private void handleComboBox2SelectionChange(String selectedCurrency) {
        // You can use the selectedCurrency as needed
        System.out.println("Selected Currency: " + selectedCurrency);
        to=selectedCurrency;

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
    void onDateCalculation(MouseEvent event) {
        if (event.getSource() instanceof Pane) {
            Pane clickedPane = (Pane) event.getSource();

            // Get the label inside the pane
            Label clickedLabel = (Label) clickedPane.getChildren().get(0);

            // Get the text of the label and concatenate it to lblResult
            String labelText = clickedLabel.getText();
            System.out.println(labelText);
            if(labelText.equals("Date Calculation")){
                HelloApplication app = new HelloApplication();
                try {
                    app.changeScene("DateCalculation.fxml",currentUserId);
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
        }}
    @FXML
    void onNumberClicked(MouseEvent event) {
        System.out.println(currentUserId);
        //lblResult must concatenate every clicked button to the result  lblResult.setText stuff
        // Check if the source is a Pane
        if (event.getSource() instanceof Pane) {
            Pane clickedPane = (Pane) event.getSource();

            // Get the label inside the pane
            Label clickedLabel = (Label) clickedPane.getChildren().get(0);

            // Get the text of the label and concatenate it to lblResult
            String labelText = clickedLabel.getText();
            //System.out.println(labelText);

            switch (labelText) {
                case "0":
                    lblResult.setText(lblResult.getText()+ "0");
                    break;
                case "1":
                    lblResult.setText(lblResult.getText()+ "1");
                    break;
                case "2":
                    lblResult.setText(lblResult.getText() + "2");
                    break;
                case "3":
                    lblResult.setText(lblResult.getText() + "3");
                    break;
                case "4":
                    lblResult.setText(lblResult.getText() + "4");
                    break;
                case "5":
                    lblResult.setText(lblResult.getText() + "5");
                    break;
                case "6":
                    lblResult.setText(lblResult.getText() + "6");
                    break;
                case "7":
                    lblResult.setText(lblResult.getText() + "7");
                    break;
                case "8":
                    lblResult.setText(lblResult.getText() + "8");
                    break;
                case "9":
                    lblResult.setText(lblResult.getText() + "9");
                    break;

                default:
                    break;
            }
        }
    }
    @FXML
    void onSymbolClicked(MouseEvent event) {
        // Check if the source is a Pane
        if (event.getSource() instanceof Pane) {
            Pane clickedPane = (Pane) event.getSource();

            // Get the label inside the pane
            Label clickedLabel = (Label) clickedPane.getChildren().get(0);

            // Get the text of the label and concatenate it to lblResult
            String labelText = clickedLabel.getText();
            //System.out.println(labelText);

            switch (labelText) {

                case ".":
                    lblResult.setText(lblResult.getText().concat("."));
                    break;
                case "DEL":
                    String currentText = lblResult.getText();
                    if (!currentText.isEmpty()) {
                        lblResult.setText(currentText.substring(0, currentText.length() - 1));
                    }
                    break;

                case "=":
                    // If = is pressed without an operator, or if num1 is not set, do nothing
                    if ( Double.isNaN(num1)) {
                        break;
                    }
                    System.out.println("I come here");
                    // Store the current lblResult as num2
                    result = Double.parseDouble(lblResult.getText());

                    // Get the selected currencies
                    String fromCurrency = from;
                    String toCurrency = to;
                    System.out.println(fromCurrency);
                    // Perform the currency conversion
                    double convertedResult = convertCurrency(result, fromCurrency, toCurrency);

                    // Display the converted result on lblConversed
                    lblConversed.setText(String.format("%s", convertedResult));
                    lblResult.setText("");


                    break;
                case "C":
                    lblResult.setText("");

                default:
                    break;
            }
        }


    }
    // Method to perform currency conversion
    private double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // Get the conversion rate from the database or any other source
        double conversionRate = JavaPostgreSql.getConversionRate(fromCurrency, toCurrency);
        System.out.println(conversionRate);
        return amount * conversionRate;

    }


}