<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5

Expected output:
2


```
import java.util.*;
import java.io.*;

public class p00387 {

	static void solve (FastScanner in, PrintWriter out, Methods ms) {

		int a = in.nextInt(), b = in.nextInt();
		System.out.println(Math.max(1, (b+a-1)/a));

	}



	public static void main (String[] args) {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Methods ms = new Methods();
		solve(in, out, ms);
		in.close();
		out.close();
	}

	static class Methods {

		public void print (Object... ar) {System.out.println(Arrays.deepToString(ar));}

		public int max (int... ar) {Arrays.sort(ar); return ar[ar.length-1];}

		public int min (int... ar) {Arrays.sort(ar); return ar[0];}

		public long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}

		public long lcm (long a, long b) {return a/gcd(a,b)*b;}

		public long factorial (int i) {
			if (i==1) return 1;
			else return i*factorial(i-1);
		}

		public int manhat (int x1, int y1, int x2, int y2) {
			return Math.abs(x1-x2)+Math.abs(y1-y2);
		}

		public double euclid (double x1, double y1, double x2, double y2) {
			return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		}

		public boolean isPrime (int n) {
			if (n==2) return true;
			if (n<2 || n%2==0) return false;
			for (int i=3; i<=Math.sqrt(n); i+=2) if(n%i==0) return false;
			return true;
		}

	}

	static class FastScanner {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private  int length = 0, p = 0;

		public FastScanner (InputStream stream) {
			in = stream;
		}

		public boolean hasNextByte () {
			if (p < length) return true;
			else {
				p = 0;
				try {length = in.read(buffer);}
				catch (Exception e) {e.printStackTrace();}
				if (length <= 0) return false;
			}
			return true;
		}

		public int readByte () {
			if (hasNextByte() == true) return buffer[p++];
			return -1;
		}

		public boolean isPrintable (int n) {return 33<=n&&n<=126;}

		public void skip () {
			while (hasNextByte() && !isPrintable(buffer[p])) p++;
		}

		public boolean hasNext () {skip(); return hasNextByte();}

		public String next () {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int t = readByte();
			while (isPrintable(t)) {
				sb.appendCodePoint(t);
				t = readByte();
			}
			return sb.toString();
		}

		public String[] nextArray (int n) {
			String[] ar = new String[n];
			for (int i=0; i<n; i++) ar[i] = next();
			return ar;
		}

		public int nextInt () {return Math.toIntExact(nextLong());}

		public int[] nextIntArray (int n) {
			int[] ar = new int[n];
			for (int i=0; i<n; i++) ar[i] = nextInt();
			return ar;
		}

		public long nextLong () {
			if (!hasNext()) throw new NoSuchElementException();
			boolean minus = false;
			int temp = readByte();
			if (temp == '-') {
				minus = true;
				temp = readByte();
			}
			if (temp<'0' || '9'<temp) throw new NumberFormatException();
			long n = 0;
			while (isPrintable(temp)) {
				if ('0'<=temp && temp<='9') {
					n *= 10;
					n += temp - '0';
				}
				else throw new NumberFormatException();
				temp = readByte();
			}
			return minus? -n : n;
		}

		public long[] nextLongArray (int n) {
			long[] ar = new long[n];
			for (int i=0; i<n; i++) ar[i] = nextLong();
			return ar;
		}

		public double nextDouble () {
			return Double.parseDouble(next());
		}

		public double[] nextDoubleArray (int n) {
			double[] ar = new double[n];
			for (int i=0; i<n; i++) ar[i] = nextDouble();
			return ar;
		}

		public void close () {
			try {in.close();}
			catch(Exception e){}
		}

	}

}

```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(1024)
        self.length = 0
        self.p = 0

    def has_next_byte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.length = self.stream.readinto(self.buffer)
            except Exception as e:
                e.printStackTrace()
            if self.length <= 0:
                return False

    def read_byte(self):
        if self.has_next_byte() == True:
            return self.buffer[self.p]
        return -1

    def is_printable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(self.buffer[self.p]):
            self.p += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException()
        sb = StringBuilder()
        t = self.read_byte()
        while self.is_printable(t):
            sb.append(chr(t))
            t = self.read_byte()
        return sb.toString()

    def next_array(self, n):
        ar = [None] * n
        for i in range(n
