Below is the Python translation of the given Java code:

```python
MOD = 1000000007

def main():
    N, M = map(int, input().split())
    dp = [[[0 for _ in range(N + 1)] for _ in range(N + 1)] for _ in range(M + 1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N + 1):
            for k in range(N + 1):
                if j != N:
                    dp[i + 1][j + 1][k] += dp[i][j][k] * (N - j) % MOD
                    dp[i + 1][j + 1][k] %= MOD
                dp[i + 1][j][k] += dp[i][j][k] * (j - k) % MOD
                dp[i + 1][j][k] %= MOD
                dp[i + 1][j][j] += dp[i][j][k] * k % MOD
                dp[i + 1][j][j] %= MOD
    print(dp[M][N][N])

if __name__ == "__main__":
    main()
```

To test the above Python code with the provided test case:

Test input:
```
3 3
```

For the Python code, you would need to run it and provide the input directly into the console:

Expected output:
```
2
```

The Java code uses a custom input class to read integers from input. In Python, it is more straightforward as you can use built-in functions like `input()` and `map()` to read and process the input. Python supports automatic type casting of large integers, so there is no need to cast explicitly to `long` as in Java.
