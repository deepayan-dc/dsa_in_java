package binarySearch;

public class BookAllocation {
    public static int findPages(int[] nums, int m) {
        int low = max(nums), high = sum(nums);
        while (low <= high) {
            int mid = (low + high) / 2;
            if (pages(nums, mid) <= m) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return low;
    }

    public static int max(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int pages(int[] nums, int maxPages) {
        int pages = 0, students = 1;
        for (int i = 0; i < nums.length; i++) {
            if (pages + nums[i] <= maxPages) pages += nums[i];
            else {
                students++;
                pages = nums[i];
            }
        }
        return students;
    }

    public static void main(String[] args) {
        int[] nums = {25, 46, 28, 49, 24};
        int m = 4;
        System.out.println(findPages(nums, m));
    }
}
