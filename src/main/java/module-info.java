module com.example.dao {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires java.sql;
    requires com.jfoenix;

    opens com.example.dao.interfaces to javafx.fxml;
    exports com.example.dao;
}