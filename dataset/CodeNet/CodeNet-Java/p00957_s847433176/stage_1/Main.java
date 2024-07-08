import java.util.Scanner;

public class Main {
	static final int MAX_L = 100;
	void run() {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int k = scan.nextInt();
		long[] dp = new long[MAX_L + 1];
		dp[0] = dp[1] = 1;
		for (int i = 2; i < l; i++) {
			long num = i - k - 1 < 0 ? 0 : dp[i-k-1];
			dp[i] = dp[i - 2] + num + 1;
		}
		dp[l] = dp[l - 1] + (l >= k ? dp[l - k]:0);
		System.out.println(dp[l]);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

