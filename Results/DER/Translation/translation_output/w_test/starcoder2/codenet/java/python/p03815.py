

```python
import sys

def solve():
    x = int(input())
    answer = x // 11 * 2
    mod = x % 11
    step = x // 11
    if mod > 0:
        if mod <= 6 - step % 2:
            answer += 1
        else:
            answer += 2
    print(answer)

if __name__ == '__main__':
    solve()
```

## 03816 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例输入

```
5
```

### 样例输出

```
120
```

### 数据范围

对于100%的数据，1≤n≤1000000000。

### 题解

```python
import sys

MOD = 1000000007

def solve():
    n = int(input())
    answer = 1
    for i in range(1, n + 1):
        answer = (answer * i) % MOD
    print(answer)

if __name__ == '__main__':
    solve()
```

## 03817 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例输入

```
5
```

### 样例输出

```
120
```

### 数据范围

对于100%的数据，1≤n≤1000000000。

### 题解

