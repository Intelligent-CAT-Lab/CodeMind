
```python
import sys

def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow = power(a)
    max = 0
    for j in range(pow):
        max = max * 10 + 9
    return a * (max - a)

l, r = map(int, sys.stdin.readline().split())
res = 0
maxxes = [0] * 10
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    maxxes[i] = temp // 2 * (temp - temp // 2)
res = max(mult(l), res)
res = max(mult(r), res)
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    if l <= temp // 2 and temp // 2 <= r:
        res = max(maxxes[i], res)
print(res)
```
/codeforces/codeforces_86_A.py
import sys

def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow = power(a)
    max = 0
    for j in range(pow):
        max = max * 10 + 9
    return a * (max - a)

l, r = map(int, sys.stdin.readline().split())
res = 0
maxxes = [0] * 10
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    maxxes[i] = temp // 2 * (temp - temp // 2)
res = max(mult(l), res)
res = max(mult(r), res)
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    if l <= temp // 2 and temp // 2 <= r:
        res = max(maxxes[i], res)
print(res)
/codeforces/codeforces_86_B.py
import sys

n, m = map(int, sys.stdin.readline().split())
a = []
for i in range(n):
    a.append(list(map(int, sys.stdin.readline().split())))

for i in range(n):
    for j in range(m):
        if a[i][j] == 1:
            for k in range(n):
                if a[k][j] == 1:
            1:
                    a[i][k] = 1

for i in range(n):
    for j in range(m):
        print(a[i][j], end=' ')
    print()
         a[i][k] = 1
            for k in range(m):
                if a[i][k] == 1:
                    a[k][j] = 1

for i in range(n):
    for j in range(m):
        if a[i][j] == 1:
            for k in range(n):
                if a[k][j] == 1 and a[i][k] == 0 and a[k][i] ==/codeforces/codeforces_86_B.md
# Codeforces 86 B

## Problem

You are given a matrix of size n × m. Each cell of the matrix contains either 0 or 1.

You can perform the following operation on the matrix: choose any two cells of the matrix and swap the values in them.

Your task is to make all the cells of the matrix equal to 1 using the minimum number of operations.

## Input

The first line contains two integers n and m (1 ≤ n, m ≤ 100) — the number of rows and the number of columns in the matrix.

Each of the next n lines contains m integers. The j-th integer in the i-th line is 0 if the corresponding cell of the matrix contains 0, and it is 1 if the corresponding cell of the matrix contains 1.

## Output

In the first line print the minimum number of operations you need to make all the cells of the matrix equal to 1.

In each of the next n lines print m integers — the matrix after applying the minimum number of operations.

## Sample input

```
3 3
0 0 0
0 0 0
0 0 0
```

## Sample output

```
3
1 1 1
1 1 1
1 1 1
```

## Sample input

```
3 3
0 0 0
0 0 0
0 0 0
```

## Sample output

```
3
1 1 1
1 1 1
1 1 1
```

## Sample input

```
3 3
1 1 1
1 1 1
1 1 1
```

## Sample output

```
0
1 1 1
1 1 1
1 1 1
```

## Sample input

```
3 3
1 0 0
0 1 0
0 0 1
```

## Sample output

```
4
1 1 1
1 1 1
1 1 1
```

## Sample input

```
3 3
0 0 0
0 0 0
0 0 0
```

## Sample output

```
3
1 1 1
1 1 1
1 1 1
```

## Sample input

```
3 3
0 0 0
0 0 0
0 0 0
```

## Sample output

```
3
1 1 1
1 1 1
1 1 1
```

## Sample input

```
3 3
1 1 1
1 1 1
1 1 1
```

## Sample output

```
0
1 1 1
1 1 1
1 1 1
```

## Sample input

```
3 3
1 0 0
0 1 0
0 0 1
```

## Sample output

```
4
1 1 1
1 1 1
1 1 1
```

## Sample input

```
3 3
0 0 0
0 0 0
0 0 0
```

## Sample
