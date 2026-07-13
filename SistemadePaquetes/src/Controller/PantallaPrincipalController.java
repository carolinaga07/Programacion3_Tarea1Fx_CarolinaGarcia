package Controller;

import utils.Navegacion;
import model.Destino;
import utils.ArchivoUtil;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ProgressBar;

public class PantallaPrincipalController {

    @FXML
    private ProgressBar ProgressBar;

    @FXML
    private MenuBar ID_menuBar;

    @FXML
    private Label lbl_pregunta;

    @FXML
    private Label lbl_titulo;

    @FXML
    private Label lblEstado;

    @FXML
    private void abrirConsultaDestinos() {

        ConsultaDestinoController controller = Navegacion.abrirVentana(
            "/view/Consulta_destino.fxml", 
            "Historial de Destinos ");

    }

    @FXML
    void abrirConsultaPaquete() {
        
        ConsultaDestinoController controller = Navegacion.abrirVentana(
            "/view/Consulta_paquete.fxml", 
            "Historial de Paquetes");


    }

    @FXML
    void abrirRegistroDestino() {

         RegistroDestinoController controller = Navegacion.abrirVentana(
            "/view/Registro_destino.fxml", 
            "Registrar Destino");

    }

    @FXML
    void abrirRegistroPaquete() {

         ConsultaDestinoController controller = Navegacion.abrirVentana(
            "/view/Registro_paquete.fxml", 
            "Registrar Paquetes");

    }

    @FXML
    void demostrarHilo() {
        lblEstado.setText("Inicializando Demostracion de hilo y runLater");
        ProgressBar.setProgress(0);

        Thread hilo = new Thread(() -> {
            try {
                for(int i = 1; i <= 10; i++){

                    try{
                       Thread.sleep(500); 
                    }catch(InterruptedException e){
                        System.out.println("Hilo interrumpido");
                    }
                    
                    int progreso = i;

                    System.out.println("Thread ejecutando paso " + progreso);

                    Platform.runLater(()-> {
                        ProgressBar.setProgress(progreso/10.0);
                        lblEstado.setText("Thread trabaja en segundo plano, Plataform.runLater actualiza la GUI: " + (progreso * 10) + "%");
                    });
                }
            
            } catch (Exception e) {
               System.out.println("Error al crear el hilo:" + e.getMessage());
            }finally{
                ProgressBar.setProgress(0);
                lblEstado.setText("Demostracion finalizada!!!");
            }

        });

        hilo.start();

       

    }

    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }

   
}
