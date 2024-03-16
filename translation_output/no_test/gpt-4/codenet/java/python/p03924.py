Here is the Python equivalent of the given Java code using standard I/O operations:
```python
MOD = 1000000007

def main():
    N, M = map(int, input().split())
    # dp[days][added town][looped size]
    dp = [[[0 for _ in range(N + 1)] for _ in range(N + 1)] for _ in range(M + 1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N + 1):
            for k in range(N + 1):
                # add town unused
                if j != N:
                    dp[i + 1][j + 1][k] += (dp[i][j][k] * (N - j)) % MOD
                    dp[i + 1][j + 1][k] %= MOD
                # add town used but not in loop
                dp[i + 1][j][k] += (dp[i][j][k] * (j - k)) % MOD
                dp[i + 1][j][k] %= MOD
                # add town used and in loop
                dp[i + 1][j][j] += (dp[i][j][k] * k) % MOD
                dp[i + 1][j][j] %= MOD
    print(dp[M][N][N])

if __name__ == '__main__':
    main()
```
Explanation:
- The nested `for` loops and the logic remain the same, simply converted to Python syntax.
- `print(dp[M][N][N])` replaces the Java `System.out.println` to output the result.
- The reading of input is simplified using `map(int, input().split())`, which reads a line, splits it by whitespace, and converts each part to an integer, assigning them to `N` and `M`.
- The modulo operations and list comprehensions are used in the same way as arrays in Java.
- The original Java code uses a custom fast input class `FS` for optimized I/O. In competitive programming, Python's built-in input functions are typically sufficient, but if an even faster method is necessary, one can use `sys.stdin.readline()` after importing `sys`. However, for simplicity, `input()` is used in this translation.
