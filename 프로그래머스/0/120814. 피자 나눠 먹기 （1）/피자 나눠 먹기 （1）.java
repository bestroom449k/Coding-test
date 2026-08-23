class Solution {
    public int solution(int n) {
        int num=1;
        while(true){
            if(n-8<0){
                break;
            }n-=7;
            num++;
        }
        return num;
    }
}