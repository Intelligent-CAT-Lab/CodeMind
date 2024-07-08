import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String A = sc.next();
		String B = sc.next();
		int N = A.length();
		int[] as = new int[N];
		int[] bs = new int[N];
		for (int i = 0; i < N; ++i) {
var newVariable_0 = A.charAt(i);			as[i] = newVariable_0 - '0';
		}
var newVariable_1 = B.length();		for (int i = 0; i < newVariable_1; ++i) {
var newVariable_2 = B.length();var newVariable_3 = B.charAt(i);			bs[N - B.length() + i] = newVariable_3 - '0';
		}
		int K = sc.nextInt();
		int[][][] dp = new int[N + 1][K + 1][2];
		for (int[][] aa : dp) {
			for (int[] a : aa) {
				Arrays.fill(a, Integer.MIN_VALUE);
			}
		}
		int base = 1;
		dp[0][0][0] = 0;
		for (int i = 1; i <= N; ++i, base *= 10) {
			if (as[N - i] >= bs[N - i]) {
				for (int j = 0; j <= K; ++j) {
var newVariable_4 = Math.max(dp[i][j][0], dp[i - 1][j][0] + base * (as[N - i] - bs[N - i]));					dp[i][j][0] = newVariable_4;
				}
			} else {
				for (int j = 0; j <= K; ++j) {
var newVariable_5 = Math.max(dp[i][j][1], dp[i - 1][j][0] + base * (10 + as[N - i] - bs[N - i]));					dp[i][j][1] = newVariable_5;
					if (j != 0) {
var newVariable_6 = Math.max(dp[i][j][0], dp[i - 1][j - 1][0] + base * (10 + as[N - i] - bs[N - i]));						dp[i][j][0] = newVariable_6;
					}
				}
			}
			if (as[N - i] - 1 >= bs[N - i]) {
				for (int j = 0; j <= K; ++j) {
var newVariable_7 = Math.max(dp[i][j][0], dp[i - 1][j][1] + base * (as[N - i] - 1 - bs[N - i]));					dp[i][j][0] = newVariable_7;
				}
			} else {
				for (int j = 0; j <= K; ++j) {
var newVariable_8 = Math.max(dp[i][j][1], dp[i - 1][j][1] + base * (10 + as[N - i] - 1 - bs[N - i]));					dp[i][j][1] = newVariable_8;
					if (j != 0) {
var newVariable_9 = Math.max(dp[i][j][0], dp[i - 1][j - 1][1] + base * (10 + as[N - i] - 1 - bs[N - i]));						dp[i][j][0] = newVariable_9;
					}
				}
			}
		}
		int ans = 0;
		for (int i = 0; i <= K; ++i) {
			ans = Math.max(ans, dp[N][i][0]);
			ans = Math.max(ans, dp[N][i][1]);
		}
		System.out.println(ans);
	}
}