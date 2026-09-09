class Solution {
    public int solution(int n, int k) {
        int num= n/10;
        int answer = n*12000+(k*2000-num*2000);
        return answer;
    }
}