class Solution {
    public int[] solution(int money) {
        int[] answer = new int [2];
        int num=0; 
        while(money>=5500){
            num++;
            money-=5500;
        }
        answer[0]+=num;
        answer[1]+=money;
        return answer;
    }
}