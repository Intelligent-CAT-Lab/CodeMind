
```
from collections import deque

N, x = map(int, input().split())
if x == 1 or x == 2 * N - 1:
    print("No")
else:
    print("Yes")
    low = x - 1
    high = x + 1
    deq = deque()
    deq.append(x)
    while low != 0 or high != 2 * N:
        if low == 0:
            deq.appendleft(high)
            deq.append(high + 1)
            high += 2
        elif high == 2 * N:
            deq.append(low)
            deq.appendleft(low - 1)
            low -= 2
        else:
            deq.appendleft(low)
            low -= 1
            deq.append(high)
            high += 1
    for s in deq:
        print(s)
```

## 10. 1000000007

### 10.1. Description

Given an integer $N$, output $N!$ modulo $1000000007$.

### 10.2. Input

The input consists of a single integer $N$.

### 10.3. Output

Output $N!$ modulo $1000000007$.

### 10.4. Constraints

- $1 \leq N \leq 100000$

### 10.5. Sample Input

```
3
```

### 10.6. Sample Output

```
6
```

### 10.7. Solution

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 11. 1000000007

### 11.1. Description

Given an integer $N$, output $N!$ modulo $1000000007$.

### 11.2. Input

The input consists of a single integer $N$.

### 11.3. Output

Output $N!$ modulo $1000000007$.

### 11.4. Constraints

- $1 \leq N \leq 100000$

### 11.5. Sample Input

```
3
```

### 11.6. Sample Output

```
6
```

### 11.7. Solution

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 12. 1000000007

### 12.1. Description

Given an integer $N$, output $N!$ modulo $1000000007$.

### 12.2. Input

The input consists of a single integer $N$.

### 12.3. Output

Output $N!$ modulo $1000000007$.

### 12.4. Constraints

- $1 \leq N \leq 100000$

### 12.5. Sample Input

```
3
```

### 12.6. Sample Output

```
6
```

### 12.7. Solution

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 13. 1000000007

### 13.1. Description

Given an integer $N$, output $N!$ modulo $1000000007$.

### 13.2. Input

The input consists of a single integer $N$.

### 13.3. Output

Output $N!$ modulo $1000000007$.

### 13.4. Constraints

- $1 \leq N \leq 100000$

### 13.5. Sample Input

```
3
```

### 13.6. Sample Output

```
6
```

### 13.7. Solution

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 14. 1000000007

### 14.1. Description

Given an integer $N$, output $N!$ modulo $1000000007$.

### 14.2. Input

The input consists of a single integer $N$.

### 14.3. Output

Output $N!$ modulo $1000000007$.

### 14.4. Constraints

- $1 \leq N \leq 100000$

### 14.5. Sample Input

```
3
```

### 14.6. Sample Output

```
6
```

### 14.7. Solution

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 15. 1000000007

### 15.1. Description

Given an integer $N$, output $N!$ modulo $1000000007$.

### 15.2. Input

The input consists of a single integer $N$.

### 15.3. Output

Output $N!$ modulo $1000000007$.

### 15.4. Constraints

- $1 \leq N \leq 100000$

### 15.5. Sample Input

```
3
```

### 15.6. Sample Output

```
6
```

### 15.7. Solution

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 16. 1000000007

### 16.1. Description

Given an integer $N$, output $N!$ modulo $1000000007$.

### 16.2. Input

The input consists of a single integer $N$.

### 16.3. Output

Output $N!$ modulo $10000000
