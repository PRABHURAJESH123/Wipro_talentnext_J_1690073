#include<stdio.h>
void deQueue()
{
    char a,b;
    if(a>b)
    {
        printf("Queue is empty");
    }
    else{
        a++;
        if(a>b)
        {
            a =0;
            b=-1;
        }
    }
}