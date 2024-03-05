import java.util.Arrays;
import java.util.Scanner;

public class p02215 {
	static Scanner sc = new Scanner(System.in);
	static final long MOD = 998244353;

	public static void main(String[] args) {
		int N = sc.nextInt();
		int X = sc.nextInt();
		long[][][] dp = new long[2][512][X + 1];
		for (int i = 0; i <= X; i++) {
			dp[0][i][i] = 1;
		}
		int t = 1;
		for (int i = 1; i < N; i++, t = 1 - t) {
			for (int j = 0; j < 512; j++) {
				Arrays.fill(dp[t][j], 0);
			}
			for (int j = 0; j < 512; j++) {
				long sum = 0;
				for (int k = 0; k <= X; k++) {
					sum += dp[1 - t][j][k];
					dp[t][j ^ k][k] += sum;
					dp[t][j ^ k][k] %= MOD;
				}
			}
		}
		long ans = 0;
		for (int i = 0; i <= X; i++) {
			ans += dp[1 - t][X][i];
		}
		System.out.println(ans % MOD);
	}
}

