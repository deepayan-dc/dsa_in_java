package recursion;

import java.util.Arrays;

public class ReverseAnArray {
    static void reverse (int[] arr, int i, int n) {
        if (i >= n/2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = {1,2 ,3, 4, 5};
        reverse(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }
}
