import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;

	String s;

	void run() {
		s = sc.nextLine();
System.out.println("[INST]17;s;sc.nextLine();"+s);
		solve();
	}

	void solve() {
		int n = s.length();
System.out.println("[INST]22;n;s.length();"+n);
		int[] count = new int[2 * n + 1];
		int now = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') {
System.out.println("[INST]26;None;s.charAt(i);"+s.charAt(i));
				now++;
			} else {
				now--;
			}
			count[now + n]++;
		}
		// debug(count);
		now = 0;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') {
System.out.println("[INST]37;None;s.charAt(i);"+s.charAt(i));
				now++;
			} else {
				now--;
			}
			count[now + n]--;
			// debug(now, count[now + n]);
			ans += count[now + n];
		}
		println(ans + "");
	}

	void println(String s) {
		System.out.println(s);
	}

	void print(String s) {
		System.out.print(s);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}