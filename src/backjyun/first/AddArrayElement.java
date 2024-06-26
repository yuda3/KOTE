package backjyun.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AddArrayElement {
    public static void main(String[] args) {
        int[] arr = {1};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(array));
    }
}
