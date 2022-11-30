package org.example.dsa;

import java.util.Arrays;

public class MoveZerosToRight {
    public static void main(String[] args) {
        int [] arr = {0,2,5,0,9,1,0,3,0,0};
        int i=0,j=arr.length-1,iteration=0;
        while (i<j) {
            iteration++;
            if(arr[i] == 0 && arr[j] !=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (arr[i] != 0) {
                i++;
            }
            if(arr[j] == 0) {
                j--;
            }
        }
        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        System.out.println("\nIteration "+iteration);
    }
}
