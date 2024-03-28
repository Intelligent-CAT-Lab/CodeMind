

```
import sys

n, k, MOD = map(int, sys.stdin.readline().split())

nChK = [[0 for i in range(k + 1)] for j in range(n + 1)]
for i in range(n + 1):
    nChK[i][0] = 1
    nChK[i][i] = 1
for i in range(2, n + 1):
    for j in range(1, i // 2 + 1):
        nChK[i][j] = (nChK[i - 1][j] + nChK[i - 1][j - 1]) % MOD
        nChK[i][i - j] = nChK[i][j]

numberOfSequencesOfSizeIwithElementBiggerThenJ = [[0 for i in range(k + 1)] for j in range(n + 1)]
sumValue = [[0 for i in range(k + 1)] for j in range(n + 1)]

for j in range(k, -1, -1):
    numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j] = 1 % MOD
    numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j] = (k - j) % MOD

sumValue[0][k] = 1
sumValue[1][k] = 0

for j in range(k - 1, -1, -1):
    sumValue[0][j] = (sumValue[0][j + 1] + numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j]) % MOD
    sumValue[1][j] = (sumValue[1][j + 1] + numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j]) % MOD

for i in range(2, n + 1):
    for j in range(k - 1, -1, -1):
        res = 0
        for sizeToTheLeft in range(i):
            optionLeft = sumValue[sizeToTheLeft][j + 1]
            optionRight = numberOfSequencesOfSizeIwithElementBiggerThenJ[i - 1 - sizeToTheLeft][j]
            optionToAddToEachSide = nChK[i - 1][sizeToTheLeft]
            res = (res + ((((optionLeft * optionRight) % MOD) * optionToAddToEachSide) % MOD)) % MOD
        numberOfSequencesOfSizeIwithElementBiggerThenJ[i][j] = res
        sumValue[i][j] = (sumValue[i][j + 1] + res) % MOD

print(numberOfSequencesOfSizeIwithElementBiggerThenJ[n][0])

```

## Problem F: F - 2016-2017 ACM-ICPC, NEERC, Southern Subregional Contest, Qualification Stage, Problem F

### Problem description

You are given a sequence of n integers a1, a2, ..., an.

You have to find the number of pairs of indices (i, j) (1 ≤ i < j ≤ n) such that ai + aj is divisible by 2016.

### Input

The first line contains integer n (1 ≤ n ≤ 105).

The second line contains n integers a1, a2, ..., an (0 ≤ ai ≤ 109).

### Output

Print the number of
