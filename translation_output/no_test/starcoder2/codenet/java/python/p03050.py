
```python
import math

n = int(input())
ans = 0
for i in range(1, int(math.sqrt(n)) + 1):
    if n % i == 0:
        m = n // i - 1
        if i < m:
            ans += m

print(ans)
```

## 03051 - 1000000007

### Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### Input

The first line of input contains a single integer T (1 ≤ T ≤ 1000), the number of test cases. T test cases follow.

Each test case consists of a single line containing a single integer n (1 ≤ n ≤ 1012).

### Output

For each test case, output a single line containing the number of positive integers less than or equal to n that are relatively prime to n.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
1
2
```

### Solution

```python
import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

t = int(input())
for _ in range(t):
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        if gcd(n, i) == 1:
            ans += 1
    print(ans)
```

## 03052 - 1000000007

### Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### Input

The first line of input contains a single integer T (1 ≤ T ≤ 1000), the number of test cases. T test cases follow.

Each test case consists of a single line containing a single integer n (1 ≤ n ≤ 1012).

### Output

For each test case, output a single line containing the number of positive integers less than or equal to n that are relatively prime to n.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
1
2
```

### Solution

```python
import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

t = int(input())
for _ in range(t):
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        if gcd(n, i) == 1:
            ans += 1
    print(ans)
```

## 03053 - 1000000007

### Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### Input

The first line of input contains a single integer T (1 ≤ T ≤ 1000), the number of test cases. T test cases follow.

Each test case consists of a single line containing a single integer n (1 ≤ n ≤ 1012).

### Output

For each test case, output a single line containing the number of positive integers less than or equal to n that are relatively prime to n.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
1
2
```

### Solution

```python
import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

t = int(input())
for _ in range(t):
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        if gcd(n, i) == 1:
            ans += 1
    print(ans)
```/03000/03000.md
# 03000 - 1000000007

## 03000 - 1000000007

### Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### Input

The first line of input contains a single integer T (1 ≤ T ≤ 1000), the number of test cases. T test cases follow.

Each test case consists of a single line containing a single integer n (1 ≤ n ≤ 1012).

### Output

For each test case, output a single line containing the number of positive integers less than or equal to n that are relatively prime to n.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
1
2
```

### Solution

```python
import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

t = int(input())
for _ in range(t):
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        if gcd(n, i) == 1:
            ans += 1
    print(ans)
```

## 03001 - 1000000007

### Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### Input

The first line of input contains a single integer T (1 ≤ T ≤ 1000), the number of test cases. T test cases follow.

Each test case consists of a single line containing a single integer n (1 ≤ n ≤ 1012).

### Output

For each test case, output a single line containing the number of positive integers less than or equal to n that are relatively prime to n.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
1
2
```

### Solution

```python
import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

t = int(input())
for _ in range(t):
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        if gcd(n, i) == 1:
            ans += 1
    print(ans)
```

## 03002 - 1000000007

### Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### Input

The first line of input contains a single integer T (1 ≤ T ≤ 1000), the number of test cases. T test cases follow.

Each test case consists of a single line containing a single integer n (1 ≤ n ≤ 1012).

### Output

For each test case, output a single line containing the number of positive integers less than or equal to n that are relatively prime to n.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
1
2
```

### Solution

```python
import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

t = int(input())
for _ in range(t):
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        if gcd(n, i) == 
