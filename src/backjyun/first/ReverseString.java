package backjyun.first;

import java.util.Arrays;

public class ReverseString {
    public String solution(String my_string, int s, int e) {
        char temp;
        int count = e;
        char[] charArray = my_string.toCharArray();
        while (s < e) {
            temp = charArray[s];
            charArray[s] = charArray[e];
            charArray[e] = temp;
            s++;
            e--;
        }

        return new String(charArray);
    }
    public static void main(String[] args) {
        ReverseString sol = new ReverseString();
        String progra21Sremm3 = sol.solution("Stanley1yelnatS", 4, 10);
        System.out.println(progra21Sremm3.equals("Stanley1yelnatS"));
    }
}
