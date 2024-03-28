```python
import sys
from collections import defaultdict

class CDivisorGame:
    def solve(self, n):
        pf = defaultdict(int)
        i = 2
        while i * i <= n:
            c = 0
            while n % i == 0:
                n //= i
                c += 1
            if c > 0:
                pf[i] = c
            i += 1
          
        if n > 1:
            pf[n] = 1
        
        ans = 1
        for key, value in pf.items():
            ans *= (value + 1)
        
        return len(pf), ans - 1

n = int(input())
solver = CDivisorGame()
result = solver.solve(n)
print(result[0], result[1])

# Test input
# 18
```

