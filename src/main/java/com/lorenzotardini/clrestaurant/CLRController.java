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
    private Button cheese;
    @FXML
    private Button egg;
    @FXML
    private Button lettuce;
    @FXML
    private Button mushrooms;
    @FXML
    private Button patty;
    @FXML
    private Button tomatoh;
    @FXML
    private Button bread1;
    @FXML
    private Button bread2;
    @FXML
    private Button tomatop;
    @FXML
    private Button mozzarella;
    @FXML
    private Button vegetable;
    @FXML
    private Button sausage;
    @FXML
    private Button salami;
    @FXML
    private Button pineapple;
    @FXML
    private Button fish;
    @FXML
    private Button impasto;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void clickedMushrooms() {
        mushrooms.setDisable(true);

    }

    @FXML
    protected void clickedCheese() {
        cheese.setDisable(true);

    }
    @FXML
    protected void clickedEgg() {
        egg.setDisable(true);

    }
    @FXML
    protected void clickedBacon() {
        bacon.setDisable(true);
    }
    @FXML
    protected void clickedLettuce() {
        lettuce.setDisable(true);

    }
    @FXML
    protected void clickedPatty() {
        patty.setDisable(true);

    }
    @FXML
    protected void clickedTomatoh() {
        tomatoh.setDisable(true);

    }

    @FXML
    protected void clickedTomatop() {
        tomatop.setDisable(true);

    }

    @FXML
    protected void clickedMozzarella() {
        mozzarella.setDisable(true);

    }
    @FXML
    protected void clickedVegetable() {
        vegetable.setDisable(true);

    }
    @FXML
    protected void clickedSausage() {
        sausage.setDisable(true);

    }
    @FXML
    protected void clickedSalami() {
        salami.setDisable(true);

    }
    @FXML
    protected void clickedPineapple() {
        pineapple.setDisable(true);

    }
    @FXML
    protected void clickedFish() {
        fish.setDisable(true);

    }
    @FXML
    protected void clickedStart() {
        int[] order = CLRgame.ordergenerator();
        System.out.println("\n");

    }



}