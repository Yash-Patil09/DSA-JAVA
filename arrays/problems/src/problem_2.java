//   Q]   Find Second-largest element in an array
//        Given an array of integers, our task is to write a program
//        that efficiently finds the second-largest element present in the array.


import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class problem_2 {

    public static void print2ndLargest(Integer [] arr, int arr_size){
        Arrays.sort(arr , Collections.reverseOrder());

        for(int i = 1 ; i < arr_size ; i++){
            if(arr[i] != arr[0]){
                System.out.println("The Second Largest Element " + arr[i]);
                return ;
            }
        }
        System.out.println("There is no second largest element ");

    }
    public static void main(String[] args) {
        Integer [] arr = {11,33,5,22,6,778,89,21,67};
        int n = arr.length;
        print2ndLargest(arr,n);
    }
}
