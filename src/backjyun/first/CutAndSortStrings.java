package backjyun.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CutAndSortStrings {
    public String[] solution(String myString){
        List<String> list = new ArrayList<>();
        String[] split = myString.split("x");
        for(String s : split){
            if(!s.isBlank()){
                list.add(s);
            }
        }
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(split);
        return answer;
    }

    public static void main(String[] args) {
        CutAndSortStrings cs = new CutAndSortStrings();
        String[] a = cs.solution("dxccxbbbsxaaaaxfxx");
        System.out.println(Arrays.toString(a));
    }
}
