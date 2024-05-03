Here is the Python equivalent of the Java code:

```python
import sys

def solve(n, m):
    dp = [0] * (n + 1)
    dp[0] = 1
    for j in range(1, n + 1):
        for i in range(1, min(m, j) + 1):
            dp[j] += dp[j - i] / j
    return dp[n]

def main():
    n, m = map(int, sys.stdin.readline().split())
    print("%.12f" % solve(n, m))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, solves the problem using dynamic programming, and prints the result to the standard output. The `solve` function computes the probability of getting exactly `n` successes in `m` trials using dynamic programming. The `main` function reads the input, calls the `solve` function, and prints the result.
