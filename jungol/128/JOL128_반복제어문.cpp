#include <iostream>

using namespace std;

int main()
{
    int a = 1;
    int cnt = 0;
    while (a != 0)
    {
        cin >> a;
        if (a == 0)
        {
            break;
        }
        if (a % 3 != 0 && a % 5 != 0)
        {
            cnt += 1;
        }
    }
    cout << cnt;
}