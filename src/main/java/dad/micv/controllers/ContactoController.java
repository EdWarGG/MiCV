package dad.micv.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;

public class ContactoController implements Initializable {

    @FXML
    private GridPane contactoView;
    @FXML
    private TableView<?> telefonosTable;
    @FXML
    private TableColumn<?, ?> numeroColumn;
    @FXML
    private TableColumn<?, ?> tipoColumn;
    @FXML
    private TableView<?> correoTable;
    @FXML
    private TableColumn<?, ?> emailColumn;
    @FXML
    private TableView<?> websTable;
    @FXML
    private TableColumn<?, ?> urlColumn;
    @FXML
    private Button anaTelButton, anaCorreoButton, anaWebButton;
    @FXML
    private Button eliTetButton, eliCorreoButton, eliWebButton;


    public ContactoController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ContactoView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public GridPane getView() {
		return contactoView;
	}

    @FXML
    void onAnadirCorreo(ActionEvent event) {

    }

    @FXML
    void onAnadirTelefono(ActionEvent event) {

    }

    @FXML
    void onAnadirWeb(ActionEvent event) {

    }

    @FXML
    void onEliminarCorreo(ActionEvent event) {

    }

    @FXML
    void onEliminarTelefono(ActionEvent event) {

    }

    @FXML
    void onEliminarWeb(ActionEvent event) {

    }

}

