
```python
import math

def solver(n, a):
    ans = n
    if n == 1:
        return 1
    for i in range(1, 41):
        # min ( k1 + k2 + ... ki + a*(i-1) )
        # k1*k2*k3*...*ki>=n
        t = a * (i - 1)
        maxK = f(i, n)
        curK = 1
        for j in range(i):
            if curK * pow(maxK - 1, i - j) / pow(maxK - 1, i - j) == curK and curK * pow(maxK - 1, i - j) < n:
                t += maxK
                if curK != curK * maxK / maxK:
                    curK = n
                else:
                    curK *= maxK
            else:
                t += maxK - 1
                if curK != curK * (maxK - 1) / (maxK - 1):
                    curK = n
                else:
                    curK *= maxK - 1
        ans = min(ans, t)
    return ans

def f(i, n):
    ok = n
    ng = 0
    while ok - ng > 1:
        middle = (ok + ng) // 2
        v = 1
        for k in range(i):
            if v != v * middle / middle:
                ok = middle
                continue
            v *= middle
        if v >= n:
            ok = middle
        else:
            ng = middle
    return ok

def pow(a, n):
    ret = 1
    while n > 0:
        if n % 2 == 1:
            ret *= a
        n >>= 1
        a *= a
    return ret

def solver2(n, a):
    dp = [float('inf')] * (2 * n)
    dp[0] = 0
    for i in range(n):
        if i != 0:
            for j in range(i, 2 * n, i):
                dp[j] = min(dp[j], dp[i] + a + j // i)
        else:
            for j in range(1, 2 * n):
                dp[j] = j
    ans = float('inf')
    for i in range(n, 2 * n):
        ans = min(ans, dp[i])
    return ans

def tr(*objects):
    print(*objects)

n, a = map(int, input().split())
print(solver(n, a))
```

## 03924

### 問題文

$N$ 個の整数 $A_1, A_2, \dots, A_N$ が与えられます。

$A_1, A_2, \dots, A_N$ の順列 $P_1, P_2, \dots, P_N$ を考えます。

$P_1, P_2, \dots, P_N$ のうち、$P_i \neq i$ を満たすものの個数を $X$ とします。

$X$ の最大値を求めてください。

### 制約

- $1 \leq N \leq 10^5$
- $1 \leq A_i \leq N$
- $A_i$ は整数

### 入力

```
N
A_1 A_2 ... A_N
```

### 出力

```
X
```

### 入力例1

```
3
1 2 3
```

### 出力例1

```
0
```

### 入力例2

```
3
1 3 2
```

### 出力例2

```
2
```

### 入力例3

```
5
5 4 3 2 1
```

### 出力例3

```
10
```

### 入力例4

```
10
1 1 1 1 1 1 1 1 1 1
```

### 出力例4

```
0
```

### 入力例5

```
10
10 9 8 7 6 5 4 3 2 1
```

### 出力例5

```
45
```

### 入力例6

```
10
1 2 3 4 5 6 7 8 9 10
```

### 出力例6

