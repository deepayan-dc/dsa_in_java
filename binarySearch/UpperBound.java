package binarySearch;

public class UpperBound {
    public static int upperBound(int[] nums, int x) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > x) high = mid - 1;
            else if (nums[mid] <= x) low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        int x = 1;
        System.out.println(upperBound(nums, x));
    }
}
