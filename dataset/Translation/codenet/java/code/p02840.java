import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class p02840 {

	private static final String NO = "No";
	private static final String YES = "Yes";
	InputStream is;
	PrintWriter out;
	String INPUT = "";
	private List<Integer>[] g;

	private static final long MOD = 998244353;
	private static final int INF = Integer.MAX_VALUE;

	void solve() {
		int T = 1;
		for (int i = 0; i < T; i++)
			solve(i);
	}

	void solve(int T) {
		int n = ni();
		int x = ni();
		int d = ni();
		if (d == 0)
			if (x == 0) {
				out.print(1);
				return;
			} else {
				out.print(n + 1);
				return;
			}

		if (x == 0) {
			out.print(1 + n * (n - 1) / 2);
			return;
		}

		Map<Long, List<long[]>> m = new HashMap<Long, List<long[]>>();

		for (long take = 0; take <= n; ++take) {
			long b = take * x;
			long sum = take * (take - 1) / 2L;
			long rsum = (n - take) * take + sum;
			long c = b / d;
			add(m, b % d, new long[] { c + sum, c + rsum });
		}
		long ans = 0L;
		for (Entry<Long, List<long[]>> en : m.entrySet()) {
			List<long[]> v = en.getValue();
			Collections.sort(v, new Comparator<long[]>() {
				public int compare(long[] o1, long[] o2) {
					if (o1[0] == o2[0])
						return Long.signum(o1[1] - o2[1]);
					return Long.signum(o1[0] - o2[0]);
				}
			});
			long l = 0, r = 0;
			boolean f = false;
			for (long p[] : v) {
				if (!f) {
					f = true;
					l = p[0];
					r = p[1];
				} else {
					if (p[0] <= r) {
						r = Math.max(r, p[1]);
					} else {
						ans += r - l + 1;
						l = p[0];
						r = p[1];
					}
				}
			}
			ans += r - l + 1;
		}
		out.println(ans);
	}

	private void add(Map<Long, List<long[]>> m, long k, long[] v) {
		if (!m.containsKey(k))
			m.put(k, new ArrayList<long[]>());
		m.get(k).add(v);
	}

	// a^b
	long power(long a, long b) {
		long x = 1, y = a;
		while (b > 0) {
			if (b % 2 != 0) {
				x = (x * y) % MOD;
			}
			y = (y * y) % MOD;
			b /= 2;
		}
		return x % MOD;
	}

	private long gcd(long a, long b) {
		while (a != 0) {
			long tmp = b % a;
			b = a;
			a = tmp;
		}
		return b;
	}

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception {
		new p02840().run();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;
	private boolean vis[];

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n) {
			if (!(isSpaceChar(b)))
				buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private List<Integer> na2(int n) {
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			a.add(ni());
		return a;
	}

	private int[][] na(int n, int m) {
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = na(m);
		return a;
	}

	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long[] nl(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}

	private long[][] nl(int n, int m) {
		long[][] a = new long[n][];
		for (int i = 0; i < n; i++)
			a[i] = nl(m);
		return a;
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}