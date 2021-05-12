package com.cyq.suanfa.search;

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-4,-2,0,4,5,8,9,10,66};
        System.out.println(binarySearch(arr, 0, arr.length, 9));

    }

    public static int binarySearch(int[] arr,int left,int right,int findValue){
        if(left >= right){
            return -1;
        }
        int mid = (right + left)/2;
        if(arr[mid] == findValue){
            return mid;
        }
        if(arr[mid] > findValue){
            return binarySearch(arr,left,mid,findValue);
        }else {
            return binarySearch(arr,mid+1,right,findValue);
        }
    }
}
