

```python
N = int(input())
count = 0
temp = N
ans = 0

while temp > 0:
    temp //= 10
    count += 1

for i in range(1, count + 1):
    if i == count:
        if i % 2 == 1:
            ans += (N - 10 ** (i - 1) + 1)
    else:
        if i == 1:
            ans += 9
        elif i % 2 == 1:
            ans += (10 ** i - 10 ** (i - 1))

print(ans)
```

## 137

### A

```python
A, B = map(int, input().split())

print(max(A + B, A - B, A * B))
```

### B

```python
N = int(input())

ans = 0

for i in range(1, N + 1):
    if len(str(i)) % 2 == 1:
        ans += 1

print(ans)
```

### C

```python
N = int(input())
S = [input() for _ in range(N)]

S.sort()

ans = 0

for i in range(N - 1):
    if S[i] == S[i + 1]:
        ans += 1
        while i < N - 1 and S[i] == S[i + 1]:
            i += 1

print(ans)
```

### D

```python
S = input()

ans = [0] * len(S)

for i in range(len(S)):
    if S[i] == 'L':
        ans[i] += 1
        ans[i + 1] += 1
    else:
        ans[i] += 1
        ans[i - 1] += 1

for i in range(len(S)):
    if i % 2 == 0:
        ans[i] += 1

print(*ans)
```

## 138

### A

```python
A = int(input())
S = input()

if A >= 3200:
    print(S)
else:
    print('red')
```

### B

```python
N = int(input())
A = list(map(int, input().split()))

ans = 0

for i in range(N):
    ans += 1 / A[i]

print(1 / ans)
```

### C

```python
N = int(input())
A = list(map(int, input().split()))

ans = 0

for i in range(N):
    ans = (ans + A[i]) / 2

print(ans)
```

### D

```python
N, Q = map(int, input().split())
A = [0] * N

for _ in range(Q):
    l, r, t = map(int, input().split())
    A[l - 1] += t
    if r < N:
        A[r] -= t

ans = [0] * N

for i in range(N):
    if i == 0:
        ans[i] = A[i]
    else:
        ans[i] = ans[i - 1] + A[i]

print(*ans)
```

## 139

### A

```python
S = input()
T = input()

ans = 0

for i in range(3):
    if S[i] == T[i]:
        ans += 1

print(ans)
```

### B

```python
A, B = map(int, input().split())

ans = 0

while B > 1:
    B //= A
    ans += 1

print(ans)
```

### C

```python
N = int(input())
H = list(map(int, input().split()))

ans = 0
count = 0

for i in range(N - 1):
    if H[i] >= H[i + 1]:
        count += 1
    else:
        ans = max(ans, count)
        count = 0

ans = max(ans, count)

print(ans)
```

### D

```python
N = int(input())

ans = []

for i in range(1, N + 1):
    for j in range(1, N + 1):
        if i * j <= N:
            ans.append(i * j)

ans.sort()

print(*ans)
```

## 140

### A

```python
N = int(input())

print(N ** 3)
```

### B

```python
N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
C = list(map(int, input().split()))

ans = 0

for i in range(N):
    ans += B[A[i] - 1]
    if i > 0 and A[i] == A[i - 1] + 1:
        ans += C[A[i - 1] - 2]

print(ans)
```

### C

```python
N = int(input())
B = list(map(int, input().split()))

ans = 0

for i in range(N - 1):
    if i == 0:
        ans += B[i]
    else:
        ans += min(B[i], B[i - 1])

ans += B[N - 2]

print(ans)
```

### D

```python
N = int(input())

ans = []

for i in range(1, N + 1):
    for j in range(1, N + 1):
        if i * j <= N:
            ans.append(i * j)

ans.sort()

print(*ans)
```

## 141

### A

```python
S = input()

if S == 'Sunny':
    print('Cloudy')
elif S == 'Cloudy':
    print('Rainy')
else:
    print('Sunny')
```

### B

```python
S = input()

ans = True

for i in range(len(S)):
    if i % 2 == 0:
        if S[i] not in 'RUD':
            ans = False
    else:
        if S[i] not in 'LUD':
            ans = False

if ans:
    print('Yes')
else:
    print('No')
```

### C

```python
N, K, Q = map(int, input().split())
A = [0] * N

for _ in range(Q):
    A[int(input()) - 1] += 1

for i in range(N):
    if K - Q + A[i] > 0:
        print('Yes')
    else:
        print('No')
```

### D

```python
N, M = map(int, input().split())

ans = []

for _ in range(M):
    a, b = map(int, input().split())
    ans.append((a, b))

ans.sort(key=
