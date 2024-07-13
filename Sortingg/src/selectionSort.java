import java.util.Arrays;
import java.util.*;

//Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting
// the smallest (or largest) element from the unsorted portion of the list
// and moving it to the sorted portion of the list.
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {11,3,22,0,2,43,-122};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selection(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0, last);

            swap(arr,maxIndex, last);

        }
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start;i <= end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

}
//Time Complexity:
//             time complexity of Selection Sort is O(N2) as there are two nested loops:
