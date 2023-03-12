package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static main.InsertionSort.insertionSort;
import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void givenAListOfWordsSortThemAndCheckIfListIsSorted() {
        String[] arr={"hello", "hey", "world", "this", "is", "kartikeya", "maan"};
        String[] copy= Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        insertionSort(arr);
        Assert.assertArrayEquals(copy, arr);
    }
}