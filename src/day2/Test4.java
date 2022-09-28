package day2;

import java.util.Arrays;

public class Test4 {


    static int [] test1 = {1,3,6,4,1,2};

    static int [] test2 = {1,2};

    static int [] test3 = {-1,-3};

    public static void main (String [] args){




        //DoTests(test1);
        DoTest("Test 1", 5, test1);
    }

    private static void DoTest(String argName, int expected, int [] arr){

        System.out.println(Arrays.toString(arr) + argName + " expected" + expected + " actual -> " + DoWorks(arr)) ;

    }


    private static int DoWorks(int [] arr){

        for (int i = 0; i < 500; i++) {

     boolean smallestNumber = false;
     int number = 0;

     if ( !Arrays.asList(arr).contains(i)){
         smallestNumber=true;

         if (smallestNumber==true){
             System.out.println(i);

         }

     }

        }

       return 0;
    }
}
