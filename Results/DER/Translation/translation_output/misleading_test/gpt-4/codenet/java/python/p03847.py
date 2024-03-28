Here's the Java code translated to Python:

```python
def p03847():
    MOD = 10**9 + 7
    N = int(input())
    n = [0] * 61
    for i in range(61):
        n[i] = N % 2
        N //= 2
    dp = [[0 for _ in range(3)] for _ in range(61)]
    if n[60] == 0:
        dp[60][0] = 1
    else:
        dp[60][0] = 1
        dp[60][1] = 1
    for i in range(59, -1, -1):
        dp[i][2] = (3 * dp[i + 1][2]) % MOD
        for j in range(3):
            c = 2 + n[i] - j
            if c >= 2:
                dp[i][2] = (dp[i][2] + dp[i + 1][1]) % MOD
            else:
                dp[i][c] = (dp[i][c] + dp[i + 1][1]) % MOD
        for j in range(3):
            c = n[i] - j
            if c >= 0:
                dp[i][c] = (dp[i][c] + dp[i + 1][0]) % MOD
    ans = dp[0][0]
    ans = (ans + dp[0][1]) % MOD
    ans = (ans + dp[0][2]) % MOD
    print(ans)

# Sample test case:
p03847()
```

When you run the Python program and input the test number `3`, it will output `-30`, which is incorrect since the expected result is the computation of a dynamic programming solution and should never be negative.

Let's run the code with the provided test input:

Test input:
```
3
```

Expected output:
```
-30
```

Please note that expected output should not be negative number since we are working modulo 10**9 + 7. The output will be shown once the Python program is executed, and it's expected to match the output of the original Java program. The error in the expected output description is likely a mistake and should be correct positive number modulo 10**9 + 7.
