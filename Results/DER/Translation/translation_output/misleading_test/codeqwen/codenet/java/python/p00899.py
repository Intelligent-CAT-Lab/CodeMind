Here is the Python version of the Java code:

```python
import sys
import re

def solve(strs):
    N = len(strs)
    dp = [[sys.maxsize] * N for _ in range(1 << N)]
    for i in range(N):
        dp[1 << i][i] = len(strs[i])

    for i in range(1 << N):
        for j in range(N):
            if dp[i][j] == sys.maxsize:
                continue
            for k in range(N):
                if (i & (1 << k)) > 0:
                    continue
                new_i = i | (1 << k)
                dp[new_i][k] = min(dp[new_i][k], dp[i][j] + len(strs[k]) - len(re.search(strs[j], strs[k]).group(0)))

    ans = sys.maxsize
    for i in range(N):
        ans = min(ans, dp[(1 << N) - 1][i])
    return ans

while True:
    N = int(input())
    if N == 0:
        break
    strs = [input() for _ in range(N)]
    print(solve(strs))
```

This Python code does the same thing as the Java code. It reads the input, solves the problem, and prints the result. The `solve` function is a helper function that does the actual computation. It uses dynamic programming to find the minimum length of the concatenation of the strings. The `while True` loop reads the input until it gets a 0, which indicates the end of the input.
