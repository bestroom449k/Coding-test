import java.util.*;
class Solution {
    public int solution(int n, int t) {
        int answer= n; 
        int num =0;
        while(num!=t){
            answer*=2;
            num++;
        }
        return answer;
    }
}