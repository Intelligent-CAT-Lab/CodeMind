System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1 2 2 2

Expected output:
1


```
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class p03446 {

	void submit() {
		int a = nextInt();
		int b = nextInt();
		int c = nextInt();
		int d = nextInt();
		int e = nextInt();
		int f = nextInt();

		if (d % a!= 0 || e % b!= 0 || f % c!= 0) {
			out.println(0);
			return;
		}

		int p = d / a;
		int q = e / b;
		int r = f / c;

		int[][] dp = new int[p + 1][q + 1];
		dp[p][q] = 1;

		int ans = 0;

		for (int x = p - 1; x >= 1; x--) {
			for (int y = q - 1; y >= 1; y--) {
				dp[x][y] = (int) ((long) ways[p][x] * ways[q][y] % P
						* pow(c, (p - x) * (q - y)) % P);

				for (int xb = x; xb <= p; xb++) {
					for (int yb = y; yb <= q; yb++) {
						if (xb + yb == x + y) {
							continue;
						}
						dp[x][y] -= (int) ((long) dp[xb][yb] * ways[xb][x] % P
								* ways[yb][y] % P);
						if (dp[x][y] < 0) {
							dp[x][y] += P;
						}
					}
				}

				int foo = pow(b, x);
				int bar = pow(a, y);

				int delta = 0;

				delta += pow(Math.floorMod(foo + bar - 1, P), r);
				if (delta >= P) {
					delta -= P;
				}

				delta -= pow(foo, r);
				if (delta < 0) {
					delta += P;
				}

				delta -= pow(bar, r);
				if (delta < 0) {
					delta += P;
				}

				delta++;
				if (delta >= P) {
					delta -= P;
				}

				delta = (int) ((long) delta * dp[x][y] % P);
				ans += delta;
				if (ans >= P) {
					ans -= P;
				}
			}
		}

		ans += (int) ((long) pow(one2D(a, p, b, q), r) * pow(a * b, r - 1) % P);
		if (ans >= P) {
			ans -= P;
		}

		ans += (int) ((long) pow(one2D(b, q, c, r), p) * pow(b * c, p - 1) % P);
		if (ans >= P) {
			ans -= P;
		}

		ans += (int) ((long) pow(one2D(c, r, a, p), q) * pow(c * a, q - 1) % P); // LOOOOOOOOOOOOOOL
		if (ans >= P) {
			ans -= P;
		}

		ans -= pow(a, q * r - 1);
		if (ans < 0) {
			ans += P;
		}

		ans -= pow(b, r * p - 1);
		if (ans < 0) {
			ans += P;
		}

		ans -= pow(c, p * q - 1);
		if (ans < 0) {
			ans += P;
		}

		ans++;
		if (ans >= P) {
			ans -= P;
		}
		ans = (int) ((long) ans * a % P * b % P * c % P);

		out.println(ans);
	}

	int one2D(int a, int p, int b, int q) {
		return Math.floorMod(pow(b, p - 1) + pow(a, q - 1) - 1, P);
	}

	int pow(int a, int b) {
		int ret = 1;
		for (; b > 0; b >>= 1) {
			if ((b & 1) == 1) {
				ret = (int) ((long) ret * a % P);
			}
			a = (int) ((long) a * a % P);
		}
		return ret;
	}

	static final int C = 110;
	static final int P = BigInteger.TEN.pow(9).intValueExact() + 7;
	int[][] ways;

	void preCalc() {
		ways = new int[C][];
		for (int i = 0; i < C; i++) {
			ways[i] = new int[i + 1];
			ways[i][0] = ways[i][i] = 1;
			for (int j = 1; j < i; j++) {
				ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % P;
			}
		}
	}

	void stress() {

	}

	void test() {

	}

	p03446() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new p03446();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null ||!st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}

```


Answer:
```python
import sys

def main():
    a, b, c, d, e, f = map(int, input().split())
    if d % a!= 0 or e % b!= 0 or f % c!= 0:
        print(0)
        return
    p, q, r = d // a, e // b, f // c
    dp = [[0] * (q + 1) for _ in range(p + 1)]
    dp[p][q] = 1
    ans = 0
    mod = 10 ** 9 + 7
    for x in range(p - 1, 0, -1):
        for y in range(q - 1, 0, -1):
            dp[x][y] = (ways[p][x] * ways[q][y] % mod) * pow(c, (p - x) * (q - y), mod) % mod
            for xb in range(x, p + 1):
                for yb in range(y, q + 1):
                    if xb + yb == x + y:
                        continue
                    dp[x][y] -= (dp[xb][yb] * ways[xb][x] % mod) * ways[yb][y] % mod
                    dp[x][y] %= mod
            foo = pow(b, x, mod)
            bar = pow(a, y, mod)
            delta = (pow(foo + bar - 1, r, mod) - pow(foo, r, mod) - pow(bar, r, mod) + 1) % mod
            delta = (delta * dp[x][y]) % mod
            ans += delta
            ans %= mod
    ans += (pow(one2D(a, p, b, q), r, mod) * pow(a * b, r - 1, mod)) % mod
    ans %= mod
    ans += (pow(one2D(b, q, c, r), p, mod) * pow(b * c, p - 1, mod)) % mod
    ans %= mod
    ans += (pow(one2D(c, r, a, p), q, mod) * pow(c * a, q - 1, mod)) % mod
    ans %= mod
    ans -= pow(a, q * r - 1, mod)
    ans %= mod
    ans -= pow(b, r * p - 1, mod)
    ans %= mod
    ans -= pow(c, p * q - 1, mod)
    ans %= mod
    ans += 1
    ans %= mod
    ans = (ans * a) % mod
    ans = (ans * b) % mod
    ans = (ans * c) % mod
    print(ans)

def pow(x, y, mod):
    ret = 1
    while y > 0:
        if y & 1:
            ret = (ret * x) % mod
        x = (x * x) % mod
        y >>= 1
    return ret

def one2D(a, p, b, q):
    return (pow(b, p - 1, mod) + pow(a, q - 1, mod) - 1) % mod

ways = [[0] * (i + 1) for i in range(110)]
for i in range(110):
    ways[i][0] = ways[i][i] = 1
    for j in range(1, i):
        ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % mod

if __name__ == '__main__':
    main()
```<|endoftext|>
