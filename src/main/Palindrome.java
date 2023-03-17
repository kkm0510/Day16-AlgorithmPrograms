package main;

import java.util.ArrayList;
import java.util.Collections;

import static main.PrimeNumbers.*;

public class Palindrome {

    static ArrayList<Integer> listOfPalindromes = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> listOfAnagrams = new ArrayList<>();

    private static boolean checkPalindrome(int num) {
        if (num / 10 == 0) return false;
        int rev = 0;
        int n = num;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == num;
    }

    public static void findPalindromes() {
        for (ArrayList<Integer> anagramList : listOfAnagrams) {
            for (int num : anagramList) {
                if (checkPalindrome(num)) listOfPalindromes.add(num);
            }
        }
    }

    public static boolean compareDigits(int x, int y) {
        ArrayList<Integer> xDigits = new ArrayList<>();
        ArrayList<Integer> yDigits = new ArrayList<>();
        int[] num = {x, y};
        for (int i = 0; i < 2; i++) {
            while (num[i] != 0) {
                if (i == 0) xDigits.add(num[i] % 10);
                else yDigits.add(num[i] % 10);
                num[i] = num[i] / 10;
            }
        }
        Collections.sort(xDigits);
        Collections.sort(yDigits);
        return xDigits.equals(yDigits);
    }


    public static ArrayList<Integer> findAnagrams(int index) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = index + 1;
        boolean oneMatchFound = false;
        while (i < listOfPrimes.size()) {
            boolean isAnagram = compareDigits(listOfPrimes.get(index), listOfPrimes.get(i));
            if (isAnagram) {
                oneMatchFound = true;
                list.add(listOfPrimes.get(i));
                listOfPrimes.set(i, -1);
            }
            i++;
        }
        if (oneMatchFound) {
            list.add(listOfPrimes.get(index));
            listOfPrimes.set(index, -1);
            return list;
        }
        return null;
    }

    public static void findAllAnagrams() {
        for (int i = 0; i < listOfPrimes.size(); i++) {
            if (listOfPrimes.get(i) == -1) continue;
            ArrayList<Integer> smallAnagramList = findAnagrams(i);
            if (smallAnagramList != null) listOfAnagrams.add(smallAnagramList);
        }
    }


    public static void main(String[] args) {
        findPrimes(0, 1000);
        System.out.println(listOfPrimes);
        findAllAnagrams();
        System.out.println(listOfAnagrams);
        findPalindromes();
        System.out.println(listOfPalindromes);
    }
}
