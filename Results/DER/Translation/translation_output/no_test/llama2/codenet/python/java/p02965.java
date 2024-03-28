<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import os
import sys

import numpy as np

if os.getenv("LOCAL"):
    sys.stdin = open("_in.txt", "r")


def main():
    sys.setrecursionlimit(2147483647)
    INF = float("inf")
    IINF = 10 ** 18
    MOD = 998244353

    N, M = list(map(int, sys.stdin.readline().split()))

    def get_factorials(max, mod=None):
        """
        éä¹ 0!, 1!, 2!, ..., max!
        :param int max:
        :param int mod:
        :return:
        """
        ret = [1]
        n = 1
        if mod:
            for i in range(1, max + 1):
                n *= i
                n %= mod
                ret.append(n)
        else:
            for i in range(1, max + 1):
                n *= i
                ret.append(n)
        return ret

    def mod_invs(max, mod):
        """
        éåã®ãªã¹ã 0 ãã max ã¾ã§
        :param max:
        :param mod:
        :return:
        """
        invs = [1] * (max + 1)
        for x in range(2, max + 1):
            invs[x] = (-(mod // x) * invs[mod % x]) % mod
        return invs

    factorials = np.array(get_factorials(M * 3 // 2 + N, MOD), dtype=int)
    finvs = np.ones(M * 3 // 2 + N + 1, dtype=int)
    p = 1
    for i, inv in enumerate(mod_invs(M * 3 // 2 + N, MOD)):
        p = p * inv % MOD
        finvs[i] = p

    def ncr(n, r, mod=None):
        """
        scipy.misc.comb ã¾ãã¯ scipy.special.comb ã¨åã
        çµã¿åããã®æ° nCr
        :param int n:
        :param int r:
        :param int mod: 3 ä»¥ä¸ã®ç´ æ°ã§ãããã¨
        :rtype: int
        """
        ret = factorials[n] * finvs[r] % MOD * finvs[n - r] % mod
        ret[n < r] = 0
        return ret

    # (1) åè¨ã M*3 ã§ãå¥æ°ã®æ°ã M ä»¥ä¸ã§ããæ°åã®æ°
    odds = np.arange(M % 2, M + 1, 2)
    halves = (M * 3 - odds) // 2

    oc1 = ncr(N, odds, MOD)
    oc2 = ncr(N - 1, odds, MOD)

    # åè¨ã halfs ã®æ°åã 2 åãã¦ãodds åé¸ãã§ 1 ãè¶³ã
    c1 = ncr(halves + N - 1, N - 1, MOD) * oc1 % MOD

    # (2) max ã M*2 ããå¤§ãããå¥æ°ã®æ°ã M ä»¥ä¸ã§ããæ°åã®æ°
    # => åè¨ã M ã§ã1 è¦ç´ ç®ã 0 ããå¤§ãããå¥æ°ã M ä»¥ä¸ã§ããæ°åã®æ° * N
    # 1 è¦ç´ ç®ã« M*2 ãè¶³ãã° (2) ã«ãªã
    halves = (M - odds) // 2
    # a. åè¨ã M ã§å¥æ°ã M ä»¥ä¸
    c2a = ncr(halves + N - 1, N - 1, MOD) * oc1 % MOD
    # c2a = c1
    # b. 1 è¦ç´ ç®ã 0 ã§ããæ°åã®æ°
    c2b = ncr(halves + N - 2, N - 2, MOD) * oc2 % MOD

    c2 = (c2a - c2b) * N % MOD
    print((c1 - c2).sum() % MOD)


if __name__ == '__main__':
    main()

```

## 解答

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            map.put(a, map.getOrDefault(a, 0) + b);
        }
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    continue;
                }
                int a = map.get(i);
                int b = map.get(j);
                ans += dp[i][j] * a * b;
            }
        }
        System.out.println(ans % 1000000007);
    }
}
```
</s>
