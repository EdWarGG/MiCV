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

public class ExperienciaController implements Initializable {

    @FXML
    private AnchorPane experienciaView;
    @FXML
    private TableView<?> experienciaTable;
    @FXML
    private TableColumn<?, ?> desdeColumn;
    @FXML
    private TableColumn<?, ?> hastaColumn;
    @FXML
    private TableColumn<?, ?> denominacionColumn;
    @FXML
    private TableColumn<?, ?> organizadorColumn;
    @FXML
    private Button anadirButton, eliminarButton;

    
    public ExperienciaController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ExperienciaView.fxml"));
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
		return experienciaView;
	}

    @FXML
    void onAnadir(ActionEvent event) {

    }

    @FXML
    void onEliminar(ActionEvent event) {

    }

}
