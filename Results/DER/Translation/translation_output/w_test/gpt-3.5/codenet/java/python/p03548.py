```python
import sys

class Solver:
    def __init__(self):
        pass

    def solve(self):
        def next_int():
            return int(next(sys.stdin))

        x, y, z = next_int(), next_int(), next_int()
        print((x - z) // (y + z))

    def exit(self):
        pass

solver = Solver()
solver.solve()
solver.exit()
```  
