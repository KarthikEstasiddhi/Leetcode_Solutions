import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;

        int[] merged = new int[a + b];
        int k = 0;
        for (int i = 0; i < a; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < b; i++) {
            merged[k++] = nums2[i];
        }

        // Sort the merged array.
        Arrays.sort(merged);

        // Calculate the total number of elements in the merged array.
        int total = merged.length;

        if (total % 2 == 1) {
            return (double) merged[total / 2];
        } else {
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}