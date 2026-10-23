function solution(arr)
{
    let answer = [];
    let num =0;
    let chek =10; 
   
    for(let x of arr){
        answer.push(x);
        if(x==chek){
            answer.pop();
        }
        chek=x;  
      
    }
    return answer;
}