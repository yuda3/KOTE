package backjyun.first;

import java.util.Arrays;

public class SpecialTwoDimensionalArray2 {
    public int solution(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[j][i]){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        SpecialTwoDimensionalArray2 sol = new SpecialTwoDimensionalArray2();
        int solution = sol.solution(new int[][] {{19, 498, 258, 587},{63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}});
        System.out.println(solution);


    }
}
