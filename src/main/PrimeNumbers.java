package main;

import java.util.ArrayList;

public class PrimeNumbers {

    public static ArrayList<Integer> findPrimes(int start, int end){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=start; i<end; i++){
            boolean isPrime=true;
            for(int j=2; j<i; j++){
                if(i%j==0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int start=0, end =1000;
        ArrayList<Integer> listOfPrimes=findPrimes(start, end);
        System.out.println(listOfPrimes);
    }

}
