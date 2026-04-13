package binarySearch;

import java.util.Arrays;

public class FloorAndCeil {
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int low = 0, high = nums.length - 1;
        int[] ans = {-1, -1};
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > x) high = mid - 1;
            else if (nums[mid] <= x) low = mid + 1;
        }
        ans[0] = nums[high];
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= x) high = mid - 1;
            else if (nums[mid] < x) low = mid + 1;
        }
        ans[1] = nums[low];
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 9;
        System.out.println(Arrays.toString(getFloorAndCeil(nums, x)));
    }
}
