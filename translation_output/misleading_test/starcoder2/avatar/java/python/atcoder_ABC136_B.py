

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
    if len(set(str(i))) == 1:
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

print(ans)
```

### D

```python
N, K = map(int, input().split())
A = list(map(int, input().split()))
ans = [0] * N

for i in range(N):
    if A[i] % 2 == 1:
        ans[i] += 1
        if i - 1 >= 0:
            ans[i - 1] += 1
        if i + 1 < N:
            ans[i + 1] += 1

for i in range(N):
    if i + K < N:
        ans[i + K] += ans[i]
    else:
        ans[i + K - N] += ans[i]

print(*ans)
```

## 138

### A

```python
A = int(input())
S = input()
print(S if A >= 3200 else 'red')
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
    p, x = map(int, input().split())
    A[p - 1] += x

for i in range(N - 1):
    A[i + 1] += A[i]

print(*A)
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

print(max(ans, count))
```

### D

```python
N = int(input())
S = input()
ans = [0] * N

for i in range(N):
    if S[i] == 'L':
        ans[i] += i + 1
        if i - 1 >= 0:
            ans[i - 1] += i + 1
    else:
        ans[i] += N - i
        if i + 1 < N:
            ans[i + 1] += N - i

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
    ans += min(B[i], B[i + 1])

print(ans + B[0])
```

### D

```python
H, W, K = map(int, input().split())
S = [input() for _ in range(H)]
ans = [[0] * W for _ in range(H)]

for i in range(H):
    for j in range(W):
        if S[i][j] == '#':
            if i - 1 >= 0:
                ans[i - 1][j] = 1
            if i + 1 < H:
                ans[i + 1][j] = 1
            if j - 1 >= 0:
                ans[i][j - 1] = 1
            if j + 1 < W:
                ans[i][j + 1] = 1

for i in range(H):
    print(*ans[i])
```

## 141

### A

```python
S = input()
W = ['Sunny', 'Cloudy', 'Rainy']
print(W[(W.index(S) + 1) % 3])
```

### B

```python
S = input()
ans = True

for i in range(len(S)):
    if i % 2 == 0 and S[i] not in 'RUD':
        ans = False
    if i % 2 == 1 and S[i] not in 'LUD':
        ans = False

print('Yes' if ans else 'No')
```

### C

```python
N, K, Q = map(int, input().split())
A = [0] * N

for _ in range(Q):
    A[int(input()) - 1] += 1

for i in range(N):
    if A[i] - (Q - K) > 0:
        print('Yes')
    else:
        print('No')

