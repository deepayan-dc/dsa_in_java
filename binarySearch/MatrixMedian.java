package binarySearch;

public class MatrixMedian {
    public static int findMedian(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = min(matrix);
        int high = max(matrix);
        while (low <= high) {
            int mid = (low + high) / 2;
            int smallerEquals = count(matrix, m, n, mid);
            if (smallerEquals > m*n/2) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    private static int count(int[][] matrix, int m, int n, int mid) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            int low = 0, high = n-1;
            while (low <= high) {
                int middle =  (low + high) / 2;
                if (matrix[i][middle] > mid) high = middle - 1;
                else low = middle + 1;
            }
            count += low;
        }
        return count;
    }

    public static int min (int[][] matrix) {
        int m = matrix.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if( matrix[i][0] < min){
                min = matrix[i][0];
            }
        }
        return min;
    }

    public static int max (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            if (matrix[i][n-1] > max){
                max = matrix[i][n-1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 7, 9, 11},
                {2, 3, 4, 5, 10},
                {9, 10, 12, 14, 16}
        };
        System.out.println(findMedian(matrix));
    }
}
