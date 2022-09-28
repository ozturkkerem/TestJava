package day2;

import java.util.*;

public class Camp {


    public static void main(String[] args) {


        countCharacter(" ");
    }

    static void countCharacter(String word){

        if (word==null || word==""| word.isBlank()){
            throw new IllegalArgumentException();
        }
        String unique="";
        String result = "";

        Set<String>set1 = new TreeSet<>(Arrays.asList(word.split("")));

        for (String str: set1){
            unique += str;
        }

        System.out.println(unique);

        for(int i = 0; i < unique.length(); i++){
        int counter = 0;
            for (int j = 0; j<word.length(); j++){
                if (unique.charAt(i)==word.charAt(j)){
                    counter++;
                }
            }
            result+=unique.charAt(i)+""+counter;
        }
        System.out.println(result);

    }





}
