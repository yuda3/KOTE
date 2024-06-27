package backjyun.first;

import java.util.Arrays;

public class EraseLetters {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder(my_string);
        for(int i = 0; i < indices.length; i++) {
            if(i == 0) {
                sb.deleteCharAt(indices[i]);
            }else{
                sb.deleteCharAt(indices[i] -i);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        EraseLetters er = new EraseLetters();
        System.out.println(er.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }
}
