package com.company;

import java.util.ArrayList;

public class SwapAndPrint {

    public static void main(String[] args) {

        int [] numbers = {2, 4, 5, 3,
                7, 6, 1, 9,
                10, 13, 56, 43};

        System.out.println("----------------");
        System.out.println("Original Array");

        ArrayList<Integer> numList2 = new ArrayList<Integer>();

        for(int element : numbers) {
            System.out.println(element);
            numList2.add(element);
        }



        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        System.out.println("----------------");
        System.out.println("Swapped Array");

        for(int element : numbers) {
           System.out.println(element);
            numList2.add(element);
        }


    }

}
