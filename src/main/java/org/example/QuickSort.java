package org.example;

import java.util.Random;

import static org.example.MergeSort.printArray;

public class QuickSort {

    public static void main(String[] args) {

        Random randNum = new Random();
        int[] numbers = new int[10000];

        for(int i = 0; i < numbers.length; i++){

            numbers[i] = randNum.nextInt(1000000000);

        }

        // Before
        printArray(numbers);
        long startTime = System.currentTimeMillis();

        //
        System.out.println();

        // After
        // time complexity O(n*log(n))
        quickSort(numbers,0,numbers.length -1);

        long endTime = System.currentTimeMillis();
        printArray(numbers);

        System.out.println("It Took " + (endTime - startTime) + " MS");



    }

    private static void quickSort(int[] numbers, int lowIndex, int highIndex) {

        if(lowIndex >= highIndex){

            return;
        }

        int pivot = numbers[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){


            while(numbers[leftPointer] <= pivot && leftPointer < rightPointer){

                leftPointer++;

            }

            while(numbers[rightPointer] >= pivot && leftPointer < rightPointer){

                rightPointer--;

            }

            swap(numbers, leftPointer,rightPointer);

        }

        if(numbers[leftPointer] > numbers[highIndex]) {
            swap(numbers, leftPointer, highIndex);
        }
        else {
            leftPointer = highIndex;
        }


         quickSort(numbers,lowIndex,leftPointer-1);
         quickSort(numbers,leftPointer+1, highIndex);

    }


    static void swap(int[] array, int index1, int index2){

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;



    }
}
