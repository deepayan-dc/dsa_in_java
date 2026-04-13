package binarySearch;

import java.util.ArrayList;

public class CheckNoOfTimesRotated {
    public static int findKRotation(ArrayList<Integer> nums) {
        int low = 1;
        int high = nums.size() - 2;
        if (nums.size() == 1) return 0;
        if (nums.get(0) > nums.get(1)) return 1;
        if (nums.get(nums.size() - 1) < nums.get(nums.size()-2)) return nums.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums.get(mid) < nums.get(mid + 1) && nums.get(mid) < nums.get(mid - 1)) return mid;
            if (nums.get(mid-1) < nums.get(mid+1)) high = mid - 1;
            else if (nums.get(mid +1) < nums.get(mid - 1)) low = mid + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(0);

        System.out.println(findKRotation(list));
    }
}
