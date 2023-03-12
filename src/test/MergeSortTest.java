package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static main.InsertionSort.insertionSort;
import static main.MergeSort.mergeSort;
import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void givenAListOfWordsSortThemAndCheckIfListIsSorted() {
        String[] arr = {"hello", "hey", "world", "this", "is", "kartikeya", "maan"};
        String[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        mergeSort(arr, 0, arr.length - 1);
        Assert.assertArrayEquals(copy, arr);
    }
}