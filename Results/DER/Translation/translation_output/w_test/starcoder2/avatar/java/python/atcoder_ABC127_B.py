

```python
r, d, x = map(int, input().split())
for i in range(10):
    x = r * x - d
    print(x)
```

## 128

### A

```python
a, p = map(int, input().split())
print((a * 3 + p) // 2)
```

### B

```python
n = int(input())
ans = 0
for i in range(n):
    s = input()
    if s.count('r') >= 2:
        ans += 1
print(ans)
```

### C

```python
n, m = map(int, input().split())
s = [list(map(int, input().split())) for _ in range(m)]
k = int(input())
p = list(map(int, input().split()))

ans = 0
for i in range(2 ** n):
    flag = True
    for j in range(m):
        cnt = 0
        for k in range(n):
            if (i >> k) & 1 and s[j][k] == 1:
                cnt += 1
        if cnt % 2 != p[j]:
            flag = False
    if flag:
        ans += 1
print(ans)
```

### D

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
bc = [list(map(int, input().split())) for _ in range(m)]

a.sort(reverse=True)
bc.sort(key=lambda x: x[1], reverse=True)

ans = 0
for i in range(m):
    for j in range(bc[i][0]):
        if a[j] < bc[i][1]:
            a[j] = bc[i][1]
        else:
            break
print(sum(a))
```

## 129

### A

```python
p, q, r = map(int, input().split())
print(min(p + q, q + r, r + p))
```

### B

```python
n = int(input())
s = input().split()
ans = 1000
for i in range(n - 1):
    ans = min(ans, s[i].count('1') + s[i + 1].count('0'))
print(ans)
```

### C

```python
n, m = map(int, input().split())
a = [0] * (n + 1)
for i in range(m):
    a[int(input())] = 1

dp = [0] * (n + 1)
dp[0] = 1
for i in range(n):
    if a[i + 1] == 0:
        dp[i + 1] = dp[i]
    if i + 2 <= n and a[i + 2] == 0:
        dp[i + 2] = (dp[i + 2] + dp[i]) % (10 ** 9 + 7)
print(dp[n])
```

### D

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
bc = [list(map(int, input().split())) for _ in range(m)]

a.sort(reverse=True)
bc.sort(key=lambda x: x[1], reverse=True)

ans = 0
for i in range(m):
    for j in range(bc[i][0]):
        if a[j] < bc[i][1]:
            a[j] = bc[i][1]
        else:
            break
print(sum(a))
```

## 130

### A

```python
x, a = map(int, input().split())
print(0 if x < a else 10)
```

### B

```python
n, x = map(int, input().split())
l = list(map(int, input().split()))

ans = 1
d = 0
for i in range(n):
    d += l[i]
    if d <= x:
        ans += 1
print(ans)
```

### C

```python
w, h, x, y = map(int, input().split())
print(w * h / 2, 1 if w / 2 == x and h / 2 == y else 0)
```

### D

```python
n, m = map(int, input().split())

ans = 0
for i in range(n, m + 1):
    if i % 2 == 0:
        ans += 1
print(ans)
```

## 131

### A

```python
s = input()
print('Bad' if s[0] == s[1] or s[1] == s[2] or s[2] == s[3] else 'Good')
```

### B

```python
n, l = map(int, input().split())
a = [l + i for i in range(n)]

ans = 1000
for i in range(n):
    if abs(a[i]) < abs(ans):
        ans = a[i]
print(sum(a) - ans)
```

### C

```python
a, b, c, d = map(int, input().split())

def lcm(x, y):
    return x * y // gcd(x, y)

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

def f(n, x):
    return n // x - n // lcm(x, c) - n // lcm(x, d) + n // lcm(lcm(x, c), d)

print(f(b, c) + f(b, d) - f(b, lcm(c, d)) - f(a - 1, c) - f(a - 1, d) + f(a - 1, lcm(c, d)))
```

### D

```python
n = int(input())
ab = [list(map(int, input().split())) for _ in range(n)]

ab.sort(key=lambda x: x[1])

ans = 0
t = 0
for i in range(n):
    if t + ab[i][0] <= ab[i][1]:
        ans += 1
        t += ab[i][0]
print(ans)
```

## 132

### A

```python
s = input()
print('Yes' if len(set(s)) == 2 else 'No')
```

### B

```python
n = int(input())
p = list(map(int, input().split()))

ans = 0
for i in range(1, n - 1):
    if p[i - 1] < p[i] < p[i + 1] or p[i - 1] > p[i] > p[i + 1]:
        ans += 1
print(ans)
```

### C

```python
n = int(input())
a = list(map(int, input().split()))

a.sort()

print(a[n // 2] - a[n // 2 - 1])
```

### D

```python
n, k = map(int, input().split())

ans = 0
for i in range(1, k + 1):
    ans += (n - k + 1) * (k - i + 1
