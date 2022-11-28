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
import javafx.scene.layout.AnchorPane;

public class ConocimientosController implements Initializable {

    @FXML
    private AnchorPane conocimientosView;
    @FXML
    private TableView<?> conocimientosTable;
    @FXML
    private TableColumn<?, ?> denominacionColumn;
    @FXML
    private TableColumn<?, ?> nivelColumn;
    @FXML
    private Button anaComocimientoButton, anaIdiomaButton, eliminarButton;

    
    public ConocimientosController() {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConocimientosView.fxml"));
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
	
	public AnchorPane getView() {
		return conocimientosView;
	}

    @FXML
    void onAnadirConocimiento(ActionEvent event) {

    }

    @FXML
    void onAnadirIdioma(ActionEvent event) {

    }

    @FXML
    void onEliminar(ActionEvent event) {

    }



}
