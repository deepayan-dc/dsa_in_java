package arrays;

import java.util.Scanner;

public class LinearSearch {
    static int linearSearch (int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(linearSearch(nums, k));
    }
}
