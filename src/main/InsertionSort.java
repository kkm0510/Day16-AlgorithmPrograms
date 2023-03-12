package main;

public class InsertionSort {

    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j].compareTo(arr[i])<0){
                    T temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

}
