import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        
        Arrays.sort(arr);
        a=arr[0]; b=arr[1]; c=arr[2]; d=arr[3]; //오름차순 배열
        
        return 
        a == d ? a * 1111 : // 전체가 같다
        a == c ?  (10*a+d)*(10*a+d): // a~c(3개) 가지만 같다
        b==d ? (10*b+a)*(10*b+a) : //b~d(3개) 가지만 같다
        a==b&&c==d ? c*c-a*a : //두 개씩 나온 값만같다 
        b==c ? a*d : // 2개만 같다
        a==b ? c*d : // 2개만 같다             
        c==d ? a*b : // 2개만 같다             
        a; // 전부 다르다.
        
        
    }
}