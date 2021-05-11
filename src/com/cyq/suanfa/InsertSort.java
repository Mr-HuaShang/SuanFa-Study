package com.cyq.suanfa;

import java.util.Arrays;

//插入排序
public class InsertSort {

    public static void insertSort(int[] arr){

        /**
         * 思路推导
         */

//        //第1轮，将数组第一个元素作为有序的，第二个到 n -1 个当做无序的
//        int insertValue = arr[1];//定义待插入的数为 数组的第二个数
//        int insertIndex = 1-1;//定义带插入的下标，为 待插入的数 的前一个位置
//        while(insertIndex >=0 && insertValue < arr[insertIndex]){
//            arr[insertIndex+1] = arr[insertIndex];
//            insertIndex--;
//        }
//        arr[insertIndex] = insertValue;
//
//        //第2轮，将数组前2个元素作为有序的，第二个到 n -1 个当做无序的
//        insertValue = arr[2];//定义待插入的数为 数组的第二个数
//        insertIndex = 2-1;//定义带插入的下标，为 待插入的数 的前一个位置
//        while(insertIndex >=0 && insertValue < arr[insertIndex]){
//            arr[insertIndex+1] = arr[insertIndex];
//            insertIndex--;
//        }
//        arr[insertIndex] = insertValue;
//
//        //第3轮，以此类推。。。。。。


        int n = arr.length;
        if(arr == null || n < 2){
            return;
        }

        for(int i=1; i < n ; i++){
            int insertValue = arr[i];//定义待插入的数为 数组的第二个数
            int insertIndex = i-1;//定义带插入的下标，为 待插入的数 的前一个位置
            while (insertIndex >= 0 && insertValue < arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1]=insertValue;
            System.out.println("第" + i + "轮插入");
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void insertSort2(int[] arr){
        int n = arr.length;
        if(arr == null || n < 2){
            return;
        }

        //正序排列
        for(int end=1; end < n ; end++){
            for(int pre = end-1; pre >= 0 && arr[pre] > arr[pre+1]; pre--){
                SortUtils.swap(arr,pre,pre+1);
            }
        }

//        //倒序排列
//        for(int end=1; end < n ; end++){
//            for(int pre = end-1; pre >= 0 && arr[pre] < arr[pre+1]; pre--){
//                SortUtils.swap(arr,pre,pre+1);
//            }
//        }
    }




    public static void main(String[] args) {
        int[] arr={12,2,3,0,4,4152,12,55,44,33,21,245};
        System.out.println("============排序前==========");
        SortUtils.printArray(arr);
        System.out.println("============insertSort排序后==========");
        insertSort(arr);
        SortUtils.printArray(arr);

//        System.out.println("============insertSort2排序后==========");
//        insertSort2(arr);
//        SortUtils.printArray(arr);
    }
}
