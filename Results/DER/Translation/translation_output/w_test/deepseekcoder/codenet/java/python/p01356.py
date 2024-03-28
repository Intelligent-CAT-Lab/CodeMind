<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 200 2 3 4 5

Expected output:
1


```
import java.util.*;

public class p01356 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long p = sc.nextLong();
		long q = sc.nextLong();
		long INF = 1000_000_000_000_000L;
		if (a == 1 && b == 1) {
			// (p+q)N
			long ans = INF;
			long div = m / (p + q);
			div = Math.min(div, n);
			ans = Math.min(ans, Math.abs(div * (p + q) - m));
			div = Math.min(div + 1, n);
			ans = Math.min(ans, Math.abs(div * (p + q) - m));
			System.out.println(ans);
			return;
		}
		// pa^k+qb^k
		long lim = 0;
		while (p * Math.pow(a, lim) + q * Math.pow(b, lim) <= m) {
			++lim;
		}
		lim += 1;
		lim = Math.min(lim, n);
		lim = Math.min(lim, 40);
		ArrayList<Long> pending1 = new ArrayList<>();
		ArrayList<Long> pending2 = new ArrayList<>();
		long[] powA = new long[42];
		long[] powB = new long[42];
		powA[0] = 1;
		powB[0] = 1;
		for (int i = 1; i < powA.length; ++i) {
			powA[i] = powA[i - 1] * a;
			powB[i] = powB[i - 1] * b;
		}
		for (int t = 0; t < 2; ++t) {
			long max = (t == 0 ? lim / 2 : (lim + 1) / 2);
			outer: for (long i = 0; i < (1L << max); ++i) {
				long s = 0;
				for (int j = 0; j < max; ++j) {
					if ((i & (1L << j)) > 0) {
						s += p * powA[(int) (j + (t == 1 ? lim / 2 : 0))]
								+ q * powB[(int) (j + (t == 1 ? lim / 2 : 0))];
						if (s > INF)
							continue outer;
					}
				}
				if (t == 0)
					pending1.add(s);
				else
					pending2.add(s);
			}
		}

		Collections.sort(pending1);
		Collections.sort(pending2);

		long ans = m;
		for (int j = 0; j < 2; ++j) {
			int t = pending2.size() - 1;
			for (int i = 0; i < pending1.size(); ++i) {
				if (j == 0)
					while (t > 0 && pending1.get(i) + pending2.get(t) > m)
						--t;
				else if (j == 1)
					while (t > 0 && pending1.get(i) + pending2.get(t) >= m
							&& pending1.get(i) + pending2.get(t - 1) >= m)
						--t;
				ans = Math.min(ans, Math.abs(-m + pending1.get(i) + pending2.get(t)));
			}
		}

		System.out.println(ans);

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	static long pow(long a, long n) {
		long ret = 1;
		for (; n > 0; n >>= 1, a *= a) {
			if (n % 2 == 1) {
				ret *= a;
			}
		}
		return ret;
	}
}
```

### Response:
```python
import sys

def pow(a, n):
    ret = 1
    for _ in range(n):
        ret *= a
    return ret

def main():
    n, m, a, b, p, q = map(int, sys.stdin.readline().split())
    INF = 10000000000000000
    if a == 1 and b == 1:
        ans = min(abs(m - (m // (p + q)) * (p + q)), abs(m - ((m // (p + q)) + 1) * (p + q)))
        print(ans)
        return
    lim = 0
    while p * pow(a, lim) + q * pow(b, lim) <= m:
        lim += 1
    lim = min(lim, n, 40)
    pending1 = []
    pending2 = []
    powA = [1] * 42
    powB = [1] * 42
    for i in range(1, 42):
        powA[i] = powA[i - 1] * a
        powB[i] = powB[i - 1] * b
    for t in range(2):
        max = lim // 2 if t == 0 else (lim + 1) // 2
        for i in range(1 << max):
            s = 0
            for j in range(max):
                if (i & (1 << j)) > 0:
                    s += p * powA[j + (t == 1) * (lim // 2)] + q * powB[j + (t == 1) * (lim // 2)]
                    if s > INF:
                        continue
            if t == 0:
                pending1.append(s)
            else:
                pending2.append(s)
    pending1.sort()
    pending2.sort()
    ans = m
    for j in range(2):
        t = len(pending2) - 1 if j == 1 else 0
        for i in range(len(pending1)):
            if j == 0:
                while t > 0 and pending1[i] + pending2[t] > m:
                    t -= 1
            else:
                while t > 0 and pending1[i] + pending2[t] >= m and pending1[i] + pending2[t - 1] >= m:
                    t -= 1
            ans = min(ans, abs(-m + pending1[i] + pending2[t]))
    print(ans)

if __name__ == "__main__":
    main()
```
<|EOT|>
