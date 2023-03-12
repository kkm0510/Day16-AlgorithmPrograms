package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static main.BubbleSort.bubbleSort;
import static main.InsertionSort.insertionSort;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void givenAListOfWordsSortThemAndCheckIfListIsSorted(){
        String[] arr={"hello", "hey", "world", "this", "is", "kartikeya", "maan"};
        String[] copy= Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        bubbleSort(arr);
        Assert.assertArrayEquals(copy, arr);
    }
}