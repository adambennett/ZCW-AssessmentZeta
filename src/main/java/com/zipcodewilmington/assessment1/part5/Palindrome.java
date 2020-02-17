package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input){
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int k = 1; k <= input.length() - i; k++) {
                substrings.add(input.substring(i, i+k));
            }
        }
        int palindromes = 0;
        for (String s : substrings) {
            if (isPalindrome(s)) {
                palindromes++;
            }
        }
        return palindromes;
    }

    public Boolean isPalindrome(String s) {
        if (BasicStringUtils.reverse(s).equals(s)) {
            return true;
        }
        return false;
    }
}
