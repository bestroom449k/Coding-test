function solution(array) {
     let count = {};

    for (let num of array) {
        count[num] = (count[num] || 0) + 1;
    }

    let max = 0;
    let answer = -1;
    let inon = false;

    for (let key in count) {
        if (count[key] > max) {
            max = count[key];
            answer = Number(key);
            inon = false;
        } else if (count[key] === max) {
            inon = true;
        }
    }

    return inon ? -1 : answer;
}