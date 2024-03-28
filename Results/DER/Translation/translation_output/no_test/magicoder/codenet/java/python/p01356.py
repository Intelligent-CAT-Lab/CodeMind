<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys
import math

def main():
    n, m, a, b, p, q = map(int, sys.stdin.readline().split())
    INF = 1000000000000000000
    if a == 1 and b == 1:
        ans = INF
        div = m // (p + q)
        div = min(div, n)
        ans = min(ans, abs(div * (p + q) - m))
        div = min(div + 1, n)
        ans = min(ans, abs(div * (p + q) - m))
        print(ans)
        return
    lim = 0
    while p * pow(a, lim) + q * pow(b, lim) <= m:
        lim += 1
    lim += 1
    lim = min(lim, n)
    lim = min(lim, 40)
    pending1 = []
    pending2 = []
    powA = [1] * 42
    powB = [1] * 42
    for i in range(1, 42):
        powA[i] = powA[i - 1] * a
        powB[i] = powB[i - 1] * b
    for t in range(2):
        max = (t == 0) and (lim // 2) or ((lim + 1) // 2)
        for i in range(1 << max):
            s = 0
            for j in range(max):
                if (i & (1 << j)) > 0:
                    s += p * powA[j + (t == 1) and (lim // 2) or 0] + q * powB[j + (t == 1) and (lim // 2) or 0]
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
        t = len(pending2) - 1
        for i in range(len(pending1)):
            if j == 0:
                while t > 0 and pending1[i] + pending2[t] > m:
                    t -= 1
            elif j == 1:
                while t > 0 and pending1[i] + pending2[t] >= m and pending1[i] + pending2[t - 1] >= m:
                    t -= 1
            ans = min(ans, abs(-m + pending1[i] + pending2[t]))
    print(ans)

def pow(a, n):
    ret = 1
    for _ in range(n):
        ret *= a
    return ret

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads input, checks conditions, and performs calculations in a similar way. The `pow` function is used to calculate the power of a number. The `main` function is the entry point of the program.<｜end▁of▁sentence｜>
