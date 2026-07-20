function solution(n) {
    var answer = [];
  
    let count =n;
    hanoi(n, 1, 3, 2);
  
    function hanoi(count, from, to, temp) {
    if(count===0) return;
    hanoi(count-1,from,temp,to);
    answer.push([from,to]);
    hanoi(count -1,temp,to,from);
}
    return answer;
}