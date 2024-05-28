package org.example;


public class SelectionSort {


    public static void main(String[] args) {
        int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("před sortem: ");
        for (int i : arr) {
            System.out.print(i);
            System.out.print(", ");
        }
        int[] sortedArr = doSelectionSort(arr);
        System.out.println();
        System.out.println("po sortu:");
        for (int i : sortedArr) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
    public static int[] doSelectionSort(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)


                if (arr[j] < arr[index])
                    index = j;


            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}
