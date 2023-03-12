package main;

import java.util.Arrays;

public class MergeSort {

    public static String[] mergeTwoSortedArrays(String[] arr1, String[] arr2) {
        String[] sortedArr = new String[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i].compareTo(arr2[j]) <= 0) {
                sortedArr[k++] = arr1[i++];
            } else {
                sortedArr[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            sortedArr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            sortedArr[k++] = arr2[j++];
        }
        return sortedArr;
    }

    public static String[] mergeSort(String[] arr, int low, int high) {
        if (high - low == 0) {
            return new String[]{arr[low]};
        }
        int mid = low + (high - low) / 2;
        String[] arr1 = mergeSort(arr, low, mid);
        String[] arr2 = mergeSort(arr, mid + 1, high);
        return mergeTwoSortedArrays(arr1, arr2);
    }

}
