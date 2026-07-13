package Controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import model.Destino;
import model.Paquete;
import utils.ArchivoUtil;

public class RegistroPaqueteController {

    @FXML
    private ProgressBar ProgressBar;

    @FXML
    private Button btnGuardarAchivoP;

    @FXML
    private Button btncargarDestino;

    @FXML
    private ComboBox<Destino> cmbDestino;

    @FXML
    private Label lbl_mensaje;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtDestinatario;

    @FXML
    private TextField txtPeso;

    @FXML
    void initialize() {
        cmbDestino.getItems().addAll( ArchivoUtil.leerListaDestino());

    }

     @FXML
    void guardarConHilo() {

        Paquete paquete = crearPaquete();
        lbl_mensaje.setText("Guardando en segundo plano ....");
        ProgressBar.setProgress(0);

        Thread hilo = new Thread(() -> {
            try {
                for(int i = 1; i <= 10; i++){
                    Thread.sleep(300);
                    int progreso = i;

                    Platform.runLater(()-> {
                        ProgressBar.setProgress(progreso/10.0);
                        lbl_mensaje.setText("Guardando..." + (progreso * 10) + "%");
                    });
                }
                ArchivoUtil.guardarPaquete(paquete);
                Platform.runLater(() -> {
                    lbl_mensaje.setText("Paquete guardado en el archivo con hilo!!");
                });
            } catch (Exception e) {
               System.out.println("Error al guardar el paquete:" + e.getMessage());
            }finally{
                ProgressBar.setProgress(0);
                lbl_mensaje.setText("Paquete guardado en el archivo");
            }

        });

        hilo.start();

    }

    private Paquete crearPaquete(){
        Destino destino = cmbDestino.getValue();
        String nombreDestino = "Sin destino";

        if(destino != null){
           nombreDestino = destino.getNombre();
        }

        return new Paquete(
            txtCodigo.getText(),
            txtDestinatario.getText(),
            Double.parseDouble(txtPeso.getText()),
            nombreDestino
        );
    }

    @FXML
    void cargarDestino() {

         ObservableList<Destino> lista = FXCollections.observableArrayList(
            ArchivoUtil.leerListaDestino()
        );

        cmbDestino.setItems(lista);

    }

}
