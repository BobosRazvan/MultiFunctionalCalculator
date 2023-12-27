# Multifunctional Calculator

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



