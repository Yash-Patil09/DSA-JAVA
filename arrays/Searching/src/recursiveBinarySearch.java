import java.util.Scanner;

public class recursiveBinarySearch {
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
    public static int search(int[] arr, int start, int end,int n , int target){
        while(start <= end){
            int mid = (start+end)/2;

//recursive
            if(arr[mid] == target){
                return mid;
            }

            // If element is smaller than mid, then
            // it can only be present in left subarray
            else if (target > arr[mid]) {
                return search(arr,mid+1,end,n,target);

                // Else the element can only be present
                // in right subarray
            }else{
                return search(arr,start,mid-1,n,target);
            }
        }
        return -1;


    }
}
