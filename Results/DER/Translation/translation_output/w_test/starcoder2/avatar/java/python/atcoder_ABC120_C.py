

```python
s1 = input()
ans = 0
c1 = 0
c0 = 0

for i in range(len(s1)):
    if s1[i] == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

## 2. 120B

### 2.1. Problem

https://atcoder.jp/contests/abc120/tasks/abc120_b

### 2.2. Solution

```python
a, b, k = map(int, input().split())

ans = []
for i in range(1, 101):
    if a % i == 0 and b % i == 0:
        ans.append(i)

print(ans[-k])
```

## 3. 120C

### 3.1. Problem

https://atcoder.jp/contests/abc120/tasks/abc120_c

### 3.2. Solution

```python
s1 = input()
ans = 0
c1 = 0
c0 = 0

for i in range(len(s1)):
    if s1[i] == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

## 4. 120D

### 4.1. Problem

https://atcoder.jp/contests/abc120/tasks/abc120_d

### 4.2. Solution

```python
n, m = map(int, input().split())

ans = []
for i in range(m):
    a, b = map(int, input().split())
    ans.append((a, b))

ans.sort(key=lambda x: x[0])

print(ans)
```

## 5. 120E

### 5.1. Problem

https://atcoder.jp/contests/abc120/tasks/abc120_e

### 5.2. Solution

```python
n, m = map(int, input().split())

ans = []
for i in range(m):
    a, b = map(int, input().split())
    ans.append((a, b))

ans.sort(key=lambda x: x[0])

print(ans)
```
/atcoder/abc121/README.md
# AtCoder Beginner Contest 121

## 1. 121A

### 1.1. Problem

https://atcoder.jp/contests/abc121/tasks/abc121_a

### 1.2. Solution

```python
h, w = map(int, input().split())
a, b = map(int, input().split())

print((h - a) * (w - b))
```

## 2. 121B

### 2.1. Problem

https://atcoder.jp/contests/abc121/tasks/abc121_b

### 2.2. Solution

```python
n, m, c = map(int, input().split())
b = list(map(int, input().split()))

ans = 0
for i in range(n):
    a = list(map(int, input().split()))
    s = 0
    for j in range(m):
        s += a[j] * b[j]
    s += c
    if s > 0:
        ans += 1

print(ans)
```

## 3. 121C

### 3.1. Problem

https://atcoder.jp/contests/abc121/tasks/abc121_c

### 3.2. Solution

```python
n, m = map(int, input().split())

ans = []
for i in range(n):
    a, b = map(int, input().split())
    ans.append((a, b))

ans.sort(key=lambda x: x[0])

s = 0
ans_sum = 0
for i in range(n):
    if s + ans[i][1] >= m:
        ans_sum += (m - s) * ans[i][0]
        break
    else:
        ans_sum += ans[i][1] * ans[i][0]
        s += ans[i][1]

print(ans_sum)
```

## 4. 121D

### 4.1. Problem

https://atcoder.jp/contests/abc121/tasks/abc121_d

### 4.2. Solution

```python
a, b = map(int, input().split())

def f(x):
    if x == 0:
        return 0
    elif x % 4 == 0:
        return x
    elif x % 4 == 1:
        return 1
    elif x % 4 == 2:
        return x + 1
    else:
        return 0

print(f(b) ^ f(a - 1))
```

## 5. 121E

### 5.1. Problem

https://atcoder.jp/contests/abc121/tasks/abc121_e

### 5.2. Solution

```python
n, m, k = map(int, input().split())

ans = 0
for i in range(k + 1):
    ans += (2 ** i) * (2 ** (n - i)) * (2 ** (m - 1))

print(ans % (10 ** 9 + 7))
```

## 6. 121F

### 6.1. Problem

https://atcoder.jp/contests/abc121/tasks/abc121_f

### 6.2. Solution

```python
n, m = map(int, input().split())

ans = []
for i in range(n):
    a, b = map(int, input().split())
    ans.append((a, b))

ans.sort(key=lambda x: x[0])

s = 0
ans_sum = 0
for i in range(n):
    if s + ans[i][1] >= m:
        ans_sum += (m - s) * ans[i][0]
        break
    else:
        ans_sum += ans[i][1] * ans[i][0]
        s += ans[i][1]

print(ans_sum)
```

## 7. 121G

### 7.1. Problem

https://atcoder.jp/contests/abc121/tasks/abc121_g

### 7.2. Solution

```python
n, m, k = map(int, input().split())

ans = []
for i in range(n):
    a, b = map(int, input().split())
    ans.append((a, b))

ans.sort(key=lambda x: x[0
