package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeaderArray {
    public static List<Integer> leaders(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            boolean isLeader = true;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) list.add(nums[i]);
        }
        list.add(nums[nums.length-1]);
        return list;
    }

    public static List<Integer> leadersOptimal(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = nums.length-1; i >= 0 ; i--) {
            if (nums[i] > max) {
                list.add(nums[i]);
                max = nums[i];
            }
        }
        return list.reversed();
    }

    public static void main(String[] args) {
        int[] nums = {-3, 4, 5, 1, -4, -5};
        System.out.println(leadersOptimal(nums));
    }
}
