#include<stdio.h>
int main()
{

    int a,b,c;
    scanf("%d%d%d",&a,&b,&c);
    printf("Enter the numbers : %d\n");
    if(a<b)
    {
        printf("a is smaller");
    }
    else if(a>b)
    {
        printf("b is smaller");
    }
    else{
        printf("c is larger");
    }
    return 0;

}