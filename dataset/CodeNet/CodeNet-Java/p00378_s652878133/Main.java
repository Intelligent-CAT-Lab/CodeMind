import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Heat Strokes
 */
public class Main {

	static int INF = 1 << 29;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int A, B, X;
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = parseInt(st.nextToken());
		B = parseInt(st.nextToken());
		X = parseInt(st.nextToken());

		int[] dp = new int[X + 1000 + 1];
		Arrays.fill(dp, INF);
		dp[0] = 0;

		for (int i = 0; i <= X; i++) {
			if (dp[i + 1000] > dp[i] + A) {
				dp[i + 1000] = dp[i] + A;
			}
		}

		for (int i = 0; i <= X + 500; i++) {
			if (dp[i + 500] > dp[i] + B) {
				dp[i + 500] = dp[i] + B;
			}
		}

		int ans = INF;
		for (int i = X + 1000; i >= X; i--) {
			if (dp[i] < ans) ans = dp[i];
		}

		System.out.println(ans);
	}
}
