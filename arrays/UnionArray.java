package arrays;

import java.util.Arrays;

public class UnionArray {
    public static int[] union (int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0, j = 0;
        int [] unionArray = new int[n1 + n2];
        int k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                unionArray[k] = nums1[i];
                i++;
                k++;
            } else if (nums1[i] > nums2[j]){
                unionArray[k] = nums2[j];
                j++;
                k++;
            } else {
                unionArray[k] = nums1[i];
                i++;
                j++;
                k++;
            }
        }
        while (i < n1) {
            unionArray[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n2) {
            unionArray[k] = nums2[j];
            j++;
            k++;
        }
        return unionArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 7, 7, 9};
        int[] nums2 = {2, 3, 5, 7, 10};
        System.out.println(Arrays.toString(union(nums1, nums2)));
    }
}
