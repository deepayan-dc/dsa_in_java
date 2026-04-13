package arrays;

import java.util.HashMap;

public class SubarraysWithXORk {
    public static int subarraysWithXorK(int[] nums, int k) {
//        int count = 0;                                    //brute approach
//        for (int i = 0; i < nums.length; i++) {
//            int xor = 0;
//            for (int j = i; j < nums.length; j++) {
//                xor = xor^nums[j];
//                if (xor == k) count++;
//            }
//        }
//        return count;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int preXOR = 0;
        for (int i = 0; i < nums.length; i++) {
            preXOR ^= nums[i];
            int x = preXOR ^ k;
            count += map.getOrDefault(x, 0);
            map.put(preXOR, map.getOrDefault(preXOR, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subarraysWithXorK(nums, k));
    }
}
