<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
    static int n, k, cut = (int)1e9+7;
    static int[] unused, unusedacum;
    static ArrayList<int[]> abli;
    static int[][] ggg, dp;
    static ArrayList<Integer>[] nonSandwichedNums;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        k = Integer.parseInt(line[1]);
        unused = new int[n+1];
        unused[0] = 1;
        unused[1] = 1;
        for (int i = 2; i <= n; i++) {
            unused[i] = 2;
        }
        unusedacum = new int[n+1];
        unusedacum[0] = 0;
        for (int i = 1; i <= n; i++) {
            unusedacum[i] = unusedacum[i-1]+unused[i];
        }
        abli = new ArrayList<int[]>();
        for (int i = 0; i < k; i++) {
            line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            if (a < b) {
                abli.add(new int[]{a, b});
            } else {
                abli.add(new int[]{b, a});
            }
        }
        flattenabli = new ArrayList<Integer>();
        for (int[] ab : abli) {
            flattenabli.add(ab[0]);
            flattenabli.add(ab[1]);
        }
        flattenabli.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (int i = 0; i < flattenabli.size(); i++) {
            int a = flattenabli.get(i);
            unused[a]--;
        }
        nonSandwichedNums = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            nonSandwichedNums[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    nonSandwichedNums[i].add(j);
                }
            }
        }
        ggg = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                ggg[i][j] = g(i, j);
            }
        }
        undetermined = unusedacum[n];
        dp = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (ggg[i][j]!= 0) {
                    dp[i][j] = (ggg[i][j]-sum(dp[i][kk]*ggg[kk+1][j] for kk in nonSandwichedNums[i] if kk < j)) % cut;
                } else {
                    dp[i][j] = 0;
                }
                ans = (ans+dp[i][j]*pairCombinations(undetermined-unusedacum[j]-unusedacum[i-1])) % cut;
            }
        }
        System.out.println(ans);
    }

    public static int pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x-1);
        } else {
            return 0;
        }
    }

    public static int doubleFactorial(int x) {
        int ans = 1;
        for (int i = x; i > 0; i -= 2) {
            ans = (ans*i) % cut;
        }
        return ans;
    }

    public static int sum(int... x) {
        int ans = 0;
        for (int i : x) {
            ans = (ans+i) % cut;
        }
        return ans;
    }

    public static boolean isSandwiched(int i, int j) {
        for (int[] ab : abli) {
            if (ab[0] < i && i <= ab[1] && ab[1] <= j) {
                return true;
            } else if (i <= ab[0] && ab[0] <= j && j < ab[1]) {
                return true;
            }
        }
        return false;
    }

    public static int g(int i, int j) {
        int x = unusedacum[j]-unusedacum[i-1];
        return pairCombinations(x);
    }
}
```

