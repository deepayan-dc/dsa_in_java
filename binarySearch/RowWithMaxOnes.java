package binarySearch;

public class RowWithMaxOnes {
    public static int rowWithMax1s(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int maxCount = 0;
        int row = -1;
        for (int i = 0; i < m; i++) {
            int count = 0;
            int low = 0, high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mat[i][mid] > 0) high = mid - 1;
                else low = mid + 1;
            }
            count += n - low;
            if (count > maxCount) {
                maxCount = count;
                row = i;
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0, 0, 1},
                {0, 1, 1},
                {0, 1, 1}
        };
        System.out.println(rowWithMax1s(mat));
    }
}
