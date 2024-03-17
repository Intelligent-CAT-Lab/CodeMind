

```python
import sys

N, K, M = map(int, sys.stdin.readline().split())

MASK = (1 << K) - 1
if N < K:
    print(naive())
    exit()

dp = [[[0 for i in range(1 << K)] for j in range(K + 1)] for k in range(2)]

for i in range(1 << K):
    c = 0
    ok = True
    for j in range(K):
        if (i & (1 << (K - 1 - j))) == 0:
            c -= 1
        else:
            c += 1
        if c < 0:
            ok = False
            break
    if not ok:
        continue
    u = bin(i).count('1')
    l = K - u
    if u < l:
        continue
    dp[0][u - l][i] = 1

t = 1
for i in range(K, 2 * N):
    for a in dp[t]:
        a.fill(0)
    for j in range(i % 2, K + 1, 2):
        l = (i - j) // 2
        u = l + j
        for k in range(1 << K):
            uc = bin(k).count('1')
            if 0 < j <= uc and (l == 0 or k != MASK):
                dp[t][j - 1][(k << 1) & MASK] += dp[1 - t][j][k]
                dp[t][j - 1][(k << 1) & MASK] %= M
            if u < N and j < K and k != 0:
                dp[t][j + 1][((k << 1) + 1) & MASK] += dp[1 - t][j][k]
                dp[t][j + 1][((k << 1) + 1) & MASK] %= M
    t = 1 - t

ans = 0
for v in dp[1 - t][0]:
    ans += v
print(ans % M)

```
/source/_posts/2017-08-13-python-list-comprehension.md
---
title: python list comprehension
date: 2017-08-13 16:00:00
tags: [python]
---

# python list comprehension

## 1. list comprehension

```python
[x for x in range(10)]
```

## 2. list comprehension with if

```python
[x for x in range(10) if x % 2 == 0]
```

## 3. list compre

## 4. list comprehension with if-else

```python
[x if x % 2 == 0 else -x for x in range(10)]
```

## 5. list comprehension with nested for

```python
[x + y for x in range(10) for y in range(10)]
```

## 6. list comprehension with nested for and if

```python
[x + y for x in range(10) for y in range(10) if x % 2 == 0 and y % 2 == 0]
```

## 7. list comprehension with nested for and if-else

```python
[x + y if x % 2 == 0 and y % 2 == 0 else -x - y for x in range(10) for y in range(10)]
```
hension with if-else

```python
[x if x % 2 == 0 else -x for x in range(10)]
```

## 4. list comprehension with nested for

```python
[x + y for x in range(10) for y in range(10)]
```

## 5. list comprehension with nested for and if

```python
[x + y for x in range(10) for y in range(10) if x % 2 == 0 and y % 2 == 0]
```/source/_posts/2017-08-13-python-dictionary-comprehension.md
---
title: python dictionary comprehension
date: 2017-08-13 16:00:00
tags: [python]
---

# python dictionary comprehension

##
