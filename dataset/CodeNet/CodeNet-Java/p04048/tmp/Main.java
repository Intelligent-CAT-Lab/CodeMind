import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	static void solver() {
		long n = nl();
		long x = nl();
		long sum = 0;
		if (x == n - x) {
			sum = 3 * x;
			System.out.println(sum);
			return;
		} else {
			if (x > n - x) {
				sum += x + n - x;
				sum += calc(x, n - x, false);
			} else if (x < n - x) {
				sum += x + n - x;
				sum += calc(x, n - x, false);
			}
			System.out.println(sum);
			return;
		}

	}

	static long calc(long x, long y, boolean first) {
		long sum = 0;
		if (x % y == 0) {
			if (first)
				sum += y;
			sum += (x / y * 2 - 1) * y;
			return sum;
		} else {
			if (first)
				sum += y;
			sum += (x / y * 2) * y;
			sum += calc(y, x % y, false);
			return sum;
		}
	}

	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]50;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]50;None;INPUT.getBytes();"+INPUT.getBytes());
		out = new PrintWriter(System.out);

		solver();
		out.flush();
System.out.println("[INST]54;None;out.flush();"+out.flush());
	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
System.out.println("[INST]61;num;is.read();"+num);
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
System.out.println("[INST]71;b;is.read();"+b);
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
System.out.println("[INST]110;b;is.read();"+b);
				if (b == -1)
					return sb.toString();
System.out.println("[INST]112;None;sb.toString();"+sb.toString());
				if (b <= ' ')
					return sb.toString();
System.out.println("[INST]114;None;sb.toString();"+sb.toString());
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
System.out.println("[INST]130;b;is.read();"+b);
				if (b == -1 || b <= ' ')
					break;
				buf[p++] = (char) b;
			}
			return Arrays.copyOf(buf, p);
System.out.println("[INST]135;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
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
System.out.println("[INST]147;None;is.read(buf);"+is.read(buf));
			return buf;
		} catch (IOException e) {
		}
		return null;
	}

	static int skip() throws IOException {
		int b;
		while ((b = is.read()) != -1 && !(b >= 33 && b <= 126))
System.out.println("[INST]156;b;is.read();"+b);
			;
		return b;
	}

	static boolean eof() {
		try {
			is.mark(1000);
System.out.println("[INST]163;None;is.mark(1000);"+is.mark(1000));
			int b = skip();
			is.reset();
System.out.println("[INST]165;None;is.reset();"+is.reset());
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
System.out.println("[INST]176;num;is.read();"+num);
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
System.out.println("[INST]186;b;is.read();"+b);
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
		if (INPUT.length() != 0)
System.out.println("[INST]199;None;INPUT.length();"+INPUT.length());
			System.out.println(Arrays.deepToString(o));
	}
}
