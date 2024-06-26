package backjyun.first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1, nums2, and merged array
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array

        // Merge nums1 and nums2 from the end to the beginning
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, they need to be copied to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
//        List<Integer> integer1 = new ArrayList<>();
//        for(int i = 0; i < m; i++){
//            integer1.add(nums1[i]);
//        }
//
//        for(int i = 0; i < n; i++){
//            integer1.add(nums2[i]);
//        }
//        integer1.stream().sorted(Comparator.comparingInt(x -> x)).forEach(System.out::print);

    }
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int []nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
    }
}
