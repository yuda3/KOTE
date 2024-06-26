package backjyun.first;

import java.util.Arrays;

public class LengthOfArray {
    public static void main(String[] args) {
        int[] arr =  {49, 12, 100, 276, 33};
        int n = 27;
        for (int i = 0; i < arr.length; i++) {
            if(arr.length % 2 == 0){
                if(i % 2 != 0){
                    arr[i] += n;
                }
            } else {
                if(i % 2 == 0){
                    arr[i] += n;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
