```python
import sys
from collections import deque


class P02699:
    INF = sys.maxsize // 2

    def solve(self):
        s, w = map(int, input().split())
        if w >= s:
            print("unsafe")
        else:
            print("safe")


if __name__ == "__main__":
    p = P02699()
    p.solve()
```
