package com.example.dao;

import com.example.dao.view.Cargador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        Cargador cargador = new Cargador();
        cargador.load("log_in.fxml","Login");
    }

    public static void main(String[] args) {
        launch();
    }
}