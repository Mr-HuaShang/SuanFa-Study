package com.cyq.suanfa.sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr={12,44,66,33,345,44,90,34,33,44,232,55,2,21,44};
        int[] midArr = partition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(midArr));

        System.out.println("============================");

        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int leftIndex,int rightIndex){
        if(leftIndex >= rightIndex){
            return;
        }
        int[] midArr = partition(arr,leftIndex,rightIndex);
        //左边数组递归
        quickSort(arr,leftIndex,midArr[0]-1);
        //右边数组递归
        quickSort(arr,midArr[1]+1,rightIndex);
    }

    public static int[] partition(int[] arr,int leftIndex,int rightIndex){
        int l = leftIndex;
        int r = rightIndex;
        int temp = 0;
        if(arr.length <= 1 || leftIndex >= rightIndex){
            return arr;
        }

        int curIndex = leftIndex;
        while (curIndex < r){
            if(arr[rightIndex] > arr[curIndex]){
                temp = arr[l];
                arr[l] = arr[curIndex];
                arr[curIndex] = temp;
                curIndex++;
                l++;
            }else if(arr[rightIndex] < arr[curIndex]){
                temp = arr[r-1];
                arr[r-1] = arr[curIndex];
                arr[curIndex] = temp;
                r--;
            }else{
                curIndex++;
            }
        }

        //循环结束交换最后位置rightIndex的值 和 位置r的值
        temp = arr[r];
        arr[r] = arr[rightIndex];
        arr[rightIndex] = temp;

        //返回中间等与值得数组的起始下标和结束下标
        int[] midEqualA = {l,r};
        return midEqualA;
    }
}
