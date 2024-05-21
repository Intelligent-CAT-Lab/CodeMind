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
		if (x == n - x):
			sum = 3 * x;
			print(sum);
			return;
		else:
			if (x > n - x):
				sum += x + n - x;
				sum += calc(x, n - x, False);
			elif (x < n - x):
				sum += x + n - x;
				sum += calc(x, n - x, False);
			print(sum);
			return;
	}

	static long calc(long x, long y, boolean first):
		sum = 0;
		if (x % y == 0):
			if (first):
				sum += y;
			sum += (x / y * 2 - 1) * y;
			return sum;
		else:
			if (first):
				sum += y;
			sum += (x / y * 2) * y;
			sum += calc(y, x % y, False);
			return sum;
	}

	public static void main(String[] args) throws Exception:
		is = INPUT.isEmpty()? System.in : ByteArrayInputStream(INPUT.getBytes());
		out = PrintWriter(System.out);

		solver();
		out.flush();
	}

	static long nl():
		try:
			num = 0;
			minus = False;
			while ((num = is.read())!= -1 and not ((num >= '0' and num <= '9') or num == '-')):
				pass;
			if (num == '-'):
				num = 0;
				minus = True;
			else:
				num -= '0';

			while True:
				b = is.read();
				if (b >= '0' and b <= '9'):
					num = num * 10 + (b - '0');
				else:
					return minus? -num : num;
		except IOException as e:
			pass
		return -1;

	static char nc():
		try:
			b = skip();
			if b == -1:
				return 0;
			return chr(b);
		except IOException as e:
			pass
		return 0;

	static double nd():
		try:
			return float(ns());
		except Exception as e:
			pass
		return 0.0;

	static String ns():
		try:
			b = skip();
			if b == -1:
				return "";
			sb = StringBuilder();
			if b == -1:
				return "";
			sb.append(chr(b));
			while True:
				b = is.read();
				if b == -1 or b <='':
					break;
				sb.append(chr(b));
			return sb.toString();
		except IOException as e:
			pass
		return "";

	public static char[] ns(int n):
		buf = [0] * n;
		try:
			b = skip();
			p = 0;
			if b == -1:
				return None;
			buf[p] = chr(b);
			while p < n:
				b = is.read();
				if b == -1 or b <='':
					break;
				buf[p] = chr(b);
				p += 1;
			return buf[:p];
		except IOException as e:
			pass
		return None;

	public static byte[] nse(int n):
		buf = [0] * n;
		try:
			b = skip();
			if b == -1:
				return None;
			is.readinto(buf);
			return buf;
		except IOException as e:
			pass
		return None;

	static int skip():
		b = 0;
		while (b < 33 or b > 126):
			b = is.read();
			pass
		return b;

	static bool eof():
		try:
			is.mark(1000);
			b = skip();
			is.reset();
			return b == -1;
		except IOException as e:
			return True;

	static int ni():
		num = 0;
		minus = False;
		while True:
			num = 0;
			minus = False;
			while (num >= '0' and num <= '9') or num == '-':
				num = is.read();
				pass
			if num == '-':
				num = 0;
				minus = True;
			else:
				num -= '0';

			while True:
				b = is.read();
				if b >= '0' and b <= '9':
					num = num * 10 + (b - '0');
				else:
					return minus? -num : num;
	tr = lambda *o: print(o) if INPUT == "" else None