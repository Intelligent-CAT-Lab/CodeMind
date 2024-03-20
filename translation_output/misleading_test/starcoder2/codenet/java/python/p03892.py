

```python
import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solve():
    a = int(input())
    b = int(input())
    a = abs(int(input()) - a)
    b = abs(int(input()) - b)
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

solve()
```

## 3. 1000000007

### 3.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### 3.2. Input

The input consists of a single integer n (1≤n≤10^12).

### 3.3. Output

Print the number of positive integers less than or equal to n that are relatively prime to n.

### 3.4. Sample Input

```
10
```

### 3.5. Sample Output

```
4
```

### 3.6. Solution

```python
import math

def solve():
    n = int(input())
    ans = n
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            ans -= ans // i
            while n % i == 0:
                n //= i
    if n > 1:
        ans -= ans // n
    print(ans)

solve()
```

## 4. 1000000008

### 4.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### 4.2. Input

The input consists of a single integer n (1≤n≤10^12).

### 4.3. Output

Print the number of positive integers less than or equal to n that are relatively prime to n.

### 4.4. Sample Input

```
10
```

### 4.5. Sample Output

```
4
```

### 4.6. Solution

```python
import math

def solve():
    n = int(input())
    ans = n
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            ans -= ans // i
            while n % i == 0:
                n //= i
    if n > 1:
        ans -= ans // n
    print(ans)

solve()
```

## 5. 1000000009

### 5.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### 5.2. Input

The input consists of a single integer n (1≤n≤10^12).

### 5.3. Output

Print the number of positive integers less than or equal to n that are relatively prime to n.

### 5.4. Sample Input

```
10
```

### 5.5. Sample
