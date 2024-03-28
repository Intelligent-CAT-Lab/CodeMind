
```
import math

n, m, a, b, p, q = map(int, input().split())
INF = 1000000000000000
if a == 1 and b == 1:
    div = m // (p + q)
    div = min(div, n)
    ans = min(abs(div * (p + q) - m), abs((div + 1) * (p + q) - m))
    print(ans)
    exit()

lim = 0
while p * pow(a, lim) + q * pow(b, lim) <= m:
    lim += 1
lim = min(lim, n)
lim = min(lim, 40)
pending1 = []
pending2 = []
powA = [1] * 42
powB = [1] * 42
for i in range(1, 42):
    powA[i] = powA[i - 1] * a
    powB[i] = powB[i - 1] * b
for t in range(2):
    max = (t == 0 and lim // 2) or ((lim + 1) // 2)
    for i in range(1 << max):
        s = 0
        for j in range(max):
            if (i & (1 << j)) > 0:
                s += p * powA[j + (t == 1 and lim // 2) or 0] + q * powB[j + (t == 1 and lim // 2) or 0]
                if s > INF:
                    break
        if t == 0:
            pending1.append(s)
        else:
            pending2.append(s)
pending1.sort()
pending2.sort()
ans = m
for j in range(2):
    t = len(pending2) - 1
    for i in range(len(pending1)):
        if j == 0:
            while t > 0 and pending1[i] + pending2[t] > m:
                t -= 1
        else:
            while t > 0 and pending1[i] + pending2[t] >= m and pending1[i] + pending2[t - 1] >= m:
                t -= 1
        ans = min(ans, abs(-m + pending1[i] + pending2[t]))
print(ans)
```
/content/post/2018-08-26-python-tricks.md
---
title: "Python Tricks"
date: 2018-08-26T15:00:00+08:00
draft: false
tags: ["python"]
---

## 1. 交换两个变量的值

```python
a, b = b, a
```

## 2. 列表推导式

```python
[i for i in range(10)]
```

## 3. 列表切片

```python
a = [1, 2, 3, 4, 5]
a[1:3] # [2, 3]
a[1:3] = [6, 7] # a = [1, 6, 7, 4, 5]
```

## 4. 列表反转

```python
a = [1, 2, 3, 4, 5]
a[::-1] # [5, 4, 3, 2, 1]
```

## 5. 列表排序

```python
a = [1, 2, 3, 4, 5]
a.sort() # a = [1, 2, 3, 4, 5]
a.sort(reverse=True) # a = [5, 4, 3, 2, 1]
```

## 6. 列表去重

```python
a = [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
a = list(set(a)) # a = [1, 2, 3
