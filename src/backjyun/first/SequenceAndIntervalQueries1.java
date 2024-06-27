package backjyun.first;

import java.util.Arrays;
//TODO
public class SequenceAndIntervalQueries1 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries[0].length; i++) {
            if( queries[i][0]<= arr[i] && queries[i][1] >= arr[i]){
                for(int j=queries[i][0]; j<= queries[i][1]; j++){
                    arr[j] += 1;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        SequenceAndIntervalQueries1 sol = new SequenceAndIntervalQueries1();
        System.out.println(Arrays.toString(sol.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1},{1, 2},{2, 3}})));
    }
}
