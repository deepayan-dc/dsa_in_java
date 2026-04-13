package arrays;

public class MaximumSubarrayWithSum0 {
    public static int maxLen(int[] arr) {
        int i = 0, j = 0;
        int sum = 0;
        int max = 0;
        while (j < arr.length) {
            sum = sum + arr[j];

            while (sum > 0) {
                sum = sum - arr[i];
                i++;
            }

            if (sum == 0) {
                max = Math.max( max, j - i + 1);
            }

            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 10, 4};
        System.out.println(maxLen(arr));
    }
}
