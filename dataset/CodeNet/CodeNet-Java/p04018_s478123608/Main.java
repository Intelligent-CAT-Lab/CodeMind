

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	int[] Zalgo(char[] s) {
		int[] ret = new int[s.length];
		ret[0] = ret.length;
		int i = 1, j = 0;
		while (i < s.length) {
			while (i + j < s.length && s[j] == s[i + j]) {
				j++;
			}
			ret[i] = j;
			if (j == 0) {
				i++;
				continue;
			}
			int k = 1;
			while (i + k < s.length && k + ret[k] < j) {
				ret[i + k] = k;
				k++;
			}
			i += k;
			j -= k;
		}
		return ret;
	}

	char[] reverse(char[] s) {
		char[] ret = new char[s.length];
		for (int i = 0; i < s.length; i++) {
			ret[i] = s[ret.length - 1 - i];
		}
		return ret;
	}

	int[] solver(char[] w) {
		boolean f = true;
		int n = w.length;
		int[] z1 = Z(w);
		int[] z2 = Z(reverse(w));
		if (n == 1) {
			return new int[] { 1, 1 };
		} else {
			if (z1[1] == n - 1) {
				return new int[] { n, 1 };
			} else {
				int tmp = 0;
				for (int d = 2; d * d <= n; d++) {
					if (n % d == 0) {
						if (z1[d] == n - d || z1[n / d] == n - n / d) {
							tmp++;
						}
					}
				}
				if (tmp == 0) {
					return new int[] { 1, 1 };
				}
				boolean[] ok1 = new boolean[n];
				boolean[] ok2 = new boolean[n];
				Arrays.fill(ok1, true);
				Arrays.fill(ok2, true);
				ok1[0] = false;
				ok2[0] = false;
				for (int d = 1; d < n; d++) {
					for (int k = 2; ok2[d] && (k - 1) * d <= z2[d] && k * d < n; k++) {
						ok2[k * d] = false;
					}
					for (int k = 2; ok1[d] && (k - 1) * d <= z1[d] && k * d < n; k++) {
						ok1[k * d] = false;
					}
				}
				int ret = 0;
				for (int i = 1; i < n; i++) {
					if (ok1[i] && ok2[n - i]) {
						ret++;
					}
				}
				return new int[] { 2, ret };
			}
		}
	}

	void run() {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		int[] tmp=solver(ns().toCharArray());
		System.out.println(tmp[0]+"\n"+tmp[1]);
		out.flush();
	}

	void rand() {
		while (true) {
			int n = (1 + (int) (Math.random() * 500000));
			if (n % 8 == 0)
				n = 1;
			int d = (1 + (int) (Math.random() * (500000 / n)));
			char[] c = new char[n * d];
			for (int i = 0; i < n; i++) {
				c[i] = (char) ('a' + (int) (Math.random() * 100) % 26);
				for (int j = 1; j < d; j++) {
					c[i + n * j] = c[i];
				}
			}
			if (n % 7 == 0) {
				Arrays.fill(c, (char) ('a' + (int) (Math.random() * 100) % 26));
			}
			int[] ret1 = solver(c);
			int[] ret2 = correct(c);
			if (ret1[0] != ret2[0] || ret1[1] != ret2[1]) {
				tr(ret1);
				tr(ret2);
				tr(c);
			}
		}
	}

	int[] correct(char[] s) {
		int n = s.length;
		outer: for (int pe = 1; pe < n; pe++) {
			if (n % pe == 0) {
				for (int i = 0, j = pe; j < n; i++, j++) {
					if (s[i] != s[j])
						continue outer;
				}
				if (pe == 1) {
					return new int[] { n, 1 };
				}

				int[] z = Z(s);
				int[] dead = new int[n + 1];
				for (int j = 1; j < n; j++) {
					for (int k = 2 * j; k <= n; k += j) {
						if (k <= j + z[j]) {
							dead[k - 1]++;
						}
					}
				}

				char[] rs = rev(s);
				z = Z(rs);
				for (int j = 1; j < n; j++) {
					for (int k = 2 * j; k <= n; k += j) {
						if (k <= j + z[j]) {
							if (n - 2 - (k - 1) >= 0)
								dead[n - 2 - (k - 1)]++;
						}
					}
				}

				int ct = 0;
				for (int j = 0; j < n - 1; j++) {
					if (dead[j] == 0) {
						ct++;
					}
				}
				return new int[] { 2, ct };
			}
		}
		return new int[] { 1, 1 };
	}

	public static char[] rev(char[] a) {
		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			char c = a[i];
			a[i] = a[j];
			a[j] = c;
		}
		return a;
	}

	public static int[] Z(char[] str) {
		int n = str.length;
		int[] z = new int[n];
		if (n == 0)
			return z;
		z[0] = n;
		int l = 0, r = 0;
		for (int i = 1; i < n; i++) {
			if (i > r) {
				l = r = i;
				while (r < n && str[r - l] == str[r])
					r++;
				z[i] = r - l;
				r--;
			} else {
				if (z[i - l] < r - i + 1) {
					z[i] = z[i - l];
				} else {
					l = i;
					while (r < n && str[r - l] == str[r])
						r++;
					z[i] = r - l;
					r--;
				}
			}
		}

		return z;
	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static char nc() {
		try {
			int b = skip();
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

	static double nd() {
		try {
			return Double.parseDouble(ns());
		} catch (Exception e) {
		}
		return 0;
	}

	static String ns() {
		try {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			if (b == -1)
				return "";
			sb.append((char) b);
			while (true) {
				b = is.read();
				if (b == -1)
					return sb.toString();
				if (b <= ' ')
					return sb.toString();
				sb.append((char) b);
			}
		} catch (IOException e) {
		}
		return "";
	}

	public static char[] ns(int n) {
		char[] buf = new char[n];
		try {
			int b = skip(), p = 0;
			if (b == -1)
				return null;
			buf[p++] = (char) b;
			while (p < n) {
				b = is.read();
				if (b == -1 || b <= ' ')
					break;
				buf[p++] = (char) b;
			}
			return Arrays.copyOf(buf, p);
		} catch (IOException e) {
		}
		return null;
	}

	public static byte[] nse(int n) {
		byte[] buf = new byte[n];
		try {
			int b = skip();
			if (b == -1)
				return null;
			is.read(buf);
			return buf;
		} catch (IOException e) {
		}
		return null;
	}

	static int skip() throws IOException {
		int b;
		while ((b = is.read()) != -1 && !(b >= 33 && b <= 126))
			;
		return b;
	}

	static boolean eof() {
		try {
			is.mark(1000);
			int b = skip();
			is.reset();
			return b == -1;
		} catch (IOException e) {
			return true;
		}
	}

	static int ni() {
		try {
			int num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
