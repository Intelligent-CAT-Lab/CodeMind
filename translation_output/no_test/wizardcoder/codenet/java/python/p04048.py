Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
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
		is = INPUT.isEmpty()? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		solver();
		out.flush();
	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read())!= -1 &&!((num >= '0' && num <= '9') || num == '-'))
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
					return minus? -num : num;
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
				if (b <='')
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
				if (b == -1 || b <='')
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
		while ((b = is.read())!= -1 &&!(b >= 33 && b <= 126))
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
			while ((num = is.read())!= -1 &&!((num >= '0' && num <= '9') || num == '-'))
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
					return minus? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static void tr(Object... o) {
		if (INPUT.length()!= 0)
			System.out.println(Arrays.deepToString(o));
	}
}

```

### Response:
```python
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.Arrays

class p04048:
    is = None
    out = None
    INPUT = ""

    def solver():
        n = p04048.nl()
        x = p04048.nl()
        sum = 0
        if x == n - x:
            sum = 3 * x
            p04048.out.println(sum)
            return
        else:
            if x > n - x:
                sum += x + n - x
                sum += p04048.calc(x, n - x, False)
            elif x < n - x:
                sum += x + n - x
                sum += p04048.calc(x, n - x, False)
            p04048.out.println(sum)
            return

    def calc(x, y, first):
        sum = 0
        if x % y == 0:
            if first:
                sum += y
            sum += (x // y * 2 - 1) * y
            return sum
        else:
            if first:
                sum += y
            sum += (x // y * 2) * y
            sum += p04048.calc(y, x % y, False)
            return sum

    def main(args):
        p04048.is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
        p04048.out = PrintWriter(System.out)

        p04048.solver()
        p04048.out.flush()

    def nl():
        try:
            num = 0
            minus = False
            while ((num = p04048.is.read())!= -1 and not((num >= '0' and num <= '9') or num == '-')):
                pass
            if num == '-':
                num = 0
                minus = True
            else:
                num -= '0'

            while True:
                b = p04048.is.read()
                if b >= '0' and b <= '9':
                    num = num * 10 + (b - '0')
                else:
                    return minus and -num or num
        except IOException as e:
            pass
        return -1

    def nc():
        try:
            b = p04048.skip()
            if b == -1:
                return 0
            return chr(b)
        except IOException as e:
            pass
        return 0

    def
