package com.example.scientificcalculator;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaPostgreSql {


    //not using this method
    public static boolean checkUserLogin(String userName, String userPassword) {
        String url = "jdbc:postgresql://localhost:5432/calculator";
        String user = "postgres";
        String password = "123456";

        // query
        String query = "SELECT * FROM users WHERE email = ? AND password = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, userName);
            pst.setString(2, userPassword);

            try (ResultSet rs = pst.executeQuery()) {
                return rs.next(); // Returns true if the user exists with the provided credentials
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return false; // Default return if an exception occurs
    }

    public static boolean isUserRegistered(String userName) {//same as checkLogin
        String url = "jdbc:postgresql://localhost:5432/calculator";
        String user = "postgres";
        String password = "123456";

        // query
        String query = "SELECT * FROM users WHERE email = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, userName);

            try (ResultSet rs = pst.executeQuery()) {
                return rs.next(); // Returns true if the user exists with the provided username
                //it allows you to iterate over the rows of the query result to retrieve data.
                //In this case, the focus is on checking if there is at least one row (user) with the provided username in the "users" table.
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return false; // Default return if an exception occurs
    }


    public static int getUserId(String userName, String userPassword) {
        String url = "jdbc:postgresql://localhost:5432/calculator";
        String user = "postgres";
        String password = "123456";

        // query
        String query = "SELECT id FROM users WHERE email = ? AND password = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, userName);
            pst.setString(2, userPassword);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id");  // Return the user ID
                }
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return -1;  // Return -1 if an exception occurs or user not found
    }


    public static void writeToDatabase(String userName,  String userPassword) {

        String url = "jdbc:postgresql://localhost:5432/calculator";
        String user = "postgres";
        String password = "123456";

        String name = userName;
        String pass = userPassword;

        // query
        String query = "INSERT INTO users(email, password) VALUES(?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, name);
            pst.setString(2, pass);
            pst.executeUpdate();
            System.out.println("Sucessfully created.");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

    }

    public static void insertCalculation(int userID, double num1, double num2, String operator, double result) {
        String url = "jdbc:postgresql://localhost:5432/calculator";
        String user = "postgres";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String expression = String.format("%.2f %s %.2f =", num1, operator, num2);
            String insertQuery = "INSERT INTO calculations (user_id, expression, result) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setInt(1, userID);
                preparedStatement.setString(2, expression);
                preparedStatement.setDouble(3, result);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String> loadHistory(int userId) {
        List<String> historyList = new ArrayList<>();
        String url = "jdbc:postgresql://localhost:5432/calculator";
        String user = "postgres";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String selectQuery = "SELECT * FROM calculations WHERE user_id = ? ORDER BY id DESC LIMIT 16";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
                preparedStatement.setInt(1, userId);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String historyText = String.format("%s  %.2f", resultSet.getString("expression"), resultSet.getDouble("result"));
                    historyList.add(historyText);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historyList;
    }


        public static List<String> getCurrencies() {
            List<String> currencies = new ArrayList<>();
            String url = "jdbc:postgresql://localhost:5432/calculator";
            String user = "postgres";
            String password = "123456";

            // query
            String query = "SELECT DISTINCT from_currency FROM conversion_rates";

            try (Connection con = DriverManager.getConnection(url, user, password);
                 PreparedStatement pst = con.prepareStatement(query);
                 ResultSet rs = pst.executeQuery()) {

                while (rs.next()) {
                    currencies.add(rs.getString("from_currency"));
                }

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
            //System.out.println(currencies);
            return currencies;
        }

    public static double getConversionRate(String fromCurrency, String toCurrency) {
        String url = "jdbc:postgresql://localhost:5432/calculator";
        String user = "postgres";
        String password = "123456";

        // query
        String query = "SELECT rate FROM conversion_rates WHERE from_currency = ? AND to_currency = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, fromCurrency);
            pst.setString(2, toCurrency);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("rate");
                }
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return -1; // Return -1 if an exception occurs or conversion rate not found
    }



}