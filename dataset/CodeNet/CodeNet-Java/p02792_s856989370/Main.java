import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();

		long ans = 0;

		long[][] count = new long[10][10];

		for (int i = 1; i <= n; i++) {
			int j = i;
			while (j >= 10) {
				j /= 10;
			}
			count[j][i % 10]++;
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				ans += (count[i][j] * count[j][i]);
		}

		System.out.println(ans);
	}

	//以下、自作ライブラリ

	/*
		int N = sc.nextInt();
	
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = sc.nextInt();
	
		String s = sc.next();
	
		String[] a = new String[N];
		for (int i = 0; i < N; i++)
			a[i] = sc.next();
	
		int[][] a = new int[N][2];
		for (int i = 0; i < N; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
	
		List<Integer> list = new ArrayList<>();
	
		Set<Integer> set = new HashSet<>();
	 */

	//階乗
	public static int fact(int n) {
		if (n == 1 || n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}

	//指定した値以上の要素が最初に現れる位置
	//要素の数は+1（配列のズレ)
	public static long lowerBound(int n, long[] x, long y) {
		int left = 0;
		int right = n;
		while (left < right) {
			int mid = (left + right) / 2;
			if (x[mid] < y) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}

	//指定した値より大きい要素が最初に現れる位置
	//要素の数は+1（配列のズレ)
	public static long upperBound(int n, long[] x, long y) {
		int left = 0;
		int right = n;
		while (left < right) {
			int mid = (left + right) / 2;
			if (x[mid] <= y) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}

	//最大公約数
	public static long gcd(long a, long b) {
		if (a < b)
			return gcd(b, a);
		long c = 0;
		c = a % b;
		if (c == 0)
			return b;
		return gcd(b, c);
	}

	//最小公倍数
	public static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	//素数判定
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

//以下、高速スキャナークラス
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
}
