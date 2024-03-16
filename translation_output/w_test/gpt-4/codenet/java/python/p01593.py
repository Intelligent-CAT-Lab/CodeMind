Here is the equivalent Python code following the logic provided in the Java snippet:

```python
from math import isqrt

def solve(n, m):
    dp = [0.0] * (n + 1)
    dp[0] = 1.0
    for j in range(1, n + 1):
        for i in range(1, min(m, j) + 1):
            dp[j] += dp[j - i] / j
    return dp[n]

if __name__ == "__main__":
    n, m = map(int, input().split())
    print(f"{solve(n, m):.8f}")
```

To run the test case with the input `2 1`, you can save this code to a file, run it using Python, and provide the input via standard input or hardcode it into the code.

The expected output will be (as per the provided output format):
```
0.50000000
```
