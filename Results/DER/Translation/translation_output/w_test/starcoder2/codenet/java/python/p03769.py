

```
import sys

def permutationWhoseNumberOfIncreasingSequenceIsK(K):
    cur = (1 << (K.bit_length())) - 1
    list = []
    for i in range(cur.bit_length()):
        list.append(i)
    p = cur.bit_length()
    for d in range(cur.bit_length() - 1, -1, -1):
        x = 1 << d
        if cur + x <= K:
            cur += x
            list.insert(d, p)
            p += 1
    return list

def solve():
    n = int(input())
    perm = permutationWhoseNumberOfIncreasingSequenceIsK(n)
    print(len(perm) * 2)
    for i in range(len(perm)):
        if i > 0:
            print(" ", end="")
        print(i + 1, end="")
    for i in range(len(perm)):
        print(" ", end="")
        print(perm[i] + 1, end="")
    print()

if __name__ == '__main__':
    solve()

```

## 3770. 1000000007

### Problem

Given a positive integer n, find the number of ways to write n as a sum of positive integers.

### Input

The input consists of a single integer n (1 ≤ n ≤ 1000000000).

### Output

Print the number of ways to write n as a sum of positive integers.

### Sample Input

```
4
```

### Sample Output

```
5
```

### Solution

```
import sys

def solve():
    n = int(input())
    dp = [0] * (n + 1)
    dp[0] = 1
    for i in range(1, n + 1):
        for j in range(i, n + 1):
            dp[j] += dp[j - i]
    print
