```python
from sys import stdin, stdout

class BAlgae:
    def solve(self, r, d, x):
        for i in range(10):
            x = r * x - d
            print(x)

def main():
    r, d, x = map(int, input().split())
    
    solver = BAlgae()
    solver.solve(r, d, x)

if __name__ == "__main__":
    main()
```

Test input:
```
2 10 20
```

Expected output:
```
66
116
92
262
285
726
1261
2619
5053
10271
```
