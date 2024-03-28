

```
import sys

N, X, M = map(int, sys.stdin.readline().split())

used = set()
A = []
A.append(X)
used.add(X)

K = 0
L = 0
ans = 0
breakflag = False

for i in range(M-1):
    prev = A[i]
    now = (prev*prev) % M
    if now == 0:
        for j in range(i+1):
            ans += A[j]
        breakflag = True
        break
    elif now in used:
        L = i+1
        for j in range(i+1):
            if A[j] == now:
                K = j
                break
        sub = 0
        for j in range(K, L):
            sub += A[j]
        m = (N-K) % (L-K)
        left = 0
        for j in range(m):
            left += A[K+j]
        ans += ((N-K)//(L-K))*sub + left
        breakflag = True
        break
    else:
        used.add(now)
        A.append(now)

if not breakflag:
    ans = 0
    for a in A:
        ans += a

print(ans)
```

## 2. 1001번 문제

### 2.1. 문제

[1001번 문제](https://www.acmicpc.net/problem/1001)

### 2.2. 풀이

```
import sys

A, B = map(int, sys.stdin.readline().split())

print(A-B)
```

## 3. 1002번 문제

### 3.1. 문제

[1002번 문제](https://www.acmicpc.net/problem/1002)

### 3.2. 풀이

```
import sys
import math

T = int(sys.stdin.readline())

for _ in range(T):
    x1, y1, r1, x2, y2, r2 = map(int, sys.stdin.readline().split())

    d = math.sqrt((x1-x2)**2 + (y1-y2)**2)

    if d == 0:
        if r1 == r2:
            print(-1)
        else:
            print(0)
    else:
        if d > r1+r2 or d < abs(r1-r2):
            print(0)
        elif d == r1+r2 or d == abs(r1-r2):
            print(1)
        else:
            print(2)
```

## 4. 1003번 문제

### 4.1. 문제

[1003번 문제](https://www.acmicpc.net/problem/1003)

### 4.2. 풀이

```
import sys

T = int(sys.stdin.readline())

for _ in range(T):
    N = int(sys.stdin.readline())

    dp = [[0, 0] for _ in range(N+1)]
    dp[0] = [1, 0]
    dp[1] = [0, 1]

    for i in range(2, N+1):
        dp[i][0] = dp[i-1][0] + dp[i-2][0]
        dp[i][1] = dp[i-1][1] + dp[i-2][1]

    print(dp[N][0], dp[N][1])
```

## 5. 1004번 문제

### 5.1. 문제

[1004번 문제](https://www.acmicpc.net/problem/1004)

### 5.2. 풀이

```
import sys
import math

T = int(sys.stdin.readline())

for _ in range(T):
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
    N = int(sys.stdin.readline())

    ans = 0
    for _ in range(N):
        cx, cy, r = map(int, sys.stdin.readline().split())

        d1 = math.sqrt((x1-cx)**2 + (y1-cy)**2)
        d2 = math.sqrt((x2-cx)**2 + (y2-cy)**2)

        if d1 < r and d2 >= r:
            ans += 1
        elif d1 >= r and d2 < r:
            ans += 1

    print(ans)
```

## 6. 1005번 문제

### 6.1. 문제

[1005번 문제](https://www.acmicpc.net/problem/1005)

### 6.2. 풀이

```
import sys

T = int(sys.stdin.readline())

for _ in range(T):
    N, K = map(int, sys.stdin.readline().split())
    times = list(map(int, sys.stdin.readline().split()))
    graph = [[] for _ in range(N)]
    for _ in range(K):
        x, y = map(int, sys.stdin.readline().split())
        graph[x-1].append(y-1)
    W = int(sys.stdin.readline())

    dp = [0 for _ in range(N)]
    for i in range(N):
        if len(graph[i]) == 0:
            dp[i] = times[i]

    for i in range(N):
        for j in graph[i]:
            dp[j] = max(dp[j], dp[i]+times[j])

    print(dp[W-1])
```

## 7. 1008번 문제

### 7.1. 문제

[1008번 문제](https://www.acmicpc.net/problem/1008)

### 7.2. 풀이

```
import sys

A, B = map(int, sys.stdin.readline().split())

print(A/B)
```

## 8. 1010번 문제

### 8.1. 문제

[1010번 문제](https://www.acmicpc.net/problem/1
