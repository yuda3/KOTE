package backjyun.first;

import java.util.ArrayList;
import java.util.List;

public class CreateArray4 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3,5,6,7,8,9,10,1,2,6,5,1,2,3,6,8,6,4,3,56,123,6};
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
            }else if(list.get(list.size()-1) < arr[i]){
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size()-1) > arr[i]) {
                list.remove(list.size()-1);
            }else {
                i++;
            }
        }
        int[] stk = list.stream().mapToInt(Integer::intValue).toArray();
    }
}
