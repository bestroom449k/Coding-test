function solution(numbers) {
    let box =[];
    for(let i =0; i<numbers.length; i++){
        for(let j =0; j<numbers.length; j++){
            if(i===j){
                continue;
            }
            box.push(numbers[i]*numbers[j])
        } 
    }
    return Math.max(...box);
}