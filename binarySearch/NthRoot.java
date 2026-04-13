package binarySearch;

public class NthRoot {
    public static long nthRoot(int n, int m) {
        long low = 0, high = m;
        long ans = -1;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (Math.pow(mid, n) == m) {
                return mid;
            }
            else if (Math.pow(mid, n) < m) low = mid + 1;

            else high = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 243;
        System.out.println(nthRoot(n, m));
    }
}
