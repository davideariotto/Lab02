package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	AlienDictionary dizionario;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField;

    @FXML
    private Button buttonTranslate;

    @FXML
    private TextArea textArea;

    @FXML
    private Button buttonClear;

    @FXML
    void doReset(ActionEvent event) {

    	dizionario.clear();
    	textArea.clear();
    	textField.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {

    	String temp = textField.getText();
    	if(temp.split(" ").length==1)
    		textArea.setText(dizionario.translateWord(temp));
    	else if(temp.split(" ").length==2) {
    		String[] x = new String[2];
    		x = temp.split(" ");
    		dizionario.addWord(x[0], x[1]);
    		textArea.setText("Traduzione salvata correttamente");
    	} else textArea.setText("Formato non corretto!!");
    	
    	textField.clear();
    }

    @FXML
    void initialize() {
        assert textField != null : "fx:id=\"textField\" was not injected: check your FXML file 'Scene.fxml'.";
        assert buttonTranslate != null : "fx:id=\"buttonTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'Scene.fxml'.";
        assert buttonClear != null : "fx:id=\"buttonClear\" was not injected: check your FXML file 'Scene.fxml'.";

        dizionario = new AlienDictionary();
    }
}
