package test;

import org.junit.Assert;
import org.junit.Test;

import static main.Anagram.checkAnagram;

public class AnagramTest {

    @Test
    public void givenTwoStringsIfTheyAreAnagramsReturnTrue() {
        String s1 = "heart";
        String s2 = "earth";
        Assert.assertTrue(checkAnagram(s1, s2));
    }
}