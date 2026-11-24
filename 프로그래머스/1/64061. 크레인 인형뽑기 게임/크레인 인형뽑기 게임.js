function solution(board, moves) {
    let count = 0;
    let stack = [];
        for (let pos of moves) {
          //console.log(pos);
            for (let i = 0; i < board.length; i++) {
                if (board[i][pos - 1] !== 0) {
                    
                    let temp = board[i][pos - 1];
                    
                    board[i][pos - 1] = 0;
                    
                        if (temp === stack[stack.length - 1]) {
                            
                            stack.pop();
                            count += 2;
                        } else {
                        stack.push(temp);
                        }
                break;
                }
          }
        }
        console.log(stack);
        return count;
}