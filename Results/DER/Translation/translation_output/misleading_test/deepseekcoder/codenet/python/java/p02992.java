<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
-8

```
#!/usr/bin/env python3
import sys
from math import *
from itertools import *
from collections import *
from functools import *
from operator import *
try:
    from math import gcd
except Exception:
    from fractions import gcd

MOD = 1000000007  # type: int

def solve(N: int, K: int):
    ns = []
    for i in range(1, N + 1):
        if N < i * i:
            break
        ns.append(i)
        ns.append(N // i)
    ns = sorted(list(set(ns)))

    m = {n: i for i, n in enumerate(ns)}
    l = [1] * len(ns)
    for i, (s, b) in enumerate(zip(ns, ns[1:])):
        l[i] = (N // s) - (N // b)

    dp = [[0] * len(ns) for _ in range(K+1)]
    dp[0][m[N]] = 1

    for i in range(K):
        for j in range(len(ns) - 2, -1, -1):
            dp[i][j] += dp[i][j + 1]
        for j, nn in enumerate(ns):
            nj = m[N // nn]
            dp[i+1][j] = (dp[i+1][j] + dp[i][nj] * l[j]) % MOD

    return sum(dp[-1]) % MOD


def main():
    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    N = int(next(tokens))  # type: int
    K = int(next(tokens))  # type: int
    result = solve(N, K)
    print(result)

if __name__ == '__main__':
    main()
```

### Response:
```java
import java.util.*;

public class Main {
    static final int MOD = (int)1e9 + 7;
    static int N, K;
    static List<Integer> ns = new ArrayList<>();
    static int[] l, m;
    static long[][] dp;

    static void solve(int n, int k) {
        N = n;
        K = k;
        ns.clear();
        for (int i = 1; ; ++i) {
            if (N < i * i) break;
            ns.add(i);
            ns.add(N / i);
        }
        Collections.sort(ns);
        ns = new ArrayList<>(new HashSet<>(ns));

        m = new int[N+1];
        l = new int[ns.size()];
        for (int i = 0; i < ns.size(); ++i) {
            m[ns.get(i)] = i;
            l[i] = (N / ns.get(i)) - (N / ns.get(i+1));
        }

        dp = new long[K+1][ns.size()];
        dp[0][m[N]] = 1;

        for (int i = 0; i < K; ++i) {
            for (int j = ns.size() - 2; j >= 0; --j) {
                dp[i][j] = (dp[i][j] + dp[i][j + 1]) % MOD;
            }
            for (int j = 0; j < ns.size(); ++j) {
                int nj = m[N / ns.get(j)];
                dp[i+1][j] = (dp[i+1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        solve(N, K);
        long ans = 0;
        for (int i = 0; i <= K; ++i) {
            ans = (ans + dp[i][0]) % MOD;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, solves the problem, and prints the result to the standard output. The `solve` function is a direct translation of the Python code, and the `main` function reads the input, calls `solve`, and prints the result.
<|EOT|>
