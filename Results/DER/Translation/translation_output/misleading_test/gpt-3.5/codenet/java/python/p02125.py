```python
import sys
from collections import deque
from collections import defaultdict

class p02125:
    def __init__(self):
        pass

    def run(self):
        N = int(input())
        if N == 1:
            print(1)
            return
        c = 1
        while 2 * c - 1 <= N:
            c *= 2
        c -= 1
        print(bin(c).count('1'))

if __name__ == "__main__":
    p = p02125()
    p.run()
```

