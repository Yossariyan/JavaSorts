package org.example;


public class BubbleSort {


    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        System.out.println("pole před sortem:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        bubbleSort(arr, n);
        System.out.println();
        System.out.println("pole po sortu: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {


                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }


            if (swapped == false)
                break;
        }
    }
}
