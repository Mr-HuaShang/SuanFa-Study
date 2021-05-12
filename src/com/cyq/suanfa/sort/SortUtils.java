package com.cyq.suanfa.sort;

public class SortUtils {

    //下表i,j的值交互
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " -> ");
        }
        System.out.println();
    }

}
