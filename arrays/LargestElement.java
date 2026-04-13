package arrays;

public class LargestElement {
    static int largestElement (int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1};
        System.out.println(largestElement(nums));
    }
}
