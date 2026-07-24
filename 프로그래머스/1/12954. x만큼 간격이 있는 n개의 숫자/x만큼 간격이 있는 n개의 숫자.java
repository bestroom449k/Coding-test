import java.util.*;
class Solution {
    public Long[] solution(int x, int n) {
           Long[] answer = new Long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}