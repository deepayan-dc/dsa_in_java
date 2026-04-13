package arrays;

public class SecondLargest {
    static int secondLargestElement (int[] nums) {
        if (nums.length <= 1) return -1;
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
            if (nums[i] > secLargest && nums[i] != largest) {
                secLargest = nums[i];
            }
        }
        if (secLargest == Integer.MIN_VALUE) return -1;
        return secLargest;
    }

    public static void main(String[] args) {
        int[] nums = {7};
        System.out.println(secondLargestElement(nums));
    }
}
