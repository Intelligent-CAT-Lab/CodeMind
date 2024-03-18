```python
import sys

class Solver:
    def __init__(self):
        pass

    def solve(self):
        x, y, z = map(int, input().split())
        print((x - z) // (y + z))

solver = Solver()
solver.solve()
sys.exit()
```
