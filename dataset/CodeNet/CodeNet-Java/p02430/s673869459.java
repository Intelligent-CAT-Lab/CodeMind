import java.util.*;
import java.io.*;

public class Main {

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
		Main main = new Main();
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
