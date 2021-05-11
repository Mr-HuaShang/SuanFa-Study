package com.cyq.suanfa;

import java.util.Arrays;

//归并排序
public class MergeSort {

    public static void main(String[] args) {
        int[] arr={12,44,66,33,345,44,90,34,33,44,232,55,2,21,44};

        int[] arrM={2,8,2,4,7};

        mergeSort(arrM,0,arrM.length-1);
        System.out.println(Arrays.toString(arrM));

        System.out.println("============================");

        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void mergeSort(int[] arr,int left,int right){
        if(arr == null || arr.length <= 1 || left == right){
            return;
        }
        int mid = left + ((right - left) >> 1);
        //归并排序mid左边
        mergeSort(arr,left,mid);
        //归并排序 mid 右边
        mergeSort(arr,mid+1,right);
        //归并
        mergeArr(arr,left,mid,right);
    }

    public static void mergeArr(int[] arr,int left,int mid,int right){
        if(arr == null || arr.length <= 1 || left == right){
            return;
        }

        int p1 = left;
        int p2 = mid + 1;
        int i=0;
        //创建辅助数组
        int[] helpArr = new int[right - left + 1];
        while (p1 <= mid && p2 <= right){
            if(arr[p1] > arr[p2]){
                //i 后加加,p2 也后 加加
                helpArr[i++] = arr[p2++];
            }else {
                //i 后加加
                helpArr[i++] = arr[p1++];
            }
        }

        //要么先遍历完左边，要么先遍历完右边，不能同时遍历完
        while(p1 <= mid){
            helpArr[i++] = arr[p1++];
        }

        while(p2 <= right){
            helpArr[i++] = arr[p2++];
        }

        //重新将辅助数组排好序的值，复制到原数组
        for (int j = 0; j < helpArr.length; j++) {
            arr[left + j]=helpArr[j];
        }
    }

}
