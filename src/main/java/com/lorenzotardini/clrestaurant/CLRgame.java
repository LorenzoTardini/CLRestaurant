package com.lorenzotardini.clrestaurant;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.lang.*;

public class CLRgame{
    public static int[] ordergenerator() {
        Random randomgen = new Random(System.currentTimeMillis());
        int randomsize = randomgen.nextInt(8);
        int[] retarr = new int[randomsize];
        Integer[] referencearr = new Integer[7];
        
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
