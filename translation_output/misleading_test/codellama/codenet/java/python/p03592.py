<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
?Yes

```
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class p03592 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= M; j++) {
				long sum = M * i + N * j - (i * j * 2);
				if (sum == K) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

	public static class Pair implements Comparable<Pair> {
		private double key;
		private int value;

		public Pair(double key, int value) {
			super();
			this.key = key;
			this.value = value;
		}

		public double getKey() {
			return key;
		}

		public int getValue() {
			return value;
		}

		@Override
		public String toString() {
			return "{" + key + ", " + value + "}";
		}

		@Override
		public int compareTo(Pair other) {
			double t = this.value / this.key;
			double o = other.value / other.key;
			if (t < o) {
				return -1;
			} else if (t > o) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	public static class Scanner {
		private BufferedInputStream inputStream;
		private StringBuilder buffer = new StringBuilder();

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
		}

		public int nextInt() throws IOException {
			int num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(int[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
		}

		public void fill(int[] a, int[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
				b[i] = nextInt();
			}
		}

		public long nextLong() throws IOException {
			long num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(long[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
		}

		public void fill(long[] a, long[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
				b[i] = nextLong();
			}
		}

		public long[] nextLong(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}

			return array;
		}

		public String next() throws IOException {
			int read = skip();
			do {
				buffer.append((char) read);
			} while ((read = inputStream.read()) > 0x20);

			String text = buffer.toString();
			buffer.delete(0, buffer.length());

			return text;
		}

		private int skip() throws IOException {
			int read;
			while ((read = inputStream.read()) <= 0x20)
				;

			return read;
		}
	}
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def __str__(self):
        return "{" + str(self.key) + ", " + str(self.value) + "}"

    def __lt__(self, other):
        t = self.value / self.key
        o = other.value / other.key
        if t < o:
            return -1
        elif t > o:
            return 1
        else:
            return 0

class Scanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buffer = ""

    def next_int(self):
        num = 0
        sign = 1

        read = self.skip()
        if read == "-":
            sign = -1
            read = self.input_stream.read()

        while read > 0x20:
            num = num * 10 + sign * (read - 0x30)
            read = self.input_stream.read()

        return num

    def fill(self, a):
        for i in range(len(a)):
            a[i] = self.next_int()

    def fill(self, a, b):
        if len(a) != len(b):
            raise ValueError("a and b must have the same length")

        for i in range(len(a)):
            a[i] = self.next_int()
            b[i] = self.next_int()

    def next_long(self):
        num = 0
        sign = 1

        read = self.skip()
        if read == "-":
            sign = -1
            read = self.input_stream.read()

        while read > 0x20:
            num = num * 10 +
