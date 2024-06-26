package backjyun.first;

import java.util.ArrayList;
import java.util.Collections;

public class ZeroOrFive {
    public static void main(String[] args) {
        int l = 0;
        int r = 20;
        int[] answer = solution(l, r);
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
    private static boolean isOnlyZeroAndFive(int num) {
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
    public static int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num = l; num <= r; num++) {
            if (isOnlyZeroAndFive(num)) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            return new int[] {-1};
        } else {
            Collections.sort(result);
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
