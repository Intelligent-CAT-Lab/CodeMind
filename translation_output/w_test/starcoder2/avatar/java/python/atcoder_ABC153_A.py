

```python
import sys

monsterHP, servalATK = map(int, sys.stdin.readline().split())

mod = monsterHP % servalATK
ans = monsterHP // servalATK

if mod > 0:
    ans += 1

print(ans)
```

## 2. 121

https://atcoder.jp/contests/abc153/tasks/abc153_b

```python
import sys

H, N = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))

if sum(A) >= H:
    print("Yes")
else:
    print("No")
```

## 3. 122

https://atcoder.jp/contests/abc153/tasks/abc153_c

```python
import sys

N, K = map(int, sys.stdin.readline().split())
H = list(map(int, sys.stdin.readline().split()))

H.sort()

if K >= N:
    print(0)
else:
    print(sum(H[:N-K]))
```

## 4. 123

https://atcoder.jp/contests/abc153/tasks/abc153_d

```python
import sys

H = int(sys.stdin.readline())

def f(x):
    if x == 1:
        return 1
    else:
        return 2 * f(x // 2) + 1

print(f(H))
```

## 5. 124

https://atcoder.jp/contests/abc153/tasks/abc153_e

```python
import sys

H, N = map(int, sys.stdin.readline().split())
A = []
B = []
for _ in range(N):
    a, b = map(int, sys.stdin.readline().split())
    A.append(a)
    B.append(b)

dp = [float("inf")] * (H + 1)
dp[0] = 0

for i in range(H):
    for j in range(N):
        if i + A[j] <= H:
            dp[i + A[j]] = min(dp[i + A[j]], dp[i] + B[j])

print(dp[H])
```

## 6. 125

https://atcoder.jp/contests/abc153/tasks/abc153_f

```python
import sys

N, D, A = map(int, sys.stdin.readline().split())

X = []
H = []
for _ in range(N):
    x, h = map(int, sys.stdin.readline().split())
    X.append(x)
    H.append(h)

X, H = zip(*sorted(zip(X, H)))

ans = 0
damage = 0

for i in range(N):
    damage += A
    if H[i] - damage <= 0:
        continue
    else:
        ans += (H[i] - damage) // A + 1
        damage += (H[i] - damage) // A * A

print(ans)
```

## 7. 126

https://atcoder.jp/contests/abc153/tasks/abc153_f

```python
import sys

N, D, A = map(int, sys.stdin.readline().split())

X = []
H = []
for _ in range(N):
    x, h = map(int, sys.stdin.readline().split())
    X.append(x)
    H.append(h)

X, H = zip(*sorted(zip(X, H)))

ans = 0
damage = 0

for i in range(N):
    damage += A
    if H[i] - damage <= 0:
        continue
    else:
        ans += (H[i] - damage) // A + 1
        damage += (H[i] - damage) // A * A

print(ans)
```

## 8. 127

https://atcoder.jp/contests/abc153/tasks/abc153_f

```python
import sys

N, D, A = map(int, sys.stdin.readline().split())

X = []
H = []
for _ in range(N):
    x, h = map(int, sys.stdin.readline().split())
    X.append(x)
    H.append(h)

X, H = zip(*sorted(zip(X, H)))

ans = 0
damage = 0

for i in range(N):
    damage += A
    if H[i] - damage <= 0:
        continue
    else:
        ans += (H[i] - damage) // A + 1
        damage += (H[i] - damage) // A * A

print(ans)
```

## 9. 128

https://atcoder.jp/contests/abc153/tasks/abc153_f

```python
import sys

N, D, A = map(int, sys.stdin.readline().split())

X = []
H = []
for _ in range(N):
    x, h = map(int, sys.stdin.readline().split())
    X.append(x)
    H.append(h)

X, H = zip(*sorted(zip(X, H)))

ans = 0
damage = 0

for i in range(N):
    damage += A
    if H[i] - damage <= 0:
        continue
    else:
        ans += (H[i] - damage) // A + 1
        damage += (H[i] - damage) // A * A

print(ans)
```

## 10. 129

https://atcoder.jp/contests/abc153/tasks/abc153_f

```python
import sys

N, D, A = map(int, sys.stdin.readline().split())

X = []
H = []
for _ in range(N):
    x, h = map(int, sys.stdin.readline().split())
    X.append(x)
    H.append(h)

X, H = zip(*sorted(zip(X, H)))

ans = 0
damage = 0

for i in range(N):
    damage += A
    if H[i] - damage <= 0:
        continue
    else:
        ans += (H[i] - damage) // A + 1
        damage += (H[i] - damage) // A * A

print(ans)
```


```python
import sys

N = int(sys.stdin.readline())

ans = 0
for i in range(1, N + 1):
    if i % 3 != 0 and i % 5 != 0:
        ans += i

print(ans)
```

## 3. 123

https://atcoder.jp/contests/abc153/tasks/abc153_c

```python
import sys

N, K = map(int, sys.stdin.readline().split())
H = list(map(int, sys.stdin.readline().split()))

H.sort()

if K >= N:
    print(0)
else:
    print(sum(H[:N-K]))
```

## 4. 124

https://atcoder.jp/contests/abc153/tasks/abc153_d

```python
import sys

H = int(sys.stdin.readline())

def f(x):
    if x == 1
