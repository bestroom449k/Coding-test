   function solution(n) {
    let sat = [];
    let i = 0;
    while (i <= n) {
        sat.push(0);
        i++;
    }

    sat[0] = 1;

    for (let i = 1; i <= n; i++) {
        for (let j = 0; j < i; j++) {
            sat[i] += sat[j] * sat[i - 1 - j];
        }
    }

    return sat[n];
}