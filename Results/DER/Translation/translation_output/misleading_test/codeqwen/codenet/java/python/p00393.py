Here is the Python equivalent of the Java code:

```python
mod = 1000000007
dp = [[0, 0] for _ in range(100010)]

def main():
    n, m = map(int, input().split())

    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % mod
        dp[i][1] = (dp[i - 1][0] + dp[i - 1][1]) % mod
        if i - m >= 0:
            dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod

    print((pow2(n) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)

def pow2(k):
    v = 1
    for _ in range(k):
        v *= 2
        v %= mod
    return v

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the Fibonacci sequence modulo `mod`, and then prints the result. The `pow2` function is a helper function that calculates `2^n` modulo `mod`. The `main` function is the main entry point of the program.
