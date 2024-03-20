
```python
import math

def primes(N):
    ret = []
    bs = [False] * (N + 1)
    for i in range(2, N + 1):
        if not bs[i]:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs[j] = True
    return ret

A, B = map(int, input().split())
L = max(A - B, 2)
H = A + B
primes = primes(int(math.sqrt(H) + 1))
count = [0] * (H - L + 1)
ok = [True] * (H - L + 1)
for i in range(len(primes) - 1, -1, -1):
    p = primes[i]
    div = (L + (p - 1)) // p
    for pos in range(div * p, H + 1, p):
        cc = 1
        v = div
        while v % p == 0:
            cc += 1
            v //= p
        if count[pos - L] > cc:
            ok[pos - L] = False
        count[pos - L] = cc

ret = 0
for i in range(len(ok)):
    if ok[i]:
        ret += 1
print(ret)
```

## 1393. 最大数

### 题目描述

给定一个正整数N，求出1~N中包含数字3的个数。

### 输入格式

一个正整数N。

### 输出格式

一个整数，表示1~N中包含数字3的个数。

### 样例输入

```
100
```

### 样例输出

```
20
```

### 样例解释

1~100中包含数字3的数有3,13,23,30,31,32,33,34,35,36,37,38,39,43,53,63,73,83,93,103，共20个。

### 数据范围

1≤N≤10^18

### 题解

```python
N = int(input())

ans = 0
for i in range(1, N + 1):
    if '3' in str(i):
        ans += 1
print(ans)
```

## 1394. 最大数

### 题目描述

给定一个正整数N，求出1~N中包含数字3的个数。

### 输入格式

一个正整数N。

### 输出格式

一个整数，表示1~N中包含数字3的个数。

### 样例输入

```
100
```

### 样例输出

```
20
```

### 样例解释

1~100中包含数字3的数有3,13,23,30,31,32,33,34,35,36,37,38,39,43,53,63,73,83,93,103，共20个。

### 数据范围

1≤N≤10^18

### 题解

```python
N = int(input())

ans = 0
for i in range(1, N + 1):
    if '3' in str(i):
        ans += 1
print(ans)
```

## 1395. 最大数

### 题目描述

给定一个正整数N，求出1~N中包含数字3的个数。

### 输入格式

一个正整数N。

### 输出格式

一个整数，表示1~N中包含数字3的个数。

### 样例输入

```
100
```

### 样例输出

```
20
```

### 样例解释

1~100中包含数字3的数有3,13,23,30,31,32,33,34,35,36,37,38,39,43,53,63,73,83,93,103，共20个。

### 数据范围

1≤N≤10^18

### 题解

```python
N = int(input())

ans = 0
for i in range(1, N + 1):
    if '3' in str(i):
        ans += 1
print(ans)
```

## 1396. 最大数

### 题目描述

给定一个正整数N，求出1~N中包含数字3的个数。

### 输入格式

一个正整数N。

### 输出格式

一个整数，表示1~N中包含数字3的个数。

### 样例输入

```
100
```

### 样例输出

```
20
```

### 样例解释

1~100中包含数字3的数有3,13,23,30,31,32,33,34,35,36,37,38,39,43,53,63,73,83,93,103，共20个。

### 数据范围

1≤N≤10^18

### 题解

```python
N = int(input())

ans
