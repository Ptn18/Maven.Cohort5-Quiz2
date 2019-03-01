package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int newLength = array1.length + array2.length;

        Integer[] numbers = Arrays.copyOf(array1, newLength);


        int n = array1.length;

        for(int i = 0; i < array2.length; i++) {
            numbers[n] = array2[i];
            n++;
        }

        //a shorter way to copy array
        //        System.arraycopy(array2, 0, numbers, array1.length, array2.length);

        return numbers;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotated = new Integer[array.length];
        int rotatedIndex = 0;

        //copy from the index to the end of the array
        for(int i = index; i < array.length; i++) {
            rotated[rotatedIndex] = array[i];
            rotatedIndex++;
        }

        //copy the beginning up to the index
        for (int i = 0; i < index; i++) {
            rotated[rotatedIndex] = array[i];
            rotatedIndex++;
        }

        return rotated;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = count(array1, valueToEvaluate) + count(array2, valueToEvaluate);


        return count;
    }

    public int count(Integer[] array, Integer valueToCount) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (valueToCount.equals(array[i])) {
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        Integer common = array[0];
        int commonCount = count(array, common);

        for(int i = 0; i < array.length; i++) {
            Integer currentNumber = array[i];
            int currentCount = count(array, currentNumber);

            if (currentCount > commonCount) {
                common = currentNumber;
                commonCount = currentCount;
            }
        }

        return common;
    }
}
