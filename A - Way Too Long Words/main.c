#include<stdio.h>
int main()
{
    int User,len=0,i=0;
    char a[100];
    scanf("%d",&User);
    for(i=0; i<User; i++)
    {
        scanf("%s",&a);
        len = strlen(a);

        if(len>10 )
        {

            printf("%c",a[0]);
            printf("%d",len-2);
            printf("%c\n",a[len-1]);
        }

        else
        {

            printf("%s\n",a);
        }
    }
    return 0;
}