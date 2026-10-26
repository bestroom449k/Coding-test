import java.util.*;
class Solution {

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;

        // **answer가 배열 길이를 넘지 않도록**
        while (answer < d.length && budget > 0){
            budget-=d[answer];
            answer++;
        }
        
        return budget<0 ? answer-=1 : answer; 
    }
}