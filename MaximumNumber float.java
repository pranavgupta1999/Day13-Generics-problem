package com.bridgelabz.com;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


/**
    * Finding The Maximum Number in Given Three Integers.
    *
    *  @author : pranav gupta
    *
    */


// Adding class for finding maximum of three

public class MaximumNumber {
    static Logger logger = Logger.getLogger(MaximumNumber.class);

    // implementing method to get maximum of three integer numbers
    public static int getThreeIntegerNumbers(Integer[] num) {
        int max = 0;
        for (int i=0; i<3; i++) {
            if(max <= num[i]) {
                max = num[i];
            }
        }
        logger.info("maximun number of given three numbers = " +max);
        return max;
    }

    // implementing method to get maximum of three float numbers
    public void getThreeFloatNumbers(Float[] floats) {
        float max = 0;
        for (int i=0; i<3; i++) {
            if(max <= floats[i]) {
                max = floats[i];
            }
        }
        logger.info("maximun number of given three float numbers = " + max);
    }
    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Given Three Integers and Finding The Maximum !");

        MaximumNumber generics = new MaximumNumber();
        Integer[] a = {10, 8, 15 };
        generics.getThreeIntegerNumbers(a);

        Floats[] f = {1.5f, 1.1f, 1.37f};
        generics.getThreeFloatNumbers(f);
    }
}