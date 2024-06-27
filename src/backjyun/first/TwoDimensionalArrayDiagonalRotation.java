package backjyun.first;

public class TwoDimensionalArrayDiagonalRotation {
    public int solution(int[][] board, int k) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(i + j <= k){
                    count += board[i][j];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TwoDimensionalArrayDiagonalRotation tr = new TwoDimensionalArrayDiagonalRotation();
        System.out.println(tr.solution(new int[][]{{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}}, 2));
    }
}
