package strings;

import java.util.HashMap;

public class rough {
    public static int beautySum(String s) {
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int hash[] = new int[26];
            int max = 0, min = 0;
            for (int j = i; j < n; j++) {
                hash[s.charAt(j) - 'a']++;
                max = Math.max(max, hash[s.charAt(j) - 'a']);
                min = Integer.MAX_VALUE;
                for (int freq : hash) {
                    if (freq>0) min = Math.min(min, freq);
                }
                sum += (max - min);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));
    }
}
