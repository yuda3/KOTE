package backjyun.first;

public class ManipulatingArrays {
    public int[] solution(int[] arr, int[] query){
        String s = "";
        String answer = "";
        for(int a : arr){
            s += String.valueOf(a);
        }
        for (int i = 0; i <query.length; i++) {
               if(i % 2 ==0){
                   answer += s.substring(query[i]+1);
               }else{
                   answer += s.substring(query[i], s.length()-1);
               }
        }
        System.out.println(answer);
        return null;
    }
    public static void main(String[] args) {
        ManipulatingArrays m = new ManipulatingArrays();
        m.solution(new int[]{0,1,2,3,4,5}, new int[]{4,1,2});
    }
}
