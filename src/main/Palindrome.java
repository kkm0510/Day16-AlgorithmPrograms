package main;

import java.util.ArrayList;
import java.util.Collections;

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

    public static void findPalindromes(ArrayList<Integer> listOfPrimes) {
        for (Integer num : listOfPrimes) {
            if (checkPalindrome(num)) listOfPalindromes.add(num);
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
        int i=index+1;
        boolean oneMatchFound=false;
        while(i<listOfPalindromes.size()){
            boolean isAnagram=compareDigits(listOfPalindromes.get(index), listOfPalindromes.get(i));
            if(isAnagram) {
                oneMatchFound=true;
                list.add(listOfPalindromes.get(i));
            }
            i++;
        }
        if(oneMatchFound) {
            list.add(listOfPalindromes.get(index));
            return list;
        }
        return null;
    }

    public static void findAllAnagrams() {
        for (int i = 0; i < listOfPalindromes.size(); i++) {
            ArrayList<Integer> smallAnagramList = findAnagrams(i);
            if (smallAnagramList!=null) listOfAnagrams.add(smallAnagramList);
        }
    }


    public static void main(String[] args) {
        PrimeNumbers.findPrimes(0, 1000);
        findPalindromes(PrimeNumbers.listOfPrimes);
        System.out.println(listOfPalindromes);
        findAllAnagrams();
        System.out.println(listOfAnagrams);

    }
}
