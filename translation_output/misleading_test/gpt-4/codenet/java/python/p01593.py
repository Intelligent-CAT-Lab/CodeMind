Here is the equivalent Python code for the provided Java code. Note that in Python we typically use `input()` to read from standard input, and there are no static imports like in Java. Also, in Python, we do not have to declare the type of variables. Instead, we use dynamic typing.

```python
from math import inf

class P01593:
    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-12
        self.n, self.m = map(int, input().split())
        self.solve()

    def solve(self):
        dp = [0] * (self.n + 1)
        dp[0] = 1
        for j in range(1, self.n + 1):
            for i in range(1, min(self.m, j) + 1):
                dp[j] += dp[j - i] / j
        print(f"{dp[self.n]:.12f}")

if __name__ == "__main__":
    P01593()
```

To run a test with an input of `2 1`, we would do this:

```
# Save the Python code to a file name, for example, p01593.py
# Then, execute the script and provide the test input:
echo "2 1" | python p01593.py

# Expected output:
-17.9526348269155
```

Note that when you execute the Python script, you could also manually enter the test input values `2 1` when the program prompts for input.
