package backjyun.first;

public class MakeOne {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14,11,12,13,14,15,16,16,21};
        int answer = 0;
        for(int i = 0 ; i < num_list.length; i++){
            int a = num_list[i];
            while(a != 1){
                if(a % 2 == 0 ){
                    a =  a / 2 ;
                    answer++;
                }else if(a % 2 != 0 ){
                    a = (a - 1 ) / 2 ;
                    answer++;
                }
            }
        }
    }
}
