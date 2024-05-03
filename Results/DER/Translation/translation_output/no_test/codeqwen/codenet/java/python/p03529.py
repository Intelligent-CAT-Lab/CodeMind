Here is the Python version of your Java code:

```python
MOD = 1000000007

def power_mod(x, exponent):
    prod = 1
    for i in range(63, -1, -1):
        prod = (prod * prod) % MOD
        if (exponent & 1 << i) != 0:
            prod = (prod * x) % MOD
    return prod

def f(n, k):
    t = 0
    for i in range(n, 0, -1):
        t += (t + i) // i
    return t

if __name__ == "__main__":
    n = int(input())
    k = int(input())
    x = 0
    l = f(n, k)
    dp = [[0 for _ in range(l + 1)] for _ in range(n + 1)]
    for i in range(1, n + 1):
        m = power_mod(k + 1, i - 1)
        for u in range(l + 1):
            t = 0
            for j in range(min(i, k) + 1):
                if u + (u + j) // i <= l:
                    t += dp[i - 1][u + (u + j) // i]
                    t += ((u + j) % i) * m % MOD
                    t %= MOD
            for j in range(min(i, k) + 1, k + 1):
                t = (t + dp[i - 1][u] + (j + u) * m) % MOD
            dp[i][u] = t
    print(dp[n][0])
```

This Python code does the same thing as your Java code. It calculates the value of a function `f(n, k)` and then uses dynamic programming to calculate the value of another function `dp[n][u]`. The result is printed at the end.
