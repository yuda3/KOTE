package backjyun.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < intStrs.length; i++) {
            String substring = intStrs[i].substring(s, s + l);
            if(Integer.parseInt(substring) > k) {
                list.add(Integer.parseInt(substring));
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        CreateArray5 sol = new CreateArray5();
        System.out.println(Arrays.toString(sol.solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5)));
    }
}
