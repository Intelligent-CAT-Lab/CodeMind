import java.util.*;

public class Main {
	final static long MODULO = 1_000_000_000 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[][][] dp = new long[2][N + 2][N + 2];// [何日目][1を含む連結成分のサイズ][全体の訪れた町のサイズ]
		dp[0][1][1] = 1;
		for (int i = 0; i + 1 <= M; ++i) {
			dp[(i + 1) % 2] = new long[N + 2][N + 2];
			for (int j = 0; j <= N; ++j) {
				for (int k = j; k <= N; ++k) {
					dp[(i + 1) % 2][j][k] += dp[i % 2][j][k] * (k - j);
					dp[(i + 1) % 2][j][k] %= MODULO;
					dp[(i + 1) % 2][k][k] += dp[i % 2][j][k] * j;
					dp[(i + 1) % 2][k][k] %= MODULO;
					dp[(i + 1) % 2][j][k + 1] += dp[i % 2][j][k] * (N - k);
					dp[(i + 1) % 2][j][k + 1] %= MODULO;
				}
			}
		}
		System.out.println(dp[M % 2][N][N]);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
