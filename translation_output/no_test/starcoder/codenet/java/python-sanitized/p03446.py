import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class p03446 {

	void submit() {
		int a = nextInt();
		int b = nextInt();
		int c = nextInt();
		int d = nextInt();
		int e = nextInt();
		int f = nextInt();

		if (d % a!= 0 || e % b!= 0 || f % c!= 0) {
			out.println(0);
			return;
		}

		int p = d / a;
		int q = e / b;
		int r = f / c;

		int[][] dp = new int[p + 1][q + 1];
		dp[p][q] = 1;

		int ans = 0;

		for (int x = p - 1; x >= 1; x--) {
			for (int y = q - 1; y >= 1; y--) {
				dp[x][y] = (int) ((long) ways[p][x] * ways[q][y] % P
						* pow(c, (p - x) * (q - y)) % P);

				for (int xb = x; xb <= p; xb++) {
					for (int yb = y; yb <= q; yb++) {
						if (xb + yb == x + y) {
							continue;
						}
						dp[x][y] -= (int) ((long) dp[xb][yb] * ways[xb][x] % P
								* ways[yb][y] % P);
						if (dp