package Controller;

import utils.Navegacion;
import model.Destino;
import utils.ArchivoUtil;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;

public class PantallaPrincipalController {

    @FXML
    private MenuBar ID_menuBar;

    @FXML
    private Label lbl_pregunta;

    @FXML
    private Label lbl_titulo;

    @FXML
    private void abrirConsultaDestinos() {

        ConsultaDestinoController controller = Navegacion.abrirVentana(
            "/view/Consulta_destino.fxml", 
            "Historial de Destinos ");

    }

    @FXML
    void abrirConsultaPaquete(ActionEvent event) {
        
        ConsultaDestinoController controller = Navegacion.abrirVentana(
            "/view/Consulta_paquete.fxml", 
            "Historial de Paquetes");


    }

    @FXML
    void abrirRegistroDestino(ActionEvent event) {

         RegistroDestinoController controller = Navegacion.abrirVentana(
            "/view/Registro_destino.fxml", 
            "Registrar Destino");

    }

    @FXML
    void abrirRegistroPaquete(ActionEvent event) {

         ConsultaDestinoController controller = Navegacion.abrirVentana(
            "/view/Registro_paquete.fxml", 
            "Registrar Paquetes");

    }

    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }

   
}
