package com.lorenzotardini.clrestaurant;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CLRgame{
    static Random randomgen = new Random();
    static int randomsize = randomgen.nextInt(8);
    static int[] retarr = new int[randomsize];
    static Integer[] referencearr = new Integer[7];

    public static int[] ordergenerator() {
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
        return retarr;
    }
}
