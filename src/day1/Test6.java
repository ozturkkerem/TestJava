package day1;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Test6 {

    public static void main(String[] args) {

        System.out.println(ifAnagram("anagram","bnagram"));


    }

    public static boolean ifAnagram(String word1, String word2){

        if (word1.length()!=word2.length())
            return false;

        Set<String>word1Set=new TreeSet<>(Arrays.asList(word1.split("")));
        Set<String>word2Set=new TreeSet<>(Arrays.asList(word2.split("")));

        if (word1Set.equals(word2Set))
            return true;
        else return false;
    }




}
