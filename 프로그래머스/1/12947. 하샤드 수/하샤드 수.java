class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num =0;
        int cont =x;
        while(x>0){
            num+=x%10;
            x/=10;
        }
        if(cont%num!=0){
            answer = false;
        }
        return answer;
    }
}