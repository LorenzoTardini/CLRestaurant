package com.lorenzotardini.clrestaurant;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

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
    private Button restart;



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
    private Button fries;
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

    @FXML
    private Pane hamburgerpane;
    @FXML
    private Pane pizzapane;
    @FXML
    private Pane gameoverpane;
    @FXML
    private Pane controlspane;

    @FXML
    private Label punteggiolabel;
    @FXML
    private Label punteggioverolabel;
    @FXML
    private Label finalscore;

    Timeline timer;
    int count = 0;
    private CLRgame orderistance = new CLRgame();
    private boolean validcreation = false;
    private boolean fooddecision;
    private boolean isfirststart=true;
    ArrayList<Integer> generatedbyuser = new ArrayList<Integer>();
    double lastingredient=orderbase1.getLayoutY()-30;
    Image[] images;
    int punteggiovalue=0;



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
        submit.setDisable(false);
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

    @FXML
    protected void clickedRestart(){
        punteggiovalue=0;
        punteggioverolabel.setVisible(false);
        gameoverpane.setVisible(false);
        hamburgerpane.setVisible(true);
        pizzapane.setVisible(true);
        clickedStart();
        timer = new Timeline();
        funzionediprovatimer();
        timer.play();
    }



    private void buttonfiller(int identifier) {
        ImageView[] ingredients = {
                ingredient1, ingredient2,
                ingredient3, ingredient4,
                ingredient5, ingredient6,
                ingredient7
        };

        for (int i = 0; i < ingredients.length; i++) {
            if (i == identifier|| i == (identifier-7)) {
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
        if(generatedbyuser.size()==0){
            checkequal=false;
        }
        for(int i = 0; i< generatedbyuser.size(); i++){
            System.out.print(generatedbyuser.get(i)+" ");
        }
        submitcount = randomlygenerated.length;
        if(generatedbyuser.size()<randomlygenerated.length)
            submitcount = generatedbyuser.size();
        for(int i=0; i<submitcount; i++)
        {
            if(generatedbyuser.get(i)!=randomlygenerated[i] && fooddecision)
                checkequal = false;
            if(!fooddecision && generatedbyuser.get(i)-7!=randomlygenerated[i])
                checkequal = false;
        }
        if(!checkequal) {
            System.out.println("Ordine sbagliato!");
            scorecalc(false);
            resetplate();
        }
        else{
            System.out.println("Ordine giusto!!!");
            confetti.setVisible(true);
            confetti.setImage(CLRgame.imageconfetti);
            scorecalc(true);
            clickedStart();
        }
        generatedbyuser.clear();
        checkequal=true;
    }


    protected void scorecalc(boolean orderiscorrect){
        if(orderiscorrect){
            punteggiovalue+= (int)((generatedbyuser.size()*100)*(1.6-0.01*Integer.parseInt(punteggiolabel.getText())));
        }
        else{
            punteggiovalue-=generatedbyuser.size()*50;
        }

        punteggioverolabel.setText(String.valueOf(punteggiovalue));
        punteggioverolabel.setVisible(true);
    }

    
    protected void resetplate() {
        Button[] buttonsvector = {tomatoh, bacon, egg, lettuce, mushrooms, patty, cheese, fries,
                                    fish,vegetable,salami,pineapple,mozzarella,sausage,
                                    impasto,bread1,bread2};
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
        validcreation=false;
        generatedbyuser.clear();
    }


    @FXML
    protected void clickedFries() {
        if(validcreation) {
            fries.setDisable(true);
            buttonfiller(11);
            count++;
        }

    }

    @FXML
    protected void clickedMozzarella() {
        if(validcreation) {
            mozzarella.setDisable(true);
            buttonfiller(12);
            count++;
        }

    }
    @FXML
    protected void clickedVegetable() {
        if(validcreation) {
            vegetable.setDisable(true);
            buttonfiller(8);
            count++;
        }

    }
    @FXML
    protected void clickedSausage() {
        if(validcreation) {
            sausage.setDisable(true);
            buttonfiller(13);
            count++;
        }
    }
    @FXML
    protected void clickedSalami() {
        if(validcreation) {
            salami.setDisable(true);
            buttonfiller(9);
            count++;
        }
    }
    @FXML
    protected void clickedPineapple() {
        if(validcreation) {
            pineapple.setDisable(true);
            buttonfiller(10);
            count++;
        }
    }
    @FXML
    protected void clickedFish() {
        if(validcreation) {
            fish.setDisable(true);
            buttonfiller(7);
            count++;
        }
    }

    @FXML
    protected void clickedImpasto() {
            validcreation=true;
            impasto.setDisable(true);
            submit.setDisable(false);
            orderbase1.setVisible(true);
            orderbase1.setImage(CLRgame.imageimpasto);
    }

    private void funzionediprovatimer(){
        for(int i=1; i<61; i++)
        {
            int finalI = i;
            if(finalI==60){
                KeyFrame kf = new KeyFrame(Duration.seconds(i),
                        ActionEvent -> {
                            pizzapane.setVisible(false);
                            hamburgerpane.setVisible(false);
                            controlspane.setVisible(false);
                            finalscore.setText(String.valueOf(punteggiovalue));
                            gameoverpane.setVisible(true);
                        });
                timer.getKeyFrames().add(kf);
            }
            KeyFrame kf = new KeyFrame(Duration.seconds(i),
                    ActionEvent -> punteggiolabel.setText(String.valueOf(60- finalI)));
            timer.getKeyFrames().add(kf);
        }
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
        submit.setDisable(true);
        hamburgerpane.setVisible(true);
        pizzapane.setVisible(true);
        confetti.setVisible(false);
        resetplate();
        cleanup(bubbles);

        if(isfirststart) {
            timer = new Timeline();
            funzionediprovatimer();
            timer.play();
            isfirststart = false;
        }


        int[] generatedorder = orderistance.ordercreator();
        images = orderistance.initimages();

        Random rangen = new Random();
        fooddecision = rangen.nextBoolean();

        if(fooddecision)
        {
            pizzapane.setVisible(false);
        }
        else{
            hamburgerpane.setVisible(false);
        }

        showbubble(generatedorder,bubbles);


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
            bubblebase1.setVisible(false);
            bubblebase2.setVisible(false);
        }
    }


    @FXML
    protected void showbubble(int []generatedorder, ImageView[] bubbles){
        if(fooddecision) {
            bubblebase1.setImage(images[15]);
            bubblebase1.setVisible(true);
        }
        else{
            bubblebase1.setImage(images[14]);
            bubblebase1.setVisible(true);
        }
        double last=0;

        //placeholderfiller(-1,CLRgame.imagetomatop);
        for(int i=0; i<generatedorder.length;i++){

            switch(generatedorder[i]){
                case 1:
                    //last = placeholderfiller(i,CLRgame.imagetomatoh);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(images[generatedorder[i]+7*(fooddecision?0:1)-1]);
                    last=bubbles[i].getLayoutY();
                    break;

                case 2:
                    //last = placeholderfiller(i,CLRgame.imagebacon);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(images[generatedorder[i]+7*(fooddecision?0:1)-1]);
                    last=bubbles[i].getLayoutY();
                    break;

                case 3:
                    //last = placeholderfiller(i,CLRgame.imagecheese);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(images[generatedorder[i]+7*(fooddecision?0:1)-1]);
                    last=bubbles[i].getLayoutY();
                    break;

                case 4:
                    //last = placeholderfiller(i,CLRgame.imageegg);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(images[generatedorder[i]+7*(fooddecision?0:1)-1]);
                    last=bubbles[i].getLayoutY();
                    break;

                case 5:
                    //last = placeholderfiller(i,CLRgame.imagelettuce);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(images[generatedorder[i]+7*(fooddecision?0:1)-1]);
                    last=bubbles[i].getLayoutY();
                    break;
                case 6:
                    //last = placeholderfiller(i,CLRgame.imagemushrooms);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(images[generatedorder[i]+7*(fooddecision?0:1)-1]);
                    last=bubbles[i].getLayoutY();
                    break;

                case 7:
                    //last = placeholderfiller(i,CLRgame.imagepatty);
                    //break;
                    bubbles[i].setVisible(true);
                    bubbles[i].setImage(images[generatedorder[i]+7*(fooddecision?0:1)-1]);
                    last=bubbles[i].getLayoutY();
                    break;

            }
        }
        double coordY = last-80;
        if(fooddecision) {
            bubblebase2.setLayoutY(coordY);
            bubblebase2.setImage(images[16]);
            bubblebase2.setVisible(true);
        }
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


    @FXML
    private void provainvisibile()
    {
        System.out.println("hello world");
    }
}