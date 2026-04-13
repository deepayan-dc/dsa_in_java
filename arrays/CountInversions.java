package arrays;

public class CountInversions {
//    public static long numberOfInversions(int[] nums) {                 //brute approach
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) count++;
//            }
//        }
//        return count;
//    }
    static int count = 0;

    public static long numberOfInversions(int[] nums) {                 //optimal approach
        mergeSort(nums, 0, nums.length-1);
        return count;
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        countInversions(arr, low, mid, high);
        merge(arr, low, mid, high);
    }

    static void countInversions(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                i++;
            } else {
                count += (mid - i + 1);
                j++;
            }
        }
    }

    static void merge (int[] arr, int low, int mid, int high) {
        int n = arr.length;
        int[] temp = new int[n];
        int left = low;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i-low];
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 1, 3, 5};
        System.out.println(numberOfInversions(nums));
    }
}
