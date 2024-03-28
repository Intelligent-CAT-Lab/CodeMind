
```python
m = 1000000007

def pow(a, b):
    s = 1
    a2 = a
    while b > 0:
        if b & 1 != 0:
            s = s * a2 % m
        a2 = a2 * a2 % m
        b >>= 1
    return s

def reverse(a):
    return pow(a, m - 2)

def sub(n, a):
    if a > n / 2:
        a = n - a
    s1 = 1
    n2 = n - a
    for i in range(n, n2, -1):
        s1 = s1 * i % m
    s2 = 1
    for i in range(1, a + 1):
        s2 = s2 * i % m
    s3 = reverse(s2)
    return s1 * s3 % m

n, a, b = map(int, input().split())

all = pow(2, n)

answer = (all + 2 * m - sub(n, a) - sub(n, b) - 1) % m
print(answer)
```

## 2. 1000000007

### 2.1. Description

Given a number n, find the number of ways to write n as a sum of two squares.

### 2.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 2.3. Output

For each test case, output the number of ways to write n as a sum of two squares.

### 2.4. Constraints

1 <= T <= 100000

1 <= n <= 1000000000

### 2.5. Sample Input

```
3
1
2
3
```

### 2.6. Sample Output

```
1
2
1
```

### 2.7. Explanation

For the first test case, 1 can be written as 1^2 + 0^2.

For the second test case, 2 can be written as 1^2 + 1^2 and 2^2 + 0^2.

For the third test case, 3 can be written as 1^2 + 1^2.

### 2.8. Solution

```python
import math

def is_square(n):
    return int(math.sqrt(n)) ** 2 == n

def solve(n):
    if is_square(n):
        return 1
    count = 0
    for i in range(1, int(math.sqrt(n)) + 1):
        if is_square(n - i ** 2):
            count += 1
    return count * 2

t = int(input())
for _ in range(t):
    n = int(input())
    print(solve(n))
```

## 3. 1000000009

### 3.1. Description

Given a number n, find the number of ways to write n as a sum of two squares.

### 3.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 3.3. Output

For each test case, output the number of ways to write n as a sum of two squares.

### 3.4. Constraints

1 <= T <= 100000

1 <= n <= 1000000000

### 3.5. Sample Input

```
3
1
2
3
```

### 3.6. Sample Output

```
1
2
1
```

### 3.7. Explanation

For the first test case, 1 can be written as 1^2 + 0^2.

For the second test case, 2 can be written as 1^2 + 1^2 and 2^2 + 0^2.

For the third test case, 3 can be written as 1^2 + 1^2.

### 3.8. Solution

```python
import math

def is_square(n):
    return int(math.sqrt(n)) ** 2 == n

def solve(n):
    if is_square(n):
        return 1
    count = 0
    for i in range(1, int(math.sqrt(n)) + 1):
        if is_square(n - i ** 2):
            count += 1
    return count * 2

t = int(input())
for _ in range(t):
    n = int(input())
    print(solve(n))
```
 1000000000

### 2.5. Sample Input

```
3
1
2
3
```

### 2.6. Sample Output

```
1
2
1
```

### 2.7. Explanation

For the first test case, 1 can be written as 1^2 + 0^2.

For the second test case, 2 can be written as 1^2 + 1^2 and 2^2 + 0^2.

For the third test case, 3 can be written as 1^2 + 1^2.

### 2.8. Solution

```python
import math

def is_square(n):
    return int(math.sqrt(n)) ** 2 == n

def solve(n):
    if is_square(n):
        return 1
    count = 0
    for i in range(1, int(math.sqrt(n)) + 1):
        if is_square(n - i ** 2):
            count += 1
    return count * 2

t = int(input())
for _ in range(t):
    n = int(input())
    print(solve(n))
```

## 3. 1000000009

### 3.1. Description

Given a number n, find the number of ways to write n as a sum of two squares.

### 3.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 3.3. Output

For each test case, output the number of ways to write n as a sum of two squares.

### 3.4. Constraints

1 <= T <= 100000

1 <= n <= 1000000000

### 3.5. Sample Input

```

