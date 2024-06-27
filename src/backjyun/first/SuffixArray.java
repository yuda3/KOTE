package backjyun.first;

import java.util.Arrays;

public class SuffixArray {
    public String[] solution(String my_string){
        String[] answer = new String[my_string.length()];
        int count = 0;
        for (int i = answer.length; i > 0; i--) {
                answer[count++] = my_string.substring(i-1);
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        SuffixArray sa = new SuffixArray();
        System.out.println(Arrays.toString(sa.solution("programmers")));
    }
}
