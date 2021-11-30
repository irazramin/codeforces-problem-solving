#include<stdio.h>
int main()
{
    unsigned long long int m, n, a, x, y;
    scanf("%llu %llu %llu", &m, &n, &a);
    if(m>a)
    {
        if(m%a == 0)
        {
            x = (m / a);
        }
        else
        {
            x = (m / a) + 1;
        }
    }
    else
    {
        x = 1;
    }

    if(n>a)
    {
        if(n%a == 0)
        {
            y = (n / a);
        }
        else
        {
            y = (n / a) + 1;
        }
    }
    else
    {
        y = 1;
    }
    printf("%llu", (x*y));
}