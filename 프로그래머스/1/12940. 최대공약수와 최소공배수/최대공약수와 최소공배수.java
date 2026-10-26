class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int num =0;
        int num2 =0;
        for(int i=m; i>0; i--){
            if(m%i==0){
                if(n%i==0){
                    if(num<i){
                     num=i;
                    }
               
                }
            }
        }
        num2 = n/num * m/num *num;
        answer[0]+=num;
        answer[1]+=num2;
        return answer;
    }
}