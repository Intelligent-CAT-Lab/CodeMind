Here is the Python version of the provided Java code:

```python
MOD = 998244353

def main():
    A, B, C, D = map(int, input().split())
    dp = [[0] * C for _ in range(D)]
    sum_ = [[0] * C for _ in range(D)]
    
    sum_[B - 1][A - 1] = 1
    
    for i in range(A, C):
        sum_[B - 1][i] = (sum_[B - 1][i - 1] * B) % MOD
    
    for i in range(B, D):
        for j in range(A, C):
            dp[i][j] = dp[i - 1][j] * j
            dp[i][j] += sum_[i - 1][j - 1] * j
            dp[i][j] %= MOD
            sum_[i][j] = (sum_[i][j - 1] * (i + 1) + dp[i][j]) % MOD
    
    ans = 0
    pow_c = 1
    
    for i in range(D - 1, B - 1, -1):
        pow_i = 1
        
        for j in range(C - 1, A - 1, -1):
            ans = (ans + dp[i][j] * ((pow_c * pow_i) % MOD)) % MOD
            pow_i = (pow_i * (i + 1)) % MOD
        
        pow_c = (pow_c * C) % MOD
    
    ans = (ans + (pow_c * sum_[B - 1][C - 1]) % MOD) % MOD
    
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, calculates the values of `dp` and `sum_` arrays, and finally prints the result.
