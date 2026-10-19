class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(numbers, target, 0, 0); // 숫자 배열 , 타켓, 현재 인덱스, 현재 합
        return answer;
    }
    
    
    public void DFS(int[] numbers, int target, int num , int right){
        if(num ==numbers.length){
            if( right==target){
                answer++;
            }
            return; 
        }
        DFS(numbers, target, num + 1, right + numbers[num]);
        DFS(numbers, target, num + 1, right - numbers[num]);
    }

            
}