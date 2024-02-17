import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
public class Main {
	static final long C =  1000000007;
	static final int CY = 1000000000;
	static final int INF = Integer.MAX_VALUE/2;
	StringBuilder sb;
	//セット
	class Set<F,S> {
		F f;
		S s;
		Set(F f, S s) {this.f = f;this.s = s;}
	}
	int[][] G;
	//Map<Integer,List<Integer>> Genb = new HashMap<>();
	int V;
	int E;
	int Venb;
	int Eenb;
	long START_TIME;
	int GenbSize;//Genbグラフの1辺
	Random rand = new Random();
	int[][] DIR = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};

	public void calc() {

		sb = new StringBuilder();


		//入力処理
		IO sc = new IO();

		int n = sc.nextInt() ;
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean ans = true;
		char[][] map = new char[n][m];
		for (int i=0; i < n; i++) {
			Arrays.fill(map[i], '.');
		}
		if (n%2 ==1) {
			for (int i=0; i < m-1;i+=2) {
				if (a == 0) break;
				puta(map,0,i);
				a--;
			}
		}
		if (m%2 ==1) {
			for (int i=0; i < n-1;i+=2) {
				if (b==0) break;
				putb(map,i,m-1);
				b--;

			}
		}
		int max = n%2;
		int y =n%2, x=0;
		while(a > 1) {
			if (n-y <=1-max) {
				ans = false;
				//System.err.println(y + "a:" + x);
				break;
			}
			puta(map,y,x);
			puta(map,y+1,x);
			a -= 2;
			x += 2;
			if (m-x <=1) {
				y += 2;
				x = 0;
			}
		}
		while(b > 1) {
			if (n-y <=1-max) {
				ans = false;
				//System.err.println(y + "b:" + x);
				break;
			}
			putb(map,y,x);
			putb(map,y,x+1);
			b -= 2;
			x += 2;
			if (m-x <=1) {
				y += 2;
				x = 0;
			}
		}
		if (n-y <=1-max && a+b > 0) {
			ans = false;

		}else {
			if (n%2 == 1 && m%2 == 1 && a == 1&& b==1&& n-y == 2 && m-x ==3) {

				putb(map,y,x);
				puta(map,y+1,x+1);
				a--;
				b--;
			}else {
				if (a == 1 && !(n-y <=1-max)) {

					puta(map,y,x);
					a -= 1;
					x += 2;
					if (m-x <=1) {
						y += 2;
						x = 0;
					}
				}
				if (b == 1) {
					if (n-y <=1-max) {
						ans = false;

					}else{
						putb(map,y,x);
						b -= 1;
						x += 2;
						if (m-x <=1) {
							y += 2;
							x = 0;
						}
					}
				}
			}
		}



		System.out.println(ans?"YES":"NO");
		if (ans)
		for (int i=0; i < n; i++){
			System.out.println(map[i]);
		}


	}
	void puta(char[][] map ,int y,int x){
		map[y][x] = '<';
		map[y][x+1] = '>';
	}
	void putb(char[][] map ,int y,int x){
		map[y][x] = '^';
		map[y+1][x] = 'v';
	}
	boolean isIn(int y, int x,int h,int w) {
		return 0 <= y && y < h && 0 <= x && x < w;
	}


	public static void main(String[] args) {
		Main main = new Main();
		main.calc();

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