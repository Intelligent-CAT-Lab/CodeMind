
```
MOD = 1000000007

def cnt(a, n, k, sum):
    if a == n:
        return sum
    f = 0
    for i in range(k+1):
        f += cnt(a+1, n, k, sum+i)
    return f

n = int(input())
k = int(input())

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
dp = [[0 for i in range(maxha+1)] for j in range(n+1)]
dp[n][0] = 1

for head in range(n, 0, -1):
    for ha in range(maxha+1):
        base = dp[head][ha]
        if base == 0:
            continue
        for l in range(k+1):
            if l <= head:
                canha = (ha + l) // head
                dp[head-1][ha+canha] += base
                dp[head-1][ha+canha] %= MOD
            else:
                dp[head-1][ha] += base
                dp[head-1][ha] %= MOD

for i in range(maxha+1):
    dec = dp[0][i] * i % MOD
    total += MOD-dec
    total %= MOD
print(total%MOD)
```

## 解説

### 解法1

まず、$n$個の整数を$k+1$個の区間に分割する方法の数を考える。

$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区間に分割する方法の数は、$n$個の整数を$k+1$個の区
