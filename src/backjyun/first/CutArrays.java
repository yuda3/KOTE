package backjyun.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutArrays {

    public int[] kSolution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<Integer>();
        int start = 0;
        int end = 0;
        int mid = start;
        if(n == 1){

            end = slicer[1];
        }else if(n == 2){
            start = slicer[0];
            end = num_list.length;
        }else if(n == 3){
            start = slicer[0];
            end = slicer[1];
        }else if(n == 4){
            start = slicer[0];
            end = slicer[1];
        }
        for(int i = start; i <= end;){
            list.add(num_list[i]);
            if(n == 4){
                i += slicer[2];
            }else{
                i++;
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        CutArrays obj = new CutArrays();
        int[] ints = obj.kSolution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(Arrays.toString(ints));

    }
}
