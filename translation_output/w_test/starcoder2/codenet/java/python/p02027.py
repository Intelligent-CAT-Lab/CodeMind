

```
import sys

def search(num, count, max):
    if count == 0:
        return 1
    if num in dp:
        if count in dp[num]:
            return dp[num][count]
    total = 0
    for i in range(2, int(max / (num * 2 ** (count - 1))) + 1):
        total += search(num * i, count - 1, max)
    if num in dp:
        dp[num][count] = total
    else:
        dp[num] = {count: total}
    return total

dp = {}
n, k = map(int, sys.stdin.readline().strip().split())
total = 0
for i in range(1, int(n / (2 ** (k - 1))) + 1):
    total += search(i, k - 1, n)
print(total)
```
/p02027.py
import sys

def search(num, count, max):
    if count == 0:
        return 1
    if num in dp:
        if count in dp[num]:
            return dp[num][count]
    total = 0
    forx / (num * 2 ** (count - 1))) + 1):
        total += search(num * i, count - 1, max)
    if num in dp:
        dp[num][count] = total
    else:
        dp[num] = {count: total}
    return total

dp = {}
n, k = map(int, sys.stdin.readline().strip().split())
total = 0
for i in range(1, int(n / (2 ** (k - 1))) + 1):
    total += search(i, k - 1, n)
print(total)
 i in range(2, int(ma
