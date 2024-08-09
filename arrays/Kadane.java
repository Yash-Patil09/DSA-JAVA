//The Maximum Subarray problem is a classic algorithmic problem that involves finding the contiguous subarray within a one-dimensional array of numbers that has the largest sum.
// This problem is often used to illustrate dynamic programming techniques, particularly in relation to Kadane's Algorithm.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Kadane {


    static int KDne(int[] arr){
        int max_sum =  arr[0];
        int max_ending_here = arr[0];

        for(int i = 1 ; i < arr.length; i++){
            max_ending_here = Math.max(arr[i], max_ending_here+arr[i]);

            max_sum = Math.max(max_sum, max_ending_here);
        }
        return max_sum;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements - > ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements -> ");
        for(int  i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int kadane = KDne(arr);
        System.out.print("Maximum Subarray -> " + kadane);



    }



}
