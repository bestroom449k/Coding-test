function solution(progresses, speeds) {
    let day = [];
    let answer = [];
    let num =0;
    for(let x of progresses){
        day[num]=100-x;
        num++;
    }
    num =0;
    for(let y of speeds){
        day[num]=Math.ceil(day[num]/y);
        num++;
    }
    num =1;
    let cot =0; 
    let mag = day[0];
    for(let i=1; i<day.length; i++){
        if(mag>=day[i]){
            num++;
        }else {
            answer.push(num);
            mag=day[i];
            num=1;
        }
    }   
    answer.push(num);
    return answer;
    //[7,3,9]  [5,10,1,1,20,1]
}