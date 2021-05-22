package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl;
    
    @FXML
    private Button dialogbutton;

    @FXML
    void ondialogbuttonClicked(ActionEvent event) {
    	lbl.setText("Clicked");
    }
    
    @FXML
    void initialize() {
        assert lbl != null : "fx:id=\"lbl\" was not injected: check your FXML file 'Sample.fxml'.";
        lbl.setText("Hello JavaFx");

    }
    
}
