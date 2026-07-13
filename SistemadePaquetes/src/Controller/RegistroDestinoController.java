package Controller;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Destino;
import utils.ArchivoUtil;

public class RegistroDestinoController {

    @FXML
    private ListView<Destino> LVDestino;

    @FXML
    private Button btnCargarArchivo;

    @FXML
    private Button btnGuardarArchivo;

    @FXML
    private Label lblMensaje2;

    @FXML
    private TextField txtNombreDestino;

    @FXML
    void guardarDestino() {

        String nombreDestino = txtNombreDestino.getText();

        if(nombreDestino.isEmpty()){
            lblMensaje2.setText(" Ingrese un destino para guardar.");
        }else{
            ArchivoUtil.guardarDestino(nombreDestino);
            lblMensaje2.setText("Destino guardado en archivo: " + nombreDestino);
            txtNombreDestino.clear();
        }

    }

    @FXML

    public void initialize(){
        LVDestino.getItems().addAll(ArchivoUtil.leerListaDestino());
    }


    @FXML
    private void CargarDestino() {

        ObservableList<Destino> lista = FXCollections.observableArrayList(
            ArchivoUtil.leerListaDestino()
        );

        LVDestino.setItems(lista);

    }


}
