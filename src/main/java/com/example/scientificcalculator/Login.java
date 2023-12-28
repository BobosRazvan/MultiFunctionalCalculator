package com.example.scientificcalculator;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Login {


    @FXML
    private Button button;

    @FXML
    private Button button1;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Label wrongLogin;

    public int currentUserId=0;

    @FXML
    public void userRegister(ActionEvent event) throws IOException {
        String enteredUsername = username.getText().trim();
        String enteredPassword = password.getText().trim();

        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            wrongLogin.setText("Please enter your credentials!");
        } else {
            if (JavaPostgreSql.isUserRegistered(enteredUsername)) {
                wrongLogin.setText("Username already exists. Please choose a different one.");
            } else {

                JavaPostgreSql.writeToDatabase(enteredUsername, enteredPassword);
                int userId = JavaPostgreSql.getUserId(enteredUsername, enteredPassword);
                if (userId != -1) {
                    currentUserId = userId;  // Set the current user ID
                    System.out.println(currentUserId);
                }
                wrongLogin.setText("Registration successful!");
                HelloApplication app = new HelloApplication();
                app.changeScene("Calculator.fxml",currentUserId);
            }
        }
    }

    public void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        HelloApplication app = new HelloApplication();

        String enteredUsername = username.getText().trim();
        String enteredPassword = password.getText().trim();

        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            wrongLogin.setText("Please enter your credentials!");
        } else {  //i am checking whether the user is logged in by seeing if userId exists
            int userId = JavaPostgreSql.getUserId(enteredUsername, enteredPassword);
            if (userId != -1) {
                currentUserId = userId;  // Set the current user ID
                System.out.println(currentUserId);
                wrongLogin.setText("Success!");
                app.changeScene("Calculator.fxml",currentUserId);
            } else {
                wrongLogin.setText("Wrong username or password!");
            }
        }
    }




}
