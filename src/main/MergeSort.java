package main;

import java.util.Arrays;

public class MergeSort {

    public static <T extends Comparable<T>> void mergeTwoSortedArrays(T[] arr, int low, int high, int mid) {
        T[] arr1=Arrays.copyOfRange(arr, low, mid+1);
        T[] arr2=Arrays.copyOfRange(arr, mid+1, high+1);
        int i = 0, j = 0, k = low;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i].compareTo(arr2[j]) <= 0) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] arr, int low, int high) {
        if (high - low == 0) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeTwoSortedArrays(arr, low, high, mid);
    }
}
