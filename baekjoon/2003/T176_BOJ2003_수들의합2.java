package test08;

import java.util.Scanner;

public class T176_BOJ2003_수들의합2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int [] data = new int[N + 1];
		
		for (int i = 0; i < N; i++) {
			data[i] = sc.nextInt();
		}
		
		
		int minus = 0;		// 더허다가 M보다 클 경우 앞에서 부터 깍아 내린다
		int plus = 0;		// 추가하는 순서
		int sum = 0;		// 더한 값 
		int ans = 0;		// M이 된 개수
		

		while (plus <= N) {	
			if (sum == M)
				ans++;

			if (sum < M)
				sum += data[plus++];
			else
				sum -= data[minus++];
		}

		System.out.println(ans);

	}

	
	
	
	
	
}
