package co.edu.uniquindio.veterinaria.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PanelInicialController {
    @FXML
    private StackPane panelPrincipal;

    public void mostrarRegistroUsuario(ActionEvent actionEvent) {
        Parent node = cargarPanel("/registroUsuario.fxml");
        panelPrincipal.getChildren().setAll(node);
    }

    public void mostrarRegistroMascota(ActionEvent actionEvent) {
        Parent node = cargarPanel("/registroMascota.fxml");
        panelPrincipal.getChildren().setAll(node);
    }

    public void mostrarRegistroConsulta(ActionEvent actionEvent) {
        Parent node = cargarPanel("/agendarConsulta.fxml");
        panelPrincipal.getChildren().setAll(node);
    }

    public void mostrarListaConsultas(ActionEvent actionEvent) {
        Parent node = cargarPanel("/listaConsultas.fxml");
        panelPrincipal.getChildren().setAll(node);
    }

    private Parent cargarPanel(String fxmlFile){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            return loader.load();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}