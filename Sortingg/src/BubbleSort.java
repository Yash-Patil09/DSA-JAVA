package Sortingg.src;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,7,2,8,1};
        int n = arr.length;
        System.out.print("Before Sorting -> ");
        for(int i = 0 ; i<n ; i++){

            System.out.print(arr[i] + " ");
        }
        System.out.println();

        BubbleSort(arr,n);
        System.out.print("After Sorting -> ");
        for(int i = 0 ; i<n ; i++){

            System.out.print(arr[i] + " ");
        }

    }
    public static void BubbleSort(int [] arr , int n){
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = 0 ; j < n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

}
