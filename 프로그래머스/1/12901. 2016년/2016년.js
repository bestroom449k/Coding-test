function solution(a, b) {
    const date = new Date(`2016-${a}-${b}`);
    let day = ['SUN','MON','TUE','WED','THU','FRI','SAT'];
    let numDay = date.getDay();
    return day[numDay];
}