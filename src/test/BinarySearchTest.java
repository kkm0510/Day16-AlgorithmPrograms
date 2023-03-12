package test;

import org.junit.Assert;
import org.junit.Test;

import static main.BinarySearch.search;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void givenAListOfWordsSearchAGivenWordInListAndReturnTrueIfPresent() {
        String[] listOfWords={"hello", "hey", "world", "this", "is", "kartikeya", "maan"};
        String wordToSearch="kartikeya";
        Assert.assertTrue(search(listOfWords, wordToSearch));
    }
}