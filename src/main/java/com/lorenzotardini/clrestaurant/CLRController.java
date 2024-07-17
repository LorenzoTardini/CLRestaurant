package com.lorenzotardini.clrestaurant;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CLRController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button bacon;
    @FXML
    private Button baconn;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void clickedMushrooms() {
        System.out.println("hello world");
        bacon.disarm();

        if(baconn.isDisable())
        {
            baconn.setDisable(false);
        }
        else baconn.setDisable(true);

    }
}