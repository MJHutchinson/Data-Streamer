package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private Button button;

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resourceBundle) {
        assert button != null : "fx:id=\"myButton\" was not injected: check your FXML file 'simple.fxml'.";

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello");
            }
        });

    }
}
