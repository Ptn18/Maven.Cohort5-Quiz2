package com.zipcodewilmington.assessment2.part2;



import java.util.*;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int arrayLength = array1.length + array2.length;
        Integer[] array1and2 = new Integer[arrayLength];
        System.arraycopy(array1, 0, array1and2, 0, array1.length);
        System.arraycopy(array2, 0, array1and2, array1.length, array2.length);

        return array1and2;

    }

    public Integer[] rotate(Integer[] array, Integer index) {


        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int num = getNumberOfOccurrences(array1,valueToEvaluate);
        int num2 = getNumberOfOccurrences(array2, valueToEvaluate);
        int total= num + num2;
        return total;
    }

    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectToCount.equals(objectArray[i])) {
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int mostFrequentNumber = 0;
        if (array != null) {
            Map<Integer, Integer> numberOccuranceMap = new HashMap<>();
            int mostFrequentOccurance = 0;

            for (Integer number : array) {
                if (!numberOccuranceMap.containsKey(number)) {
                    numberOccuranceMap.put(number, 1);
                } else {
                    numberOccuranceMap.put(number, numberOccuranceMap.get(number) + 1);
                }
                if (numberOccuranceMap.get(number) > mostFrequentOccurance) {
                    mostFrequentNumber = number;
                    mostFrequentOccurance = numberOccuranceMap.get(number);
                }
            }
        }
        return mostFrequentNumber;
    }
}
