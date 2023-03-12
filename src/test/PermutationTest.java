package test;

import main.Permutation;
import org.junit.Assert;
import org.junit.Test;


import java.util.LinkedList;
import java.util.Queue;


public class PermutationTest {

    @Test
   public void givenAStringFindAllPossiblePermutationsIterativelyAndRecursivelyAndCheckEquality(){
        String s = "abc";
        Queue<String> queue1 = new LinkedList<>();
        Permutation.findPermutationIterative(s, queue1);
        Queue<String> queue2 = Permutation.findPermutationRecursive(s);
        Assert.assertEquals(queue1, queue2);
   }
}