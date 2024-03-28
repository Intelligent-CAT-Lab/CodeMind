<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
    while r1 != 0:
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
        if gg != 0:
            dp[i][j] = (ggg[i][j]-sum([dp[i][kk]*ggg[kk+1][j] for kk in nonSandwichedNums[i] if kk < j])) % cut
        else:
            dp[i][j] = 0
        ans = (ans + dp[i][j]*pairCombinations(undetermined-numberUnderterminedBetween(i, j))) % cut


print(ans)

```
[/INST]
```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static final int cut = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nn = scanner.nextInt();
        int k = scanner.nextInt();
        int n = 2 * nn;
        List<int[]> abli = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                abli.add(new int[]{a, b});
            } else {
                abli.add(new int[]{b, a});
            }
        }
        List<Integer> flattenabli = abli.stream().flatMapToInt(a -> Arrays.asList(a[0], a[1])).collect(Collectors.toList());

        int[] unused = new int[n + 1];
        Arrays.fill(unused, 1);
        for (int a : flattenabli) {
            unused[a]--;
        }
        int[] unusedacum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            unusedacum[i] = unused[i];
        }

        int modInverse(int a, int b) {
            int r0 = a, r1 = b, s0 = 1, s1 = 0;
            while (r1 != 0) {
                int q = r0 / r1;
                int rtmp = r0 % r1;
                int stmp = s0 - q * s1;
                r0 = r1;
                r1 = rtmp;
                s0 = s1;
                s1 = stmp;
            }
            return s0 % cut;
        }

        @SuppressWarnings("unused")
        int doubleFactorial(int x) {
            return (int) Math.pow(2, x) * (x == 0 ? 1 : (x & 1) == 0 ? doubleFactorial(x - 1) : doubleFactorial(x - 2));
        }

        @SuppressWarnings("unused")
        boolean isSandwiched(int i, int j) {
            for (int k : abli) {
                if (k[0] < i && i <= k[1] && j <= k[1]) {
                    return true;
                }
                if (i <= k[0] && k[0] <= j && j < k[1]) {
                    return true;
                }
            }
            return false;
        }

        List<List<Integer>> nonSandwichedNums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> nums = new ArrayList<>();
            for (int j = i + 1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    nums.add(j);
                }
            }
            nonSandwichedNums.add(nums);
        }

        int numberUnderterminedBetween(int i, int j) {
            return unusedacum[j] - unusedacum[i - 1];
        }

        int[][] g = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    g[i][j] = modInverse(numberUnderterminedBetween(i, j), cut);
                }
            }
        }

        int ans = 0;
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int gg = g[i][j];
                if (gg != 0) {
                    dp[i][j] = (gg * (dp[i -
