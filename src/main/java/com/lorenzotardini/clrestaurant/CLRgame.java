package com.lorenzotardini.clrestaurant;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.lang.*;

public class CLRgame{

    static Image imagepatty;
    static Image imagetomatoh;
    static Image imagemushrooms;
    static Image imagelettuce;
    static Image imageegg;
    static Image imagecheese;
    static Image imagebread1;
    static Image imagebread2;
    static Image imagebacon;
    static Image imageanchovy;
    static Image imageaubergine;
    static Image imagesalami;
    static Image imagepineapple;
    static Image imagemozzarella;
    static Image imagefries;
    static Image imageimpasto;
    static Image imagesausage;
    static Image imageconfetti;




    static Image singleimageanchovy;
    static Image singleimageaubergine;
    static Image singleimagesalami;
    static Image singleimagepineapple;
    static Image singleimagefries;
    static Image singleimagemozzarella;
    static Image singleimagesausage;
    static Image singleimageimpasto;


    static int[] localorder;







    public static int[] ingredientgenerator() {
        Random randomgen = new Random(System.currentTimeMillis());
        int randomsize=0;
        while(randomsize==0)
            randomsize = randomgen.nextInt(8);
        int[] retarr = new int[randomsize];
        Integer[] referencearr = new Integer[7];

        System.out.print("Array generato randomicamente: \n");

        for(int i = 0; i< referencearr.length; i++)
        {
            referencearr[i] = i+1;
        }
        Collections.shuffle(Arrays.asList(referencearr), randomgen);
        for(int i = 0; i< retarr.length; i++)
        {
            retarr[i] = referencearr[i];
            System.out.print(retarr[i]+" ");
        }
        return retarr;
    }

    public static int[] ordercreator(){
        Random randomgen = new Random();
        boolean decision = randomgen.nextBoolean();
        int[] order = CLRgame.ingredientgenerator();
        localorder = order;
        return order;
    }

    public static int[] getLocalorder() {
        return localorder;
    }

    public static void setLocalorder(int[] localorder) {
        CLRgame.localorder = localorder;
    }

    public static void buttonlistadd(){

    }

    public Image[] initimages(){
        try {
            imagepatty = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\hamburger\\patty.png"));
            imagetomatoh = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\hamburger\\tomatoh.png"));
            imagemushrooms = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\hamburger\\mushrooms.png"));
            imagelettuce = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\hamburger\\lettuce.png"));
            imageegg = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\hamburger\\egg.png"));
            imagecheese = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\hamburger\\cheese.png"));
            imagebread1 = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\hamburger\\bread1.png"));
            imagebread2 = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\hamburger\\bread2.png"));
            imagebacon = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\hamburger\\bacon.png"));

            imageanchovy = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\anchovy.PNG"));
            imageaubergine = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\aubergine.PNG"));
            imagesalami = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\salami.PNG"));
            imagepineapple = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\pineapple.PNG"));
            imagefries = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\fries.PNG"));
            imagemozzarella = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\mozzarella.PNG"));
            imagesausage = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\sausage.PNG"));
            imageimpasto = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\impasto.png"));

            singleimageanchovy = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\singles\\anchovy.PNG"));
            singleimageaubergine = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\singles\\aubergine.PNG"));
            singleimagesalami = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\singles\\salami.PNG"));
            singleimagepineapple = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\singles\\pineapple.PNG"));
            singleimagefries = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\singles\\fries.PNG"));
            singleimagemozzarella = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\singles\\mozzarella.PNG"));
            singleimagesausage = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\singles\\sausage.PNG"));
            singleimageimpasto = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\singles\\impasto.png"));




            imageconfetti = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\coriandoli.gif"));
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //here we define which image corresponds to which identifier in the "buttonfiller" function
        Image[] ret = {imagetomatoh,imagebacon,imagecheese,imageegg,imagelettuce,imagemushrooms,
                imagepatty,imageanchovy,imageaubergine,imagesalami, imagepineapple,
                imagefries,imagemozzarella,imagesausage,imageimpasto,imagebread1,
                imagebread2,singleimageanchovy, singleimageaubergine, singleimagesalami, singleimagepineapple,
                singleimagefries, singleimagemozzarella, singleimagesausage, singleimageimpasto}; //lenght = 24

        return ret;
    }
}
