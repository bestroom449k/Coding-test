function solution(myString) {
    let num =0; 
    let cot=0;
    let answer = [];
    for(let x of myString){
        if(x==="x"){
            answer[cot]=num;
            num=0;
            cot++;
        }else
        num++;
    }
    answer[cot]=num;
    return answer;
}