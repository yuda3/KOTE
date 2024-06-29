package backjyun.first;

public class QRCode {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] charArray = code.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int count;
            count = i % q;
            if(count == r){
                answer += charArray[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        QRCode qr = new QRCode();
        qr.solution(1,0,"programmers");
    }
}
