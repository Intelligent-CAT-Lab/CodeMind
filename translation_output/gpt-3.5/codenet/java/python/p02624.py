```python
import sys
from collections import defaultdict

class P02624:
    def __init__(self):
        self.mod = 1000000007
        self.dx = [0, -1, 0, 1]
        self.dy = [1, 0, -1, 0]
        self.solve()

    def solve(self):
        limit = 10000010
        div = [1] * limit
        for i in range(2, limit):
            for j in range(i, limit, i):
                div[j] += 1
        
        res = 0
        n = int(input())
        for i in range(1, n+1):
            res += 1 * i * div[i]
        
        print(res)

if __name__ == '__main__':
    P02624()
```
