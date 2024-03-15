
```python
import sys

x1, y1, x2, y2 = map(int, sys.stdin.readline().split())

if x1 == x2:
    dif = abs(y1 - y2)
    print(x1 + dif, y1, x1 + dif, y2)
elif y1 == y2:
    dif = abs(x1 - x2)
    print(x1, y1 + dif, x2, y2 + dif)
elif abs(x1 - x2) == abs(y1 - y2):
    print(x1, y2, x2, y1)
else:
    print(-1)
```

## 460A. 
[problem](http://codeforces.com/problemset/problem/460/A)

python code:
```python
import sys

n, m = map(int, sys.stdin.readline().split())

print(n + (n - 1) // (m - 1))
```

## 461A. 
[problem](http://codeforces.com/problemset/problem/461/A)

python code:
```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))

a.sort()

ans = 0
for i in range(n):
    ans += a[i] * (n - i)

print(ans)
```

## 462A. 
[problem](http://codeforces.com/problemset/problem/462/A)

python code:
```python
import sys

n = int(sys.stdin.readline())
a = [list(sys.stdin.readline().strip()) for _ in range(n)]

ans = True
for i in range(n):
    for j in range(n):
        cnt = 0
        if i > 0 and a[i - 1][j] == 'o':
            cnt += 1
        if i < n - 1 and a[i + 1][j] == 'o':
            cnt += 1
        if j > 0 and a[i][j - 1] == 'o':
            cnt += 1
        if j < n - 1 and a[i][j + 1] == 'o':
            cnt += 1
        if cnt % 2 == 1:
            ans = False

print('YES' if ans else 'NO')
```

## 463A. 
[problem](http://codeforces.com/problemset/problem/463/A)

python code:
```python
import sys

n, s = map(int, sys.stdin.readline().split())

ans = -1
for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    if a <= s and b > ans:
        ans = b

print(ans)
```

## 465A. 
[problem](http://codeforces.com/problemset/problem/465/A)

python code:
```python
import sys

s = sys.stdin.readline().strip()

ans = 0
for i in range(len(s)):
    if s[i] == '1':
        ans = i + 1

print(ans)
```

## 466A. 
[problem](http://codeforces.com/problemset/problem/466/A)

python code:
```python
import sys

n, m, a, b = map(int, sys.stdin.readline().split())

ans = min(n * a, (n // m) * b + (n % m) * a, (n // m + 1) * b)
print(ans)
```

## 467A. 
[problem](http://codeforces.com/problemset/problem/467/A)

python code:
```python
import sys

n = int(sys.stdin.readline())

ans = 0
for _ in range(n):
    p, q = map(int, sys.stdin.readline().split())
    if q - p >= 2:
        ans += 1

print(ans)
```

## 469A. 
[problem](http://codeforces.com/problemset/problem/469/A)

python code:
```python
import sys

n = int(sys.stdin.readline())
x = set(map(int, sys.stdin.readline().split()))
y = set(map(int, sys.stdin.readline().split()))

print('I become the guy.' if x | y == set(range(1, n + 1)) else 'Oh, my keyboard!')
```

## 471A. 
[problem](http://codeforces.com/problemset/problem/471/A)

python code:
```python
import sys

a = list(map(int, sys.stdin.readline().split()))

a.sort()

if a[0] == a[1] == a[2] == a[3] == a[4]:
    print('Bear')
elif a[0] == a[1] == a[2] and a[3] == a[4]:
    print('Elephant')
elif a[0] == a[1] and a[2] == a[3] == a[4]:
    print('Elephant')
else:
    print('Alien')
```

## 472A. 
[problem](http://codeforces.com/problemset/problem/472/A)

python code:
```python
import sys

n = int(sys.stdin.readline())

if n % 2 == 0:
    print(8, n - 8)
else:
    print(9, n - 9)
```

## 474A. 
[problem](http://codeforces.com/problemset/problem/474/A)

python code:
```python
import sys

s = sys.stdin.readline().strip()
t = sys.stdin.readline().strip()

d = {
    'a': 'q',
    'b': 'w',
    'c': 'e',
    'd': 'r',
    'e': 't',
    'f': 'y',
    'g': 'u',
    'h': 'i',
    'i': 'o',
    'j': 'p',
    'k': 'a',
    'l': 's',
    'm': 'd',
    'n': 'f',
    'o': 'g',
    'p': 'h',
    'q': 'j',
    'r': 'k',
    's': 'l',
    't': 'z',
    'u': 'x',
    'v': 'c',
    'w': 'v',
    'x': 'b',
    'y': 'n',
    'z': 'm',
}

ans = ''
for c in t:
    ans += d[c]

print(ans)
```

## 476
