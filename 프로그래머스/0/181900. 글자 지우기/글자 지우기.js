function solution(my_string, indices) {
    let answer ="";
    let chek = true; 
    for(let num =0; num<my_string.length; num++){
        chek = true;
        for(let x of indices){
            if(num === x){
                chek = false;
            }
        }
        if(chek==true){
            answer+=(my_string.charAt(num));
        } 
    }
    return answer;
}