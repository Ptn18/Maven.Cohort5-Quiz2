package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {


        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        int length = stop - start + 1;

        Integer[] numbers = new Integer[length];
        int count = start;

        for (int i = 0; i < length ; i++) {
            numbers[i] = count;
            count++;
        }


        return numbers;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array[0] * array[1];
    }
}
