```python
import sys
from io import StringIO
_INPUT = """5 2"""
sys.stdin = StringIO(_INPUT)

class Solver:
    def __init__(self):
        pass
    
    def solve(self):
        a, b = map(int, input().split())
        print(max(a + b, a - b, a * b))

solver = Solver()
solver.solve()
```
