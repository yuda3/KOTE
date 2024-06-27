package backjyun.first;

//TODO
public class SumOfTwoNumbers {
    public String solution(String a, String b) {
        Long l = Long.parseLong(b);
        Long answer = Long.parseLong(a);

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        SumOfTwoNumbers s = new SumOfTwoNumbers();
        System.out.println(s.solution("18446744073709551615","287346502836570928366"));
    }
}
