```python
import sys
from collections import defaultdict
input = sys.stdin.readline

class TaskD:
    def solve(self):
        n, K = map(int, input().split())
        ans = 0
        for i in range(K + 1, n + 1):
            for j in range(0, n // i + 1):
                if i * (j + 1) - 1 <= n:
                    ans += i - K
                else:
                    ans += max(i - K - (i * (j + 1) - 1 - n), 0)
        if K == 0:
            ans -= n
        print(ans)

if __name__ == '__main__':
    solver = TaskD()
    solver.solve()
```
