import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int[] num =new int[right-left+1];
        int answer = 0;
        int cont =0;
        for(int i=left; i<=right; i++){
             
           for(int j=1; j<=i; j++){
              
            if(i%j==0){
                num[cont]++;
            }
        
           } 
            if(num[cont]%2==0){
                answer+=i;
            }else if(num[cont]%2==1){
                answer-=i;
            }
            cont+=1;
        }
        return answer;
    }
}