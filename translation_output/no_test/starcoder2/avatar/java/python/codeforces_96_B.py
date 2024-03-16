
```python
number = int(input())
ans = -1
value = 0
mask = 2

while value < number:
    s = bin(mask)[2:]
    zeros = 0
    for c in s:
        if c == '0':
            zeros += 1
    if zeros != len(s) - zeros:
        mask += 1
        continue
    s = s.replace('0', '4')
    s = s.replace('1', '7')
    value = int(s, 2)
    mask += 1

print(value)
```

## 1000. A+B

### Description

Given two integers $A$ and $B$, output $A+B$.

### Input

The first line contains an integer $T$ ($1 \le T \le 1000$), indicating the number of test cases.

For each test case, the first line contains two integers $A$ and $B$ ($-1000 \le A, B \le 1000$).

### Output

For each test case output one line containing one integer, indicating the sum of $A$ and $B$.

### Sample Input

```
2
1 2
-3 4
```

### Sample Output

```
3
1
```

### Solution

```python
T = int(input())
for i in range(T):
    A, B = map(int, input().split())
    print(A + B)
```

## 1001. A+B (II)

### Description

Given two integers $A$ and $B$, output $A+B$.

### Input

The first line contains an integer $T$ ($1 \le T \le 1000$), indicating the number of test cases.

For each test case, the first line contains two integers $A$ and $B$ ($-1000 \le A, B \le 1000$).

### Output

For each test case output one line containing one integer, indicating the sum of $A$ and $B$.

### Sample Input

```
2
1 2
-3 4
```

### Sample Output

```
3
1
```

### Solution

```python
T = int(input())
for i in range(T):
    A, B = map(int, input().split())
    print(A + B)
```

## 1002. A+B (III)

### Description

Given two integers $A$ and $B$, output $A+B$.

### Input

The first line contains an integer $T$ ($1 \le T \le 1000$), indicating the number of test cases.

For each test case, the first line contains two integers $A$ and $B$ ($-1000 \le A, B \le 1000$).

### Output

For each test case output one line containing one integer, indicating the sum of $A$ and $B$.

### Sample Input

```
2
1 2
-3 4
```

### Sample Output

```
3
1
```

### Solution

```python
T = int(input())
for i in range(T):
    A, B = map(int, input().split())
    print(A + B)
```

## 1003. A+B (IV)

### Description

Given two integers $A$ and $B$, output $A+B$.

### Input

The first line contains an integer $T$ ($1 \le T \le 1000$), indicating the number of test cases.

For each test case, the first line contains two integers $A$ and $B$ ($-1000 \le A, B \le 1000$).

### Output

For each test case output one line containing one integer, indicating the sum of $A$ and $B$.

### Sample Input

```
2
1 2
-3 4
```

### Sample Output

```
3
1
```

### Solution

```python
T = int(input())
for i in range(T):
    A, B = map(int, input().split())
    print(A + B)
```

## 1004. A+B (V)

### Description

Given two integers $A$ and $B$, output $A+B$.

### Input

The first line contains an integer $T$ ($1 \le T \le 1000$), indicating the number of test cases.

For each test case, the first line contains two integers $A$ and $B$ ($-1000 \le A, B \le 1000$).

### Output

For each test case output one line containing one integer, indicating the sum of $A$ and $B$.

### Sample Input

```
2
1 2
-3 4
```

### Sample Output

```
3
1
```

### Solution

```python
T = int(input())
for i in range(T):
    A, B = map(int, input().split())
    print(A + B)
```

## 1005. A+B (VI)

### Description

Given two integers $A$ and $B$, output $A+B$.

### Input

The first line contains an integer $T$ ($1 \le T \le 1000$), indicating the number of test cases.

For each test case, the first line contains two integers $A$ and $B$ ($-1000 \le A, B \le 1000$).

### Output

For each test case output one line containing one integer, indicating the sum of $A$ and $B$.

### Sample Input

```
2
1 2
-3 4
```

### Sample Output

```
3
1
```

### Solution

```python
T = int(input())
for i in range(T):
    A, B = map(int, input().split())
    print(A + B)
```

## 1006. A+B (VII)

### Description

Given two integers $A$ and $B$, output $A+B$.

### Input

The first line contains an integer $T$ ($1 \le T \le 1000$), indicating the number of test cases.

For each test case, the first line contains two integers $A$ and $B$ ($-1000 \le A, B \le 1000$).

### Output

For each test case output one line containing one integer, indicating the sum of $A$ and $B$.

### Sample Input

```
2
1 2
-3 4
```

### Sample Output

```
3
1
```

### Solution

```python
T = int(input())
for i in range(T):
    A, B = map(int, input().split())
    print(A + B)
```

## 1007. A+B (VIII)

### Description

Given two integers $A$ and $B$, output $A+B$.

### Input

The first line contains an integer $T$ ($1 \le T \le 1000$), indicating the number of test cases.

For each test case, the first line contains two integers $A$ and $B$ ($-1000 \le A, B \le 1000$).

### Output

For each test case output one line containing one integer, indicating the sum of $A$ and $B$.

### Sample Input


