package backjyun.first;

public class FindOneNearby {
    public int solution(int[] arr, int idx){
        int answer = 0;
        for (int i = idx; i < arr.length; i++) {
            if(arr[i] == 1){
                answer = i;
            }
        }
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindOneNearby findOneNearby = new FindOneNearby();
        int solution = findOneNearby.solution(new int[]{ 0, 0, 0, 1, },1);
        System.out.println(solution);
    }
}
