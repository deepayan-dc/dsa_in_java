package binarySearch;

public class PaintersPartition {
    public static int paint(int A, int B, int[] C) {
        int low = max(C)*B, high = sum(C)*B;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (time(C, mid, B) <= A) {
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

    public static int time(int[] nums, int maxTime, int B) {
        int time = 0, painters = 1;
        for (int i = 0; i < nums.length; i++) {
            if (time + nums[i]*B <= maxTime) {
                time += nums[i]*B;
            } else {
                painters++;
                time = nums[i]*B;
            }
        }
        return painters;
    }
    public static void main(String[] args) {
        int[] C = {1, 8, 11, 3};
        int A = 10, B = 1;
        System.out.println(paint(A, B, C));
    }
}
