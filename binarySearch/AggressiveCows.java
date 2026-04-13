package binarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 1, high = max(nums) - min(nums);
        while (low <= high) {
            int mid = (low + high)/2;
            if (possibleArrangement(nums, k, mid)) low = mid + 1;
            else high = mid - 1;
        }
        return high;
    }

    private static boolean possibleArrangement(int[] nums, int cows, int dist) {
        int cowsPlaced = 1, lastCow = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - lastCow >= dist) {
                cowsPlaced++;
                lastCow = nums[i]; //2 5 7 8 10
            }
        }
        return cowsPlaced >= cows;
    }

    public static int max (int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

    public static int min (int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int cows = 2;
        System.out.println(aggressiveCows(nums, cows));
    }
}
