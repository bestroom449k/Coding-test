import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int num1[] = new int [1];
        if(arr.length<=1){
            num1[0]=-1;
            return num1;
        }
           
        int []answer= new int [arr.length -1];
        
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==min){
                continue;
            }
            answer[j++]=arr[i];
        }return answer;
        
    }
}