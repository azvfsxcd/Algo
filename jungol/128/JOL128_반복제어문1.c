#include <stdio.h>

int main()
{
    int a = 1;
    int cnt = 0;
    while (a != 0)
    {
        scanf("%d", &a);
        if (a == 0)
        {
            break;
        }
        if (a % 3 != 0 && a % 5 != 0)
        {
            cnt += 1;
        }
    }
    printf("%d", cnt);
}