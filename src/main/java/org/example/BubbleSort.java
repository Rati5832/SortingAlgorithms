package org.example;


import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arrNumbers = new int[10000];
        Random randomNum = new Random();

        for(int i = 0; i < arrNumbers.length; i ++){

            arrNumbers[i] = randomNum.nextInt(10000);

        }

        // Before BubbleSort
        System.out.println(Arrays.toString(arrNumbers));
        long startTime = System.currentTimeMillis();

        bubbleSort(arrNumbers);
        long endTime = System.currentTimeMillis();

        System.out.println("It Took " + (endTime - startTime) + " MS");
        // After
        // time complexity O(n^2)
        System.out.println(Arrays.toString(arrNumbers));

    }

    private static void bubbleSort(int[] arrNumbers) {

        for(int i = 0; i < arrNumbers.length - 1; i++){
            for(int j = 0; j < arrNumbers.length - 1 - i; j++){

                if(arrNumbers[j] > arrNumbers[j+1]){

                    int temp = arrNumbers[j];
                    arrNumbers[j] = arrNumbers[j+1];
                    arrNumbers[j+1] = temp;
                }
            }
        }



    }


}
