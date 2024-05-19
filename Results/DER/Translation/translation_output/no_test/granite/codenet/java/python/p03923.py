System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class p03923 {
	public static void main(String[] args) {
		new p03923().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		System.out.println(solver(n, a));
	}

	long solver(long n, long a) {
		long ans = n;
		if (n == 1) {
			return 1;
		}
		for (int i = 1; i <= 40; ++i) {
			// min ( k1 + k2 +... ki + a*(i-1) )
			// k1*k2*k3*...*ki>=n
			long t = a * (i - 1);
			long maxK = f(i, n);
			long curK = 1;
			for (int j = 0; j < i; ++j) {
				if (curK * pow(maxK - 1, i - j) / pow(maxK - 1, i - j) == curK && curK * pow(maxK - 1, i - j) < n) {
					t += maxK;
					if (curK!= curK * maxK / maxK) {
						curK = n;
					} else {
						curK *= maxK;
					}
				} else {
					t += maxK - 1;
					if (curK!= curK * (maxK - 1) / (maxK - 1)) {
						curK = n;
					} else {
						curK *= maxK - 1;
					}
				}
			}
			ans = Math.min(ans, t);
		}
		return ans;
	}

	long f(long i, long n) {
		long ok = n;
		long ng = 0;
		out: while (ok - ng > 1) {
			long middle = (ok + ng) / 2;
			long v = 1;
			for (int k = 0; k < i; ++k) {
				if (v!= v * middle / middle) {
					ok = middle;
					continue out;
				}
				v *= middle;
			}
			if (v >= n) {
				ok = middle;
			} else {
				ng = middle;
			}
		}
		return ok;
	}

	long pow(long a, long n) {
		long ret = 1;
		for (; n > 0; n >>= 1, a *= a) {
			if (n % 2 == 1) {
				ret *= a;
			}
		}
		return ret;
	}

	int solver2(int n, int a) {
		int[] dp = new int[2 * n];
		Arrays.fill(dp, Integer.MAX_VALUE >> 3);
		dp[0] = 0;
		for (int i = 0; i < n; ++i) {
			if (i!= 0)
				for (int j = i; j < 2 * n; j += i) {
					dp[j] = Math.min(dp[j], dp[i] + a + j / i);
				}
			else {
				for (int j = 1; j < 2 * n; ++j) {
					dp[j] = j;
				}
			}
		}
		int ans = Integer.MAX_VALUE >> 3;
		for (int i = n; i < 2 * n; ++i) {
			ans = Math.min(ans, dp[i]);
		}
		return ans;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
```


Answer:
```python
import math

def solver(n, a):
    ans = n
    if n == 1:
        return 1
    for i in range(1, 41):
        # min ( k1 + k2 +... ki + a*(i-1) )
        # k1*k2*k3*...*ki>=n
        t = a * (i - 1)
        max_k = f(i, n)
        cur_k = 1
        for j in range(i):
            if cur_k * pow(max_k - 1, i - j) / pow(max_k - 1, i - j) == cur_k and cur_k * pow(max_k - 1, i - j) < n:
                t += max_k
                if cur_k!= cur_k * max_k / max_k:
                    cur_k = n
                else:
                    cur_k *= max_k
            else:
                t += max_k - 1
                if cur_k!= cur_k * (max_k - 1) / (max_k - 1):
                    cur_k = n
                else:
                    cur_k *= max_k - 1
        ans = min(ans, t)
    return ans

def f(i, n):
    ok = n
    ng = 0
    while ok - ng > 1:
        middle = (ok + ng) // 2
        v = 1
        for k in range(i):
            if v!= v * middle // middle:
                ok = middle
                break
            v *= middle
        else:
            if v >= n:
                ok = middle
            else:
                ng = middle
    return ok

def pow(a, n):
    ret = 1
    for _ in range(n):
        if n % 2 == 1:
            ret *= a
        a *= a
        n //= 2
    return ret

n, a = map(int, input().split())
print(solver(n, a))
```<|endoftext|>
