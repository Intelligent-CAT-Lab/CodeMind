import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
		pw.close();
	}

	/**
	 * ASCII
	 * 0 48
	 * A 65
	 * a 97
	 */

	static PrintWriter pw = new PrintWriter(System.out);

	long MOD = 1_000_000_007;

	void solve() {
		FastScanner sc = new FastScanner();
		char X = sc.next().charAt(0);
		char Y = sc.next().charAt(0);
		String ans = "=";
		if (X - Y < 0) {
			ans = "<";
		} else if (X - Y > 0) {
			ans = ">";
		}
		out(ans);
	}

	double getD(double x1, double x2, double y1, double y2) {
		return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2));
	}

	int[][] d4 = new int[][] {{1,0},{0,1},{-1,0},{0,-1}};
	int[][] d8 = new int[][] {{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};

	class Data {
		int a;
		int b;
		int c;
		Data(){}
		Data(int a) {
			this.a = a;
		}
		Data(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		Data(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	class Permutation {
		int[] array;

		Permutation(int N) {
			array = new int[N];
			for (int i = 0; i < N; i++) {
				array[i] = i+1;
			}
		}

		boolean nextPermutation() {
		    int i = array.length - 1;
		    while (i > 0 && array[i - 1] >= array[i])
		        i--;
		    if (i <= 0)
		        return false;

		    int j = array.length - 1;
		    while (array[j] <= array[i - 1])
		        j--;
		    int temp = array[i - 1];
		    array[i - 1] = array[j];
		    array[j] = temp;

		    j = array.length - 1;
		    while (i < j) {
		        temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		        i++;
		        j--;
		    }
		    return true;
		}
	}

	class UnionFind {
		int[] parents;
		int[] counts;

		public UnionFind(int size) {
			parents = new int[size];
			counts = new int[size];
			for (int i = 0; i < size; i++) {
				parents[i] = i;
				counts[i] = 1;
			}
		}

		public int find(int a) {
			if (parents[a] == a) return a;
			parents[a] = find(parents[a]);
			return parents[a];
		}

		public void unite(int a, int b) {
			a = find(a);
			b = find(b);
			if (a == b) return;
			if (counts[a] < counts[b]) {
				parents[a] = b;
				counts[b] += counts[a];
			} else {
				parents[b] = a;
				counts[a] += counts[b];
			}
		}

		public boolean differ(int a, int b) {
			a = find(a);
			b = find(b);
			return a != b;
		}

		public int count(int a) {
			return counts[find(a)];
		}
	}

	class Combination {
		final int mod;
		final int max;

		final long[] fact;
		final long[] inv;
		final long[] invfact;

		public Combination(int n) {
			this(n, 1_000_000_007);
		}

		public Combination(int n, int mod) {
			this.mod = mod;
			max = n + 1;
			fact = new long[max];
			invfact = new long[max];
			inv = new long[max];

			inv[1] = 1;
			for (int i = 2; i < inv.length; i++) {
				inv[i] = inv[mod % i] * (mod - mod / i) % mod;
			}

			fact[0] = 1;
			invfact[0] = 1;
			for (int i = 1; i < inv.length; i++) {
				fact[i] = i * fact[i - 1] % mod;
				invfact[i] = inv[i] * invfact[i - 1] % mod;
			}
		}

		public long get(int n, int r) {
			return fact[n] * invfact[n - r] % mod * invfact[r] % mod;
		}

		public long gcd(long a, long b) {
			if (b == 0) return a;
			else {
				b %= MOD;
				if (b < 0) b+=MOD;
				return gcd(b, (b-a*inv[(int)b]%MOD*b%MOD)%MOD);
			}
		}
	}

	public long gcd(long a, long b) {
		if (b == 0) return a;
		else return gcd(b, a%b);
	}

	public void reverse(int[] a) {
		int last = a.length-1;
		int n = a.length / 2;
		for (int i = 0; i < n; i++) {
			int t = a[i];
			a[i] = a[last-i];
			a[last-i] = t;
		}
	}

	public void reverse(long[] a) {
		int last = a.length-1;
		int n = a.length / 2;
		for (int i = 0; i < n; i++) {
			long t = a[i];
			a[i] = a[last-i];
			a[last-i] = t;
		}
	}

	void out() {
		pw.println();
	}

	void out(String a) {
		pw.println(a);
	}
	void out(boolean a) {
		pw.println(a);
	}

	void out(int a) {
		pw.println(a);
	}

	void out(long a) {
		pw.println(a);
	}

	void out(double a) {
		pw.println(a);
	}

	void out(char a) {
		pw.println(a);
	}

	void rout(String a) {
		out(a);
		pw.close();
		System.exit(0);
	}
	void rout(int a) {
		out(a);
		pw.close();
		System.exit(0);
	}
	void rout(long a) {
		out(a);
		pw.close();
		System.exit(0);
	}
	void rout(double a) {
		out(a);
		pw.close();
		System.exit(0);
	}
	void rout(char a) {
		out(a);
		pw.close();
		System.exit(0);
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

    private boolean isPrintableChar(int c) {
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
