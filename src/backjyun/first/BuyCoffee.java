package backjyun.first;

public class BuyCoffee {
    public int solution(String[] order) {
        int answer = 0;
        for (String s : order) {
            if (s.equals("anything")) {
                answer += 4500;
            }
            if (s.equals("iceamericano") || s.equals("americanoice") ||
                    s.equals("hotamericano") || s.equals("americanohot") || s.equals("americano")) {
                answer += 4500;
            }
            if (s.equals("icecafelatte") || s.equals("cafelatteice") ||
                    s.equals("hotcafelatte") || s.equals("cafelattehot") || s.equals("cafelatte")) {
                answer += 5000;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        BuyCoffee b = new BuyCoffee();
        System.out.println(b.solution(new String[]{"americanoice", "americano", "iceamericano"}));
    }
}
