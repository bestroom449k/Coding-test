import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cont=0;
        int ven =0;
        String num = s.toUpperCase();
        System.out.print(num);
       for(int i=0; i<num.length(); i++){
           if(num.charAt(i) == 'P'){
               cont++;
           }
           if(num.charAt(i)=='Y'){
               ven++;
           }
       }
        if(cont!=ven){
            answer = false;
        }

        return answer;
    }
}