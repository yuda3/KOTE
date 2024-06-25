package backjyun.first;

import java.util.Arrays;

public class ReadColumn {
    public static void main(String[] args) {
        String my_string = "programmers";
        int m = 1;
        int c = 1;
        int count = 0;
        String answer = "";
        String[] substring = new String[my_string.length() / m];
        while(!my_string.isEmpty()) {
            substring[count++] = my_string.substring(0, m);
            my_string = my_string.substring(m);
        }
        for (int i = 0; i < substring.length; i++) {
            answer += substring[i].charAt(c-1);
        }
        System.out.println(answer);
    }
}
