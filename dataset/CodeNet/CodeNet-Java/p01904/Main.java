import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
public class Main {
	static int[] D = {1,0,-1,0};
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int[] sqi = new int[n];
		int[] sqj = new int[n];
		for(int i=1;i<n;i++) {
			int x = io.nextInt();
			int d = io.nextInt();
			sqi[i] = sqi[x] + D[d];
			sqj[i] = sqj[x] + D[d^1];
		}
		Vector2[] pp = new Vector2[n*4];
		for(int i=0;i<n;i++) {
			pp[i*4+0] = new Vector2(sqi[i], sqj[i]);
			pp[i*4+1] = new Vector2(sqi[i], sqj[i]+1);
			pp[i*4+2] = new Vector2(sqi[i]+1, sqj[i]);
			pp[i*4+3] = new Vector2(sqi[i]+1, sqj[i]+1);
		}
		Vector2[] v = Vector2.convexHull(pp);
		int m = v.length;
		double[] theta = new double[m];
		for(int i=0;i<m;i++) {
			Vector2 v1 = v[i];
			Vector2 v2 = v[(i+1)%m];
			theta[i] = Math.atan2(v2.y - v1.y, v2.x - v1.x);
		}
		Arrays.sort(theta);
		double min = Double.POSITIVE_INFINITY;
		for(int i=0;i<m;i++) {
			double l = theta[i];
			double r = i < m - 1 ? theta[i+1] : (theta[0] + Math.PI * 2);
			for(int j=0;j<90;j++) {
				double x1 = (l * 2 + r) / 3;
				double x2 = (l + r * 2) / 3;
				if (area(v,x1) < area(v,x2)) {
					r = x2;
				}else{
					l = x1;
				}
			}
			min = Math.min(min, area(v, (r + l) / 2));
		}
		System.out.println(String.format("%.6f", min));
	}
	
	static double area(Vector2[] v, double theta) {
		double amax = Double.NEGATIVE_INFINITY;
		double amin = Double.POSITIVE_INFINITY;
		double bmax = Double.NEGATIVE_INFINITY;
		double bmin = Double.POSITIVE_INFINITY;
		for(int i=0;i<v.length;i++) {
			double cos = Math.cos(theta);
			double sin = Math.sin(theta);
			double a = v[i].x * cos + v[i].y * sin;
			double b = v[i].x * -sin + v[i].y * cos;
			amax = Math.max(amax, a);
			amin = Math.min(amin, a);
			bmax = Math.max(bmax, b);
			bmin = Math.min(bmin, b);
		}
		return (amax - amin) * (bmax - bmin);
	}

}

class Vector2 {
	long x = 0;
	long y = 0;

	public Vector2(long x, long y) {
		this.x = x;
		this.y = y;
	}

	public long dot(Vector2 v) {
		return this.x * v.x + this.y * v.y;
	}

	public long cross(Vector2 v) {
		return this.x * v.y - this.y * v.x;
	}

	public Vector2 add(Vector2 v) {
		return new Vector2(this.x + v.x, this.y + v.y);
	}

	public Vector2 subtract(Vector2 v) {
		return new Vector2(this.x - v.x, this.y - v.y);
	}

	public Vector2 multiply(long k) {
		return new Vector2(k * this.x, k * this.y);
	}

	public String toString() {
		return this.x + " " + this.y;
	}

	public boolean equals(Object o) {
		if (o instanceof Vector2) {
			Vector2 v = (Vector2) o;
			return x == v.x && y == v.y;
		}
		return super.equals(o);
	}

	public static Vector2[] convexHull(Vector2[] p) {
		int n = p.length;
		int k = 0;
		Arrays.sort(p, new LexicographicalComp());
		Vector2[] q = new Vector2[n * 2];
		for (int i = 0; i < n; q[k++] = p[i++]) {
			while (k >= 2 && q[k - 2].subtract(q[k - 1]).cross(q[k - 1].subtract(p[i])) <= 0) {
				k--;
			}
		}
		for (int i = n - 2, t = k + 1; i >= 0; q[k++] = p[i--]) {
			while (k >= t && q[k - 2].subtract(q[k - 1]).cross(q[k - 1].subtract(p[i])) <= 0) {
				k--;
			}
		}
		return Arrays.copyOf(q, k - 1);
	}

	public static class LexicographicalComp implements Comparator<Vector2> {
		public int compare(Vector2 o1, Vector2 o2) {
			if (o1.x != o2.x) {
				return Long.compare(o1.x, o2.x);
			}
			return Long.compare(o1.y, o2.y);
		}
	}
}
class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	
	public IO() { this(System.in);}
	public IO(InputStream source) { super(System.out); this.in = source;}
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public boolean hasNextLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public char[] nextCharArray(int len) {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char[] s = new char[len];
		int i = 0;
		int b = readByte();
		while(isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}
	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}
	public double nextDouble() { return Double.parseDouble(next());}
	public int[] nextIntArray(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
	public long[] nextLongArray(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
	public double[] nextDoubleArray(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
	public void nextIntArrays(int[]... a) { for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
	public int[][] nextIntMatrix(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = nextIntArray(m); return a;}
	public char[][] nextCharMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
	public void close() { super.close(); try {in.close();} catch (IOException e) {}}
}