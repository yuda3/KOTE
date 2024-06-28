package backjyun.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoArray {

    public static void main(String[] args) {
        TwoArray twoArray = new TwoArray();
        System.out.println(Arrays.toString(twoArray.kSolution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})));
    }

    public int[] kSolution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int a = 0;
        boolean flag = true;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 2){
                count ++;
            }
            if(count == 1 && flag){
                a = i;
                flag = false;
            }
        }
        if(count == 0){
            return new int[]{-1};
        }
        for(int i = a ; i < arr.length; i++){
            list.add(arr[i]);
            if(arr[i] == 2){
                count--;
                if(count == 0){
                    break;
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public int[] gSolution(int[] arr) {
        int firstTwoIndex = -1;
        int lastTwoIndex = -1;

        // Find the first and last occurrence of 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstTwoIndex == -1) {
                    firstTwoIndex = i;
                }
                lastTwoIndex = i;
            }
        }
        // If there are no 2s in the array, return [-1]
        if (firstTwoIndex == -1) {
            return new int[]{-1};
        }
        // Create the subarray from firstTwoIndex to lastTwoIndex
        int[] result = new int[lastTwoIndex - firstTwoIndex + 1];
        for (int i = firstTwoIndex; i <= lastTwoIndex; i++) {
            result[i - firstTwoIndex] = arr[i];
        }
        return result;
    }
}
