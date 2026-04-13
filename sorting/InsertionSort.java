package sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            int j = i;
            while (j > 0 && nums[j-1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {13, 46, 24, 52, 20, 9};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
