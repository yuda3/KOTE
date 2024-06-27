package backjyun.first;

import java.util.Arrays;
//TODO
public class DiceGame3 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        // Case 1: 네 주사위 숫자가 모두 같은 경우
        if (dice[0] == dice[3]) {
            return 1111 * dice[0];
        }else if ((dice[0] == dice[2] && dice[3] != dice[2]) ||
                (dice[1] == dice[3] && dice[0] != dice[1])) {
            int p = 0, q = 0;
            if (dice[0] == dice[2]) {
                p = dice[0];
                q = dice[3];
            } else {
                p = dice[1];
                q = dice[0];
            }
            return (10 * p + q) * (10 * p + q);
        }else if((dice[0] == dice[1] && dice[2] == dice[3] && dice[0] != dice[2])) {
            int p = dice[0];
            int q = dice[2];
            return (p + q) * Math.abs(p - q);
        }else if (dice[0] == dice[1] || dice[2] == dice[3]){
            int p = dice[2];
            int q = dice[3];
            return p * q;
        }
        // Case 4: 모든 숫자가 다른 경우
        return dice[0];
    }
    public static void main(String[] args) {
        DiceGame3 sol = new DiceGame3();
        int result = sol.solution(2, 5, 2, 6);
        System.out.println(result); // 예시: 출력은 여기서 13

    }
}

