package com.cyq.suanfa.sort;

//冒泡排序
public class bubbleSort {

    //1 2, 2 3 ，3 4  ..... ,n-2 n-1;

    //表示比较 数对 中的第二个元素 ： second = n-1
    public static void bubbleSort(int[] arr){
        int n = arr.length;

        if(arr == null || n < 2){
            return;
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }


    //1 2, 2 3 ，3 4  ..... ,n-2 n-1;

    //表示比较 数对 中的第1个元素 ： first = n-2
    public static void bubbleSortByFirst(int[] arr){
        int n = arr.length;

        if(arr == null || n < 2){
            return;
        }

        for(int end = n-2; end>=0 ; end--){
            for(int first=0 ; first<=end ; first++){
                if(arr[first] > arr[first+1]){
                    SortUtils.swap(arr,first,first+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={12,2,3,0,4,4152,12,55,44,33,21,245};
        System.out.println("============排序前==========");
        SortUtils.printArray(arr);

        System.out.println("============bubbleSort排序后==========");
        bubbleSort(arr);
        SortUtils.printArray(arr);

        System.out.println("============bubbleSortByFirst排序后==========");
        bubbleSortByFirst(arr);
        SortUtils.printArray(arr);

    }
}
