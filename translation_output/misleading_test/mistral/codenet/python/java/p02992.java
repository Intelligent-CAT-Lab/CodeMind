<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] ns = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            if (N < i * i) {
                break;
            }
            ns[i] = i;
            ns[i] = N / i;
        }
        Arrays.sort(ns);

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.length; i++) {
            m.put(ns[i], i);
        }

        int[] l = new int[ns.length];
        for (int i = 0; i < ns.length; i++) {
            l[i] = (N / ns[i]) - (N / ns[i + 1]);
        }

        int[][] dp = new int[K + 1][ns.length];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.length - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0, nn : ns) {
                int nj = m.get(N / nn);
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % 1000000007;
            }
        }

        int result = 0;
        for (int i : dp[K]) {
            result += i;
        }
        System.out.println(result % 1000000007);
    }
}
```</s>
