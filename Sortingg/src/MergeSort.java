package Sortingg.src;


    public class MergeSort {
        public static void main(String[] args) {
            int[] arr = {7, 3, 4, 2};
            int n = arr.length;

            Divide(arr, 0, n - 1);

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void Divide(int[] arr, int start, int end) {
            if (start >= end) {
                return;
            }

            int mid = start + (end - start) / 2;

            Divide(arr, start, mid);
            Divide(arr, mid + 1, end);

            Merge(arr, start, mid, end);
        }

        public static void Merge(int[] arr, int start, int mid, int end) {
            // Create temporary arrays for the two subarrays
            int[] left = new int[mid - start + 1];
            int[] right = new int[end - mid];

            // Copy data to temp arrays
            for (int i = 0; i < left.length; i++) {
                left[i] = arr[start + i];
            }
            for (int i = 0; i < right.length; i++) {
                right[i] = arr[mid + 1 + i];
            }

            // Merge the temp arrays back into arr[start..end]
            int i = 0, j = 0, k = start;
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }

            // Copy the remaining elements of left[], if any
            while (i < left.length) {
                arr[k] = left[i];
                i++;
                k++;
            }

            // Copy the remaining elements of right[], if any
            while (j < right.length) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
    }

