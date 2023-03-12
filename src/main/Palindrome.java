package main;

import java.util.ArrayList;

public class Palindrome {

    static ArrayList<Integer> listOfPalindromes = new ArrayList<>();

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

    public static void main(String[] args) {
        PrimeNumbers.findPrimes(0, 1000);
        findPalindromes(PrimeNumbers.listOfPrimes);
        System.out.println(listOfPalindromes);
    }
}
