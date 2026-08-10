class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int num=0; 
        for(int i=0; i<absolutes.length; i++){
            if(signs[num]==true){
                answer+=absolutes[num];
            }else if(signs[num]!=true){
                answer-=absolutes[num];
            }
            num++;
        }
        return answer;
    }
}