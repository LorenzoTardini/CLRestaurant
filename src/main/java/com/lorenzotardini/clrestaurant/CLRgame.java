package com.lorenzotardini.clrestaurant;

import javafx.scene.image.Image;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

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
    static Image imagetomatop;
    static Image imageimpasto;
    static Image imagesausage;
    static Image imageconfetti;



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
            imagetomatop = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\tomatop.png"));
            imagemozzarella = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\mozzarella.png"));
            imagesausage = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\sausage.png"));
            imageimpasto = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizza\\PLACEHOLDER2.PNG"));



            imageconfetti = new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\coriandoli.gif"));
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //here we define which image corresponds to which identifier in the "buttonfiller" function
        Image[] ret = {imagetomatoh,imagebacon,imagecheese,imageegg,imagelettuce,imagemushrooms,
                imagepatty,imageanchovy,imageaubergine,imagesalami, imagepineapple,
                imagetomatop,imagemozzarella,imagesausage,imageimpasto,imagebread1,imagebread2};

        return ret;
    }
}
