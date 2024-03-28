

```python
import sys

def main():
    s, k = input().split()
    k = int(k)
    n = len(s)
    a = [0] * n
    count = 0
    for i in range(n - 1, -1, -1):
        if s[i] == '0':
            a[i] = count
            count = 0
        else:
            count += 1
    a[n - 1] = count
    ones = n - 1
    zeros = len(s) - ones
    if ones == 0 or zeros == 0:
        print(1)
        return
    dp = [[[0] * (zeros + 1) for _ in range(zeros + 1)] for _ in range(n + 1)]
    sum0 = [[0] * (zeros + 1) for _ in range(zeros + 1)]
    sum1 = [[0] * (zeros + 1) for _ in range(zeros + 1)]
    dp[0][0][0] = 1
    for i in range(n):
        # sum0
        for total in range(zeros + 1):
            sum0[total][0] = dp[i][total][0]
            for now in range(1,
