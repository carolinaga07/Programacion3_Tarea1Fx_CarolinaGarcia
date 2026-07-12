package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class RegistroPaqueteController {

    @FXML
    private ProgressBar ProgressBar;

    @FXML
    private Button btnGuardarAchivoP;

    @FXML
    private Button btncargarDestino;

    @FXML
    private ComboBox<String> cmbDestino;

    @FXML
    private Label lbl_mensaje;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtDestinatario;

    @FXML
    private TextField txtPeso;

    @FXML
    void initialize(ActionEvent event) {

    }

}
