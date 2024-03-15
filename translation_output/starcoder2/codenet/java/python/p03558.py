
```
import sys
from collections import deque

def init(n):
    global parent, rank, num
    parent = [i for i in range(n)]
    rank = [0 for i in range(n)]
    num = [1 for i in range(n)]

def root(x):
    if parent[x] == x:
        return x
    parent[x] = root(parent[x])
    return parent[x]

def same(x, y):
    return root(x) == root(y)

def unite(x, y):
    xr = root(x)
    yr = root(y)
    if xr == yr:
        return False
    if rank[xr] < rank[yr]:
        parent[xr] = yr
        num[yr] += num[xr]
    else:
        parent[yr] = xr
        num[xr] += num[yr]
        if rank[xr] == rank[yr]:
            rank[xr] += 1
    return True

def size(x):
    return num[root(x)]

k = int(sys.stdin.readline())
init(k)
for i in range(1, k):
    unite(i, (i * 10) % k)

edges = [set() for _ in range(k)]
for i in range(k):
    if not same(i, (i + 1) % k):
        edges[root(i)].add(root((i + 1) % k))

dq = deque()
dq.append(root(1))
d = [-1 for _ in range(k)]
d[root(1)] = 0
while len(dq) > 0:
    now = dq.popleft()
    for next in edges[now]:
        if d[next] < 0:
            d[next] = d[now] + 1
            dq.append(next)

print(d[root(0)] + 1)
```

## 03559 - 1000000007

### Problem

Given a positive integer $n$, find the number of ways to write $n$ as a sum of positive integers.

### Input

The first line contains a positive integer $T$ ($T \leq 1000$), the number of test cases.

Each of the next $T$ lines contains a positive integer $n$ ($n \leq 10^9$).

### Output

For each test case, output the number of ways to write $n$ as a sum of positive integers.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
3
```

### Solution

```python
import sys

mod = 1000000007

def solve(n):
    dp = [0 for _ in range(n + 1)]
    dp[0] = 1
    for i in range(1, n + 1):
        for j in range(i, n + 1):
            dp[j] += dp[j - i]
            dp[j] %= mod
    return dp[n]

T = int(sys.stdin.readline())
for _ in range(T):
    n = int(sys.stdin.readline())
    print(solve(n))
```

## 03560 - 1000000007

### Problem

Given a positive integer $n$, find the number of ways to write $n$ as a sum of positive integers.

### Input

The first line contains a positive integer $T$ ($T \leq 1000$), the number of test cases.

Each of the next $T$ lines contains a positive integer $n$ ($n \leq 10^9$).

### Output

For each test case, output the number of ways to write $n$ as a sum of positive integers.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
3
```

### Solution

```python
import sys

mod = 1000000007

def solve(n):
    dp = [0 for _ in range(n + 1)]
    dp[0] = 1
    for i in range(1, n + 1):
        for j in range(i, n + 1):
            dp[j] += dp[j - i]
            dp[j] %= mod
    return dp[n]

T = int(sys.stdin.readline())
for _ in range(T):
    n = int(sys.stdin.readline())
    print(solve(n))
```

## 03561 - 1000000007

### Problem

Given a positive integer $n$, find the number of ways to write $n$ as a sum of positive integers.

### Input

The first line contains a positive integer $T$ ($T \leq 1000$), the number of test cases.

Each of the next $T$ lines contains a positive integer $n$ ($n \leq 10^9$).

### Output

For each test case, output the number of ways to write $n$ as a sum of positive integers.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
3
```

### Solution

```python
import sys

mod = 1000000007

def solve(n):
    dp = [0 for _ in range(n + 1)]
    dp[0] = 1
    for i in range(1, n + 1):
        for j in range(i, n + 1):
            dp[j] += dp[j - i]
            dp[j] %= mod
    return dp[n]

T = int(sys.stdin.readline())
for _ in range(T):
    n = int(sys.stdin.readline())
    print(solve(n))
```

## 03562 - 10000000
