
```python
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

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 11. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 12. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 13. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 14. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 15. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 16. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 17. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 18. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 19. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 20. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 21. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in range(1, N + 1):
    ans *= i
    ans %= 1000000007
print(ans)
```

## 22. 1000000007

Given an integer N, output N! mod 1000000007.

Test input:
10

Expected output:
3628800

```python
N = int(input())
ans = 1
for i in
