package org.example;


public class InsertionSort {


    public static void main(String[] args) {




        int[] arr = {1, 24, 5, 23, 744, 3};
        System.out.println("pole před sortem:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        insertionSort(arr);
        System.out.println();
        System.out.println("pole po sortu: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
}




