Below is the Python equivalent for the provided Java code. It uses the same algorithm and logic, simply translated into Python syntax.

```python
mod = 1000000007
dp = [[0 for _ in range(2)] for _ in range(100010)]

def pow2(k):
    # v = 2^n mod 1e9+7
    v = 1
    for i in range(k):
        v *= 2
        v %= mod
    return v

def main():
    n, m = map(int, input().split())

    dp[0][0] = 1
    for i in range(1, n+1):
        dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][0] %= mod
        dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][1] %= mod
        if i - m >= 0:
            dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod

    print((pow2(n) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)

if __name__ == "__main__":
    main()
```

Now for the test input provided (4 3), you can run the script with the given input, and it should provide the expected output. You can copy and paste the script into a Python file and run it, or you can run interactive Python and enter the input manually when prompted.
