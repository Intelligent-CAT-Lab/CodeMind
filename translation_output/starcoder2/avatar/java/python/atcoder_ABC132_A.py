
```python
import sys

s = sys.stdin.readline().strip()
chars = set(s)
if len(chars) == 2:
    print("Yes")
else:
    print("No")
```

## 2. B - Flipping Signs

### 2.1. Problem

https://atcoder.jp/contests/abc132/tasks/abc132_b

### 2.2. Solution

```python
import sys

n = int(sys.stdin.readline().strip())
p = list(map(int, sys.stdin.readline().strip().split()))

count = 0
for i in range(1, n-1):
    if p[i-1] < p[i] < p[i+1] or p[i-1] > p[i] > p[i+1]:
        count += 1

print(count)
```

## 3. C - Divide the Problems

### 3.1. Problem

https://atcoder.jp/contests/abc132/tasks/abc132_c

### 3.2. Solution

```python
import sys

n = int(sys.stdin.readline().strip())
d = list(map(int, sys.stdin.readline().strip().split()))

d.sort()

print(d[n//2] - d[n//2-1])
```

## 4. D - Blue and Red Balls

### 4.1. Problem

https://atcoder.jp/contests/abc132/tasks/abc132_d

### 4.2. Solution

```python
import sys

n, k = map(int, sys.stdin.readline().strip().split())

mod = 10**9 + 7

def nCr(n, r):
    if n < r:
        return 0
    if n == r:
        return 1
    if r == 1:
        return n
    return nCr(n-1, r-1) + nCr(n-1, r)

for i in range(1, k+1):
    r = nCr(k-1, i-1)
    b = nCr(n-k+1, i)
    print((r*b)%mod)
```

## 5. E - Ordinary Number

### 5.1. Problem

https://atcoder.jp/contests/abc132/tasks/abc132_e

### 5.2. Solution

```python
import sys
from collections import deque

n, m = map(int, sys.stdin.readline().strip().split())

graph = [[] for _ in range(n)]
for _ in range(m):
    u, v = map(int, sys.stdin.readline().strip().split())
    graph[u-1].append(v-1)

s, t = map(int, sys.stdin.readline().strip().split())
s -= 1
t -= 1

dist = [-1] * n
dist[s] = 0

q = deque([s])
while q:
    u = q.popleft()
    for v in graph[u]:
        if dist[v] == -1:
            dist[v] = dist[u] + 1
            q.append(v)

if dist[t] == -1:
    print(-1)
else:
    print(dist[t] // 3)
```

## 6. F - Shortest Path on a Line

### 6.1. Problem

https://atcoder.jp/contests/abc132/tasks/abc132_f

### 6.2. Solution

```python
import sys

n, k = map(int, sys.stdin.readline().strip().split())

mod = 10**9 + 7

def nCr(n, r):
    if n < r:
        return 0
    if n == r:
        return 1
    if r == 1:
        return n
    return nCr(n-1, r-1) + nCr(n-1, r)

def solve(n, k):
    if k == 0:
        return 1
    if k == 1:
        return n
    if k == 2:
        return n*(n-1) // 2
    if k == 3:
        return n*(n-1)*(n-2) // 6
    if k == 4:
        return n*(n-1)*(n-2)*(n-3) // 24
    if k == 5:
        return n*(n-1)*(n-2)*(n-3)*(n-4) // 120
    if k == 6:
        return n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5) // 720
    if k == 7:
        return n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5)*(n-6) // 5040
    if k == 8:
        return n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5)*(n-6)*(n-7) // 40320
    if k == 9:
        return n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5)*(n-6)*(n-7)*(n-8) // 362880
    if k == 10:
        return n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5)*(n-6)*(n-7)*(n-8)*(n-9) // 3628800
    if k == 11:
        return n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5)*(n-6)*(n-7)*(n-8)*(n-9)*(n-10) // 39916800
    if k == 12:
        return n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5)*(n-6)*(n-7)*(n-8)*(n-9)*(n-10)*(n-11) // 479001600
    if k == 13:
        return n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5)*(n-6)*(n-7)*(n-
