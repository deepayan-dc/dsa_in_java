package binarySearch;

public class CountOccurrences {
    public static int countOccurrences(int[] arr, int target) {
        int first = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            } else low = mid + 1;
        }
        int last = -1;
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return last - (first - 1);
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 3};
        int target = 1;
        System.out.println(countOccurrences(arr, target));
    }
}
