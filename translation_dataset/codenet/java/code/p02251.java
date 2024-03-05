import java.util.*;
import java.io.*;

class p02251 {
	void solve () {
		
		int n = nextInt();
		int ans = 0;
		
		//25cent
		ans += n/25;
		n %= 25;
		
		//10cent
		ans += n/10;
		n %= 10;
		
		//5cent
		ans += n/5;
		n %= 5;
		
		//1cent
		ans += n;
		
		out.println(ans);
		
	}


	// <p02251 Method>
	public static PrintWriter out;
	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		new p02251().solve();
		out.flush();
	}

	// <Default Field>
	static int maxInt = Integer.MAX_VALUE, minInt = Integer.MIN_VALUE;
	static int mod = 1000000007;

	// <Default Method>
	static int max (int... ar) {Arrays.sort(ar);return ar[ar.length-1];}
	static int min (int... ar) {Arrays.sort(ar);return ar[0];}
	static int calcManhatDistance (int x1, int y1, int x2, int y2) {
		int d = Math.abs(x1-x2)+Math.abs(y1-y2);
		return d;
	}
	static double calcEuclidDistance (double x1, double y1, double x2, double y2) {
		double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return d;
	}
	static boolean isPrime (int n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
		return true;
	}
	static void printChar2DArray (char[][] ar) {
		for (int i=0; i<ar.length; i++) {
			for (int j=0; j<ar[0].length; j++) {
				out.print(ar[i][j]);
			}
			out.println();
		}
	}

	// <Fast Scanner> START -------------------------------------------------
	static InputStream in = System.in;
	static  byte[] buffer = new byte[1024];
	static int length = 0, p = 0;
	public static boolean hasNextByte () {
		if (p < length) return true;
		else {
			p = 0;
			try {length = in.read(buffer);}
			catch (Exception e) {e.printStackTrace();}
			if (length == 0) return false;
		}
		return true;
	}
	public static int readByte () {
		if (hasNextByte() == true) return buffer[p++];
		return -1;
	}
	public static boolean isPrintable (int n) {return 33<=n&&n<=126;}
	public static void skip () {
		while (hasNextByte() && !isPrintable(buffer[p])) p++;
	}
	public static boolean hasNext () {skip(); return hasNextByte();}
	public static String next () {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int temp = readByte();
		while (isPrintable(temp)) {
			sb.appendCodePoint(temp);
			temp = readByte();
		}
		return sb.toString();
	}
	public static String[] nextStringArray (int n) {
		String[] ar = new String[n];
		for (int i=0; i<n; i++) ar[i] = next();
		return ar;
	}
	public static int nextInt () {return Math.toIntExact(nextLong());}
	public static int[] nextIntArray (int n) {
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = nextInt();
		return ar;
	}
	public static long nextLong () {
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
			temp = readByte();
		}
		return minus? -n : n;
	}
	public static char[][] nextChar2DArray (int h, int w, boolean b) {
		//b(番兵)がtrueなら配列を余計に確保する
		char[][] ar = new char[b?h+2:h][b?w+2:h];
		for (int i=b?1:0; i<(b?h+1:h); i++) {
			String temp = next();
			for (int j=0; j<w; j++) {
				ar[i][b?j+1:j] = temp.charAt(j);
			}
		}
		return ar;
	}
	// <Fast Scanner> END ----------------------------------------------------------
}

