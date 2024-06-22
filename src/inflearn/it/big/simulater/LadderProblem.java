package inflearn.it.big.simulater;

import java.util.Arrays;

public class LadderProblem {
    public char[] solution(int n, int[][] ladder){
        char[] answer = new char[n];
        char c = 65;
        for(int i = 0; i < n; i++){
            answer[i] = c++;
        }
        char temp;
        int count;
        for (int i = 0; i < ladder.length; i++) {
            count = 0;
            for (int j = 0; j < ladder[i].length; j++) {
                temp =answer[ladder[i][j]];
                answer[ladder[i][j]] = answer[ladder[i][j] - 1];
                answer[ladder[i][j]-1] = temp;
            }
        }
//        for(int[] line : ladder){
//            for(int x : line){
//                char tmp = answer[x];
//                answer[x] = answer[x-1];
//                answer[x-1] = tmp;
//            }
//        }
        return answer;
    }

    public static void main(String[] args){
        LadderProblem T = new LadderProblem();
        System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
        System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
        System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
        System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
    }
}

