package backjyun.first;

import java.util.Arrays;

class CreateArray2 {
    public static void main(String[] args) {
        String myString = "xabcxdefxghi";

        int[] answer = solution(myString);
    }

    private static int[] solution(String myString) {

        String[] split = myString.split("x");
        for (int i = 0; i < split.length; i++) {
            if(split[i] != "" ){

            }
        }
        System.out.println(Arrays.toString(split));
        return null;
    }
}
