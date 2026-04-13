package sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length-1 ; i++) {
            int min = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    int temp = nums[min];
                    nums[min] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {13, 46, 24, 52, 20, 9};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
