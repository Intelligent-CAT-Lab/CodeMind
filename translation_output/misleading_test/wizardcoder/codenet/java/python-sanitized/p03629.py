import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class p03629 {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = False;

	static void solve() {
		char[] a = ir.next().toCharArray();
		int n = a.length;
		int[][][] dp = new int[n + 1][26][2];
		for (int i = 0; i < 26; i++)
			dp[n][i] = new int[] { i, 1 };
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < 26; j++)
				for (int k = 0; k < 2; k++)
					dp[i][j][k] = dp[i + 1][j][k];
			int cur = a[i] - 'a';
			int mi = 2 * n;
			for (int j = 0; j < 26; j++)
				mi = Math.min(mi, dp[i + 1][j][1]);
			for (int j = 0; j < 26; j++) {
				if (dp[i + 1][j][1] == mi) {
					dp[i][cur][0] = j;