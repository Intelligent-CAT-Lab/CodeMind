import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	final long MODULO = 1_000_000_000 + 7;

	void run() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 積み木の総数
		int m = sc.nextInt();// 操作回数
		/*
		 * dp[i][j][k]:=i回目の操作まで終えたとき(k=0ならば左端に到達せずに、k=1ならば左端に訪れて）j番目に到達する経路数
		 */

		long[][][] dp = new long[2][n + 1][2];
		for (int i = 0; i <= n; ++i) {
			if (i != 0)
				dp[0][i][0] = 1;
			else
				dp[0][i][1] = 1;
		}

		for (int i = 0; i < m; ++i) {
			for (int k = 0; k < 2; ++k) {
				for (int j = 0; j <= n; ++j) {

					// 左に移動
					if (j - 1 >= 0) {
						if (j - 1 > 0)
							dp[(i + 1) % 2][j - 1][k] += dp[i % 2][j][k];
						else
							dp[(i + 1) % 2][j - 1][1] += dp[i % 2][j][k];
					}
					// 右に移動
					if (j + 1 <= n) {
						dp[(i + 1) % 2][j + 1][k] += dp[i % 2][j][k];
					}

					// 左を経由して元の位置に移動
					if (j - 1 >= 0) {
						if (j - 1 > 0) {
							dp[(i + 1) % 2][j][k] += dp[i % 2][j][k];
						} else if (j - 1 == 0) {
							dp[(i + 1) % 2][j][1] += dp[i % 2][j][k];
						}
					}

					// 右を経由して元の位置に移動
					if (j + 1 <= n) {
						dp[(i + 1) % 2][j][k] += dp[i % 2][j][k];
					}

				}
			}
			for (int k = 0; k < 2; ++k) {
				for (int j = 0; j <= n; ++j) {
					dp[(i + 1) % 2][j][k] %= MODULO;
				}
			}
			dp[i % 2] = new long[n + 1][2];
		}

		long ans = 0;
		for (int i = 0; i <= n; ++i) {
			ans = (ans + dp[m % 2][i][1]) % MODULO;
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}