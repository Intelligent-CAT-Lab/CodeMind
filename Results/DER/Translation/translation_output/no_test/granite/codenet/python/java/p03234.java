System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
#! /usr/bin/env python
# -*- coding: utf-8 -*-
# vim:fenc=utf-8
#

"""
AGC028 D
"""

import itertools
from functools import reduce
from functools import lru_cache

nn, k = map(int, input().split())
n = 2*nn
abli = []
for i in range(k):
    a, b = map(int, input().split())
    if a < b:
        abli.append((a, b))
    else:
        abli.append((b, a))
flattenabli = itertools.chain.from_iterable(abli)

cut = 10**9+7

unused = [1 for i in range(n+1)]
for a in flattenabli:
    unused[a] -= 1
unusedacum = list(itertools.accumulate(unused))


def modInverse(a, b, divmod=divmod):
    r0, r1, s0, s1 = a, b, 1, 0
    while r1!= 0:
        q, rtmp = divmod(r0, r1)
        stmp = s0-q*s1
        r0, s0 = r1, s1
        r1, s1 = rtmp, stmp
    return s0 % cut


@lru_cache(maxsize=None)
def doubleFactorial(x):
    return reduce(lambda y, z: y*z % cut, range(x, 0, -2))


@lru_cache(maxsize=None)
def isSandwiched(i, j):
    return any(map(lambda k: abli[k][0] < i <= abli[k][1] <= j or i <= abli[k][0] <= j < abli[k][1], range(k)))


nonSandwichedNums = [[] for i in range(n+1)]
for i in range(1, n+1):
    for j in range(i+1, n+1):
        if not isSandwiched(i, j):
            nonSandwichedNums[i].append(j)


def numberUnderterminedBetween(i, j):
    return unusedacum[j]-unusedacum[i-1]


def pairCombinations(x):
    if x == 0:
        return 1
    elif x % 2 == 0:
        return doubleFactorial(x-1)
    else:
        return 0


def g(i, j):
    x = numberUnderterminedBetween(i, j)
    return pairCombinations(x)


undetermined = numberUnderterminedBetween(1, n)

ggg = [[0]*(i+1) for i in range(n+1)]
for i in range(1, n+1):
    for j in range(i+1, n+1):
        ggg[i].append(g(i, j))

ans = 0
dp = [[0]*(n+1) for i in range(n+1)]
for i in range(1, n+1):
    for j in nonSandwichedNums[i]:
        gg = ggg[i][j]
        if gg!= 0:
            dp[i][j] = (ggg[i][j]-sum([dp[i][kk]*ggg[kk+1][j] for kk in nonSandwichedNums[i] if kk < j])) % cut
        else:
            dp[i][j] = 0
        ans = (ans + dp[i][j]*pairCombinations(undetermined-numberUnderterminedBetween(i, j))) % cut


print(ans)

```


Answer:
```java
import java.util.*;
import java.io.*;

class Main {
    static long MOD = 100000007;
    static int MAX = 2000;
    static long[] fact = new long[MAX];
    static long[] invFact = new long[MAX];
    static long[] unused = new long[MAX];
    static long[][] dp = new long[MAX][MAX];
    static int[][] abli = new int[MAX][2];
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 2;
        k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            abli[i][0] = sc.nextInt();
            abli[i][1] = sc.nextInt();
        }
        sc.close();

        fact[0] = 1;
        for (int i = 1; i < MAX; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        invFact[MAX - 1] = modInverse(fact[MAX - 1]);
        for (int i = MAX - 2; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }

        for (int i = 0; i < k; i++) {
            if (abli[i][0] > abli[i][1]) {
                int tmp = abli[i][0];
                abli[i][0] = abli[i][1];
                abli[i][1] = tmp;
            }
        }
        Arrays.sort(abli, (a, b) -> a[0] - b[0]);

        for (int i = 1; i <= n; i++) {
            unused[i] = 1;
        }
        for (int i = 0; i < k; i++) {
            unused[abli[i][0]]--;
            unused[abli[i][1]]--;
        }
        for (int i = 1; i <= n; i++) {
            unused[i] += unused[i - 1];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                boolean isSandwiched = false;
                for (int l = 0; l < k; l++) {
                    if (abli[l][0] < i && j < abli[l][1]) {
                        isSandwiched = true;
                        break;
                    }
                }
                if (!isSandwiched) {
                    dp[i][j] = (doubleFactorial(unused[j] - unused[i - 1]) - getSum(i, j)) % MOD;
                    if (dp[i][j] < 0) {
                        dp[i][j] += MOD;
                    }
                }
            }
        }

        long ans = 0;
        int undetermined = unused[n] - unused[0];
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (dp[i][j]!= 0) {
                    ans += dp[i][j] * doubleFactorial(undetermined - (unused[j] - unused[i - 1]));
                    ans %= MOD;
                }
            }
        }
        System.out.println(ans);
    }

    static long getSum(int i, int j) {
        long sum = 0;
        for (int l = 0; l < k; l++) {
            if (abli[l][0] < i && j < abli[l][1]) {
                sum += dp[i][abli[l][0]] * dp[abli[l][1] + 1][j] % MOD;
                sum %= MOD;
            }
        }
        return sum;
    }

    static long doubleFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return fact[x - 1] * invFact[x - 1] % MOD;
        } else {
            return 0;
        }
    }

    static long modInverse(long a, long m) {
        long[] ans = extGCD(a, m);
        return (ans[0] + m) % m;
    }

    static long[] extGCD(long a, long b) {
        if (b == 0) {
            return new long[]{1, 0};
        } else {
            long[] ans = extGCD(b, a % b);
            long tmp = ans[0];
            ans[0] = ans[1];
            ans[1] = tmp - (a / b) * ans[1];
            return ans;
        }
    }
}
```<|endoftext|>
