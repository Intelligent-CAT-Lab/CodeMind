```python
import sys

class Scanner:
    def __init__(self, stream=None):
        self.stream = stream if stream else sys.stdin
        self.tokenizer = None
    
    def next(self):
        if not self.tokenizer or not self.tokenizer.hasMoreTokens():
            self.tokenizer = iter(self.stream.readline().split())
        return next(self.tokenizer)
    
    def nextInt(self):
        return int(self.next())

def main():
    sc = Scanner()
    a, b, c, x, y = sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()

    if a + b < 2 * c:
        print(x * a + y * b)
    else:
        min_xy = min(x, y)
        max_xy = max(x, y)
        res = 0
        res += 2 * c * min_xy
        if max_xy == x:
            res += min(a, 2 * c) * (max_xy - min_xy)
        else:
            res += min(b, 2 * c) * (max_xy - min_xy)
        print(res)
    
if __name__ == "__main__":
    main()
```

