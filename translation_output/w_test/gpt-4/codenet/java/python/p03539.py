The provided Java code cannot be directly translated into Python on a one-to-one basis due to the different programming paradigms and library support between Java and Python. However, I can provide you with a Python version that achieves the same functionality using a more Pythonic approach.

```python
MOD = 1000000007

def main():
    n, k = map(int, input().split())
    
    pownk1 = 1
    for i in range(1, n):
        pownk1 *= (k+1)
        pownk1 %= MOD
    
    total = 0
    for i in range(k+1):
        total += i * pownk1 % MOD
        total %= MOD
    
    total *= n
    total %= MOD
    
    maxha = 100000
    dp = [[0 for _ in range(maxha + 1)] for _ in range(n + 1)]
    dp[n][0] = 1
    
    for head in range(n, 0, -1):
        for ha in range(maxha + 1):
            base = dp[head][ha]
            if base == 0:
                continue
            for l in range(k + 1):
                if l <= head:
                    canha = (ha + l) // head
                    dp[head - 1][ha + canha] += base
                    dp[head - 1][ha + canha] %= MOD
                else:
                    dp[head - 1][ha] += base
                    dp[head - 1][ha] %= MOD
    
    for i in range(maxha + 1):
        dec = dp[0][i] * i % MOD
        total += MOD - dec
        total %= MOD
    
    print(total % MOD)

if __name__ == "__main__":
    main()
```

This Python program should be run in a Python 3.x environment. You can input the test case `2 2` directly when executing the script, and it will output the expected `10`. Ensure that the inputs are given in the same way as in the Java program, typically through the console.

The program reads the values of `n` and `k`, calculates the combinations and the DP table in a similar fashion to the Java program, then prints out the resulting value modulo `MOD`. The structure of dynamic programming and other algorithmic parts remain the same, adhering to the logic of the original Java code.
