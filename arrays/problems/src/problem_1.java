//Q] Find the largest three distinct elements in an array
//
//        Given an array with all distinct elements, find the largest three elements.
//
//        Expected Time Complexity: O(n)
//        Expected Auxiliary Space: O(1).
public class problem_1 {
    public static void main(String[] args) {
        int[] arr = {10,22,34,52,2,3,41,29,80};
        int n = arr.length;
        first3element(arr,n);

    }
    public static void first3element(int[] arr , int arr_size){
        int i ,first , second , third ;

        if(arr_size < 3){
            System.out.println("Invalid !! ");
            return;

        }
        third = second = first = Integer.MIN_VALUE;
        for(i = 0 ; i < arr_size ; i++){
            if( arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if ( arr[i] > second){
                third = second ;
                second = arr[i];

            }
            else if ( arr[i] > third){
                third = arr[i];
            }

        }
        System.out.println("Three largest elements are " + first + " " + second + " " + third);




    }
}
