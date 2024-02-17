import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int mod = 1000000007;
		int rn = (int) Math.sqrt(n);
		int[] cnt = new int[rn + 1];
		cnt[1] = n;
		for (int i = 2; i <= rn; i++) {
			cnt[i] = n / i;
			cnt[i - 1] -= cnt[i];
		}
		cnt[rn] -= rn;

		long[][] dp = new long[k + 1][rn + 1];
		for (int j = 1; j <= rn; j++) {
			dp[0][j] = 1;
			dp[1][j] = dp[1][j - 1] + 1;
		}
		for (int i = 2; i <= k; i++) {
			long sum = 0;
			for (int j = rn; j > 0; j--) {
				sum += dp[i - 2][j] * cnt[j];
				sum %= mod;
				dp[i][j] = dp[i - 1][rn] + sum;
				dp[i][j] %= mod;
			}
			for (int j = 1; j <= rn; j++) {
				dp[i][j] += dp[i][j - 1];
				dp[i][j] %= mod;
			}
		}

		long ans = dp[k][rn];
		for (int j = 1; j <= rn; j++) {
			ans += dp[k - 1][j] * cnt[j];
			ans %= mod;
		}
		System.out.println(ans);
	}
}
