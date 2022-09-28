package day1;

import java.util.Arrays;

public class day5 {

    public static void main(String[] args) {

        int[] numbers = {0, 23, 1, 5, 0, 10, 8, 3, 0, 5};


        int[] arrNew = new int[numbers.length];

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != 0) {

                numbers[counter] = numbers[i];
            counter++;
            }
        }


        System.out.println(Arrays.toString(numbers));
    }
}
