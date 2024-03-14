Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

	private static boolean isDebug = System.getProperty("sun.desktop")!= null;

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
			if (a.length!= b.length) {
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
			if (a.length!= b.length) {
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

### Response:
```python
import java.io.BufferedInputStream
import java.io.IOException
import java.io.InputStream
import java.util.Arrays

class p03592:

    def __init__(self):
        pass

    def main(self, args):
        sc = Scanner(System.in)
        N = sc.nextInt()
        M = sc.nextInt()
        K = sc.nextInt()

        for i in range(N+1):
            for j in range(M+1):
                sum = M * i + N * j - (i * j * 2)
                if sum == K:
                    print("Yes")
                    return

        print("No")

    class Pair:
        def __init__(self, key, value):
            self.key = key
            self.value = value

        def getKey(self):
            return self.key

        def getValue(self):
            return self.value

        def toString(self):
            return "{" + str(self.key) + ", " + str(self.value) + "}"

        def compareTo(self, other):
            t = self.value / self.key
            o = other.value / other.key
            if t < o:
                return -1
            elif t > o:
                return 1
            else:
                return 0

    class Scanner:
        def __init__(self, in_):
            self.inputStream = BufferedInputStream(in_)
            self.buffer = StringBuilder()

        def nextInt(self):
            num = 0
            sign = 1

            read = self.skip()
            if read == '-':
                sign = -1
                read = self.inputStream.read()

            while read > 0x20:
                num = num * 10 + sign * (read - 0x30)
                read = self.inputStream.read()

            return num

        def fill(self, a):
            for i in range(len(a)):
                a[i] = self.nextInt()

        def fill(self, a, b):
            if len(a)!= len(b):
                raise IllegalArgumentException()

            for i in range(len(a)):
                a[i] = self.nextInt()
                b[i] = self.nextInt()

        def nextLong(self):
            num = 0
            sign = 1

            read = self.skip()
            if read == '-':
                sign = -1
                read = self.inputStream.read()

            while read > 0x20:
                num = num * 10 + sign * (read - 0x30)
                read = self.inputStream.read()

            return num

        def fill(self, a):
            for i in range(len(a)):
                a[i] = self.nextLong()

        def fill(self, a, b):
            if len(a)!= len(b):
                raise IllegalArgumentException()

            for i in range(len(a)):
                a[i] = self.nextLong()
                b[i] = self.nextLong()

        def nextLong(self, n):
            array = [0] * n
            for i in range(n):
                array[i] = self.nextLong()

            return array

        def next(self):
            read = self.skip()
            while read > 0x20:
                self.buffer.append(chr(read))
                read = self.inputStream.read()

            text = self.buffer.toString()
            self.buffer.delete(0, len(self.buffer))

            return text

        def skip(self):
            read = self.inputStream.read()
            while read <= 0x20:
                read = self.inputStream.read()

            return read

p03592().main(None
