#include <stdio.h>

int main()
{
    int n = 0, max = 0, min = 1000002;
    scanf("%d", &n);

    int arr[n];

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
        if (i == 0)
        {
            max = arr[0];
            min = arr[0];
        }
        if (arr[i] >= max)
        {
            max = arr[i];
        }
        if (arr[i] <= min)
        {
            min = arr[i];
        }
    }

    printf("%d %d", min, max);
}