

```python
import math

n, m, k = map(int, input().split())

mod = 998244353

fact = [0] * (n + 1)
ifact = [0] * (n + 1)

fact[0] = fact[1] = ifact[0] = ifact[1] = 1

for i in range(2, n + 1):
    fact[i] = (fact[i - 1] * i) % mod
    ifact[i] = pow(fact[i], mod - 2, mod)

def ncr(n, r):
    return (fact[n] * ifact[r] * ifact[n - r]) % mod

ans = 0

for i in range(k + 1):
    ans = (ans + (m * pow(m - 1, n - i - 1, mod) * ncr(n - 1, i)) % mod) % mod

print(ans)
```

## Problem 3

### Problem 3.1

#### Problem 3.1.1

Write a function that takes a list of numbers and returns the sum of the numbers.

```python
def sum_list(l):
    return sum(l)
```

#### Problem 3.1.2

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def max_list(l):
    return max(l)
```

#### Problem 3.1.3

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def min_list(l):
    return min(l)
```

#### Problem 3.1.4

Write a function that takes a list of numbers and returns the average of the numbers.

```python
def avg_list(l):
    return sum(l) / len(l)
```

####
