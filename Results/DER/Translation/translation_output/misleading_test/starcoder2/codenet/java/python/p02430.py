

```python
import sys

n, k = map(int, input().split())

for bit in range(1 << n):
    if bin(bit).count('1') != k:
        continue
    print(bit, end=':')
    for j in range(n):
        if (bit >> j) & 1 == 1:
            print(j, end=' ')
    print()
```

## 2431

### 2431.py

```python
import sys

n, m = map(int, input().split())

a = list(map(int, input().split()))

b = list(map(int, input().split()))

c = [0] * (n + 1)

for i in range(n):
    c[i + 1] = c[i] + a[i]

ans = 0

for i in range(n):
    if c[i] > m:
        break
    ans = i
    m -= c[i]

print(ans + 1)

for i in range(ans + 1):
    if b[i] <= m:
        m -= b[i]
        print(i + 1, end=' ')
```

## 2432

### 2432.py

```python
import sys

n = int(input())

a = list(map(int, input().split()))

b = list(map(int, input().split()))

c = [0] * (n + 1)

for i in range(n):
    c[i + 1] = c[i] + a[i]

ans = 0

for i in range(n):
    if c[i] > b[i]:
        break
    ans = i

print(ans + 1)
```

## 2433

### 2433.py

```python
import sys

n = int(input())

a = list(map(int, input().split()))

b = list(map(int, input().split()))

c = [0] * (n + 1)

for i in range(n):
    c[i + 1] = c[i] + a[i]

ans = 0

for i in range(n):
    if c[i] > b[i]:
        break
    ans = i

print(ans + 1)
```

## 2434

### 2434.py

```python
import sys

n = int(input())

a = list(map(int, input().split()))

b = list(map(int, input().split()))

c = [0] * (n + 1)

for i in range(n):
    c[i + 1] = c[i] + a[i]

ans = 0

for i in range(n):
    if c[i] > b[i]:
        break
    ans = i

print(ans + 1)
```

## 2435

### 2435.py

```python
import sys

n = int(input())


