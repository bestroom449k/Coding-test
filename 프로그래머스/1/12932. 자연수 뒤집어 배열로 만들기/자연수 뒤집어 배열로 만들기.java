import java.util.*;
class Solution {
    public int[] solution(long n) {
        int[] answer = new int[(n + "").length()];
        int num =0;
        while(n>0){
            answer[num]+=n%10;
            n/=10;
            num++;
        }
        //Arrays.sort(answer);
        return answer;
    }
}