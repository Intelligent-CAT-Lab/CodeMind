
```python
def gcd(p, q):
    if p % q == 0:
        return q
    return gcd(q, p%q)

N = int(input())
result = 0
a = 0

for i in range(1, N+1):
    for j in range(1, N+1):
        a = gcd(i, j)
        for k in range(1, N+1):
            result += gcd(a, k)

print(result)
```

## 2.7.14

Write a program that takes a command-line argument N and prints an N-by-N table with all N^2 integers between 0 and N^2-1 arranged in row-major order, followed by all N^2 integers between 0 and N^2-1 arranged in column-major order.

```python
import sys

N = int(sys.argv[1])

for i in range(N):
    for j in range(N):
        print(i*N+j, end=' ')
    print()

for i in range(N):
    for j in range(N):
        print(j*N+i, end=' ')
    print()
```

## 2.7.15

Write a program that takes a command-line argument N and prints an N-by-N table with all N^2 integers between 0 and N^2-1 arranged in spiral order, as in the following example.

```python
import sys

N = int(sys.argv[1])

a = [[0 for i in range(N)] for j in range(N)]

x = 0
y = 0

for i in range(N*N):
    a[x][y] = i
    if x+y == N-1:
        if x > y:
            x += 1
        else:
            y += 1
    elif x == y:
        if x > N/2:
            x -= 1
        else:
            y += 1
    elif x > y:
        x -= 1
        y += 1
    else:
        x += 1
        y -= 1

for i in range(N):
    for j in range(N):
        print(a[i][j], end=' ')
    print()
```

## 2.7.16

Write a program that takes a command-line argument N and prints an N-by-N table with all N^2 integers between 0 and N^2-1 arranged in spiral order, as in the following example.

```python
import sys

N = int(sys.argv[1])

a = [[0 for i in range(N)] for j in range(N)]

x = 0
y = 0

for i in range(N*N):
    a[x][y] = i
    if x+y == N-1:
        if x > y:
            x += 1
        else:
            y += 1
    elif x == y:
        if x > N/2:
            x -= 1
        else:
            y += 1
    elif x > y:
        x -= 1
        y += 1
    else:
        x += 1
        y -= 1

for i in range(N):
    for j in range(N):
        print(a[i][j], end=' ')
    print()
```

## 2.7.17

Write a program that takes a command-line argument N and prints an N-by-N table with all N^2 integers between 0 and N^2-1 arranged in spiral order, as in the following example.

```python
import sys

N = int(sys.argv[1])

a = [[0 for i in range(N)] for j in range(N)]

x = 0
y = 0

for i in range(N*N):
    a[x][y] = i
    if x+y == N-1:
        if x > y:
            x += 1
        else:
            y += 1
    elif x == y:
        if x > N/2:
            x -= 1
        else:
            y += 1
    elif x > y:
        x -= 1
        y += 1
    else:
        x += 1
        y -= 1

for i in range(N):
    for j in range(N):
        print(a[i][j], end=' ')
    print()
```

## 2.7.18

Write a program that takes a command-line argument N and prints an N-by-N table with all N^2 integers between 0 and N^2-1 arranged in spiral order, as in the following example.

```python
import sys

N = int(sys.argv[1])

a = [[0 for i in range(N)] for j in range(N)]

x = 0
y = 0

for i in range(N*N):
    a[x][y] = i
    if x+y == N-1:
        if x > y:
            x += 1
        else:
            y += 1
    elif x == y:
        if x > N/2:
            x -= 1
        else:
            y += 1
    elif x > y:
        x -= 1
        y += 1
    else:
        x += 1
        y -= 1

for i in range(N):
    for j in range(N):
        print(a[i][j], end=' ')
    print()
```

## 2.7.19

Write a program that takes a command-line argument N and prints an N-by-N table with all N^2 integers between 0 and N^2-1 arranged in spiral order, as in the following example.

```python
import sys

N = int(sys.argv[1])

a = [[0 for i in range(N)] for j in range(N)]

x = 0
y = 0

for i in range(N*N):
    a[x][y] = i
    if x+y == N-1:
        if x > y:
            x += 1
        else:
            y += 1
    elif x == y:
        if x > N/2:
            x -= 1
        else:
            y += 1
    elif x > y:
        x -= 1
        y += 1
    else:
        x += 1
        y -= 1

for i in range(N):
    for j in range(N):
        print(a[i][j], end=' ')
    print()
```

## 2.7.20

Write a program that takes a command-line argument N and prints an N-by-N table with all N^2 integers between 0 and N^2-1 arranged in spiral order, as in the following example.

```python
import sys

N = int(sys.argv[1])

a = [[0 for i in range(N)] for j in range(N)]

x = 0
y = 0

for i in range(N*N):
    a[x][y] = i
    if x+y == N-1:
        if x > y:
            x += 1
        else:
            y += 1
    elif x == y:
        if x > N/2:
            x -= 1
        else:
            y += 1
    elif x > y:
        x -= 1
        y += 1
    else:
        x += 1
        y -= 1

for i in range(N):
    for j in range(N):
        print(a[i][j], end=' ')
    print()
```

## 2.7.21

Write a program that takes a command-line argument N and prints an N-by-N table with all N^2 integers between 0 and
