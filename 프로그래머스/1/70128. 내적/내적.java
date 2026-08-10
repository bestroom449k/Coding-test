class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int num =0; 
        for(int i=0; i<a.length; i++){
            answer+=a[num]*b[num];
            num++;
        }
        return answer;
    }
}