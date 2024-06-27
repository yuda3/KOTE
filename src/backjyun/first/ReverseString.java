package backjyun.first;

import java.util.Arrays;

public class ReverseString {
    public String solution(String my_string, int s, int e) {
        String result = "";
        char temp;
        for (int i = s; i < e; i++) {
            result += my_string.charAt(i);
        }

        return result;
    }
    public static void main(String[] args) {
        ReverseString sol = new ReverseString();
        String progra21Sremm3 = sol.solution("Progra21Sremm3", 6, 12);
        System.out.println(progra21Sremm3);
    }
}
