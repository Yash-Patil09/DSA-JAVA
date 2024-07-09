
public class operationsonArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int n = arr.length-1;
        int x = 50;
        int pos = 4;
        int key = 90 ;
        TraversalinArray();
        insertionArray(arr,n,x,pos);
        for(int i = 0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        findElementArray(arr, key);
        deletionArray(arr, key , n);
        for(int i = 0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }


    }
    static void TraversalinArray() {
        //Traversal in array

        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int n = arr.length;
        int i = 0;

        // using for loop
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + "");
        }


    }
    static void insertionArray(int[] arr, int n, int x, int pos){
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        // Insert the new element at the specified position
        arr[pos] = x;

    }
    static int findElementArray(int[] arr , int key){
        // to delete particular element , first we need to find whether the element is present in array or not

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }

        }
        return -1;

    }
    static void deletionArray(int[] arr, int key , int n){
        //finding the position of key element
        int pos = findElementArray(arr,key);
        if(pos == -1){
            System.out.println("Element not found");
        }

        // Delete the element
        for(int i = pos; i < n - 1 ; i++){
            arr[i] = arr[i+1];
        }


    }


}
