class Solution {
    public int solution(int[] arr) {
        int answer = arr[arr.length - 1]; 
        
        for (int j = arr.length - 2; j >= 0; j--) {
            int num = answer; 
            
            while (true) {
                if (answer % arr[j] == 0) {
                    break;
                }
                answer += num; 
            }
        }
        
        return answer;
    }
}