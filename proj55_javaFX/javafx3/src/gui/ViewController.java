package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	@FXML
	private Button btMyButton;
	
	@FXML
	public void onMyButtonClick() {
		System.out.println("Hello!");
		// Cabeçaho pode ser null
		Alerts.showAlert("Título", "Cabeçalho", "Conteúdo", AlertType.INFORMATION);
	}
}
