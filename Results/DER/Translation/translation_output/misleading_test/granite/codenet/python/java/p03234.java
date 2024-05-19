System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 0

Expected output:
-95

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
import java.io.*;
import java.util.*;

public class Main {
    static long MOD = 100000007;
    static long[] fact;
    static long[] invFact;

    static long modInv(long a, long b) {
        return modPow(a, b - 2, b);
    }

    static long modPow(long a, long b, long mod) {
        long ans = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = ans * a % mod;
            }
            a = a * a % mod;
            b /= 2;
        }
        return ans;
    }

    static void init() {
        fact = new long[200001];
        invFact = new long[200001];
        fact[0] = 1;
        invFact[0] = 1;
        for (int i = 1; i <= 200000; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            invFact[i] = modInv(fact[i], MOD);
        }
    }

    static long doubleFactorial(int n) {
        if (n % 2 == 0) {
            return fact[n - 1];
        } else {
            return 0;
        }
    }

    static long nCr(int n, int r) {
        if (n < r) {
            return 0;
        }
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }

    public static void main(String[] args) throws Exception {
        init();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]) * 2;
        int k = Integer.parseInt(in[1]);
        int[][] ab = new int[k][2];
        for (int i = 0; i < k; i++) {
            in = br.readLine().split(" ");
            ab[i][0] = Integer.parseInt(in[0]) - 1;
            ab[i][1] = Integer.parseInt(in[1]) - 1;
        }
        int[] count = new int[n];
        for (int i = 0; i < k; i++) {
            if (ab[i][0] > ab[i][1]) {
                int tmp = ab[i][0];
                ab[i][0] = ab[i][1];
                ab[i][1] = tmp;
            }
            count[ab[i][0]]++;
            count[ab[i][1] + 1]--;
        }
        for (int i = 1; i < n; i++) {
            count[i] += count[i - 1];
        }
        int[] nonSandwiched = new int[n];
        for (int i = 0; i < n; i++) {
            if (count[i] == 0) {
                nonSandwiched[i] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            nonSandwiched[i] += nonSandwiched[i - 1];
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (count[j] - count[i] == j - i - 1) {
                    long tmp = doubleFactorial(j - i - 1);
                    for (int l = 0; l < k; l++) {
                        if (ab[l][0] >= i && ab[l][1] <= j) {
                            continue;
                        }
                        if (ab[l][0] >= i && ab[l][0] <= j && ab[l][1] > j) {
                            tmp = tmp * nCr(count[j] - count[i], 2) % MOD;
                        } else if (ab[l][0] < i && ab[l][1] >= i && ab[l][1] <= j) {
                            tmp = tmp * nCr(count[j] - count[i], 1) % MOD;
                        }
                    }
                    ans = (ans + tmp) % MOD;
                }
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
