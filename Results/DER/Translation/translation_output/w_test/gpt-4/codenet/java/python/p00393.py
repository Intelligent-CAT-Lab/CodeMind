Below is the translated Python code for the provided Java program:

```python
mod = 1000000007
dp = [[0 for _ in range(2)] for _ in range(100010)]

def main():
    n, m = map(int, input().split())

    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % mod
        dp[i][1] = (dp[i - 1][0] + dp[i - 1][1]) % mod
        if i >= m:
            dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod

    print((pow2(n) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)

def pow2(k):
    v = 1
    for _ in range(k):
        v = (v * 2) % mod
    return v

if __name__ == '__main__':
    main()
```

Now to test this code with the provided test input (`4 3`), you can simply run it and type the input after executing the script:

Expected output:
```
3
```
