package backjyun.first;

public class LongestCharacterEndingWithASpecificString {
    public String solution(String myString, String pat) {
        String answer = "";
        StringBuilder sb = new StringBuilder(myString);
        int i = sb.lastIndexOf(pat);
        answer = sb.substring(0, i+pat.length());
        return answer;
    }
    public static void main(String[] args) {
        LongestCharacterEndingWithASpecificString ls = new LongestCharacterEndingWithASpecificString();
        System.out.println(ls.solution("AAAAaaaa", "a"));
    }
}
