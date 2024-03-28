

```python
import sys

N = int(sys.stdin.readline())
MOD = 1000000007
TOKENS = ["A", "C", "G", "T"]
memo = [{} for _ in range(N + 1)]


def is_ok(last4):
    if "AGC" in last4:
        return False
    for i in range(3):
        vals = list(last4)
        vals[i], vals[i + 1] = vals[i + 1], vals[i]
        s = "".join(vals)
        if "AGC" in s:
            return False
    return True


def dfs(current, last3):
    if last3 in memo[current]:
        return memo[current][last3]
    if current == N:
        return 1
    result = 0
    for c in TOKENS:
        if is_ok(last3 + c):
            result = (result + dfs(current + 1, last3[1:] + c)) % MOD
    memo[current][last3] = result
    return result


print(dfs(0, "TTT"))
```

## 123

### 123A

```python
import sys

A = int(sys.stdin.readline())
B = int(sys.stdin.readline())
C = int(sys.stdin.readline())
D = int(sys.stdin.readline())
E = int(sys.stdin.readline())
K = int(sys.stdin.readline())

if D - A > K:
    print(":(")
else:
    print("Yay!")
```

### 123B

```python
import sys

N = int(sys.stdin.readline())

dishes = []
for _ in range(N):
    dishes.append(int(sys.stdin.readline()))

dishes.sort()

ans = 0
for i in range(N):
    if dishes[i] % 10 == 0:
        ans += dishes[i]
    else:
        ans += (dishes[i] // 10 + 1) * 10

print(ans - 10)
```

### 123C

```python
import sys

N, A, B, C, D, E = map(int, sys.stdin.readline().split())

ans = float("inf")
for i in range(N):
    ans = min(ans, (i + 1) * A + (N - i - 1) * B)

for i in range(N):
    ans = min(ans, (i + 1) * A + (N - i - 1) * C)

for i in range(N):
    ans = min(ans, (i + 1) * B + (N - i - 1) * C)

for i in range(N):
    ans = min(ans, (i + 1) * A + (N - i - 1) * D)

for i in range(N):
    ans = min(ans, (i + 1) * B + (N - i - 1) * D)

for i in range(N):
    ans = min(ans, (i + 1) * C + (N - i - 1) * D)

for i in range(N):
    ans = min(ans, (i + 1) * A + (N - i - 1) * E)

for i in range(N):
    ans = min(ans, (i + 1) * B + (N - i - 1) * E)

for i in range(N):
    ans = min(ans, (i + 1) * C + (N - i - 1) * E)

for i in range(N):
    ans = min(ans, (i + 1) * D + (N - i - 1) * E)

print(ans)
```

### 123D

```python
import sys
from heapq import heappush, heappop

X, Y, Z, K = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))
B = list(map(int, sys.stdin.readline().split()))
C = list(map(int, sys.stdin.readline().split()))

A.sort(reverse=True)
B.sort(reverse=True)
C.sort(reverse=True)

q = []
heappush(q, (-(A[0] + B[0] + C[0]), 0, 0, 0))

seen = set()
seen.add((0, 0, 0))

for _ in range(K):
    v, i, j, k = heappop(q)
    print(-v)
    if i + 1 < X and (i + 1, j, k) not in seen:
        heappush(q, (-(A[i + 1] + B[j] + C[k]), i + 1, j, k))
        seen.add((i + 1, j, k))
    if j + 1 < Y and (i, j + 1, k) not in seen:
        heappush(q, (-(A[i] + B[j + 1] + C[k]), i, j + 1, k))
        seen.add((i, j + 1, k))
    if k + 1 < Z and (i, j, k + 1) not in seen:
        heappush(q, (-(A[i] + B[j] + C[k + 1]), i, j, k + 1))
        seen.add((i, j, k + 1))
```

## 124

### 124A

```python
import sys

N, A, B = map(int, sys.stdin.readline().split())

print(min(N, A + B))
```

### 124B

```python
import sys

N = int(sys.stdin.readline())
H = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(N):
    if all(H[i] >= H[j] for j in range(i + 1, N)):
        ans
