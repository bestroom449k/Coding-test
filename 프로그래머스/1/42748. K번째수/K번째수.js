function solution(array, commands) {
    let answer = [];
    let min = [];
    for(let i=0; i<commands.length; i++){
        answer = [];
        answer= array.slice(commands[i][0]-1,commands[i][1]);
        min.push(+answer.sort((a, b) => a - b).slice(commands[i][2]-1,commands[i][2]).join());
    }
    return min
}