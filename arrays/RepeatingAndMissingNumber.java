package arrays;

import java.util.Arrays;

public class RepeatingAndMissingNumber {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int[] hash = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        int[] ans = new int[2];
        for (int i = 1; i < hash.length; i++) {
            if (hash[i] == 2) ans[0] = i;
            if (hash[i] == 0) ans[1] = i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {6, 5, 7, 1, 8, 6, 4, 3, 2};
        System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums)));
    }
}
