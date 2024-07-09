import java.io.*;
import java.util.Scanner;
public class LinearSearch {

    //Linear Search Algorithm
    //The linear search algorithm is defined as a sequential search algorithm that
    // starts at one end and goes through each element of a list
    // until the desired element is found; otherwise, the search continues till the end of the dataset.
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        int n = arr.length;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target element -->>  ");
        int target = in.nextInt();


        int result = Search(arr,n,target);
        if(result == -1){
            System.out.println("Element not Found");
        } else{
            System.out.print("Element found at Index -->> " + result);
        }



    }
    public static int Search(int[] arr, int n , int target){
        for(int i = 0 ; i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}

//    Time Complexity:
//
//        Best Case: In the best case, the key might be present at the first index. So the best case complexity is O(1)
//        Worst Case: In the worst case, the key might be present at the last index i.e., opposite to the end from which the search has started in the list. So the worst-case complexity is O(N) where N is the size of the list.
//        Average Case: O(N)
