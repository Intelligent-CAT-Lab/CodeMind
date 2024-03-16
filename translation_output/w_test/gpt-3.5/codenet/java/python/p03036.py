```python
class BAlgae:
    def solve(self):
        r, d, x = map(int, input().split())
        
        for i in range(10):
            x = r * x - d
            print(x)

# Instantiate the BAlgae class
solver = BAlgae()
solver.solve()
```

