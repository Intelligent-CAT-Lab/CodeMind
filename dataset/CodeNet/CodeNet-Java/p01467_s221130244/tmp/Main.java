import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String A = sc.next();
System.out.println("[INST]8;A;sc.next();"+A);
		String B = sc.next();
System.out.println("[INST]9;B;sc.next();"+B);
		int N = A.length();
System.out.println("[INST]10;N;A.length();"+N);
		int[] as = new int[N];
		int[] bs = new int[N];
		for (int i = 0; i < N; ++i) {
			as[i] = A.charAt(i) - '0';
System.out.println("[INST]14;None;A.charAt(i);"+A.charAt(i));
		}
		for (int i = 0; i < B.length(); ++i) {
System.out.println("[INST]16;None;B.length();"+B.length());
			bs[N - B.length() + i] = B.charAt(i) - '0';
System.out.println("[INST]17;None;B.length();"+B.length());
System.out.println("[INST]17;None;B.charAt(i);"+B.charAt(i));
		}
		int K = sc.nextInt();
System.out.println("[INST]19;K;sc.nextInt();"+K);
		int[][][] dp = new int[N + 1][K + 1][2];
		for (int[][] aa : dp) {
			for (int[] a : aa) {
				Arrays.fill(a, Integer.MIN_VALUE);
System.out.println("[INST]23;None;Arrays.fill(a, Integer.MIN_VALUE);"+Arrays.fill(a, Integer.MIN_VALUE));
			}
		}
		int base = 1;
		dp[0][0][0] = 0;
		for (int i = 1; i <= N; ++i, base *= 10) {
			if (as[N - i] >= bs[N - i]) {
				for (int j = 0; j <= K; ++j) {
					dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][0] + base * (as[N - i] - bs[N - i]));
System.out.println("[INST]31;None;Math.max(dp[i][j][0], dp[i - 1][j][0] + base * (as[N - i] - bs[N - i]));"+Math.max(dp[i][j][0], dp[i - 1][j][0] + base * (as[N - i] - bs[N - i])));
				}
			} else {
				for (int j = 0; j <= K; ++j) {
					dp[i][j][1] = Math.max(dp[i][j][1], dp[i - 1][j][0] + base * (10 + as[N - i] - bs[N - i]));
System.out.println("[INST]35;None;Math.max(dp[i][j][1], dp[i - 1][j][0] + base * (10 + as[N - i] - bs[N - i]));"+Math.max(dp[i][j][1], dp[i - 1][j][0] + base * (10 + as[N - i] - bs[N - i])));
					if (j != 0) {
						dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j - 1][0] + base * (10 + as[N - i] - bs[N - i]));
System.out.println("[INST]37;None;Math.max(dp[i][j][0], dp[i - 1][j - 1][0] + base * (10 + as[N - i] - bs[N - i]));"+Math.max(dp[i][j][0], dp[i - 1][j - 1][0] + base * (10 + as[N - i] - bs[N - i])));
					}
				}
			}
			if (as[N - i] - 1 >= bs[N - i]) {
				for (int j = 0; j <= K; ++j) {
					dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][1] + base * (as[N - i] - 1 - bs[N - i]));
System.out.println("[INST]43;None;Math.max(dp[i][j][0], dp[i - 1][j][1] + base * (as[N - i] - 1 - bs[N - i]));"+Math.max(dp[i][j][0], dp[i - 1][j][1] + base * (as[N - i] - 1 - bs[N - i])));
				}
			} else {
				for (int j = 0; j <= K; ++j) {
					dp[i][j][1] = Math.max(dp[i][j][1], dp[i - 1][j][1] + base * (10 + as[N - i] - 1 - bs[N - i]));
System.out.println("[INST]47;None;Math.max(dp[i][j][1], dp[i - 1][j][1] + base * (10 + as[N - i] - 1 - bs[N - i]));"+Math.max(dp[i][j][1], dp[i - 1][j][1] + base * (10 + as[N - i] - 1 - bs[N - i])));
					if (j != 0) {
						dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j - 1][1] + base * (10 + as[N - i] - 1 - bs[N - i]));
System.out.println("[INST]49;None;Math.max(dp[i][j][0], dp[i - 1][j - 1][1] + base * (10 + as[N - i] - 1 - bs[N - i]));"+Math.max(dp[i][j][0], dp[i - 1][j - 1][1] + base * (10 + as[N - i] - 1 - bs[N - i])));
					}
				}
			}
		}
		int ans = 0;
		for (int i = 0; i <= K; ++i) {
			ans = Math.max(ans, dp[N][i][0]);
System.out.println("[INST]56;ans;Math.max(ans, dp[N][i][0]);"+ans);
			ans = Math.max(ans, dp[N][i][1]);
System.out.println("[INST]57;ans;Math.max(ans, dp[N][i][1]);"+ans);
		}
		System.out.println(ans);
	}
}