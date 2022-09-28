package day2;

import java.util.*;

public class Test2 {

        public static void main (String[] args){
            //reverse string   ok
            //unique characters
            //anagram
            //palindrome
            //count unique
            //strong password
            //frequency of characters
            //max/min
            //finra
            //prime?
            //armstrong?
            int [] arr = {4,2,98,2,2,42,9,0,3,1};
            List <Integer> list = new ArrayList<>(Arrays.asList(4,2,0,2,2,42,9,0,3,1));
            //reverseString("abuzukkale");
            //uniqueCharacter("naaho");
            //frequencyOfCharacter("aaaabbbbc");
           // moveZerotoTheEnd(list);
           // palindrome("kerem","merek");
            //arrMind(arr);
            maxProfit(arr);
        }

        static void reverseString( String word){

            String reverse = "";

            for (int i = word.length()-1; i >= 0; i-- ){

                reverse+=word.charAt(i);

            }

            System.out.println(reverse);

        }
        static void uniqueCharacter(String word){

            String uniWord = "";
            String uniqueCharacter = "";

            for (int i = 0; i < word.length(); i++){
                ;
                if (!uniWord.contains(word.charAt(i)+"")){
                    uniWord+=word.charAt(i);
                }
            }
            System.out.println(uniWord);

            for (int  i = 0; i < uniWord.length(); i++){
                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j)==uniWord.charAt(i))
                        count++;

                }


                if (count==1)
                    uniqueCharacter+= uniWord.charAt(i)+"";
            }
            System.out.println(uniqueCharacter);


        }
        static void frequencyOfCharacter(String word){
            String onlyCharacters = "";
            String result= "";
            for (int i = 0; i < word.length(); i++) {
                if (!onlyCharacters.contains(word.charAt(i)+"")){
                    onlyCharacters+=word.charAt(i);
                }
            }

            for (int i = 0; i < onlyCharacters.length(); i++) {
                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (onlyCharacters.charAt(i)==word.charAt(j)){
                        count++;
                    }
                }
                result+= onlyCharacters.charAt(i);
                result+= count;
            }


            System.out.println(result);
        };
        static void moveZerotoTheEnd(List<Integer>list ){

            int size = list.size();
            list.removeAll(Arrays.asList(0));

            int sizeNo0= list.size();

            int numberOf0= size-sizeNo0;

            for (int i = 0; i < numberOf0; i++) {
                list.add(0);
            }
            System.out.println(list);
        };
        static void palindrome(String word1, String word2){
            if (word1.length()!=word2.length()){
                System.out.println("Not palindrome");
            }
            Set<String>set1 = new TreeSet<>(Arrays.asList(word1.split("")));
            Set<String>set2 = new TreeSet<>(Arrays.asList(word2.split("")));
            System.out.println(set1.equals(set2));

        }
        static void arrMind(int [] arr){
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>min)
                    min=arr[i];
            }

            System.out.println(min);
        }
        static void maxProfit(int [] arr){
            int min = arr[0];
            int max = 0;

            for (int i = 0; i < arr.length; i++) {
                int profit=0;
                if (arr[i]>max){
                   profit= arr[i] -min;
                    if (profit>max)
                        max =profit;

                }
                else min=arr[i];
            }
            System.out.println(max);

        }



}
