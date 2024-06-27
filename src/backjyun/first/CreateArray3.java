package backjyun.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray3 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                list.add(arr[j]);
            }

        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        CreateArray3 obj = new CreateArray3();
        System.out.println(Arrays.toString(obj.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}})));
    }
}
