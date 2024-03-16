
```
s = input()
c = s[0]
print(chr(ord(c)+1))
```

## 152

### A

```
n, m = map(int, input().split())
if n == m:
    print("Yes")
else:
    print("No")
```

### B

```
n, k, m = map(int, input().split())
a = list(map(int, input().split()))

s = sum(a)
if s + k >= n * m:
    print(max(0, s + k - n * m))
else:
    print(-1)
```

### C

```
n = int(input())
a = list(map(int, input().split()))

ans = 0
cnt = 0
for i in range(n):
    if a[i] == i + 1:
        cnt += 1
    else:
        ans = max(ans, cnt)
        cnt = 0
ans = max(ans, cnt)
print(ans)
```

### D

```
h, w = map(int, input().split())
s = [input() for _ in range(h)]

ans = 0
for i in range(h):
    for j in range(w):
        if s[i][j] == "#":
            continue
        for k in range(4):
            ni = i + dy[k]
            nj = j + dx[k]
            if ni < 0 or ni >= h or nj < 0 or nj >= w:
                continue
            if s[ni][nj] == "#":
                continue
            ans += 1
print(ans)
```

## 153

### A

```
h, a = map(int, input().split())
print(-(-h // a))
```

### B

```
n, k = map(int, input().split())
a = list(map(int, input().split()))

print("Yes" if sum(a) >= k else "No")
```

### C

```
n, k = map(int, input().split())
a = list(map(int, input().split()))

a.sort()
print(sum(a[:max(0, n - k)]))
```

### D

```
n = int(input())

ans = 0
for i in range(1, n + 1):
    ans += n // i
print(ans)
```

## 154

### A

```
s, t = input().split()
a, b = map(int, input().split())
u = input()

if s == u:
    a -= 1
else:
    b -= 1
print(a, b)
```

### B

```
s = input()
print(s.replace(s, "x" * len(s)))
```

### C

```
n = int(input())
a = list(map(int, input().split()))

s = set()
for i in range(n):
    if a[i] in s:
        print("NO")
        exit()
    s.add(a[i])
print("YES")
```

### D

```
n, k = map(int, input().split())
a = list(map(int, input().split()))

ans = 0
for i in range(n - k + 1):
    ans = max(ans, sum(a[i:i + k]))
print(ans)
```

## 155

### A

```
a, b, c = map(int, input().split())
print("Yes" if len(set([a, b, c])) == 2 else "No")
```

### B

```
n = int(input())
a = list(map(int, input().split()))

ans = "APPROVED"
for i in range(n):
    if a[i] % 2 == 0:
        if a[i] % 3 != 0 and a[i] % 5 != 0:
            ans = "DENIED"
print(ans)
```

### C

```
n = int(input())
s = [input() for _ in range(n)]

d = {}
for i in range(n):
    if s[i] in d:
        d[s[i]] += 1
    else:
        d[s[i]] = 1

m = max(d.values())
for k, v in d.items():
    if v == m:
        print(k)
```

### D

```
n, k = map(int, input().split())

ans = 0
for i in range(k, n + 1):
    ans += i * (n - i + 1)
print(ans)
```

## 156

### A

```
n, r = map(int, input().split())
print(r if n >= 10 else r + 100 * (10 - n))
```

### B

```
n, k = map(int, input().split())

ans = 0
while n > 0:
    n //= k
    ans += 1
print(ans)
```

### C

```
n = int(input())
a = list(map(int, input().split()))

ans = 10 ** 9
for i in range(1, 101):
    s = 0
    for j in range(n):
        s += (a[j] - i) ** 2
    ans = min(ans, s)
print(ans)
```

### D

```
n, a, b = map(int, input().split())

ans = 0
for i in range(a, b + 1):
    ans += i * (n - i + 1)
print(ans)
```

## 157

### A

```
n = int(input())
print(n // 2 + n % 2)
```

### B

```
a = [list(map(int, input().split())) for _ in range(3)]
n = int(input())
b = [int(input()) for _ in range(n)]

for i in range(n):
    for j in range(3):
        for k in range(3):
            if a[j][k] == b[i]:
                a[j][k] = 0

ans = "No"
for i in range(3):
    if a[i][0] == a[i][1] == a[i][2] == 0:
        ans = "Yes"
for i in range(3):
    if a[0][i] == a[1][i] == a[2][i] == 0:
        ans = "Yes"
if a[0][0] == a[1][1] == a[2][2] == 0:
    ans = "Yes"
if a[0][2] == a[1][1] == a[2][0] == 0:
    ans = "Yes"
print(ans)
```

### C

```
n, m = map(int, input().split())
s = [0] * n
c = [0] * n
for i in range(m):
    s[i], c[i] = map(int, input().split())

ans = -1
for i in range(1000):
    flag = True
    for j in range(m):
        if i // 10 ** (s[j] - 1) % 10 != c[j]:
            flag = False
    if flag:
        ans = i
        break
print(ans)
```

### D

```
n, a, b = map(int, input().split())

ans = 0
for i in range(a, b + 1):
    ans += i * (n - i + 1)
print(ans)
```

## 158

### A

```
s = input()
print("Yes" if s[0] == s[1] == s[2] else "No")
```

###
