
```

```


```

java code:
```

```
/archive/abc167/abc167_c.md
# [abc167 C - Skill Up](https://atcoder.jp/contests/abc167/tasks/abc167_c)

## 解法

## コード

```python
import bisect, collections, copy, heapq, itertools, math, string, sys
input = lambda: sys.stdin.readline().rstrip() 
sys.setrecursionlimit(10**7)
INF = float('inf')
MOD = 10**9 + 7
def I(): return int(input())
def F(): return float(input())
def SS(): return input()
def LI(): return [int(x) for x in input().split()]
def LI_(): return [int(x)-1 for x in input().split()]
def LF(): return [float(x) for x in input().split()]
def LSS(): return input().split()

def resolve():
    n, m, x = LI()
    c = [0] * n
    a = [[0] * m for _ in range(n)]
    for i in range(n):
        c[i], *a[i] = LI()

    ans = INF
    for bit in range(1 << n):
        s = [0] * m
        cost = 0
        for i in range(n):
            if bit & (1 << i):
                cost += c[i]
                for j in range(m):
                    s[j] += a[i][j]
        if all(s[j] >= x for j in range(m)):
            ans = min(ans, cost)

    if ans == INF:
        print(-1)
    else:
        print(ans)

if __name__ == '__main__':
    resolve()
/archive/abc166/abc166_c.md
# [abc166 C - Peaks](https://atcoder.jp/contests/abc166/tasks/abc166_c)

## 解法

## コード

```python
import bisect, collections, copy, heapq, itertools, math, string, sys
input = lambda: sys.stdin.readline().rstrip() 
sys.setrecursionlimit(10**7)
INF = float('inf')
MOD = 10**9 + 7
def I(): return int(input())
def F(): return float(input())
def SS(): return input()
def LI(): return [int(x) for x in input().split()]
def LI_(): return [int(x)-1 for x in input().split()]
def LF(): return [float(x) for x in input().split()]
def LSS(): return input().split()

def resolve():
    n, m = LI()
    h = LI()
    g = [[] for _ in range(n)]
    for _ in range(m):
        a, b = LI_()
        g[a].append(b)
        g[b].append(a)

    ans = 0
    for i in range(n):
        ok = True
        for j in g[i]:
            if h[i] <= h[j]:
                ok = False
                break
        if ok:
            ans += 1

    print(ans)

if __name__ == '__main__':
    resolve()

```

java code:
```

```
/archive/abc165/abc165_c.md
# [abc165 C - Many Requirements](https://atcoder.jp/contests/abc165/tasks/abc165_c)

## 解法

## コード

```python
import bisect, collections, copy, heapq, itertools, math, string, sys
input = lambda: sys.stdin.readline().rstrip() 
sys.setrecursionlimit(10**7)
INF = float('inf')
MOD = 10**9 + 7
def I(): return int(input())
def F(): return float(input())
def SS(): return input()
def LI(): return [int(x) for x in input().split()]
def LI_(): return [int(x)-1 for x in input().split()]
def LF(): return [float(x) for x in input().split()]
def LSS(): return input().split()

def resolve():
    n, m, q = LI()
    a = [0] * q
    b = [0] * q
    c = [0] * q
    d = [0] * q
    for i in range(q):
        a[i], b[i], c[i], d[i] = LI()

    ans = 0
    for x in range(1, m + 1):
        for y in range(1, m + 1):
            if x == y:
                continue
            for z in range(1, m + 1):
                if x == z or y == z:
                    continue
                for w in range(1, m + 1):
                    if x == w or y == w or z == w:
                        continue
                    score = 0
                    for i in range(q):
                        if x == a[i] and y == b[i]:
                            score += c[i]
                        if x == a[i] and z == b[i]:
                            score += c[i]
                        if x == a[i] and w == b[i]:
                            score += c[i]
                        if y == a[i] and z == b[i]:
                            score += c[i]
                        if y == a[i] and w == b[i]:
                            score += c[i]
                        if z == a[i] and w == b[i]:
                            score += c[i]
                    ans = max(ans, score)

    print(ans)

if __name__ == '__main__':
    resolve()

```

java code:
```

```

## 解法

## コード

```python
import bisect, collections, copy, heapq, itertools, math, string, sys
input = lambda: sys.stdin.readline().rstrip() 
sys.setrecursionlimit(10**7)
INF = float('inf')
MOD = 10**9 + 7
def I(): return int(input())
def F(): return float(input())
def SS(): return input()
def LI(): return [int(x) for x in input().split()]
def LI_(): return [int(x)-1 for x in input().split()]
def LF(): return [float(x) for x in input().split()]
def LSS(): return input().split()

def resolve():
    n, m, q = LI()
    a = [0] * q
    b = [0] * q
    c = [0] * q
    d = [0] * q
    for i in range(q):
        a[i], b[i], c[i], d[i] = LI()

    ans = 0
    for x in range(1, m + 1):
        for y in range(1, m + 1):
            if x == y:
                continue
            for z in range(1, m + 1):
                if x == z or y == z:
                    continue
                for w in range(1, m + 1):
                    if x == w or y == w or z == w:
                        continue
                    score = 0
                    for i in range(q):
                        if x == a[i] and y == b[i]:
                            score +=
