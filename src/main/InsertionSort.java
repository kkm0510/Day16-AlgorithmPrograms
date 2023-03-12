package main;

public class InsertionSort {

    public static void insertionSort(String[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j].compareTo(arr[i])<0){
                    String temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

}
