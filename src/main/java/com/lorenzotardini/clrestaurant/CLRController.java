package com.lorenzotardini.clrestaurant;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.*;

import java.util.ArrayList;
import java.util.Random;

public class CLRController{
    @FXML
    private Label welcomeText;
    @FXML
    private Button submit;
    @FXML
    private Button trashcan;



    @FXML
    private Button bread1;
    @FXML
    private Button bread2;



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
    private Button impasto;

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
    private ImageView bubblebase1;
    @FXML
    private ImageView bubblebase2;

    @FXML
    private ImageView bubble1 = new ImageView();
    @FXML
    private ImageView bubble2 = new ImageView();
    @FXML
    private ImageView bubble3 = new ImageView();
    @FXML
    private ImageView bubble4 = new ImageView();
    @FXML
    private ImageView bubble5 = new ImageView();
    @FXML
    private ImageView bubble6 = new ImageView();
    @FXML
    private ImageView bubble7 = new ImageView();




    @FXML
    private ImageView orderbase1 = new ImageView();
    @FXML
    private ImageView orderbase2 = new ImageView();

    @FXML
    private ImageView ingredient1 = new ImageView();
    @FXML
    private ImageView ingredient2 = new ImageView();
    @FXML
    private ImageView ingredient3 = new ImageView();
    @FXML
    private ImageView ingredient4 = new ImageView();
    @FXML
    private ImageView ingredient5 = new ImageView();
    @FXML
    private ImageView ingredient6 = new ImageView();
    @FXML
    private ImageView ingredient7 = new ImageView();
    @FXML
    private ImageView confetti = new ImageView();



    int count = 0;
    private CLRgame orderistance = new CLRgame();
    private boolean validcreation = false;
    private boolean fooddecision;
    ArrayList<Integer> generatedbyuser = new ArrayList<Integer>();
    double lastingredient=orderbase1.getLayoutY()-30;



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void clickedMushrooms() {
        if (validcreation) {
            mushrooms.setDisable(true);
            buttonfiller(5);
            //ingredients[count].setVisible(true);
            //ingredients[count].setImage(CLRgame.imagemushrooms);
            count++;
        }
    }

    @FXML
    protected void clickedCheese() {
        if (validcreation) {
            cheese.setDisable(true);
            buttonfiller(2);
            count++;
        }

    }

    @FXML
    protected void clickedEgg() {
        if (validcreation) {
            egg.setDisable(true);
            buttonfiller(3);
            //ingredients[count].setVisible(true);
            //ingredients[count].setImage(CLRgame.imageegg);
            count++;
        }

    }

    @FXML
    protected void clickedBacon() {
        if (validcreation) {
            bacon.setDisable(true);
            buttonfiller(1);
            //ingredients[count].setVisible(true);
            //ingredients[count].setImage(CLRgame.imagebacon);
            count++;
        }
    }

    @FXML
    protected void clickedLettuce() {
        if (validcreation) {
            lettuce.setDisable(true);
            buttonfiller(4);
            //ingredients[count].setVisible(true);
            //ingredients[count].setImage(CLRgame.imagelettuce);
            count++;
        }

    }

    @FXML
    protected void clickedPatty() {
        if (validcreation) {
            patty.setDisable(true);
            buttonfiller(6);
            //ingredients[count].setVisible(true);
            //ingredients[count].setImage(CLRgame.imagepatty);
            count++;
        }

    }

    @FXML
    protected void clickedTomatoh() {
        if (validcreation) {
            tomatoh.setDisable(true);
            buttonfiller(0);
            //ingredients[count].setVisible(true);
            //ingredients[count].setImage(CLRgame.imagetomatoh);
            count++;
        }
    }




    @FXML
    protected void clickedBread1() {
        validcreation = true;
        bread1.setDisable(true);
        orderbase1.setVisible(true);
        orderbase1.setImage(CLRgame.imagebread1);
    }

    @FXML
    protected void clickedBread2() {
        if (validcreation) {
            bread2.setDisable(true);
            orderbase2.setLayoutY(lastingredient-30);
            orderbase2.setVisible(true);
            orderbase2.setImage(CLRgame.imagebread2);
        }
    }



    private void buttonfiller(int identifier) {
        ImageView[] ingredients = {
                ingredient1, ingredient2,
                ingredient3, ingredient4,
                ingredient5, ingredient6,
                ingredient7
        };
        Image[] images = orderistance.initimages();

        for (int i = 0; i < ingredients.length; i++) {
            if (i == identifier) {
                fooddecision=true;
                if(fooddecision) {
                    ingredients[count].setLayoutY(orderbase1.getLayoutY() - 30 * (count + 1));
                    lastingredient = ingredients[count].getLayoutY();
                }
                else{
                    ingredients[count].setLayoutY(orderbase1.getLayoutY());
                }
                ingredients[count].setVisible(true);
                ingredients[count].setImage(images[identifier]);
                generatedbyuser.add(1+identifier);
                break;
            }
        }
    }

