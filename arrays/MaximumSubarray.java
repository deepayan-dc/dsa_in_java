package arrays;

public class MaximumSubarray {
    static void maximumSubArray (int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int arraystart = -1, arrayend = -1;
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                arraystart = i;
            }
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                arrayend = i;
            }

            if (sum < 0) sum = 0;
        }
        for (int i = arraystart; i <= arrayend; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maximumSubArray(nums);
    }
}
