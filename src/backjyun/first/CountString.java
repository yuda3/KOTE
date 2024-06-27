package backjyun.first;

public class CountString {
    public int[] solution(String myString){
        int[] counts = new int[52];  // 52개의 요소를 가진 배열 생성

        // 문자열을 순회하면서 알파벳 개수를 센다
        for (char ch : myString.toCharArray()) {
            if ('A' <= ch && ch <= 'Z') {
                // 대문자 'A'부터 'Z'까지의 경우
                counts[ch - 'A']++;
            } else if ('a' <= ch && ch <= 'z') {
                // 소문자 'a'부터 'z'까지의 경우
                counts[26 + ch - 'a']++;
            }
        }

        return counts;
    }

    public static void main(String[] args) {
        String my_string = "Hello, World!";
        CountString solution = new CountString();
        int[] result = solution.solution(my_string);

        // 결과 배열 출력
        for (int count : result) {
            System.out.print(count + " ");
        }
        System.out.println();
    }
}
