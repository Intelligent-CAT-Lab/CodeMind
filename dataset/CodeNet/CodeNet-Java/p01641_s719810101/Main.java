import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Brainf*ck
public class Main {
	Scanner sc = new Scanner(System.in);

	String in;
	String[][] d;

	void run() {
		in = sc.nextLine();
		solve();
	}

	void solve() {
		int n = 256;
		int lb = 33, ub = 126;
		String[] plus = new String[n];
		String[] minus = new String[n];
		plus[0] = minus[0] = "";
		for (int i = 1; i < n; i++) {
			plus[i] = plus[i - 1] + '+';
			minus[i] = minus[i - 1] + '-';
		}
		d = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < j) {
					update(i, j, plus[j - i]);
					update(i, j, minus[256 + i - j]);
				} else if (i > j) {
					update(i, j, minus[i - j]);
					update(i, j, plus[256 + j - i]);
				} else {
					update(i, j, "");
				}
			}
			update(i, 0, ">");
		}
		for (int a = 0; a < n; a++) {
			// +i*j
			for (int j = 1; j < n; j++) {
				for (int i = 1; i < n; i++) {
					// >i...i[<j...j>-]<
					int next = (a + i * j) % 256;
					if (can(a, next, i + j + 7)) {
						update(a, next, ">" + plus[i] + "[<" + plus[j] + ">-]<");
					}
					next = ((a - i * j) % 256 + 256) % 256;
					if (can(a, next, i + j + 7)) {
						update(a, next, ">" + plus[i] + "[<" + minus[j]
								+ ">-]<");
					}
				}
			}
			// *k
			for (int k = 2; k < 20; k++) {
				// [>k...k<-]>
				int next = a * k % 256;
				update(a, next, "[>" + plus[k] + "<-]>");
				next = (-a * k % 256 + 256) % 256;
				update(a, next, "[>" + minus[k] + "<-]>");
			}
			// /k
			for (int k = 2; k < 20; k++) {
				update(a, a / k, minus[a % k] + "[>+<" + minus[k] + "]>");
			}
		}
		int[][] p = new int[n][n], w = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				p[i][j] = i != j ? i : -1;
				w[i][j] = d[i][j].length();
			}
		}
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (w[i][k] + w[k][j] < w[i][j]) {
						w[i][j] = w[i][k] + w[k][j];
						p[i][j] = p[k][j];
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		char from = 0;
		for (char to : in.toCharArray()) {
			LinkedList<String> list = new LinkedList<String>();
			for (int now = to; now != from; now = p[from][now]) {
				list.addFirst(d[p[from][now]][now]);
			}
			for (String s : list) {
				sb.append(s);
			}
			sb.append('.');
			from = to;
		}
		String ans = sb.toString();
		println(ans);
	}

	boolean can(int i, int j, int len) {
		return len < 21 && (d[i][j] == null || len < d[i][j].length());
	}

	void update(int i, int j, String s) {
		if (d[i][j] == null || s.length() < d[i][j].length()) {
			d[i][j] = s;
		}
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}