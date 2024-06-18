package org.example;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {

        Random randNum = new Random();
        int[] numbers = new int[1000000];

        for(int i = 0; i < numbers.length; i++){

           numbers[i] = randNum.nextInt(1000000);

        }

        // Before
        printArray(numbers);
        long startTime = System.currentTimeMillis();

        //
        System.out.println();

        // After
        // Time Complexity O(n log n)
        mergeSort(numbers);
        long endTime = System.currentTimeMillis();
        printArray(numbers);

        System.out.println("It Took " + (endTime - startTime) + " MS");


    }

     static void mergeSort(int[] numbers) {

        int inputLength = numbers.length;

        if(inputLength < 2 ){

            return;

        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];


        for(int i = 0; i < midIndex; i++){

            leftHalf[i] = numbers[i];

        }

        for(int i = midIndex; i < inputLength; i++){

            rightHalf[i - midIndex] = numbers[i];

         }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        Merge(numbers,leftHalf,rightHalf);


    }

     static void Merge(int[] inputArray, int[] leftHalf, int[] rightHalf){

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftSize && j < rightSize){

            if(leftHalf[i] <= rightHalf[j]){

                inputArray[k] = leftHalf[i];
                i++;

            } else {

                inputArray[k] = rightHalf[j];
                j++;

            }

            k++;

        }

        while(i < leftSize){

            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

         while(j < rightSize){

             inputArray[k] = rightHalf[j];
             j++;
             k++;
         }
     }


    static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){

            System.out.print(array[i] + " ");

        }

    }

}
