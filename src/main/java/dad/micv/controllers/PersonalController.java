package dad.micv.controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import dad.micv.models.Nacionalidad;
import dad.micv.models.PersonalModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PersonalController implements Initializable{

	//model 
	PersonalModel personalModel = new PersonalModel();
	
	//view
    @FXML
    private GridPane personalView;
    @FXML
    private TextField dniText, nombreText, apellidosText, codPostText, localidadText;
    @FXML
    private DatePicker fNacPicker;
    @FXML
    private TextArea direccionArea;
    @FXML
    private ComboBox<String> paisComboBox;
    @FXML
    private ListView<Nacionalidad> nacionalidadList;
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
		addPaises();
	}
	
	
	public GridPane getView() {
		return personalView;
	}
	
    @FXML
    void onAnadir(ActionEvent event) {
    	
		try {
			BufferedReader br = new BufferedReader(new FileReader("/MiCV/src/main/resources/csv/nacionalidades.csv"));
			List<String> nacionalidades = new ArrayList<>();
	    	try {
				while (br.readLine() != null){  
					nacionalidades.add(br.readLine());
					System.out.println(nacionalidades);
				}
			br.close();
			} catch (IOException e) {
			}  
	    	
	    	ChoiceDialog<String> anadirDialog = new ChoiceDialog<>(nacionalidades.get(0), nacionalidades);
	    	anadirDialog.setTitle("Nueva nacionalidad");
	    	anadirDialog.setHeaderText("Añadir nacionalidad");
	    	anadirDialog.setContentText("Seleccione una nacionalidad:");

	    	Optional<String> result = anadirDialog.showAndWait();
	    	if (result.isPresent()){
	    		
	    	}
	    	
		} catch (FileNotFoundException e1) {
			System.err.println("No se encuentra el archivo (/*_*)/");
		}
    	
    	
    	
    	
    }

    @FXML
    void onEliminar(ActionEvent event) {

    }
    
    public void addPaises() {
    	paisComboBox = new ComboBox<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("/MiCV/src/main/resources/csv/paises.csv"));
		    try {
				String nacionalidad = br.readLine();
				System.out.println(nacionalidad);
				while (nacionalidad != null){  
					paisComboBox.getItems().add(nacionalidad);
				}
			br.close();
			} catch (IOException e) {
			}  
		} catch (FileNotFoundException e1) {
			System.err.println("No se encuentra el archivo (/*_*)/");
		}	
    }


}
