package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Paquete;
import utils.ArchivoUtil;

public class ConsultaPaqueteController {

    @FXML
    private Button btnCargarArchivo2;

    @FXML
    private TableColumn<Paquete, String> colCodigo;

    @FXML
    private TableColumn<Paquete, String> colDestinatario;

    @FXML
    private TableColumn<Paquete, String> colDestino;

    @FXML
    private TableColumn<Paquete, String> colPeso;

    @FXML
    private Label lblMensaje3;

    @FXML
    private TableView<Paquete> tablaPaquete;

    @FXML
    public void initialize(){
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));

        colDestinatario.setCellValueFactory(new PropertyValueFactory<>("destinatario"));

        colPeso.setCellValueFactory(new PropertyValueFactory<>("peso"));

        colDestino.setCellValueFactory(new PropertyValueFactory<>("destino"));

        cargarPaquetes();
    }

    @FXML
    private void cargarPaquetes() {

        ObservableList<Paquete> lista = FXCollections.observableArrayList(
            ArchivoUtil.leerListaPaquete()
        );

        tablaPaquete.setItems(lista);

    }

    


}
