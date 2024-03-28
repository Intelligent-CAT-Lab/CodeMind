<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 3

Expected output:
n: 0!ux2
1: 0 1 3
59N jc|&Q
1: 1 2 3
19: 0 1 4
21* 0 % ;
2: 1 2 4
25: 0Y 3 4
2*]M>QG=g
8: 2 3 4

```
import java.util.*;
import java.io.*;

public class p02430 {

	void solve (FastScanner in, PrintWriter out, Methods ms) {
		
		int n = in.nextInt(), k = in.nextInt();
		
		for (int bit=0; bit<(1<<n); bit++) {
			if (Integer.bitCount(bit) != k) continue;
			out.print(bit+":");
			for (int j=0; j<n; j++) {
				if (((bit>>j) & 1) == 1) {
					out.print(" "+j);
				}
			}
			out.println();
		}
		
	}



	public static void main(String[] args) {
		p02430 main = new p02430();
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Methods ms = new Methods();
		main.solve(in, out, ms);
		in.close();
		out.close();
	}

	static class Methods {

		public void print (Object... ar) {System.out.println(Arrays.deepToString(ar));}

		public void yesno (PrintWriter out, boolean b) {out.println(b?"Yes":"No");}

		public void YESNO (PrintWriter out, boolean b) {out.println(b?"YES":"NO");}

		public int max (int... ar) {Arrays.sort(ar); return ar[ar.length-1];}

		public int min (int... ar) {Arrays.sort(ar); return ar[0];}

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

### Response:
```python
import sys

def solve(n, k):
    for bit in range(2 ** n):
        if bin(bit).count('1') != k:
            continue
        print(f"{bit}: {', '.join(str(j) for j in range(n) if (bit >> j) & 1)}")

def main():
    n, k = map(int, sys.stdin.readline().split())
    solve(n, k)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers `n` and `k` from the standard input, and then it prints all `k`-bit numbers in binary format along with their corresponding bit positions. The `bin` function is used to convert an integer to a binary string, and the `count` method of the string is used to count the number of '1's in the binary string. The `map` function is used to read the two integers from the standard input. The `range` function is used to generate the numbers from 0 to `n-1`, and the `join` method of the string is used to concatenate the numbers into a string with a comma as the separator. The `if __name__ == "__main__":` line is used to call the `main` function when the script is run as the main program, not when it is imported as a module.
<|EOT|>