    @FXML
    protected void clickedSubmit(){
        int[] randomlygenerated = orderistance.getLocalorder();
        int submitcount=0;
        boolean checkequal=true;
        System.out.print("\nArray generato dall'utente: \n");
        for(int i = 0; i< generatedbyuser.size(); i++){
            System.out.print(generatedbyuser.get(i)+" ");
        }
        if(generatedbyuser.size()<randomlygenerated.length)
            submitcount = generatedbyuser.size();
        else
            submitcount = randomlygenerated.length;
        for(int i=0; i<submitcount; i++)
        {
            if(generatedbyuser.get(i)!=randomlygenerated[i])
                checkequal=false;
        }
        if(!checkequal) {
            System.out.println("Ordine sbagliato!");
            resetplate();
        }
        else{
            System.out.println("Ordine giusto!!!");
            confetti.setVisible(true);
            confetti.setImage(CLRgame.imageconfetti);
        }
        generatedbyuser.clear();
        checkequal=true;
    }

    protected void resetplate() {
        Button[] buttonsvector = {tomatoh, bacon, egg, lettuce, mushrooms, patty, cheese};
        for (int i = 0; i < buttonsvector.length; i++) {
            buttonsvector[i].setDisable(false);
        }
        count = 0; //TO FIX: VECTOR "INGREDIENT" IS DECLARED TWICE. MUST BE OPTIMIZED
        ImageView[] ingredients = {
                ingredient1, ingredient2,
                ingredient3, ingredient4,
                ingredient5, ingredient6,
                ingredient7
        };
        for (int i = 0; i < ingredients.length; i++)
        {
            ingredients[i].setVisible(false);
        }
        orderbase1.setVisible(false);
        orderbase2.setVisible(false);
        bread1.setDisable(false);
        bread2.setDisable(false);
        validcreation=false;
        generatedbyuser.clear();
    }


    @FXML
    protected void clickedTomatop() {
        if(validcreation)
            tomatop.setDisable(true);

    }

    @FXML
    protected void clickedMozzarella() {
        if(validcreation)
            mozzarella.setDisable(true);

    }
    @FXML
    protected void clickedVegetable() {
        if(validcreation)
            vegetable.setDisable(true);

    }
    @FXML
    protected void clickedSausage() {
        if(validcreation)
            sausage.setDisable(true);

    }
    @FXML
    protected void clickedSalami() {
        if(validcreation)
            salami.setDisable(true);

    }
    @FXML
    protected void clickedPineapple() {
        if(validcreation)
            pineapple.setDisable(true);

    }
    @FXML
    protected void clickedFish() {
        if(validcreation)
            fish.setDisable(true);

    }

    @FXML
    protected void clickedImpasto() {
            validcreation=true;
            impasto.setDisable(true);

    }
    @FXML
    protected void clickedStart() {
        ImageView[] bubbles = {bubble1,
                bubble2,
                bubble3,
                bubble4,
                bubble5,
                bubble6,
                bubble7
        };

        confetti.setVisible(false);
        resetplate();
        cleanup(bubbles);


        int[] generatedorder = orderistance.ordercreator();
        orderistance.initimages();
        showhamburgerbubble(generatedorder,bubbles);
        Random rangen = new Random();
        fooddecision = rangen.nextBoolean();



        /*if(decision.nextBoolean()){ //se decision == true allora abbiamo un hamburger
            System.out.println("hello world");
            showhamburgerbubble(generatedorder);
        }
        else
        {
            System.out.println("hello mama");
        }*/
    }



    protected void cleanup(ImageView[] bubbles){
           for( int i=0; i<bubbles.length; i++){
            bubbles[i].setVisible(false);
        }
    }


    @FXML
    protected void showhamburgerbubble(int []generatedorder, ImageView[] bubbles){
        bubblebase1.setImage(orderistance.imagebread1);
        bubblebase1.setVisible(true);
        double last=0;
        //placeholderfiller(-1,CLRgame.imagetomatop);
        for(int i=0; i<generatedorder.length;i++){

            switch(generatedorder[i]){
                case 1:
                    //last = placeholderfiller(i,CLRgame.imagetomatoh);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(CLRgame.imagetomatoh);
                    last=bubbles[i].getLayoutY();
                    break;

                case 2:
                    //last = placeholderfiller(i,CLRgame.imagebacon);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(CLRgame.imagebacon);
                    last=bubbles[i].getLayoutY();
                    break;

                case 3:
                    //last = placeholderfiller(i,CLRgame.imagecheese);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(CLRgame.imagecheese);
                    last=bubbles[i].getLayoutY();
                    break;

                case 4:
                    //last = placeholderfiller(i,CLRgame.imageegg);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(CLRgame.imageegg);
                    last=bubbles[i].getLayoutY();
                    break;

                case 5:
                    //last = placeholderfiller(i,CLRgame.imagelettuce);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(CLRgame.imagelettuce);
                    last=bubbles[i].getLayoutY();
                    break;
                case 6:
                    //last = placeholderfiller(i,CLRgame.imagemushrooms);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(CLRgame.imagemushrooms);
                    last=bubbles[i].getLayoutY();
                    break;

                case 7:
                    //last = placeholderfiller(i,CLRgame.imagepatty);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(CLRgame.imagepatty);
                    last=bubbles[i].getLayoutY();
                    break;

            }
        }
        double coordY = last-80;
        bubblebase2.setLayoutY(coordY);
        bubblebase2.setImage(orderistance.imagebread2);
        bubblebase2.setVisible(true);
    }


    @FXML
    private void clickedTrashCan()
    {
        resetplate();
    }

   /* @FXML
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
    }*/
}