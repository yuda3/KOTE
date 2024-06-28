package backjyun.first;

import java.util.Arrays;

public class UpdateArrayQueries {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            for(int j = s; j <= e; j++){
                arr[j] += 1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        UpdateArrayQueries updateArrayQueries = new UpdateArrayQueries();
        int[] solution = updateArrayQueries.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}});
        System.out.println(Arrays.toString(solution));

    }
}
