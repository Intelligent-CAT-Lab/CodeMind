```python
import math

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

N = int(input())

count = 0
for i in range(6, 55556, 5):
    if is_prime(i):
        print(i, end=" ")
        count += 1
    if count == N:
        break
```

