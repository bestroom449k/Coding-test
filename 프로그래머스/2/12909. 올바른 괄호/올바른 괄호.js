function solution(s) {
    let stack = [];
    for (let x of s) {
        if (x === '(') {
            stack.push(x);
        } else if (x === ')') {
            if (stack.length === 0) {
                return false;
            }
            stack.pop(); 
        }
    }
    return stack.length === 0;
}