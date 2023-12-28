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

public class Calculator  {
    private double x,y;
    private double num1,num2,result;
    private String operator;


    @FXML
    private Label History;
    @FXML
    private Pane btnAbsolute;
    @FXML
    private Pane btnRadical;

    @FXML
    private Pane btnSquared;
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
    private Pane btnLn;
    @FXML
    private Pane btnxtoy;
    @FXML
    private Pane btn10tox;
    @FXML
    private Pane btnLog;
    @FXML
    private Pane btnCos;
    @FXML
    private Pane btnE;
    @FXML
    private Pane btnPi;
    @FXML
    private Pane btnSinus;
    @FXML
    private Pane btnTg;
    @FXML
    private Label lblResult;

    @FXML
    private Label historyLabel1;

    @FXML
    private  Label historyLabel10;




    @FXML
    private  Label historyLabel11;

    @FXML
    private  Label historyLabel12;

    @FXML
    private Label historyLabel13;

    @FXML
    private  Label historyLabel14;

    @FXML
    private Label historyLabel15;

    @FXML
    private  Label historyLabel16;

    @FXML
    private Label historyLabel2;

    @FXML
    private  Label historyLabel3;

    @FXML
    private  Label historyLabel4;

    @FXML
    private  Label historyLabel5;

    @FXML
    private Label historyLabel6;

    @FXML
    private  Label historyLabel7;

    @FXML
    private  Label historyLabel8;

    @FXML
    private  Label historyLabel9;



