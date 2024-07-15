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
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}