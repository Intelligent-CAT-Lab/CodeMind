Here's the provided Java code translated to Python:

```python
mod = 1000000007
dp = [[0] * 2 for _ in range(100010)]

def pow2(k):
    v = 1
    for i in range(k):
        v *= 2
        v %= mod
    return v

def main():
    n, m = map(int, input().split())

    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][0] %= mod
        dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][1] %= mod
        if i - m >= 0:
            dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod
    
    print((pow2(n) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)

if __name__ == '__main__':
    main()
```

Please note that Python's handling of arrays (lists in Python) differs somewhat from Java's, so the method of declaration/instantiation for `dp` has been adapted to create a two-dimensional list in Python. Additionally, in Python, we don't need to import the Scanner class or any other input/output classes as Python has built-in functions for these operations. Function definitions in Python also do not require a static keyword or a return type. The `main()` function is not strictly necessary in Python, but I've included it to structure the code similarly to the Java example, and it's called at the end if this script is the main program being run.
