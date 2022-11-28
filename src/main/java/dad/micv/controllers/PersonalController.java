package dad.micv.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PersonalController implements Initializable{

    @FXML
    private GridPane personalView;
    @FXML
    private TextField dniText, nombreText, apellidosText, codPostText, localidadText;
    @FXML
    private DatePicker fNacPicker;
    @FXML
    private TextArea direccionArea;
    @FXML
    private ComboBox<?> paisComboBox;
    @FXML
    private ListView<?> nacionalidadList;
    @FXML
    private Button anadirButton, eliminarButton;

    public PersonalController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PersonalView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	public GridPane getView() {
		return personalView;
	}
	
    @FXML
    void onAnadir(ActionEvent event) {

    }

    @FXML
    void onEliminar(ActionEvent event) {

    }


}
