package backjyun.first;

public class CountStrings {
    public int solution(String myString, String pat) {
        int count = 0;
        for(int i = 0; i < myString.length(); i++) {
            if(pat.length() + i <= myString.length()){
                String a = myString.substring(i, pat.length()+i);
                System.out.println(a);
                if(a.equals(pat)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountStrings countStrings = new CountStrings();
        countStrings.solution("aaaa", "aa");
    }
}
