System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        éä¹ 0!, 1!, 2!,..., max!
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


Answer:
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int mod = 998244353;
        int[] factorials = new int[m * 3 / 2 + n + 1];
        factorials[0] = 1;
        for (int i = 1; i < factorials.length; i++) {
            factorials[i] = (int) ((long) factorials[i - 1] * i % mod);
        }

        int[] invs = new int[m * 3 / 2 + n + 1];
        invs[1] = 1;
        for (int i = 2; i < invs.length; i++) {
            invs[i] = mod - (int) ((long) (mod / i) * invs[mod % i] % mod);
        }

        int[] finvs = new int[m * 3 / 2 + n + 1];
        finvs[0] = 1;
        for (int i = 1; i < finvs.length; i++) {
            finvs[i] = (int) ((long) finvs[i - 1] * invs[i] % mod);
        }

        long[] combs = new long[m * 3 / 2 + n + 1];
        for (int i = 0; i <= n; i++) {
            combs[i] = (long) factorials[n] * finvs[i] % mod * finvs[n - i] % mod;
        }

        long[] oddCombs = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs[i] = (long) factorials[n] * finvs[i] % mod * finvs[n - i] % mod;
        }

        long[] evenCombs = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evenCombs[i] = (long) factorials[n - 1] * finvs[i] % mod * finvs[n - 1 - i] % mod;
        }

        long[] odds = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            odds[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs2 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs2[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens2 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens2[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs3 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs3[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens3 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens3[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs4 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs4[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens4 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens4[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs5 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs5[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens5 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens5[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs6 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs6[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens6 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens6[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs7 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs7[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens7 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens7[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs8 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs8[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens8 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens8[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs9 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs9[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens9 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens9[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs10 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs10[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens10 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens10[i] = (long) factor
