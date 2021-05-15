package com.cyq.suanfa.search;

import java.util.ArrayList;

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-4,-2,0,4,5,33,234,3523,22432,79023};

        System.out.println("==================迭代遍历法 二分查找===================");
        System.out.println(binarySearchByIteration(arr, 0, arr.length, 234));

        System.out.println(binarySearch(arr, 0, arr.length, 234));

        System.out.println(binarySearch2(arr, 0, arr.length, 8));


    }

    /**
     * 1、递归查找
     * 此写法只能查找出一个 目标值，
     * @param arr
     * @param left
     * @param right
     * @param findValue
     * @return
     */
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

    /**
     * 1、迭代查找（非递归）
     * 此写法只能查找出一个 目标值，
     * @param arr
     * @param left
     * @param right
     * @param findValue
     * @return
     */
    public static int binarySearchByIteration(int[] arr,int left,int right,int findValue){
        if(left >= right){
            return -1;
        }
        int mid = left + (right - left)/2;
        while(mid >= 0 && mid < arr.length){
            //目标值在左边
            if(arr[mid] > findValue){
                right = mid - 1;
            }else if (arr[mid] < findValue){
                left = mid + 1;
            }else {
                return mid;
            }
            mid = left + (right - left)/2;
        }
        return -1;
    }


    /**
     * 二分查找改进，可以查询所有相同的值
     */
    public static ArrayList<Integer> binarySearch2(int[] arr, int left, int right, int findValue){
        ArrayList<Integer> values = new ArrayList<>();
        if(left >= right){
            return new ArrayList<>();
        }
        int mid = (right + left)/2;
        if(arr[mid] == findValue){
            //当查找到 值时，向左右搜索相等的值
            int searchIndex = mid - 1;
            while (true){
                //向左
                if (searchIndex < 0 || arr[mid] != arr[searchIndex]){
                    break;
                }
                values.add(searchIndex--);
            }

            searchIndex = mid + 1;
            while (true){
                //向左
                if (searchIndex > right || arr[mid] != arr[searchIndex]){
                    break;
                }
                values.add(searchIndex++);
            }
            values.add(mid);
            return values;
        }
        if(arr[mid] > findValue){
            return binarySearch2(arr,left,mid,findValue);
        }else {
            return binarySearch2(arr,mid+1,right,findValue);
        }
    }
}
