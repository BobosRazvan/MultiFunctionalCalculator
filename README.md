
# Multifunctional Calculator by Răzvan Andrei Boboș

The JavaFX Multifunctional Calculator is a versatile desktop application designed to provide users with a comprehensive set of mathematical functions while offering a convenient way to store and retrieve calculation history. The calculator seamlessly integrates with a PostgreSQL database to enable personalized user experiences, including persistent calculation history.


## Built with

- JavaFX
- Java version 20
- PostGreSql version 15
- CSS

# Table of Contents
1. [Title and Description](#Multifunctional-Calculator)
- [Built with](#Built-with)
2. [Table of Contents](#Table-of-Contents)
3. [Instalation and Setup](#Instalation-and-Setup)
- [Setting up JDK](#Setting-up-JDK)
- [Setting up Scene Builder](#Setting-up-Scene-Builder)
- [Setting up IntelliJ IDEA](#Setting-up-IntelliJ-IDEA)
- [Setting up IDE to use JDK](#Setting-up-IDE-to-use-JDK)
- [Setting up IDE to use JavaFX Scene Builder](#Setting-up-IDE-to-use-JavaFX-Scene-Builder)
4. [Usage](#Usage)
- [Run the desktop application](#Run-the-desktop-application)
     - [Ensure you have Java and SceneBuilder installed](#1-Ensure-you-have-Java-and-SceneBuilder-installed)
     - [Open the project in your preferred IDE (e.g., IntelliJ IDEA)](#2-Open-the-project-in-your-preferred-IDE-e.g.-IntelliJ-IDEA)
     - [Run the main application file (`HelloApplication.java`)](#3-Run-the-main-application-file-HelloApplication.java-to-launch-the-calculator)
- [Features](#Features)
     - [User Interface](#User-Interface)
     - [User Authentication and Authorization](#User-Authentication-and-Authorization)
     - [Arithmetic Calculator](#Arithmetic-Calculator)
     - [Currency Converter](#Currency-Converter)
     - [Date Calculation](#Date-Calculation)
     - [Programmer](#Programmer)

5. [Project Structure](#Project-Structure)
- [The Database](#The-Database)
     - [users table](#users-table)
     - [calculations table](#calculations-table)
     - [currency_converter table](#currency_converter-table)
- [The Class Diagram](#The-Class-Diagram)
   - [HelloApplication.java](#HelloApplication.java)
   - [Login.java](#Login.java)
   - [JavaPostgreSql.java](#JavaPostgreSql.java)
   - [Calculator.java](#Calculator.java)
   - [CurrencyConverter.java](#CurrencyConverter.java)
   - [DateCalculation.java](#DateCalculation.java)
   - [Programmer.java](#Programmer.java)
   - [Calculator.css](#Calculator.css)

6. [Future Improvements](#Future-Improvements)
7. [How To Contribute](#How-to-Contribute)
8. [Inspiration & Sources](#Inspiration-&-Sources)
9. [Contact](#Contact)
# Instalation and Setup
This tutorial uses [IntelliJ IDEA](https://www.jetbrains.com/idea/) and Java 20.

### Setting up JDK

#### Windows

1. Download [Java SE](http://www.oracle.com/technetwork/java/javase/downloads/index.html) website and click on JDK download button, this will take you to next page.
2. Under *Java SE Development Kit*, read and accept the licence. Once accepted, download JDK for *Windows* and follow the instructions on the scree.

### Setting up Scene Builder

 Download [JavaFX Scene Builder](https://gluonhq.com/products/scene-builder/).


### Setting up IntelliJ IDEA

#### Windows



Go to [IntelliJ IDEA](https://www.jetbrains.com/idea/) and download the IDE.


### Setting up IDE to use JDK

1. Once you open the IDE, click on `Create New Project`.
2. If Project SDK is empty, click on `New` and click on JDK. Browse to the JDK location and click on choose.
3. Press on Create.

### Setting up IDE to use JavaFX Scene Builder
1. Once you open the IDE, create a FXML file.
2. Right click on the screen. Open in SceneBuilder.
3. Select the path where you set up SceneBuilder(.exe file).
4. Once done click on Open In SceneBuilder. 
# Usage

## Run the desktop application

1. Ensure you have Java and SceneBuilder installed.
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA).
3. Run the main application file (`HelloApplication.java`) to launch the calculator.

![Calculator Interface](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/RunHelloApp.png)


## Features

### User Interface 
Intuitive Design : JavaFX provides a visually appealing and intuitive user interface, enhancing the overall user experience.

### User Authentication and Authorization 
Secure Login and Register : Implement a robust authentication system to ensure only registered personnel can access the system. 
After the user logs in or registers in the app, you can begin performing arithmetic operations, currency conversions, date calculations and base conversions while maintaining a personalized history of calculations.

![Login](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/Login.png)

### Arithmetic Calculator

To use the arithmetic calculator, simply press the buttons corresponding to numbers and mathematical symbols to input your calculation. Once you've entered the expression, press the equal button to obtain the result. The calculator's intuitive button layout makes it easy to perform arithmetic operations swiftly and accurately.

![Arithmetic Calculator](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/ArithmeticCalculator.png)


### Currency Converter

To utilize the currency converter, follow these simple steps:

1. Use the provided combo box to select the source and target currencies for conversion.
2. Input numerical values using the dedicated number buttons.
3. Press the equal button to calculate and display the converted currency value.

The currency converter's user-friendly interface, featuring a combination of a combo box and intuitive buttons, ensures a seamless and efficient currency conversion experience.

![Currency Converter](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/CurrencyConverter.png)

### Date Calculation

To perform date calculations using the date calculator, follow these straightforward steps:

1. Utilize the date picker to select the two dates you want to compare.  
2. The calculator will automatically compute the difference between the selected dates in years, months, and days.  
3. The result will be displayed, providing you with a clear understanding of the time span between the chosen dates.
The date calculator simplifies the process of determining the temporal gap between two selected dates, enhancing your ability to manage date-related calculations effortlessly.

![Date Calculator](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/DateCalculation.png)

### Programmer

To utilize the base calculator for decimal number calculations, follow these steps:

1. Input decimal numbers using the provided number buttons.
Press the "Calculate" button to obtain the result in decimal representation.

2.  Optionally, press buttons to view the binary, hexadecimal, and octal representations of the calculated result.

3. The base calculator streamlines calculations with decimal numbers, offering the flexibility to view alternate representations effortlessly, including binary, hexadecimal, and octal formats.


![Programmer](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/Programmer.png)




## Project Structure

The project structure revolves around distinct controller classes, each dedicated to managing the functionality of specific FXML files, such as the login page, arithmetic calculator, date conversion, currency conversion, and base conversion. Additionally, a vital component is the JavaPostgre class, responsible for establishing a connection with the PostgreSQL database. Lastly, the HelloApplication class serves as the orchestrator of the application, overseeing scene changes and ensuring smooth navigation between different components.

### The Database


![Database](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/Database.png)

The users table enables secure user authentication, ensuring that each user has a unique identity.
The calculations table tracks user-specific mathematical computations, allowing users to review their calculation history.
The currency_converter table supports real-time currency conversion by providing up-to-date exchange rates.


![Database2](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/DataBase%20data.png)


![Database3](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/DataBase%20data%202.png)


### The Class Diagram


![Class Diagram](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/Classes%20diagram.png)

### HelloApplication.java

HelloApplication class serves as the main application class that manages the initialization, scene transitions, and launching of your JavaFX application. The start method sets up the initial scene, and the changeScene method facilitates the transition between different scenes. The main method acts as the starting point when running the application.

The most relevant part of this class is the changeScene method, for which I will provide the code: 

```java

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


```

### Login.java

The Login.java class serves as the controller for the hello-view.fxml file, containing two main methods that handle the actions triggered by the "Login" and "Register" buttons. These methods seamlessly interact with the JavaPostgreSql.java class to manage user authentication, registration, and scene transitions.

Both presented methods are very similar, the registration method inserts data into the users table, while the login method reads data from the same table.

```java
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
```

The Log In and the Register buttons (from hello-view.fxml) have a specific id and an onAction method(when the button gets clicked: the method presented above).

```java
hello-view.fxml file:
<Button fx:id="button" layoutX="186.0" layoutY="274.0" mnemonicParsing="false" onAction="#userRegister"
```

### JavaPostgreSql.java

Overall, the JavaPostgreSql class encapsulates database operations related to user authentication, registration, calculation history, and currency conversion for the scientific calculator application. It abstracts away the database interaction details, providing a clean and modular way to manage database-related tasks.It uses prepareStatements to execute the desired queries.

```java
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
```

### Calculator.java

Calculator.java represents the controller class for Calculator.fxml.

#### Overview:

1. Instance Variables:

The class has various instance variables to store information about the current calculation, including the numbers (num1, num2), the result, and the operator.

2. FXML Elements:

The class defines FXML elements for buttons, labels, and panes used in the user interface. These elements represent different calculator functionalities, including numbers, operators, and special operations.

3. Event Handling:

The class contains methods annotated with @FXML to handle user interactions, such as clicking on numbers, operators, and special functions like logarithms and trigonometric operations.

4. Scene Transition:

Methods like onProgrammer, onDateCalculation, and onCurrency handle scene transitions to different calculator modes (Programmer, Date Calculation, Currency Converter).

5. Calculation Logic:

The methods onNumberClicked and onSymbolClicked handle the logic when a number or operator button is clicked, respectively. The calculations are performed based on the chosen operator, and the result is displayed in the calculator window.

6. History Loading:

The loadHistory method retrieves the calculation history for the current user from the PostgreSQL database using the JavaPostgreSql class. The history is then displayed in labels on the user interface.

7. Log Out:

The onLogOutClicked method handles the log-out functionality, transitioning back to the login screen.

This class is a crucial part of the scientific calculator application, managing user input, performing calculations, and displaying results and history. It also facilitates transitions between different calculator modes. The interaction with the PostgreSQL database is handled by the JavaPostgreSql class for storing and retrieving calculation history.

```java

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
                ...
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
             ...
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

                   ...

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
              ...
        }



```
JavaPostgreSql.java snippets
```java
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
```
Calculator.fxml snippets
```java
<Pane fx:id="btn0" layoutX="226.0" layoutY="507.0" onMouseClicked="#onNumberClicked" prefHeight="54.0" prefWidth="63.0" styleClass="highlight">

<Pane fx:id="btnEquals" layoutX="358.0" layoutY="507.0" onMouseClicked="#onSymbolClicked" prefHeight="54.0" prefWidth="63.0" styleClass="highlight">
```

### CurrencyConverter.java


This Java code represents the controller class for a currency converter implemented using JavaFX. It interacts with a PostgreSQL database to retrieve currency information and conversion rates.

1. Instance Variables:

It includes ComboBox instances (comboBox1 and comboBox2) for selecting currencies.

2. Currency Information:

The initializeComboBox1 and initializeComboBox2 methods populate the ComboBoxes with currency options retrieved from the PostgreSQL database using the getCurrencies method in the JavaPostgreSql class.

3. Currency Conversion:

The convertCurrency method takes an amount and the selected currencies and uses the conversion rate retrieved from the getConversionRate method in the JavaPostgreSql class to perform the currency conversion.


4. Database Interaction:

The JavaPostgreSql class provides methods to interact with the PostgreSQL database, such as retrieving a list of currencies (getCurrencies) and obtaining conversion rates (getConversionRate).

```java
  @FXML
    void onSymbolClicked(MouseEvent event) {
        // Check if the source is a Pane
       ...
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


             ...

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
```

PostgreSQL.java
```java
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
```

CurrencyConverter.fxml
```java
<ComboBox fx:id="comboBox1" layoutX="115.0" layoutY="282.0" onMouseClicked="#initializeComboBox1" opacity="0.77" prefWidth="150.0" promptText="Select Currency" />
```

### DateCalculation.java

This Java class, named DateCalculation, is the controller class for a date calculation module in a JavaFX application. It performs calculations on selected dates, determining the difference in terms of years, months, and days. The onCalculateClicked method is triggered when the user clicks the "Calculate" button. It calculates the difference between two selected dates (picked using DatePickers) in terms of years, months, and days.

```java
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
```
DateCalculation.fxml
```java
<DatePicker fx:id="datePicker1" layoutX="128.0" layoutY="240.0" promptText="Select Date" />
<DatePicker fx:id="datePicker2" layoutX="128.0" layoutY="328.0" promptText="Select Date" />
<Pane fx:id="btnCalculate" layoutX="405.0" layoutY="240.0" onMouseClicked="#onCalculateClicked">
</Pane>
```

### Programmer.java

This Java class, named Programmer, serves as the controller for a programmer's calculator module in a JavaFX application. It provides additional features for numerical representation conversion (decimal to hexadecimal, octal, and binary).

The onRepresentation method converts the current result in decimal to hexadecimal, octal, and binary representations. The converted values are displayed in corresponding labels (lblHex, lblOct, lblBin).

```java
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
```
Programmer.fxml
```java
<Pane fx:id="btnRepresentation" layoutX="417.0" layoutY="72.0" onMouseClicked="#onRepresentation" prefHeight="67.0" prefWidth="77.0" styleClass="highlight">
```

### Calculator.css
CSS defines styles for a dark background root element, a gradient-filled main pane with rounded corners, and a semi-transparent black highlight effect. These styles are intended for use in a graphical user interface.

```css
.root{
    -fx-background-color: #222;
    -fx-background-radius: 28;
}

.mainPane{
    -fx-background-color: linear-gradient(to bottom, #87CEEB, #ffffff);
    -fx-background-radius:  15 15 25 25;
}

.highlight{
    -fx-background-color: #00000025;
    -fx-background-radius: 15;
}
```


# Future Improvements
1. Establish a connection with the BNR API to dynamically fetch real-time currency rate values, enhancing the accuracy and timeliness of the application's financial data.

![BNR](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/BNR.png)


2. Enhance the User Interface by incorporating a more modern and visually appealing design, ensuring an improved overall user experience.

![UI](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/calculatorIdeal.png)

3. Strengthen the security measures of the application by implementing password hashing in the database, thereby enhancing data protection and ensuring a higher level of user account security.

![Security](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/securityIdeal.png)

4. Expand the functionality of the application by incorporating additional mathematically useful features(ex: Graphics), catering to a broader range of user needs and providing a more comprehensive and versatile tool.

![Graphics](https://github.com/BobosRazvan/MultiFunctionalCalculator/blob/main/graphics.png)

# How to Contribute

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement". Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (git checkout -b feature/AmazingFeature)
3. Commit your Changes (git commit -m 'Add some AmazingFeature')
4. Push to the Branch (git push origin feature/AmazingFeature)
5. Open a Pull Request
# Inspiration & Sources


The primary source of inspiration stemmed from BroCode's Java tutorials, specifically his comprehensive 12-hour playlist, which I consider the most valuable resource. I will provide a link to this tutorial for reference.

[Java Full Course](https://youtu.be/xk4_1vDrzzo?si=JVPqgFkOVOphi_N0)


Additionally, I drew inspiration from the Windows 11 Calculator and its functionalities, serving as a catalyst for generating new ideas and designing my own model. This exploration allowed me to discover and incorporate innovative features.

### Notable Sources

1. [JavaFX Course by Random Code](https://youtube.com/playlist?list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&si=-YgEAMXI9B96CZkq)

2. [Database connection](https://youtu.be/J0IE5LRyzx8?si=EZarMcY26raF93eU)

3. [Stack Overflow](https://stackoverflow.com/)


# Contact

* Email: bobosrazvan@gmail.com
* [LinkedIn Account](https://www.linkedin.com/in/r%C4%83zvan-bobo%C8%99-9689202a6/)
