package sorting;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] nums) {
        for (int i = nums.length - 1; i >= 1 ; i--) {
            int didSwap = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) break;
        }
    }

    public static void main(String[] args) {
        int[] nums = {13, 46, 24, 52, 20, 9};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
