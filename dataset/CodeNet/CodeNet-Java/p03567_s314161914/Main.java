import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
class BIT{
	int bit[]=new int[0];
	int N=0;
	BIT(int n){
		bit=new int[n+1];
		N=n;
	}
	void add(int a,int w) {
		for(int x=a;x<=N;x+=x&-x) bit[x]+=w;
	}
	int sum(int a) {
		int ret=0;
		for(int x=a;x>0;x-=x&-x)ret+=bit[x];
		return ret;
	}
}
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
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
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
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
	public long nextLong() {
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
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	public char nextchar() {
		return next().charAt(0);
	}
}

class UnionFind {
	int Parent[];
	UnionFind(int n) {// Initialize by -1
		Parent = new int[n];
		Arrays.fill(Parent, -1);
	}
	int root(int A) {// In which tree is A?
		if (Parent[A] < 0)
			return A;
		return Parent[A] = root(Parent[A]);
	}
	int size(int A) {// size of tree which is include A
		return -Parent[root(A)];
	}
	boolean connect(int A, int B) {// Connect A and B
		A = root(A);
		B = root(B);
		if (A == B)
			return false;
		if (size(A) < size(B)) {
			int C = 0;
			C = B;
			B = A;
			A = C;
		} // SWAP
		Parent[A] += Parent[B];
		Parent[B] = A;
		return true;
	}
}

class Pair<T, E> {
	public T first;
	public E second;
	void set(T x, E y) {
		first = x;
		second = y;
	}
}

class Pint {
	public int first;
	public int second;
	Pint(int x, int y) {
		first = x;
		second = y;
	}
	void set(int x, int y) {
		first = x;
		second = y;
	}
}

class Tpair {
	public int first;
	public int second;
	public long third;
	Tpair(int x, int y, long z) {
		first = x;
		second = y;
		third = z;
	}
	void set(int x, int y, long z) {
		first = x;
		second = y;
		third = z;
	}
}

public class Main {
	static FastScanner scan = new FastScanner();
	static Scanner scanner = new Scanner(System.in);
	static Random rand = new Random();
	static long mod = 1000000007;
	static double eps = 1.0E-14;
	static int big = Integer.MAX_VALUE;
	static double PI = 3.141592653589793;
	static long modlcm(long a, long b) {
		return a * b * modinv(GCD(a, b), mod);
	}
	static long GCD(long a, long b) {
		return b > 0 ? GCD(b, a % b) : a;
	}
	static long lcm(long a, long b) {
		return a * b / GCD(a, b);
	}
	static int min(int a, int b) {
		return a < b ? a : b;
	}
	static long factorial(int i) {
		return i == 1 ? 1 : i * factorial(i - 1);
	}
	static int max(int... i) {
		int x = i[0];
		for (int e : i)
			x = Math.max(x, e);
		return x;
	}
	static int min(int... i) {
		int x = i[0];
		for (int e : i)
			x = Math.min(x, e);
		return x;
	}
	static long gcd(long... i) {
		long x = i[0];
		for (long e : i)
			x = GCD(x, e);
		return x;
	}
	static long lmax(long... i) {
		long x = i[0];
		for (long e : i)
			x = Math.max(x, e);
		return x;
	}
	static long lmin(long... i) {
		long x = i[0];
		for (long e : i)
			x = Math.min(x, e);
		return x;
	}
	static long nCr(long n, long r, long m) {
		long ans = 1;
		for (long i = 0; i < r; i++) {
			ans *= (n - i);
			ans %= m;
		}
		for (long i = 0; i <= r; i++) {
			ans *= modinv(i, m);
			ans %= mod;
		}
		return ans;
	}
	static int lower_bound(int[] b, long cost) {
		int ok = b.length;
		int ng = -1;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (b[mid] >= cost)
				ok = mid;
			else
				ng = mid;
		}
		return ok;
	}
	static int upper_bound(int[] b, int cost) {
		int ok = b.length;
		int ng = -1;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (b[mid] > cost)
				ok = mid;
			else
				ng = mid;
		}
		return ok;
	}
	static boolean isPrime(long n) {
		if (n == 2)
			return true;
		if (n < 2 || n % 2 == 0)
			return false;
		double d = Math.sqrt(n);
		for (int i = 3; i <= d; i += 2)
			if (n % i == 0) {
				return false;
			}
		return true;
	}
	static int upper_division(int a, int b) {
		if (a % b == 0) {
			return a / b;
		} else {
			return a / b + 1;
		}
	}
	static long lupper_division(long a, long b) {
		if (a % b == 0) {
			return a / b;
		} else {
			return a / b + 1;
		}
	}
	static int[] setArray(int a) {
		int b[] = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = scan.nextInt();
		}
		return b;
	}
	static long[] lsetArray(int a) {
		long b[] = new long[a];
		for (int i = 0; i < a; i++) {
			b[i] = scan.nextLong();
		}
		return b;
	}
	static String reverse(String str) {
		char ch[] = new char[str.length()];
		char chch[] = str.toCharArray();
		int a = str.length();
		for (int i = 0; i < upper_division(a, 2); i++) {
			ch[i] = chch[ch.length - i - 1];
			ch[ch.length - 1 - i] = chch[i];
		}
		return String.valueOf(ch);
	}
	public static void printArray(int[] que) {
		for (int i = 0; i < que.length - 1; i++) {
			System.out.print(que[i] + " ");
		}
		System.out.println(que[que.length - 1]);
	}
	public static void lprintArray(long[] que) {
		for (int i = 0; i < que.length - 1; i++) {
			System.out.print(que[i] + " ");
		}
		System.out.println(que[que.length - 1]);
	}
	public static int[][] doublesort(int[][] a) {
		Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
		return a;
	}
	public static long[][] ldoublesort(long[][] a) {
		Arrays.sort(a, (x, y) -> Long.compare(x[0], y[0]));
		return a;
	}
	static long modpow(long x, long n, long mo) {
		long sum = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				sum = sum * x % mo;
			}
			x = x * x % mo;
			n >>= 1;
		}
		return sum;
	}
	public static char[] revch(char ch[]) {
		char ret[] = new char[ch.length];
		for (int i = ch.length - 1, j = 0; i >= 0; i--, j++) {
			ret[j] = ch[i];
		}
		return ret;
	}
	public static int[] revint(int ch[]) {
		int ret[] = new int[ch.length];
		for (int i = ch.length - 1, j = 0; i >= 0; i--, j++) {
			ret[j] = ch[i];
		}
		return ret;
	}
	public static int[][] warshall_floyd(int v[][], int n) {
		for (int k = 0; k < n; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					v[i][j] = min(v[i][j], v[i][k] + v[k][j]);
		return v;
	}
	public static long modinv(long a, long m) {
		long b = m, u = 1, v = 0;
		while (b != 0) {
			long t = a / b;
			a -= t * b;
			long x = a;
			a = b;
			b = x;
			u -= t * v;
			x = u;
			u = v;
			v = x;
		}
		u %= m;
		if (u < 0)
			u += m;
		return u;
	}
	public static long lmod(long i, long j) {
	    return (i%j)<0?(i%j)+0+(j<0?-j:j):(i%j+0);
	}
	public static int next_combination(int sub) {
	    int x = sub & -sub, y = sub + x;
	    return (((sub & ~y) / x) >> 1) | y;
	}
	public static void main(String[] $) throws IOException{
		String s=scan.next();
		System.out.println(s.indexOf("AC")!=-1?"Yes":"No");
	}
}