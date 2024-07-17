package com.lorenzotardini.clrestaurant;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CLRgame{
    Random randomgen = new Random();
    int randomsize = randomgen.nextInt(8);
    int[] retarr = new int[randomsize];
    Integer[] referencearr = new Integer[7];

    public void ordergenerator() {
        for(int i = 0; i< referencearr.length; i++)
        {
            referencearr[i] = i+1;
        }
        Collections.shuffle(Arrays.asList(referencearr), randomgen);
        for(int i = 0; i< retarr.length; i++)
        {
            retarr[i] = referencearr[i];
            System.out.println(retarr[i]);
        }
    }
}
