import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class p04048 {
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
				sum += calc(x, n - x, False);
			} else if (x < n - x) {
				sum += x + n - x;
				sum += calc(x, n - x, False);
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
			sum += calc(y, x % y, False);
			return sum;
		}
	}

	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty()? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		solver();
		out.flush();
	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = False;
			while ((num = is.read())!= -1 &&!((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = True;
			} else {
				num -= '0';
			}

			while (True) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;