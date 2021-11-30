#include<stdio.h>
int main()
{
    int w, result;
    scanf("%d",&w);
    if(w>=1 && w <= 100 && w % 2 == 0 && w/2 > 1)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }
    return 0;
}