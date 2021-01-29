package com.invillia.challenge.java;

import java.util.Arrays;

/**
 * Java Basic Challenge
 *
 * Write a code to verify if a string provided has all unique characters.
 *
 * For example: "zyyz"
 *  x -> unique
 *  y -> not unique
 *  y -> not unique
 *  z -> unique
 * Result: False
 *
 */
public class Challenge1 {

    /**
     * Your code goes here
     */

    public static void main(String[] args) {
        String str = "invillia";
        System.out.println("Input : "+str);
        System.out.println("String has all unique characters: " + hasAllUniqueCharacters(str));
    }

}