    @FXML
    private Pane btnProgrammer;
    @FXML
    private Pane titlePane;
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
        }}

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
                case "pi":
                    lblResult.setText(lblResult.getText() + Math.PI);
                    break;
                case "e":
                    lblResult.setText(lblResult.getText() + Math.E);
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
                case "ln": //toate de la ln pana la x^y merg daca faci un +3 dupa ce dai egal nu intekeg de ce arunca eceptie , dar baga in baza si face dupa in continuare
                    String lnText = lblResult.getText();
                    System.out.println(lnText);
                    if (!lnText.isEmpty()) {
                        num1 = Double.parseDouble(lnText);
                        operator = "ln";
                        lblResult.setText("");
                    } else {
                        // Handle the case where lblResult is empty
                        System.out.println("Invalid input for ln");
                    }
                    break;
                case "log":
                    String logText = lblResult.getText();
                    if (!logText.isEmpty()) {
                        num1 = Double.parseDouble(logText);
                        operator = "log";
                        lblResult.setText("");
                    } else {
                        // Handle the case where lblResult is empty
                        System.out.println("Invalid input for log");
                    }
                    break;
                case "10^x":
                    String Text = lblResult.getText();
                    if (!Text.isEmpty()) {
                        num1 = Double.parseDouble(Text);
                        operator = "10^x";
                        lblResult.setText("");
                    } else {
                        // Handle the case where lblResult is empty
                        System.out.println("Invalid input for 10^x");
                    }
                    break;
                case "x^y":
                    String xText = lblResult.getText();
                    if (!xText.isEmpty()) {
                        num1 = Double.parseDouble(xText);
                        operator = "x^y";
                        lblResult.setText("");
                    } else {
                        // Handle the case where lblResult is empty
                        System.out.println("Invalid input for x^y");
                    }
                    break;
                case "x^1/2":
                    String sText = lblResult.getText();
                    if (!sText.isEmpty()) {
                        num1 = Double.parseDouble(sText);
                        operator = "x^1/2";
                        lblResult.setText("");
                    } else {
                        // Handle the case where lblResult is empty
                        System.out.println("Invalid input for x^1/2");
                    }
                    break;
                case "x^2":
                    String tText = lblResult.getText();
                    if (!tText.isEmpty()) {
                        num1 = Double.parseDouble(tText);
                        operator = "x^2";
                        lblResult.setText("");
                    } else {
                        // Handle the case where lblResult is empty
                        System.out.println("Invalid input for x^2");
                    }
                    break;
                case "|x|":
                    String aText = lblResult.getText();
                    if (!aText.isEmpty()) {
                        num1 = Double.parseDouble(aText);
                        operator = "|x|";
                        lblResult.setText("");
                    } else {
                        // Handle the case where lblResult is empty
                        System.out.println("Invalid input for |x|");
                    }
                    break;
                case "sin":
                    String sinText = lblResult.getText();
                    if (!sinText.isEmpty()) {
                        num1 = Double.parseDouble(sinText);
                        operator = "sin";
                        lblResult.setText("");
                    } else {
                        // Handle the case where lblResult is empty
                        System.out.println("Invalid input for sin");
                    }
                    break;
                case "cos":
                    String cosText = lblResult.getText();
                    if (!cosText.isEmpty()) {
                        num1 = Double.parseDouble(cosText);
                        operator = "cos";
                        lblResult.setText("");
                    } else {
                        // Handle the case where lblResult is empty
                        System.out.println("Invalid input for cos");
                    }
                    break;
                case "tan":
                    String tanText = lblResult.getText();
                    if (!tanText.isEmpty()) {
                        num1 = Double.parseDouble(tanText);
                        operator = "tan";
                        lblResult.setText("");
                    } else {
                        // Handle the case where lblResult is empty
                        System.out.println("Invalid input for tan");
                    }
                    break;
                case "=":
                    // If = is pressed without an operator, or if num1 is not set, do nothing
                    if (operator.equals("0") || Double.isNaN(num1)) {
                        break;
                    }

                    // Store the current lblResult as num2
                    if(!lblResult.getText().equals(""))
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
                        case "ln":
                            System.out.println(num1);
                            result = Math.log(num1); // Calculate natural logarithm
                            num2=0;
                            break;
                        case "log":
                            result = Math.log10(num1); // Calculate logarithm
                            num2=0;
                            break;
                        case "10^x":
                            result = Math.pow(10,num1);
                            num2=0;
                            break;
                        case "x^y":
                            result = Math.pow(num1,num2);

                            break;
                        case "x^1/2":
                            result = Math.sqrt(num1);
                            num2=0;

                            break;
                        case "x^2":
                            result = Math.pow(num1,2);
                            num2=0;

                            break;
                        case "|x|":
                            result = Math.abs(num1);
                            num2=0;

                            break;
                        case "sin":
                            result = Math.sin(Math.toRadians(num1));
                            num2=0;

                            break;
                        case "cos":
                            result = Math.cos(Math.toRadians(num1));
                            num2=0;

                            break;
                        case "tan":
                            result = Math.tan(Math.toRadians(num1));
                            num2=0;

                            break;
                        default:
                            break;
                    }
                    JavaPostgreSql.insertCalculation(currentUserId,num1, num2, operator, result);
                    // Display the result
                    lblResult.setText(String.valueOf(result));
                    ;
                    loadHistory();



                    break;
                case "C":
                    lblResult.setText("");

                default:
                    break;
            }
        }


    }


    private void loadHistory() {
        List<String> historyList = JavaPostgreSql.loadHistory(currentUserId);
        System.out.println(historyList);
        for (int i = 0; i < historyList.size(); i++) {
            String historyText = historyList.get(i);

            switch (i) {
                case 0:
                    historyLabel1.setText(historyText);

                    break;
                case 1:
                    historyLabel2.setText(historyText);
                    break;
                case 2:
                    historyLabel3.setText(historyText);
                    break;
                case 3:
                    historyLabel4.setText(historyText);
                    break;
                case 4:
                    historyLabel5.setText(historyText);
                    break;
                case 5:
                    historyLabel6.setText(historyText);
                    break;
                case 6:
                    historyLabel7.setText(historyText);
                    break;
                case 7:
                    historyLabel8.setText(historyText);
                    break;
                case 8:
                    historyLabel9.setText(historyText);
                    break;
                case 9:
                    historyLabel10.setText(historyText);
                    break;
                case 10:
                    historyLabel11.setText(historyText);
                    break;
                case 11:
                    historyLabel12.setText(historyText);
                    break;
                case 12:
                    historyLabel13.setText(historyText);
                    break;
                case 13:
                    historyLabel14.setText(historyText);
                    break;
                case 14:
                    historyLabel15.setText(historyText);
                    break;
                case 15:
                    historyLabel16.setText(historyText);
                    break;
            }
        }





}}