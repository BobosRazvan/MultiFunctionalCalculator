package com.example.scientificcalculator;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Programmer  {
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
    private Pane btnDivide;

    @FXML
    private Pane btnEquals;

    @FXML
    private ImageView btnMinimize;
    @FXML
    private Pane btnRepresentation;
    @FXML
    private Pane btnMinus;

    @FXML
    private Pane btnMultiply;

    @FXML
    private Pane btnPlus;
    @FXML
    private Pane btnDelete;
    @FXML
    private Pane btnPoint;
    @FXML
    private Pane btnCurrency;
    @FXML
    private Pane btnCalculator;


    @FXML
    private Label lblResult;
    @FXML
    private Label lblHex;
    @FXML
    private Label lblOct;
    @FXML
    private Label lblBin;


    @FXML
    private Pane btnDate;
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
                case "+":
                    num1 = Double.parseDouble(lblResult.getText());
                    System.out.println(num1);
                    operator = String.valueOf('+');
                    lblResult.setText("");
                    break;
                case "-":
                    num1 = Double.parseDouble(lblResult.getText());
                    operator = String.valueOf('-');
                    lblResult.setText("");
                    break;
                case "*":
                    num1 = Double.parseDouble(lblResult.getText());
                    operator = String.valueOf('*');
                    lblResult.setText("");
                    break;
                case "/":
                    num1 = Double.parseDouble(lblResult.getText());
                    operator = String.valueOf('/');
                    lblResult.setText("");
                    break;
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
                    if (operator.equals("0") || Double.isNaN(num1)) {
                        break;
                    }

                    // Store the current lblResult as num2
                    num2 = Double.parseDouble(lblResult.getText());

                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            // Check if dividing by zero
                            if (num2 == 0) {
                                lblResult.setText("Error");
                                break;
                            }
                            result = num1 / num2;
                            break;

                        default:
                            break;
                    }

                    // Display the result
                    lblResult.setText(String.valueOf(result));


                    break;
                case "C":
                    lblResult.setText("");

                default:
                    break;
            }
        }


    }

    @FXML
    void onRepresentation(MouseEvent event) {
        if (event.getSource() instanceof Pane) {
            Pane clickedPane = (Pane) event.getSource();

            // Get the label inside the pane
            Label clickedLabel = (Label) clickedPane.getChildren().get(0);

            // Get the text of the label and concatenate it to lblResult
            String labelText = clickedLabel.getText();
            //System.out.println(labelText);
            if(labelText.equals("Calculate representation")){
                double decimalValue = Double.parseDouble(lblResult.getText());

                // Update Hexadecimal representation
                String hexValue = Integer.toHexString((int) decimalValue).toUpperCase();
                lblHex.setText(hexValue);

                // Update Octal representation
                String octValue = Integer.toOctalString((int) decimalValue);
                lblOct.setText(octValue);

                // Update Binary representation
                String binValue = Integer.toBinaryString((int) decimalValue);
                lblBin.setText( binValue);
            }
        }
    }




}