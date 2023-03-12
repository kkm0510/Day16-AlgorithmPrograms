package main;

import java.util.ArrayList;

public class PrimeNumbers {

    static ArrayList<Integer> listOfPrimes=new ArrayList<>();

    public static void findPrimes(int start, int end){
        for(int i=start; i<end; i++){
            boolean isPrime=true;
            for(int j=2; j<i; j++){
                if(i%j==0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) listOfPrimes.add(i);
        }
    }

    public static void main(String[] args) {
        int start=0, end =1000;
        findPrimes(start, end);
        System.out.println(listOfPrimes);
    }

}
