module com.example.oopjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopjava to javafx.fxml;
    exports com.example.oopjava;
}