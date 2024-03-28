<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 0

Expected output:
5


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

@@ Response
```java
import java.util.*;
import java.util.stream.*;

public class Main {
    static int n, k;
    static List<int[]> abli = new ArrayList<>();
    static int cut = 1000000007;
    static int[] unused = new int[200001];
    static int[] unusedacum = new int[200001];
    static int[][] ggg = new int[200001][];
    static long[][] dp = new long[200001][];
    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt() * 2;
        k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                abli.add(new int[]{a, b});
            } else {
                abli.add(new int[]{b, a});
            }
        }
        for (int i = 1; i <= n; i++) {
            unused[i] = 1;
        }
        for (int[] ab : abli) {
            unused[ab[0]] -= 1;
        }
        for (int i = 1; i <= n; i++) {
            unusedacum[i] = unusedacum[i - 1] + unused[i];
        }
        for (int i = 1; i <= n; i++) {
            ggg[i] = new int[i + 1];
            for (int j = i + 1; j <= n; j++) {
                ggg[i][j] = isSandwiched(i, j) ? 0 : pairCombinations(numberUnderterminedBetween(i, j));
            }
        }
        for (int i = 1; i <= n; i++) {
            dp[i] = new long[n + 1];
            for (int j = i + 1; j <= n; j++) {
                if (ggg[i][j] != 0) {
                    dp[i][j] = (ggg[i][j] - IntStream.range(i, j).mapToLong(kk -> dp[i][kk] * ggg[kk + 1][j]).sum()) % cut;
                } else {
                    dp[i][j] = 0;
                }
                ans = (ans + dp[i][j] * pairCombinations(numberUnderterminedBetween(1, n) - numberUnderterminedBetween(i, j))) % cut;
            }
        }
        System.out.println(ans);
    }

    static boolean isSandwiched(int i, int j) {
        return abli.stream().anyMatch(ab -> ab[0] < i && ab[1] > j || ab[0] < i && ab[1] < j || ab[0] > i && ab[1] < j);
    }

    static int numberUnderterminedBetween(int i, int j) {
        return unusedacum[j] - unusedacum[i - 1];
    }

    static int pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x - 1);
        } else {
            return 0;
        }
    }

    static int doubleFactorial(int x) {
        int result = 1;
        for (int i = x; i > 0; i -= 2) {
            result = (result * i) % cut;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, initializes the necessary arrays and variables, and then calculates the answer. The `isSandwiched`, `numberUnderterminedBetween`, `pairCombinations`, and `doubleFactorial` methods are implemented in the same
