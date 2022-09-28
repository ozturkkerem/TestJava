package day1;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class Test4 {

    //reverse string
    //unique characters
    //anagram
    //palindrome
    //count unique
    //strong password
    //frequency of characters
    //max/min
    //finra
    //prime?

    public static void main(String[] args) {

        int [] arr = {9,7,6,5,4,3,3,1,98,7,3,1,};
        //profit(arr);
        //System.out.println("---------------------------");
        //reverseString("keremozturk");
        //uniqueCharacter("keeeeereeeeem");
        //anagram("ahmet", "hamte");
        //countUnique("Kereme");

        //-314159.2653 ➞ "-$314,159.27"

        double money = -314159.2653;
       // moneyConvert(money);
        moneyConvertManuel(money);


    }

    public static void reverseString(String word){

        String reversed= "";
        for (int i = word.length()-1; i >=0 ; i--) {

            reversed += word.charAt(i);

        }
        System.out.println(reversed);

    }
    public static void uniqueCharacter(String word){
        System.out.println("----------------------------------------");
String unique="";

        for (int i = 0; i < word.length(); i++) {
            if (!unique.contains(word.charAt(i)+""))
            unique+=word.charAt(i);
        }
        System.out.println(unique);
    }
    public static void anagram(String word1, String word2){
        System.out.println("----------------------------");
        String [] arr1 = word1.split("");
        String [] arr2 = word2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2));

        System.out.println(Arrays.toString(arr1) +" "+ word1);
        System.out.println(Arrays.toString(arr2) +" "+ word2);
    }
    public static void palindrome(String word1, String word2){
        System.out.println("-----------------------");
        String reversed = "";

        for (int i = word1.length()-1; i>=0; i-- ){
            reversed+=word1.charAt(i);
        }

        System.out.println(reversed.equals(word2));

    }
    public static void moneyConvert(double number){

        NumberFormat nfUS=NumberFormat.getCurrencyInstance();

        System.out.println(nfUS.format(number));




    }
    public static void countUnique(String word){
        System.out.println("----------------------------------");
        String unique = "";
        String result= "";
        for (int i = 0; i < word.length(); i++){

            if (!unique.contains(word.charAt(i)+"")){
                unique+=word.charAt(i);
            }
        }

        for (int i = 0; i < unique.length(); i++){
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (unique.charAt(i)==word.charAt(j))
                    count++;
            }

            result+=unique.charAt(i)+""+count;
        }
        System.out.println(result);




    }
    public static void moneyConvertManuel(double money){}
    public static void profit(int [] arr ){
        int min = arr[0];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int profit = 0;
            if (arr[i]>min){
                profit=arr[i]-min;
                if(profit>max){
                    max=profit;
                }

            }else   min = arr[i];

        }

        int dayBuy = 0;
        int daySell = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]-arr[i]==max){
                    dayBuy=i +1;
                    daySell= j+1;
                }
            }

        }
        System.out.println("dayBuy = " + dayBuy);
        System.out.println("daySell = " + daySell);


        System.out.println(max );

    }
    public static void profit2(int [] arr){

        int min = arr[0];
        int maxP= 0;

        for (int i = 0; i < arr.length; i++) {
            int profit = 0;
            if (arr[i]>min){
                profit= arr[i]-min;
                if (profit>maxP)
                    maxP=profit;

            }
            else min= arr[i];

        }


    }



}
