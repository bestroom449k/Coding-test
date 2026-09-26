import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int [2];
        int num =0;
        int maxnum=0;
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(max>=array[i]){
                num++;
            }else{
                num++;
                max=array[i];
                maxnum=num;
            }
        }
        answer[0]=max;
        answer[1]=maxnum;
        return answer;
    }
}