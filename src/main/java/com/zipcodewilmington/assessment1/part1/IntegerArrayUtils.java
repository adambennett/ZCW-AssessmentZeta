package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer sum = 0;
        for (Integer i : intArray) {
            sum += i;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer prod = 1;
        for (Integer i : intArray) {
            prod *= i;
        }
        return prod;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double avg = 0.0;
        Double sumOf = 0.0;
        Double count = (double)(intArray.length);
        for (Integer i : intArray) {
            sumOf += i;
        }

        avg = sumOf / count;
        return avg;
    }
}
