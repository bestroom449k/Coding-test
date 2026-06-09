#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int num=0;
    if(num1==num2){
        num=1;
    } else num=-1;
    return num;
}