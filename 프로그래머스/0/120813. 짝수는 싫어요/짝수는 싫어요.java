class Solution {
    public int[] solution(int n) {
        int cont=0;
        if(n%2==0){
            cont=n/2;
        }else  cont=n/2+1;
        int[] answer = new int[cont];
        int num=0;
        for(int i=0; i<=n; i++){
            if(i%2!=0){
                answer[num]+=i;
                num++;
            }
        }
        return answer;
    }
}