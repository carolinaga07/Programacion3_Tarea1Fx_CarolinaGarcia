package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import model.Destino;
import utils.ArchivoUtil;

public class ConsultaDestinoController {

    @FXML
    private ListView<Destino> LVdestino;

    @FXML
    private Button btnCargarArchivo;

    @FXML
    private Label lblMensaje4;

    @FXML

    public void initialize(){
        LVdestino.getItems().addAll(ArchivoUtil.leerListaDestino());
    }

    @FXML
    private void cargarDestinos() {
         ObservableList<Destino> lista = FXCollections.observableArrayList(
            ArchivoUtil.leerListaDestino()
        );

        LVdestino.setItems(lista);

    }

}
