package hashing;

import java.util.*;

public class CountFrequenciesOfAllArrayElements {
    static void countFrequencies(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(Arrays.asList(nums[i], map.get(nums[i])));
        }
        for (List<Integer> pair : set) {
            list.add(pair);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[]  test = {1, 2, 1, 5, 5, 3, 2, 1};
        countFrequencies(test);
    }
}
