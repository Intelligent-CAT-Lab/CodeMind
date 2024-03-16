<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int INF = Integer.MAX_VALUE;
    private static final int MOD = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("_in.txt"));
        String line = br.readLine();
        List<Integer> nums = new ArrayList<>();
        for (String s : line.split(" ")) {
            nums.add(Integer.parseInt(s));
        }
        int N = nums.get(0);
        int M = nums.get(1);

        List<Integer> factorials = getFactorials(M * 3 / 2 + N, MOD);
        List<Integer> finvs = getModInvs(M * 3 / 2 + N, MOD);

        int p = 1;
        for (int i = 0; i < finvs.size(); i++) {
            p = p * finvs.get(i) % MOD;
        }

        List<Integer> odds = new ArrayList<>();
        for (int i = 1; i < M; i += 2) {
            odds.add(i);
        }
        int halves = (M * 3 - odds.size()) / 2;

        int oc1 = getNCR(N, odds, MOD);
        int oc2 = getNCR(N - 1, odds, MOD);

        int c1 = getNCR(halves + N - 1, N - 1, MOD) * oc1 % MOD;

        int halves2 = (M - odds.get(0)) / 2;
        int c2a = getNCR(halves2 + N - 1, N - 1, MOD) * oc1 % MOD;
        int c2b = getNCR(halves2 + N - 2, N - 2, MOD) * oc2 % MOD;
        int c2 = (c2a - c2b) * N % MOD;

        System.out.println((c1 - c2).sum() % MOD);
    }

    private static List<Integer> getFactorials(int n, int mod) {
        List<Integer> ret = new ArrayList<>();
        ret.add(1);
        for (int i = 2; i <= n; i++) {
            ret.add(ret.get(i - 1) * i % mod);
        }
        return ret;
    }

