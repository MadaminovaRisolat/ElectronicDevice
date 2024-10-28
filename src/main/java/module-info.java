module org.example.demodevice {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demodevice to javafx.fxml;
    exports org.example.demodevice;
}