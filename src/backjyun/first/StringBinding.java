package backjyun.first;

import java.util.HashMap;
import java.util.Map;

public class StringBinding {
    public int solution(String[] strArr) {
//        // Map to store counts of strings with the same length
//        Map<Integer, Integer> countMap = new HashMap<>();
//
//        // Count strings by their lengths
//        for (String str : strArr) {
//            int len = str.length();
//            countMap.put(len, countMap.getOrDefault(len, 0) + 1);
//        }
//
//        // Find the maximum count
//        int maxGroupSize = 0;
//        for (int count : countMap.values()) {
//            if (count > maxGroupSize) {
//                maxGroupSize = count;
//            }
//        }
//        return maxGroupSize;
        int answer = 0;
        int[] len = new int[31];
        for (String s : strArr) {
            len[s.length()]++;
        }
        for (int j : len) {
            answer = Math.max(answer, j);
        }
        return answer;
    }

    public static void main(String[] args) {
        StringBinding stringBinding = new StringBinding();
        int solution = stringBinding.solution(new String[]{"a", "bc", "d", "efg", "hi"});
        System.out.println(solution);
    }
}
