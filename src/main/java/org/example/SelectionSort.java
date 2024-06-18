package org.example;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {


        int[] numbers = new int[10000];
        Random randNumbers = new Random();

        for (int i = 0; i < numbers.length; i++){

            numbers[i] = randNumbers.nextInt(10000);
        }

        // before selection
        System.out.println(Arrays.toString(numbers));
        long startTime = System.currentTimeMillis();


        selectionSort(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println("It Took " + (endTime - startTime) + " MS");

        // time complexity;  O(n^2)
        // after
        System.out.println(Arrays.toString(numbers));


    }

    private static void selectionSort(int[] numbers) {

        int length = numbers.length;

        for(int i = 0; i < length - 1; i++){

            int min = numbers[i];
            int indexOfMin = i;

            for(int j = i + 1; j < length; j++){

                if(numbers[j] < min){

                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }
    }

    private static void swap(int[] numbers, int a, int b) {

        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;

    }

}
