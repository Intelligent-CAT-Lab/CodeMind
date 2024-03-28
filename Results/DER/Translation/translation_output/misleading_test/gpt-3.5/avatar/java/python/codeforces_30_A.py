```python
from math import isqrt

A, B, N = map(int, input().split())
for x in range(-1000, 1001):
    if pow(x, N)*A == B:
        print(x)
        break
else:
    print("No solution")
```
