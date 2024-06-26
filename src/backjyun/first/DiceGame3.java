package backjyun.first;

import java.util.Arrays;

public class DiceGame3 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        if (dice[0] == dice[3]) {
            return 1111 * dice[0];
        } else if ((dice[0] == dice[2] && dice[3] == dice[1]) || (dice[0] == dice[1] && dice[3] == dice[2])) {
            int p = dice[0];
            int q = dice[3];
            return (10 * p + q) * (10 * p + q);
        } else if (dice[0] == dice[1] && dice[2] == dice[3] && dice[0] != dice[2]) {
            int p = dice[0];
            int q = dice[2];
            return (p + q) * Math.abs(p - q);
        } else if (dice[0] == dice[1] || dice[2] == dice[1] || dice[3] == dice[0]) {
            int p = dice[0];
            int q = dice[2];
            int r = dice[3];
            return q * r;
        } else {
            return dice[0];
        }
    }
    public static void main(String[] args) {
        DiceGame3 sol = new DiceGame3();
        int result = sol.solution(6, 3, 3, 6);
        System.out.println(result); // 예시: 출력은 여기서 13

    }
}

