package com.aodingkun.DataStructure.search;

/**
 * @ClassName: SeqSearch
 * @Description: 顺序查找
 * @Author: AoDingKun
 * @Date :2020/6/17 15:04
 * Project : SeqSearch.java
 */
public class SeqSearch {

    public static void main(String[] args) {
        // 无序数组
        int arr[] = {1, 9, 11, -1, 34, 89};
        int index = seqSearch(arr, -11);
        if (index == -1) {
            System.out.println("没有找到value");
        } else {
            System.out.println("查找value的下标值=" + index);
        }
    }

    /**
     * 线性查找
     * 找到一个相同就返回
     *
     * @param arr
     * @param value
     * @return
     */
    public static int seqSearch(int[] arr, int value) {
        // 线性查找是逐一比对 发现相同值就返回下标
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
