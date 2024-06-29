package backjyun.first;

import java.util.Arrays;

public class ThreeSeparators {
    public String[] solution(String myStr) {
        String answer = "";
        for (int i = 0; i < myStr.length(); i++) {
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                answer += " ";
            }else {
                answer += myStr.charAt(i);
            }
        }
        String[] split = answer.trim().split(" ");
        if (split.length==1 && split[0].isEmpty()){
            return new String[]{"EMPTY"};
        }
        return split;
    }

    public static void main(String[] args) {
        ThreeSeparators obj = new ThreeSeparators();
        System.out.println(Arrays.toString(obj.solution("cabab")));
    }
}
