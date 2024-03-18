```python
import sys

def min_cost(N, A, B):
    return min(A*N, B)

if __name__ == "__main__":
    N, A, B = map(int, input().split())
    result = min_cost(N, A, B)
    print(result)
```
Test input:
7 17 120

Expected output:
219
