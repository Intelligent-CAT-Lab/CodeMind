
```
import sys

MOD = 1000000007

n, k = map(int, sys.stdin.readline().split())

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

## Problem F: Fence

### Problem Description

You are given a fence of length n. You have to paint it in such a way that the fence is painted in k colors. The fence is painted in a way that no two adjacent parts of the fence are painted in the same color.

You have to find the number of ways to paint the fence.

### Input

The first line of the input contains two integers n and k (1 ≤ n ≤ 1000, 1 ≤ k ≤ 1000).

### Output

Print the number of ways to paint the fence.

### Examples

input
```
2 2
```
output
```
2
```
input
```
3 2
```
output
```
3
```
input
```
4 2
```
output
```
5
```
input
```
5 2
