package binarySearch;

public class LowerBound {
    public static int lowerBound(int[] nums, int x) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= x) high = mid - 1;
            else if (nums[mid] < x) low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,8,15,19};
        int x = 0;
        System.out.println(lowerBound(nums, x));
    }
}
