package learning_java;

import java.util.*;
public class Main {
    static void printArr(int arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray(int arr[], int start, int end){
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverseArray(arr,start+1,end-1);
        }
    }

    public static void main(String[] args){
        int n=5;
        int arr[]={1,2,3,4,5};
        reverseArray(arr,0,n-1);
        printArr(arr,n);
    }
}