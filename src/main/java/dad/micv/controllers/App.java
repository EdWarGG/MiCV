/**
 * 
 */
package dad.micv.controllers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private MainController mainController = new MainController();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		mainController = new MainController();
		
		Scene scene = new Scene(mainController.getView());
		
		primaryStage.setTitle("Tablas");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}


	public static void main(String[] args) {
		launch(args);
	}



}
