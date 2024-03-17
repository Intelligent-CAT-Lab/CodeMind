

```python
import math

def combination(n, r):
    if n < r or r < 0:
        return 0
    return math.factorial(n) // math.factorial(r) // math.factorial(n - r)

def permutation(n, r):
    if n < r or r < 0:
        return 0
    return math.factorial(n) // math.factorial(n - r)

n, k = map(int, input().split())
print(permutation(k, n))
```

## 02333

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

