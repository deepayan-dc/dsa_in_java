package binarySearch;

public class kthElement {
    public static int kthElement(int[] a, int[] b, int k) {
        int m = a.length;
        int n = b.length;
        int[] c = new int[m + n];
        int i = 0, j = 0;
        int p = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                c[p++] = a[i++];
            } else {
                c[p++] = b[j++];
            }
        }
        while (i < m) {
            c[p++] = a[i++];
        }
        while (j < n) {
            c[p++] = b[j++];
        }
        return c[k-1];
    }

    public static int kthElementOptimal(int[] a, int[] b, int k) {
        int m = a.length;
        int n = b.length;
        //int low = Math.max(0, k-n), high = Math.min(k, n);
        int low = 0, high = m;
        while (low <= high) {
            int cut1 = low + (high - low) / 2;
            int cut2 = k - cut1;
            int left1 = cut1 == 0 ? Integer.MIN_VALUE : a[cut1-1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : b[cut2-1];
            int right1 = cut1 == m ? Integer.MAX_VALUE : a[cut1];
            int right2 = cut2 == n ? Integer.MAX_VALUE : b[cut2];
            if (left1 <= right2 && left2 <= right1) {
                return Math.max(left1, left2);
            } else if (left1 > right2) high = cut1 - 1;
            else low = cut1 + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] b = {2, 3, 4, 6, 7, 8, 9, 10};
        int[] a = {1};
        int k = 8;
        System.out.println(kthElementOptimal(a, b, k));
    }
}
