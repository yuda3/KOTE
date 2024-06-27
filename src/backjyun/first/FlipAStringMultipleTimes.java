package backjyun.first;

public class FlipAStringMultipleTimes {
    public String solution(String my_string, int[][] queries) {
        String result = "";
        for (int i = 0; i < my_string.length(); i++) {
            result = my_string.charAt(i) + result;
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
