import java.util.Scanner;

public class BinarySearch {

    //Binary search is a search algorithm used to find the position of a target value within a sorted array.
    //It works by repeatedly dividing the search interval in half until
    //the target value is found or the interval is empty.
    // The search interval is halved by comparing the target element with the middle value of the search space.
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,67,77,88,90,91};
        int n = arr.length;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Target Element -->> ");
        int target = in.nextInt();
        int start = 0;
        int end = n-1;

        int result = search(arr,start,end,n,target);
        if(result == -1){
            System.out.print("Element not found !!");
        }else{
            System.out.print("Element found at index --> " + result);
        }




    }
    public static int search(int[] arr , int start , int end, int n, int target){
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == target){
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else{
                end = mid - 1;
            }
        }
        return -1;



    }
}
//    Time Complexity: O(log N)
//    Auxiliary Space: O(1)

