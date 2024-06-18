package org.example;

import java.util.Random;

public class InsertionSort {

    public static void main(String[] args){

        Random randNumbers = new Random();
        int[] arrNumbers = new int[10000];

        for(int i = 0; i < arrNumbers.length; i++){

            arrNumbers[i] = randNumbers.nextInt(10000);

        }


        // Before sort
        printArray(arrNumbers);
        long startTime = System.currentTimeMillis();
        System.out.println();

        // After sort
        // time complexity n^2
        insertionSort(arrNumbers);
        long endTime = System.currentTimeMillis();

        printArray(arrNumbers);
        System.out.println("It Took " + (endTime - startTime) + " MS");



    }

       static void insertionSort(int[] arrNumbers) {

        for(int i = 1; i < arrNumbers.length; i++){

            int currentValue = arrNumbers[i];
            int j = i - 1;

            while(j >= 0 && arrNumbers[j] > currentValue){

                arrNumbers[j + 1] = arrNumbers[j];
                j--;

            }

            arrNumbers[j+1] = currentValue;

        }
    }

    static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){

            System.out.print(array[i] + " ");


        }


    }



}
