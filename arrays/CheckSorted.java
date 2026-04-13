package arrays;

import java.util.ArrayList;

public class CheckSorted {
    static boolean isSorted(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.toArray().length; i++) {
            if (nums.get(i) < nums.get(i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(6);
        nums.add(5);
        nums.add(14);
        nums.add(100);
        System.out.println(isSorted(nums));
    }
}
