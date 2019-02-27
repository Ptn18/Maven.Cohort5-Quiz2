package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        int length = array.length;
        if(length % 2 ==0) {

            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
//    int lengthOfArray = stop -start;
//    Integer[] ranges = new[lengthOfArray];
//    for(int i = start; i < stop; i++){
//        start = start + i;
//
//    }


        return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum = array[0] + array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int product =array[0] * array[1];
        return product;
    }
}
