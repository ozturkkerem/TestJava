package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class x{
    public static void main(String[] args) {

Integer[] arr = {1,2,3,4,5};




    }


    public static int abc (int n){
        int sum = 0;

        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        return sum;


    }
}
