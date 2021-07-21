package test07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T169_BOJ10972_다음순열 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if(N==1) {
			System.out.println(-1);
			System.exit(0);
		}
		boolean[] visited = new boolean[N + 2];

		boolean f = false;

		for (int i = 1; i < N - 1; i++) {
			visited[arr[N-i]]=true;
			if (arr[N - i] > arr[N - i - 1] && f==false) {
				int test = arr[N-i-1];
				visited[arr[N-i]]=true;
				visited[arr[N-i-1]]=true;
				for(int k =1;k<=N;k++) {
					if(visited[k]&&k>arr[N-i-1]) {
						arr[N-i-1]=k;
						visited[k]=false;
						break;
					}
				}
//				visited[test]=true;
//				arr[N-i-1] = arr[N-i];
				for(int j=N-i;j<N;j++) {
					for(int k =1;k<=N;k++) {
						if(visited[k]) {
							arr[j]=k;
							visited[k]=false;
							break;
						}
					}
					f=true;
				}
				
			}
		}

		int j = N - 1;
		if (arr[N - j] > arr[N - j - 1] && f == false) {
			arr[0] = arr[N - j];
			for (int i = 1; i < N; i++) {
				arr[i] = i;
			}
			f = true;
		}

		if (f) {
			for (int i = 0; i < N; i++) {
				System.out.print(arr[i]);
				if (i != N - 1) {
					System.out.print(" ");
				}
			}
		} else {
			System.out.println(-1);
		}


	}
}
