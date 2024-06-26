package backjyun.first;

import java.util.*;

public class DeleteArray {
    public int[] solution(int[] arr, int[] delete_list){
        Set<Integer> set = new LinkedHashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        System.out.println(set);
        for (int j : delete_list) {
            set.remove(j);
        }
        return set.stream().mapToInt(i->i).toArray();
    }


    public static void main(String[] args) {
        DeleteArray array = new DeleteArray();
        int [] arr = {110, 66, 439, 785, 1};
        int[] delete_list = {377, 823, 119, 43};

        int[] solution = array.solution(arr, delete_list);
        System.out.println(Arrays.toString(solution));

    }
}
