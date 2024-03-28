

```python
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

## 3. 2017年度 プログラミングコンテスト 予選 問題3

### 問題文

N 個の整数 a1, a2, ..., aN があります。

これらの整数の中からいくつか選んで、その和をちょうど K にすることができるか判定してください。

### 制約

1 ≤ N ≤ 20

1 ≤ ai ≤ 1000

1 ≤ K ≤ 100000

### 入力

入力は以下の形式で標準入力から与えられる。

N K

a1 a2 ... aN

### 出力

和をちょうど K にすることができるならば Yes を、そうでないならば No を出力せよ。

### 入力例1

3 10

1 5 5

### 出力例1

Yes

### 入力例2

3 10

1 5 6

### 出力例2

No

### 入力例3

4 10

1 2 3 4

### 出力例3

Yes

### 入力例4

4 10

1 2 3 5

### 出力例4

No

### 入力例5

20 100000

1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000

### 出力例5

Yes

### 入力例6

20 100000

1000 1000 1000 1000 1000 1000 100
