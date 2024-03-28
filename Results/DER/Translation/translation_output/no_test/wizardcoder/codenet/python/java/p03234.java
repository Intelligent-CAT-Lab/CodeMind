Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        int k = sc.nextInt();
        int n = 2*nn;
        List<int[]> abli = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                abli.add(new int[]{a, b});
            } else {
                abli.add(new int[]{b, a});
            }
        }
        List<Integer> flattenabli = new ArrayList<>();
        for (int[] ab : abli) {
            flattenabli.add(ab[0]);
            flattenabli.add(ab[1]);
        }
        int cut = 1000000007;

        List<Integer> unused = new ArrayList<>(Collections.nCopies(n+1, 1));
        for (int a : flattenabli) {
            unused.set(a, unused.get(a)-1);
        }
        List<Integer> unusedacum = new ArrayList<>(Collections.nCopies(n+1, 0));
        for (int i = 1; i <= n; i++) {
            unusedacum.set(i, unusedacum.get(i-1)+unused.get(i));
        }

        int modInverse(int a, int b) {
            int r0 = a, r1 = b, s0 = 1, s1 = 0;
            while (r1!= 0) {
                int q = r0 / r1;
                int stmp = s0 - q * s1;
                r0 = r1;
                s0 = s1;
                r1 = r0 % r1;
                s1 = stmp;
            }
            return s0 % cut;
        }

        Map<Integer, Integer> doubleFactorial = new HashMap<>();
        for (int i = 1; i <= n; i+=2) {
            doubleFactorial.put(i, 1);
        }
        for (int i = 3; i <= n; i+=2) {
            doubleFactorial.put(i, (doubleFactorial.get(i-2)*i) % cut);
        }

        List<List<Integer>> nonSandwichedNums = new ArrayList<>(Collections.nCopies(n+1, new ArrayList<>()));
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    nonSandwichedNums.get(i).add(j);
                }
            }
        }

        int numberUnderterminedBetween(int i, int j) {
            return unusedacum.get(j) - unusedacum.get(i-1);
        }

        int pairCombinations(int x) {
            if (x == 0) {
                return 1;
            } else if (x % 2 == 0) {
                return doubleFactorial.get(x-1);
            } else {
                return 0;
            }
        }

        int g(int i, int j) {
            int x = numberUnderterminedBetween(i, j);
            return pairCombinations(x);
        }

        int undetermined = numberUnderterminedBetween(1, n);

        List<List<Integer>> ggg = new ArrayList<>(Collections.nCopies(n+1, new ArrayList<>()));
        for (int i = 1; i <= n; i++) {
            List<Integer> gg = new ArrayList<>();
            for (int j = i+1; j <= n; j++) {
                gg.add(g(i, j));
            }
            ggg.add(gg);
        }

        int ans = 0;
        List<List<Integer>> dp = new ArrayList<>(Collections.nCopies(n+1, new ArrayList<>()));
        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = i+1; j <= n; j++) {
                int gg = ggg.get(i).get(j-i);
                if (gg!= 0) {
                    int sum = 0;
                    for (int kk : nonSandwichedNums.get(i)) {
                        if (kk < j) {
                            sum = (sum + dp.get(i).get(kk-i)*ggg.get(kk-i+1).get(j-i)) % cut;
                        }
                    }
                    dp.get(i).set(j-i, (ggg.get(i).get(j-i)-sum) % cut);
                } else {
                    dp.get(i).set(j-i, 0);
                }
                ans = (ans + dp.get(i).get(j-i)*pairCombinations(undetermined-numberUnderterminedBetween(i, j))) % cut;
            }
