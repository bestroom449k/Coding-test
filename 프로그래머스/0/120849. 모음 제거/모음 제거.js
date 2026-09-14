function solution(my_string) {
    let num = 0;
    let value = ['a','e','i','o','u'];

  const mide = (war) => { 
    if (num === 5) return war;
    let answer = war.split(value[num]).join(""); 
    num++;
    return mide(answer);
  };

    //console.log(mide(my_string));
    return mide(my_string);
}