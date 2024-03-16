<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p00332 {

	static void solve (FastScanner in, PrintWriter out, Methods ms) {

		int e = in.nextInt(), y = in.nextInt();

		if (e == 0) { //seireki
			if (1868<=y && y<=1911) { //meiji
				out.println("M" + (y-1867));
			}
			else if (1912<=y && y<=1925) { //taishou
				out.println("T" + (y-1911));
			}
			else if (1926<=y && y<=1988) { //shouwa
				out.println("S" + (y-1925));
			}
			else { //heisei
				out.println("H" + (y-1988));
			}
		}
		else if (e == 1) { //meiji
			out.println(1867 + y);
		}
		else if (e == 2) { //taishou
			out.println(1911 + y);
		}
		else if (e == 3) { // shouwa
			out.println(1925 + y);
		}
		else if (e == 4) { // heisei
			out.println(1988 + y);
		}

	}

	static void printCharMap (char[][] map) {
		for (int i=0; i<map.length; i++) {
			for (int j=0; j<map[0].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}



	public static void main(String[] args) {
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
			while (hasNextByte() &&!isPrintable(buffer[p])) p++;
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

python code:<fim_suffix><fim_middle>
```python
import java.util.*;
import java.io.*;

public class p00332 {

	static void solve (FastScanner in, PrintWriter out, Methods ms) {

		int e = in.nextInt(), y = in.nextInt();

		if (e == 0) { //seireki
			if (1868<=y && y<=1911) { //meiji
				out.println("M" + (y-1867));
			}
			else if (1912<=y && y<=1925) { //taishou
				out.println("T" + (y-1911));
			}
			else if (1926<=y && y<=1988) { //shouwa
				out.println("S" + (y-1925));
			}
			else { //heisei
				out.println("H" + (y-1988));
			}
		}
		else if (e == 1) { //meiji
			out.println(1867 + y);
		}
		else if (e == 2) { //taishou
			out.println(1911 + y);
		}
		else if (e == 3) { // shouwa
			out.println(1925 + y);
		}
		else if (e == 4) { // heisei
			out.println(1988 + y);
		}

	}

	static void printCharMap (char[][] map) {
		for (int
