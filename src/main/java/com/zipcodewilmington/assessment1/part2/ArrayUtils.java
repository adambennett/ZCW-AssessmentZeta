package com.zipcodewilmington.assessment1.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int amt = 0;
        for (Object o : objectArray) {
            if (o.equals(objectToCount)) {
                amt++;
            }
        }
        return amt;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object[] toRet = new Object[objectArray.length - 1];
        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                toRet[i] = objectArray[i];
            }
        }
        return toRet;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommon = null;
        Map<Object, Integer> occurences = new HashMap<>();
        for (Object o : objectArray) {
            if (occurences.containsKey(o)) {
                occurences.put(o, occurences.get(o) + 1);
            } else {
                occurences.put(o, 1);
            }
        }
        
        int highestOcc = 0;
        for (Map.Entry<Object, Integer> i : occurences.entrySet()) {
            if (i.getValue() > highestOcc) {
                mostCommon = i.getKey();
                highestOcc = i.getValue();
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object mostCommon = null;
        Map<Object, Integer> occurences = new HashMap<>();
        for (Object o : objectArray) {
            if (occurences.containsKey(o)) {
                occurences.put(o, occurences.get(o) + 1);
            } else {
                occurences.put(o, 1);
            }
        }

        int leastOcc = objectArray.length;
        for (Map.Entry<Object, Integer> i : occurences.entrySet()) {
            if (i.getValue() < leastOcc) {
                mostCommon = i.getKey();
                leastOcc = i.getValue();
            }
        }
        return mostCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
