package arrays;

public class LongestSubarrayWithSumK {
    static int longestSubarray (int[] nums, int k) {
        int sum = 0;
        int maxLength = 0;
        int i = 0;
        int j = 0;
//        while (i < nums.length && j < nums.length) {
//            if (sum < k) {
//                sum = sum + nums[j];
//                j++;
//            } else if (sum > k) {
//                sum = sum - nums[i];
//                i++;
//            } else {
//                maxLength = Math.max(maxLength, j - i + 1);
//                i++;
//            }
//        }
        while (j < nums.length) {
            sum += nums[j];

            while (sum > k) {
                sum -= nums[i];
                i++;
            }

            if (sum == k)
                maxLength = Math.max(maxLength, j - i + 1);

            j++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 1;
        System.out.println(longestSubarray(nums, k));
    }
}
