package LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        r.rotate(new int[] { 1, 2, 3, 4, 5 }, 3);
    }
    
    public void rotate(int[] nums, int k){
        //Brute Force
        /*
        k %= nums.length;
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;

            }
        }
         */
        //Using Extra Array
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
