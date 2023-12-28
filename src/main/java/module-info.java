module com.example.scientificcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.scientificcalculator to javafx.fxml;
    exports com.example.scientificcalculator;
}