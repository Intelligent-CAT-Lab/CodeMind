```python
import sys

class Scanner:
    def __init__(self, input_func=input):
        self.input_func = input_func
        self.tokens = iter(self.input_func().split())
    
    def next(self):
        return next(self.tokens)
    
    def next_int(self):
        return int(self.next())

def solve():
    scanner = Scanner()
    a, b, c, x, y = scanner.next_int(), scanner.next_int(), scanner.next_int(), scanner.next_int(), scanner.next_int()
    
    min_cost = sys.maxsize
    for i in range(max(x, y) + 1):
        cost = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
        min_cost = min(min_cost, cost)
    
    print(min_cost)

solve()
```

