function solution(n) {
    let answer = [];
    let i =0;
    let tre =0
    while (n > 0) {
        answer[i] = Math.floor(n % 3);
        n = Math.floor(n / 3);
        i++;
    }
    i=1;
    while (answer.length>0) {
        tre +=i*answer.pop();
        i=i*3;
    }
    return tre;
}