import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
		int max = 0, min = 1000002;
        int n= sc.nextInt();
    
        int arr[] = new int[n];
    
        for (int i = 0; i < n; i++)
        {
            arr[i]= sc.nextInt();
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
    
        System.out.print(min +" " + max);
    }
}