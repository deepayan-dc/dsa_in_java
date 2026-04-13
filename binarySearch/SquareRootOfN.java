package binarySearch;

public class SquareRootOfN {
    public static long floorSqrt(int n) {
        long low = 0, high = n;
        long ans = 0;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            }

            else high = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 8345436;
        System.out.println(floorSqrt(n));
    }
}
