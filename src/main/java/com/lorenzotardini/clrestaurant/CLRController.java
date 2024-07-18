package com.lorenzotardini.clrestaurant;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

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
    private Button test;



    @FXML
    private ImageView base1;
    @FXML
    private ImageView base2;
    @FXML
    private ImageView ingredient1;
    @FXML
    private ImageView ingredient2;
    @FXML
    private ImageView ingredient3;
    @FXML
    private ImageView ingredient4;
    @FXML
    private ImageView ingredient5;
    @FXML
    private ImageView ingredient6;
    @FXML
    private ImageView ingredient7;







    CLRgame order = new CLRgame();


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
    protected void clickedBread1() {
        bread1.setDisable(true);

    }
    @FXML
    protected void clickedBread2() {
        bread2.setDisable(true);
        base1.setVisible(true);
        base2.setVisible(true);
    }
    @FXML
    protected void clickedImpasto() {
        impasto.setDisable(true);
        double currentx = base1.getLayoutX();
        base1.setLayoutX(currentx+20);
        base2.setLayoutX(base1.getLayoutX()+20);
        base2.setLayoutY(base1.getLayoutY()-30);
    }





    @FXML
    protected void clickedStart() {
        cleanup();
        int[] generatedorder = order.ordercreator();
        order.initimages();
        Random decision = new Random();


        showhamburgerbubble(generatedorder);



        /*if(decision.nextBoolean()){ //se decision == true allora abbiamo un hamburger
            System.out.println("hello world");
            showhamburgerbubble(generatedorder);
        }
        else
        {
            System.out.println("hello mama");
        }*/
    }

    protected void cleanup(){
        ingredient1.setVisible(false);
        ingredient2.setVisible(false);
        ingredient3.setVisible(false);
        ingredient4.setVisible(false);
        ingredient5.setVisible(false);
        ingredient6.setVisible(false);
        ingredient7.setVisible(false);
    }

    @FXML
   protected void showhamburgerbubble(int []generatedorder){
        base1.setImage(order.imagebread1);
        base1.setVisible(true);
        double last = placeholderfiller(-1,CLRgame.imagetomatop);
        for(int i=0; i<generatedorder.length;i++){

            switch(generatedorder[i]){
                case 1:
                    last = placeholderfiller(i,CLRgame.imagetomatoh);
                    break;
                case 2:
                    last = placeholderfiller(i,CLRgame.imagebacon);
                    break;
                case 3:
                    last = placeholderfiller(i,CLRgame.imagecheese);
                    break;
                case 4:
                    last = placeholderfiller(i,CLRgame.imageegg);
                    break;
                case 5:
                    last = placeholderfiller(i,CLRgame.imagelettuce);
                    break;
                case 6:
                    last = placeholderfiller(i,CLRgame.imagemushrooms);
                    break;
                case 7:
                    last = placeholderfiller(i,CLRgame.imagepatty);
                    break;
            }
        }
        double coordY = last-80;
        base2.setLayoutY(coordY);
        base2.setImage(order.imagebread2);
        base2.setVisible(true);
    }

    @FXML
    protected double placeholderfiller(int pl, Image sprite)
    {
        switch(pl){
            case -1:
                return 0;
            case 0:
                ingredient1.setVisible(true);
                ingredient1.setImage(sprite);
                return ingredient1.getLayoutY();

            case 1:
                ingredient2.setVisible(true);
                ingredient2.setImage(sprite);
                return ingredient2.getLayoutY();
            case 2:
                ingredient3.setVisible(true);
                ingredient3.setImage(sprite);
                return ingredient3.getLayoutY();
            case 3:
                ingredient4.setVisible(true);
                ingredient4.setImage(sprite);
                return ingredient4.getLayoutY();
            case 4:
                ingredient5.setVisible(true);
                ingredient5.setImage(sprite);
                return ingredient5.getLayoutY();
            case 5:
                ingredient6.setVisible(true);
                ingredient6.setImage(sprite);
                return ingredient6.getLayoutY();
            case 6:
                ingredient7.setVisible(true);
                ingredient7.setImage(sprite);
                return ingredient7.getLayoutY();
        }
        return 0;
    }


    private void disablebuttongeneric(int but)
    {
        System.out.println("hello world \n");
        test.setDisable(true);
    }


}