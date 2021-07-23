import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a = 1;
    int cnt = 0;
    while (a != 0)
    {
        a = sc.nextInt();
        if (a == 0)
            {
                break;
            }
        if (a % 3 != 0 && a % 5 != 0)
            {
                cnt += 1;
            }
    }
    System.out.print(cnt);
    }
}