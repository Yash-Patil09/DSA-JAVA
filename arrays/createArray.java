import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class createArray {
    public static void main(String[] args) {
        staticArray();
        dynamicArray();
    }

    static void staticArray(){
        int [] arr = { 10, 20, 30, 40, 50};
        //printing array using loop
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    static void dynamicArray(){
        // Dynamic Integer Array
        List<Integer> dynamicArray = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.print(dynamicArray);

        //printing using loop
        //for using loop we have to use size and get

        for(int i = 0 ; i<dynamicArray.size();i++){
            System.out.print(dynamicArray.get(i) + " ");
        }



    }

}
