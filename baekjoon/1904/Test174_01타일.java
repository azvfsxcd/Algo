import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[1000003];
		dp[1]=1;
		dp[2]=2;
		for(int i = 3; i<=1000002; i++) {
			dp[i]=(dp[i-1]+dp[i-2])%15746;
		}
		
		System.out.println(dp[N]);
	}
}
