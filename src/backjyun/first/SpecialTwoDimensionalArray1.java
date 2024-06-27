package backjyun.first;

import java.util.Arrays;

public class SpecialTwoDimensionalArray1 {
    public int[][] solution(int n){
        int[][] arr = new int[n][n];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i][count++] = 1;
        }
        return arr;
    }
    public static void main(String[] args) {
        SpecialTwoDimensionalArray1 sol = new SpecialTwoDimensionalArray1();
        int[][] solution = sol.solution(3);
        System.out.println(Arrays.toString(solution[0]));
        System.out.println(Arrays.toString(solution[1]));
        System.out.println(Arrays.toString(solution[2]));


    }
}
