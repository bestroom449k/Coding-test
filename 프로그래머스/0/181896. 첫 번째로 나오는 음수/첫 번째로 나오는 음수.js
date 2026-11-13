function solution(num_list) {
    let num =0; 
    for(let x of num_list){
      if(x<0){
        break;
      }
        num++;
    }
     return num===num_list.length? -1 : num;
}