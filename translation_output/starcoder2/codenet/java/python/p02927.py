
```python
import sys

M, D = map(int, sys.stdin.readline().split())
ans = 0
for m in range(1, M + 1):
    for d in range(1, D + 1):
        d1 = d % 10
        d2 = d // 10
        if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
            ans += 1
print(ans)
```

## 02928

### 02928.py

```python
import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] > A[j]:
            ans += 1
print(ans)
```

## 02929

### 02929.py

```python
import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] > A[j]:
            ans += 1
print(ans)
```

## 02930

### 02930.py

```python
import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] > A[j]:
            ans += 1
print(ans)
```

## 02931

### 02931.py

```python
import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(N):
    for j in range
