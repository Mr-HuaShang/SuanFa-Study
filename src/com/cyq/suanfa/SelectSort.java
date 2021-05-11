package com.cyq.suanfa;


//选择排序
public class SelectSort {

    //选择排序
    public static void selectSort(int[] arr){
        /**
         * 思路，如下
         */
//        //第一轮排序,假定最小值是 下标为 0  的元素
//        int minIndex = 0;
//        int minValue = arr[0];
//        for (int j = 1; j < n; j++) {
//            if(minValue > arr[j]){
//                minValue = arr[j];
//                minIndex=j;
//            }
//        }
//        //交换最小值位置
//        arr[minIndex] = arr[0];
//        arr[0] = minValue;
//
//        //第二轮排序，下标为0以排好，所以假定最小值是 下标为 1 的元素
//        minIndex = 1;
//        minValue = arr[1];
//        for (int j = 1; j < n; j++) {
//            if(minValue > arr[j]){
//                minValue = arr[j];
//                minIndex=j;
//            }
//        }
//        //交换最小值位置
//        arr[minIndex] = arr[1];
//        arr[1] = minValue;

        int n = arr.length;

        if(arr == null || n < 2){
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            int minValue = arr[i];
            for (int j = i + 1; j < n; j++) {
                if(minValue > arr[j]){
                    minValue = arr[j];
                    minIndex=j;
                }
            }

            /**
             * 优化点，假如当前下标i对应的元素已经是最小值，则不用交换
             */
            if(minIndex != i){
                //交换最小值位置
                arr[minIndex] = arr[i];
                arr[i] = minValue;
            }
        }
    }




    public static void main(String[] args) {
        int[] arr={12,44,3,0,4,4152,12,55,44,2,21,245};
        System.out.println("============排序前==========");
        SortUtils.printArray(arr);
        System.out.println("============排序后==========");
        selectSort(arr);
        SortUtils.printArray(arr);
    }
}
