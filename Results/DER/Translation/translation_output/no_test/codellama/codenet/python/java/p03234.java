<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AGC028D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nn = scanner.nextInt();
        int k = scanner.nextInt();
        int n = 2 * nn;
        List<List<Integer>> abli = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                abli.add(List.of(a, b));
            } else {
                abli.add(List.of(b, a));
            }
        }
        int cut = 1000000007;

        int[] unused = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            unused[i] = 1;
        }
        for (List<Integer> ab : abli) {
            unused[ab.get(0)] -= 1;
            unused[ab.get(1)] -= 1;
        }
        int[] unusedAcum = new int[n + 1];
        unusedAcum[0] = unused[0];
        for (int i = 1; i < n + 1; i++) {
            unusedAcum[i] = unusedAcum[i - 1] + unused[i];
        }

        int[][] ggg = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                ggg[i][j] = g(i, j);
            }
        }

        int undetermined = unusedAcum[n] - unusedAcum[0];

        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                int gg = ggg[i][j];
                if (gg != 0) {
                    dp[i][j] = (ggg[i][j] - IntStream.range(0, n + 1)
                            .filter(k -> k < j)
                            .map(k -> dp[i][k] * ggg[k + 1][j])
                            .sum()) % cut;
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                ans = (ans + dp[i][j] * pairCombinations(undetermined - numberUnderterminedBetween(i, j))) % cut;
            }
        }

        System.out.println(ans);
    }

    private static int g(int i, int j) {
        int x = numberUnderterminedBetween(i, j);
        return pairCombinations(x);
    }

    private static int numberUnderterminedBetween(int i, int j) {
        return unusedAcum[j] - unusedAcum[i - 1];
    }

    private static int pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x - 1);
        } else {
            return 0;
        }
    }

    private static int doubleFactorial(int x) {
        return IntStream.range(x, 0, -2)
                .map(i -> i * (
