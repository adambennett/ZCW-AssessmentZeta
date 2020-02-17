package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String toRet = "";
        char[] strC = str.toCharArray();
        for (int i = strC.length - 1; i > -1; i--) {
            toRet += strC[i];
        }
        return toRet;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String toRet = "";
        char[] arr = str.toCharArray();
        for (int i = 1; i < str.length() - 1; i++) {
            toRet += arr[i];
        }
        return toRet;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String toRet = "";
        char[] arr = str.toCharArray();
        ArrayList<Character> chars = new ArrayList<>();
        for (char c : arr) {
            chars.add(c);
        }

        for (Character c : chars) {
            if (c.toString().equals(c.toString().toUpperCase())) {
                toRet += c.toString().toLowerCase();
            } else {
                toRet += c.toString().toUpperCase();
            }
        }
        return toRet;
    }
}
