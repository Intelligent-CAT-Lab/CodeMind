System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p02065 {
	static Scanner sc = new Scanner(System.in);
	static int N, K, M;

	public static void main(String[] args) {
		N = sc.nextInt();
		K = sc.nextInt();
		M = sc.nextInt();
		int MASK = (1 << K) - 1;
		if (N < K) {
			System.out.println(naive());
			return;
		}
		long[][][] dp = new long[2][K + 1][1 << K];
		for (int i = 0; i < (1 << K); i++) {
			int c = 0;
			boolean ok = true;
			for (int j = 0; j < K; j++) {
				if ((i & (1 << (K - 1 - j))) == 0) {
					c--;
				} else {
					c++;
				}
				if (c < 0) {
					ok = false;
					break;
				}
			}
			if (!ok) continue;
			int u = Integer.bitCount(i);
			int l = K - u;
			if (u < l) continue;
			dp[0][u - l][i] = 1;
		}
		int t = 1;
		for (int i = K; i < 2 * N; i++, t = 1 - t) {
			for (long[] a : dp[t]) {
				Arrays.fill(a, 0);
			}
			for (int j = i % 2; j <= K; j += 2) {
				int l = (i - j) / 2;
				int u = l + j;
				for (int k = 0; k < (1 << K); k++) {
					int uc = Integer.bitCount(k);
					if (0 < j && j <= uc && (l == 0 || k!= MASK)) { // put lower row
						dp[t][j - 1][(k << 1) & MASK] += dp[1 - t][j][k];
						dp[t][j - 1][(k << 1) & MASK] %= M;
					}
					if (u < N && j < K && k!= 0) { // put upper row
						dp[t][j + 1][((k << 1) + 1) & MASK] += dp[1 - t][j][k];
						dp[t][j + 1][((k << 1) + 1) & MASK] %= M;
					}
				}
			}
//			System.err.println(Arrays.deepToString(dp[t]));
		}
		long ans = 0;
		for (long v : dp[1 - t][0]) {
			ans += v;
		}
		System.out.println(ans % M);
	}

	static long naive() {
		ArrayList<Integer> u = new ArrayList<>();
		ArrayList<Integer> l = new ArrayList<>();
		u.add(0);
		return rec(u, l, 1);
	}

	static long rec(ArrayList<Integer> u, ArrayList<Integer> l, int cur) {
		if (cur == 2 * N) return 1;
		long ret = 0;
		if (u.size() < N) {
			u.add(cur);
			ret += rec(u, l, cur + 1);
			u.remove(u.size() - 1);
		}
		if (l.size() < u.size() && cur <= u.get(l.size()) + K) {
			l.add(cur);
			ret += rec(u, l, cur + 1);
			l.remove(l.size() - 1);
		}
		return ret % M;
	}

}


```


Answer:
```python
import sys

N, K, M = map(int, input().split())

if N < K:
    print(naive())
    sys.exit(0)

dp = [[[0] * (1 << K) for _ in range(K + 1)] for _ in range(2)]

for i in range(1 << K):
    c = 0
    ok = True
    for j in range(K):
        if (i >> (K - 1 - j)) & 1 == 0:
            c -= 1
        else:
            c += 1
        if c < 0:
            ok = False
            break
    if not ok: continue
    u = bin(i).count('1')
    l = K - u
    if u < l: continue
    dp[0][u - l][i] = 1

t = 1
for i in range(K, 2 * N):
    for j in range(i % 2, K + 1, 2):
        l = (i - j) // 2
        u = l + j
        for k in range(1 << K):
            uc = bin(k).count('1')
            if 0 < j <= uc and (l == 0 or k!= (1 << K) - 1):
                dp[t][j - 1][(k << 1) & ((1 << K) - 1)] += dp[1 - t][j][k]
                dp[t][j - 1][(k << 1) & ((1 << K) - 1)] %= M
            if u < N and j < K and k!= 0:
                dp[t][j + 1][((k << 1) + 1) & ((1 << K) - 1)] += dp[1 - t][j][k]
                dp[t][j + 1][((k << 1) + 1) & ((1 << K) - 1)] %= M

ans = sum(dp[1 - t][0]) % M
print(ans)
```<|endoftext|>
