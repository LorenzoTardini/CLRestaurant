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
        mushrooms.disarm();

        if(mushrooms.isDisable())
        {
            mushrooms.setDisable(false);
        }
        else mushrooms.setDisable(true);

    }


    protected void clickedCheese() {
        cheese.disarm();

        if(cheese.isDisable())
        {
            cheese.setDisable(false);
        }
        else cheese.setDisable(true);

    }

    protected void clickedEgg() {
        egg.disarm();

        if(egg.isDisable())
        {
            egg.setDisable(false);
        }
        else egg.setDisable(true);

    }

    protected void clickedBacon() {
        bacon.disarm();

        if(bacon.isDisable())
        {
            bacon.setDisable(false);
        }
        else bacon.setDisable(true);

    }

    protected void clickedLettuce() {
        lettuce.disarm();

        if(lettuce.isDisable())
        {
            lettuce.setDisable(false);
        }
        else lettuce.setDisable(true);

    }

    protected void clickedPatty() {
        patty.disarm();

        if(patty.isDisable())
        {
            patty.setDisable(false);
        }
        else patty.setDisable(true);

    }

    protected void clickedTomatoh() {
        tomatoh.disarm();

        if(tomatoh.isDisable())
        {
            tomatoh.setDisable(false);
        }
        else tomatoh.setDisable(true);

    }

    protected void clickedBread1() {
        bread1.disarm();

        if(bread1.isDisable())
        {
            bread1.setDisable(false);
        }
        else bread1.setDisable(true);

    }

    protected void clickedBread2() {
        bread2.disarm();

        if(bread2.isDisable())
        {
            bread2.setDisable(false);
        }
        else bread2.setDisable(true);

    }

    protected void clickedTomatop() {
        tomatop.disarm();

        if(tomatop.isDisable())
        {
            tomatop.setDisable(false);
        }
        else tomatop.setDisable(true);

    }


    protected void clickedMozzarella() {
        mozzarella.disarm();

        if(mozzarella.isDisable())
        {
            mozzarella.setDisable(false);
        }
        else mozzarella.setDisable(true);

    }

    protected void clickedVegetable() {
        vegetable.disarm();

        if(vegetable.isDisable())
        {
            vegetable.setDisable(false);
        }
        else vegetable.setDisable(true);

    }

    protected void clickedSausage() {
        sausage.disarm();

        if(sausage.isDisable())
        {
            sausage.setDisable(false);
        }
        else sausage.setDisable(true);

    }

    protected void clickedSalami() {
        salami.disarm();

        if(salami.isDisable())
        {
            salami.setDisable(false);
        }
        else salami.setDisable(true);

    }

    protected void clickedPineapple() {
        pineapple.disarm();

        if(pineapple.isDisable())
        {
            pineapple.setDisable(false);
        }
        else pineapple.setDisable(true);

    }

    protected void clickedFish() {
        fish.disarm();

        if(fish.isDisable())
        {
            fish.setDisable(false);
        }
        else fish.setDisable(true);

    }

    protected void clickedImpasto() {
        impasto.disarm();

        if(impasto.isDisable())
        {
            impasto.setDisable(false);
        }
        else impasto.setDisable(true);

    }


}