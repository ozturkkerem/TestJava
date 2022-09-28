package hackerRank;

import java.util.Arrays;
import java.util.TreeSet;

public class BirthdayCake {


    //Write a function that accepts a string, and returns true if it is in the form of a phone number.
    //Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
    //
    //Only worry about the following format:
    //(123) 456-7890 (don't forget the space after the close parentheses)
    public static void main(String[] args) {

        System.out.println(isAnagram("kerem", "merek"));


    }

    public static boolean isAnagram(String test, String original) {

        if (test.length() != original.length())
            return false;

        char [] arr1 = test.toCharArray();
        char [] arr2 = original.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);





}}
