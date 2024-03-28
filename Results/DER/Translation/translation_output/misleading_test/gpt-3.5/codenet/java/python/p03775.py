```python
import math

class AtCoder:
    
    def __init__(self, N):
        self.N = N

    def solve(self):
        sqrt = int(math.sqrt(self.N))
        for i in range(sqrt, 0, -1):
            if self.N % i == 0:
                A = len(str(i))
                B = len(str(self.N // i))
                return max(A, B)

# Test input
N = int(input())
problem = AtCoder(N)
output = problem.solve()
print(output)
```

