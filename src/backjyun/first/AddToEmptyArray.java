package backjyun.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToEmptyArray {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            }else{
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size()-1);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        AddToEmptyArray sol = new AddToEmptyArray();
        System.out.println(Arrays.toString(sol.solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false})));
    }
}
