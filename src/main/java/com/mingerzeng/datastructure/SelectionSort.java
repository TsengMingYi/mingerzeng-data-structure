package com.mingerzeng.datastructure;

public class SelectionSort {

    private SelectionSort(){}

    public static <E extends Comparable<E>> void sort(E arr[]){
        for(int i = 0;i<arr.length;i++){
            //選擇 arr[i...n) 中的最小值的索引
            int minIndex = i;
            for(int j = i;j< arr.length;j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    private static <E> void swap(E arr[],int i,int j){
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer arr[] = {6,100,45,1,34,90};
        SelectionSort.sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }







}
