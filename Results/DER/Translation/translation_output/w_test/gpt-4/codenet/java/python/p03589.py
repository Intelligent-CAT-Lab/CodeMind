Here is the Java code translated into Python:

```python
from itertools import product

def solve(N):
    for h, n in product(range(1, 3501), repeat=2):
        if 4*h*n - N*n - N*h != 0 and (N*h*n) % (4*h*n - N*n - N*h) == 0:
            w = (N*h*n) // (4*h*n - N*n - N*h)
            if w > 0:
                print(h, n, w)
                return

# Sample test case
N = int(input())
solve(N)
```

When you run this Python program and input `2`, the expected output will be:

```
1 2 2
```
