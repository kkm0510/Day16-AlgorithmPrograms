package main;

import java.util.LinkedList;
import java.util.Queue;

public class Permutation {

    public static void findPermutationIterative(String s, Queue<String> queue) {
        String temp1 = "";
        temp1 += s.charAt(s.length() - 1);
        queue.add(temp1);
        for (int i = s.length() - 2; i >= 0; i--) {
            char ch = s.charAt(i);
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String temp = queue.poll();
                for (int k = 0; k <= temp.length(); k++) {
                    queue.add(temp.substring(0, k) + ch + temp.substring(k));
                }
            }
        }
    }

    public static Queue<String> findPermutationRecursive(String s) {
        if (s.length() == 1) {
            Queue<String> queue= new LinkedList<>();
            queue.add(s);
            return queue;
        }
        char ch = s.charAt(0);
        Queue<String> queue = findPermutationRecursive(s.substring(1));
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            String temp = queue.poll();
            for (int j = 0; j <= temp.length(); j++) {
                queue.add(temp.substring(0, j) + ch + temp.substring(j));
            }
        }
        return queue;
    }
}
