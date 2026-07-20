function solution(n, w, num) {
    let box = [];
    let count = 1;
    let left = true;

  
    while (count <= n) {
        let row = new Array(w).fill(null);

        if (left) {
           
            for (let i = 0; i < w && count <= n; i++) {
                row[i] = count;
                count++;
            }
        } else {
          
            for (let i = w - 1; i >= 0 && count <= n; i--) {
                row[i] = count;
                count++;
            }
        }

        box.push(row);
        left = !left;
    }


    let Nextrow = 0;
    let NextCol = 0;

    for (let i = 0; i < box.length; i++) {
        for (let j = 0; j < w; j++) {
            if (box[i][j] === num) {
                Nextrow = i;
                NextCol = j;
            }
        }
    }

  
    let answer = 0;

    for (let i = Nextrow; i < box.length; i++) {
        if (box[i][NextCol] !== null) {
            answer++;
        }
    }

    return answer;
}