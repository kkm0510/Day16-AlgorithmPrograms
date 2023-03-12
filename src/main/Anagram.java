package main;

import java.util.LinkedList;

public class Anagram {

    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s1.length(); i++) {
            list.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            list.remove((Character) (s2.charAt(i)));
        }
        return list.size() == 0;
    }

}
