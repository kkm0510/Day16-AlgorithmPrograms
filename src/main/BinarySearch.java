package main;

import java.util.Arrays;

public class BinarySearch {

    public static boolean search(String[] arr, String word){
        Arrays.sort(arr);
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            String curr=arr[mid];
            if(word.compareTo(curr)==0){
                return true;
            }
            else if(word.compareTo(curr)<0){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }

}
