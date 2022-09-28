package day2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {

    public static void main(String[] args) {

        int [] arr= {1,8,3,16,3,98,68,102};

        Arrays.toString(arr);


        System.out.println("anagram(\"kerem\",\"merek\") = " + anagram("keram", "merek"));
        System.out.println("anagram2(\"kerem\",\"merek\") = " + anagram2("kereem", "merek"));
        profit(arr);
        characterSquency("kerem");

        String kerem = "kerem";
        TreeSet <String> word1 = new TreeSet<>(Arrays.asList());



    }

    static boolean anagram(String word1, String word2){

        String [] arr1 = word1.split("");
        String [] arr2 = word2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return  Arrays.equals(arr1,arr2);
    }

    static boolean anagram2(String word1, String word2){

        if (word1.length()!=word2.length())
return false;

        Set<String> set1= new TreeSet<>(Arrays.asList(word1.split("")));
        Set<String> set2= new TreeSet<>(Arrays.asList(word2.split("")));


        return  set1.equals(set2);


    }

    static void profit(int [] arr){

        int min = arr[0];
        int maxP = 0;

        for (int i = 0; i < arr.length; i++) {

            int profit=0;
            if (arr[i]>min)
            {
                profit= arr[i]-min;
                if (profit>maxP)
                    maxP=profit;
            }

        }

        int sellDay= 0;
        int buyDay=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]-arr[i]==maxP){
                    buyDay=i+1;
                    sellDay=j+1;
                }
            }
        }
        System.out.println("buyDay = " + buyDay);
        System.out.println("sellDay = " + sellDay);
        System.out.println(maxP);






    }

    static void characterSquency(String word1){
        String uniqueCharacter= "";
        String result = "";

        for (int i = 0; i <word1.length() ; i++) {
            if (!uniqueCharacter.contains(word1.charAt(i)+""))
            uniqueCharacter+=word1.charAt(i);

        }

        for (int i = 0; i < uniqueCharacter.length(); i++) {
int count = 0;


            for (int j = 0; j < word1.length(); j++) {
                if (uniqueCharacter.charAt(i)==word1.charAt(j))
                {
                    count++;

                }
            }
            result+=uniqueCharacter.charAt(i);
            result+=count;
        }
        System.out.println("result = " + result);


    }

}
