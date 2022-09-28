package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3,5,7,8,43,2,1243,124,532,534,634,23,423,4,6));

        evenOrOdd(list);

    }


    static void evenOrOdd (List <Integer> list){


        for (Integer integer : list) {
            if (integer%2==0)
                System.out.println(integer + " is an even" );

            else System.out.println(integer + " is an odd");
        }




    }

    static void primeNumber (List <Integer> list){

        }

        static void countOfNumber(String word){




    }


}


