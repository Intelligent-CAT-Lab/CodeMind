<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

/*
                   _ooOoo_
                  o8888888o
                  88". "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
            .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \ .-\__  `-`  ___/-. /
         ___`..'  /--.--\  `.. __
     ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/  .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            pass System Test!
*/

public class p01076 {
	private static class Task {

		void solve(FastScanner in, PrintWriter out) {
			long N = in.nextLong();
			long d = in.nextLong();

			if (d == 1) {
				out.println(N * (N - 1) / 2);
			} else if (d == 2) {
				out.println(N * (N - 1) / 2 - 1);
			} else {
				long m = N - d;
				long ans = m * (m - 1) / 2 + 2 * m + (d - 2);
				out.println(ans);
			}
		}
	}

	/**
	 *?????????????????????????????Â¬????????Â§??????
	 */
	public static void main(String[] args) {
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner();
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(in, out);
		out.close();
	}

	private static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int bufferLength = 0;

		private boolean hasNextByte() {
			if (ptr < bufferLength) {
				return true;
			} else {
				ptr = 0;
				try {
					bufferLength = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (bufferLength <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private void skipUnprintable() {
			while (hasNextByte() &&!isPrintableChar(buffer[ptr]))
				ptr++;
		}

		boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 ||!isPrintableChar(b)) {
					return minus? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextDouble();
			}
			return array;
		}

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][];
			for (int i = 0; i < n; i++) {
				map[i] = nextDoubleArray(m);
			}
			return map;
		}

		public int nextInt() {
			return (int) nextLong();
		}

		public int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		public long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		public String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();
			return array;
		}

		public char[][] nextCharMap(int n) {
			char[][] array = new char[n][];
			for (int i = 0; i < n; i++)
				array[i] = next().toCharArray();
			return array;
		}

		public int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][];
			for (int i = 0; i < n; i++) {
				map[i] = nextIntArray(m);
			}
			return map;
		}
	}
}
```

python code:<fim_suffix><fim_middle>
```python
import sys

class Task:
    def __init__(self):
        self.read = self.read_ # break the recursion

    def read_(self):
        return sys.stdin.readline().strip()

    def readInt(self):
        return int(self.read())

    def readLong(self):
        return int(self.read())

    def readFloat(self):
        return float(self.read())

    def readDouble(self):
        return float(self.read())

    def readString(self):
        return self.read()

    def readStringList(self):
        return self.read().split(' ')

    def readIntList(self):
        return list(map(int, self.readStringList()))

    def readLongList(self):
        return list(map(int, self.readStringList()))

    def readFloatList(self):
        return list(map(float, self.readStringList()))

    def readDoubleList(self):
        return list(map(float, self.readStringList()))

    def readStringMatrix(self):
        n = self.readInt()
        m = self.readInt()
        return [self.readStringList() for _ in range(n)]

    def readIntMatrix(self):
        n = self.readInt()
        m = self.readInt()
        return [self.readIntList() for _ in range(n)]

    def readLongMatrix(self):
        n = self.readInt()
        m = self.readInt()
        return [self.readLongList() for _ in range(n)]

    def readFloatMatrix(self):
        n = self.readInt()
        m = self.readInt()
        return [self.readFloatList() for _ in range(n)]

    def readDoubleMatrix(self):
        n = self.readInt()
        m = self.readInt()
        return [self.readDoubleList() for _ in range(n)]

def main():
    task = Task()
    task.read()

if __name__ == '__main__':
    main()
```

"""
<|endoftext|>
