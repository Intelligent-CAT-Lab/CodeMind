```python
from math import pow

def find_x(A, B, N):
    for x in range(-1000, 1001):
        if pow(x, N) * A == B:
            return x
    return "No solution"

A, B, N = map(int, input().split())
result = find_x(A, B, N)
print(result)
```
