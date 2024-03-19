<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int[] unused = new int[n + 1];
        for (int i = 0; i < k; i++) {
            unused[a[i]]++;
            unused[b[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            unused[i] = unused[i] / 2;
        }
        int[] unusedacum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unusedacum[i] = unusedacum[i - 1] + unused[i];
        }
        int cut = 1000000007;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int x = unusedacum[j] - unusedacum[i - 1];
                int[] nonSandwichedNums = new int[j - i + 1];
                int k = 0;
                for (int l = i; l <= j; l++) {
                    if (unused[l] == 0) {
                        nonSandwichedNums[k++] = l;
                    }
                }
                int[] dp = new int[j - i + 1];
                for (int l = 0; l < nonSandwichedNums.length; l++) {
                    int gg = g(i, nonSandwichedNums[l]);
                    if (gg!= 0) {
                        dp[l] = (gg - sum(ggg[i][k] * ggg[k + 1][nonSandwichedNums[l]] for k in nonSandwichedNums if k < nonSandwichedNums[l])) % cut;
                    } else {
                        dp[l] = 0;
                    }
                    ans = (ans + dp[l] * pairCombinations(x - numberUnderterminedBetween(i, nonSandwichedNums[l]))) % cut;
                }
            }
        }
        System.out.println(ans);
    }

    public static int pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x - 1);
        } else {
            return 0;
        }
    }

    public static int doubleFactorial(int x) {
        int ans = 1;
        for (int i = x; i > 0; i -= 2) {
            ans = ans * i;
        }
        return ans;
    }

    public static int sum(int... x) {
        int ans = 0;
        for (int i = 0; i < x.length; i++) {
            ans = ans + x[i];
        }
        return ans;
    }

    public static int numberUnderterminedBetween(int i, int j) {
        return unusedacum[j] - unusedacum[i - 1];
    }

    public static int g(int i, int j) {
        int x = numberUnderterminedBetween(i, j);
        return pairCombinations(x);
    }
}
```
<|endoftext|>
