```python
import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.iterator = iter(stream.read().split())
    
    def next_int(self):
        return int(next(self.iterator))
    
    def next_long(self):
        return int(next(self.iterator))
    
    def next_double(self):
        return float(next(self.iterator))
    
    def next_char(self):
        return next(self.iterator)
    
    def next_str(self):
        return next(self.iterator)

class p02927:
    def __init__(self):
        self.MOD = (int)(1e9+7)
        self.inp = FastScanner()
    
    def solve(self):
        M = self.inp.next_int()
        D = self.inp.next_int()
        ans = 0
        for m in range(1, M + 1):
            for d in range(1, D + 1):
                d1 = d % 10
                d2 = d // 10
                if d1 >= 2 and d2 >= 2 and d1 * d2 == m: 
                    ans += 1
        print(ans)

if __name__ == '__main__':
    solver = p02927()
    solver.solve()
```

The provided Python code is the equivalent of the given Java code but here is an optimized functioning version without the scanner class:

```python
def magic_dates_checker(M, D):
    ans = 0
    for m in range(1, M + 1):
        for d in range(1, D + 1):
            d1 = d % 10
            d2 = d // 10
            if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
                ans += 1
    return ans

M, D = map(int, input().split())
print(magic_dates_checker(M, D))
```

This version of the code is more straightforward and does not include the scanner class but uses the built-in input function for getting the user's input and a simple function to calculate the answer. The sample test case can be run as follows:

```python
print(magic_dates_checker(15, 40))  # Expected output: 10
```
