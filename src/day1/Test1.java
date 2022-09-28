package day1;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {




        System.out.println("---------------------------------");

        int [] arr= {34,42,12,312,423,1,326,45,654,7,347,45,654,6,456,4135,134,5234,5,99999,4564,534,43,53,43,54};
//      reverse("Kerem");
  //    uniqueCharacter("aaaaab");
      anagram("kerem","kerem");
      //polidrome("musta","atsum");
//      countUnique("Keeeeereeeeemmm");
  //    max(arr);
    //  sort(arr);
//prime(17);
    maxProfit(arr);

    }


    public static void reverse(String word){

        String result = "";
        for (int i = word.length()-1; i>=0; i--){
            result+= word.charAt(i);

        }
        System.out.println(word +" reversed "+ result);
        System.out.println("----------------------------");
    }

    public static void uniqueCharacter(String word){
        String unique= "";
        String result = "";

        for (int i = 0; i<word.length() ;i++){

        if (!unique.contains(word.charAt(i)+"")){
            unique+=word.charAt(i);
        }
        }


        for (int i = 0; i < unique.length(); i++){
            int count = 0;
            for (int j = 0; j < word.length(); j++){
                if (unique.charAt(i)==word.charAt(j))
                    count++;

            }
            if (count==1){
                result+=unique.charAt(i);
            }

        }
        System.out.println(result);





    }

    public static void anagram(String word1, String word2){

      String [] arr =  word1.split("");
      String [] arr2 = word2.split("");
        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr,arr2));

    }

    public static void polidrome(String word, String word2){
        System.out.println("------------------------------");
    String result = "";

        for (int i = word.length()-1; i>=0; i--){
            result+= word.charAt(i);

        }

        System.out.println(result.equals(word2));
    }

    public static void countUnique(String word){

        String unique = "";
        String result = "";

        for (int i = 0; i <word.length() ; i++) {
            if (!unique.contains(word.charAt(i)+"")){
                unique+=word.charAt(i);
            }
        }

        for (int i = 0; i <unique.length() ; i++){
            int count = 0;

            for (int j = 0; j <word.length() ; j++){
                if (unique.charAt(i)==word.charAt(j))
                count++;
            }
            result+= unique.charAt(i)+""+count;
        }
        System.out.println(result);

    }

    public static void max(int [] arr){

        System.out.println("---------------------------");
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max)
                max = i;
        }

        System.out.println(max);
    }

    public static void sort(int [] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<
                        arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;

                }
            }

        }

        System.out.println(Arrays.toString(arr) );
    }

    public static void prime(int num){
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''");
        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                System.out.println("prime number" + " " +i);
                return;
            }

        }
        System.out.println("It is not a prime number");

    }

    public static void maxProfit(int [] arr){
        int min = arr[0];
        int maxP = 0;

        for (int i = 0; i < arr.length; i++) {
            int profit = 0;
            if (arr[i]>min){
                profit=arr[i]-min;

                if (profit>maxP){
                    maxP=profit;
                }
            }
            else min=arr[i];

        }
        System.out.println(maxP);
int buyDay=0;
int sellDay=0;

        for (int i = 0; i < arr.length; i++) {


            for (int j = i+1; j < arr.length; j++) {

                if (arr[j]-arr[i]==maxP){

                    buyDay=i+1;
                    sellDay=j+1;
                }

            }
        }
        System.out.println(buyDay+"   "+sellDay+"  "+maxP);
    }


}
