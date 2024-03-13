module com.example.micasa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.micasa to javafx.fxml;
    exports com.example.micasa;
}