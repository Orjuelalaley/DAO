package com.example.dao.interfaces;

import com.example.dao.personas.empleado;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class designController implements Initializable {

    public JFXButton Register;
    public JFXButton LoginButton;
    public Label Warning_text;
    public TextField UserName;
    public TextField UserID;
    public Label obtenerID;
    public Label ObtenerNombre;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void LoginButtonAction(ActionEvent event) {
        DAOEmpleadoImplementacion empleado_dao = new DAOEmpleadoImplementacion();
        empleado empleado = new empleado();
        empleado.setUsername(UserName.getText());
        try {
            empleado.setId(Integer.parseInt(UserID.getText()));
        }catch (Exception e){
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Error");
            alerta.setHeaderText("El campos de ID  están vacíos o no son números");
            alerta.setContentText("Por favor, ingrese un ID");
            alerta.showAndWait();
        }

        if (empleado_dao.iniciarSesion(empleado)){
            obtenerID.setText(String.valueOf(empleado.getId()));
            ObtenerNombre.setText(empleado.getNombre());
        }
    }
    public void register(ActionEvent event) {
        DAOEmpleadoImplementacion empleado_dao = new DAOEmpleadoImplementacion();
        empleado empleado = new empleado();
        try {
            empleado.setId(Integer.parseInt(UserID.getText()));
            empleado.setNombre(UserName.getText());
            empleado_dao.registrar(empleado);
        }catch (Exception e){
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Error");
            alerta.setHeaderText("Los campos de usuario y contraseña están vacíos");
            alerta.showAndWait();
        }
    }
    public void close_app(MouseEvent event) {
        System.exit(0);
    }
}
