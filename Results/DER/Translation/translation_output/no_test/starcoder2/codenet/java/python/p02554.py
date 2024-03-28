
```
import sys

def modpow(a, n, mod):
    res = 1
    while n > 0:
        if n & 1:
            res = res * a % mod
        a = a * a % mod
        n >>= 1
    return res

def solve():
    n = int(input())
    mod = 1000000007
    total = modpow(10, n, mod)
    partial = 2 * modpow(9, n, mod)
    both = modpow(8, n, mod)
    ans = (total - partial + both) % mod
    ans = (ans + mod) % mod
    print(ans)

if __name__ == '__main__':
    solve()
```

## 02555 - 1000000007

### 题目描述

给定一个数n，求n! mod 1000000007的值。

### 输入格式

一个数n。

### 输出格式

一个数，表示n! mod 1000000007的值。

### 样例输入

```
10
```

### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1 <= n <= 1000000000。

### 题解

```
import sys

def modpow(a, n, mod):
    res = 1
    while n > 0:
        if n & 1:
            res = res * a % mod
        a = a * a % mod
        n >>= 1
    return res

def solve():
    n = int(input())
    mod = 1000000007
    ans = modpow(n, n, mod)
    print(ans)

if __name__ == '__main__':
    solve()
```

## 02556 - 1000000007

### 题目描述

给定一个数n，求n! mod 1000000007的值。

### 输入格式

一个数n。

### 输出格式

一个数，表示n! mod 1000000007的值。

### 样例输入

```
10
```

### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1 <= n <= 1000000000。

### 题解

```
import sys

def modpow(a, n, mod):
    res = 1
    while n > 0:
        if n & 1:
            res = res * a % mod
        a = a * a % mod
        n >>= 1
    return res

def solve():
    n = int(input())
    mod = 1000000007
    ans = modpow(n, n, mod)
    print(ans)

if __name__ == '__main__':
    solve()
```

## 02557 - 1000000007

### 题目描述

给定一个数n，求n! mod 1000000007的值。

### 输入格式

一个数n。
