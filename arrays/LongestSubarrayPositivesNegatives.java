package arrays;

import java.util.HashMap;

public class LongestSubarrayPositivesNegatives {
    static int longestSubarray (int[] nums, int k ) {
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == k) maxLen = Math.max(maxLen, i + 1);
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 1;
        System.out.println(longestSubarray(nums, k));
    }
}
