```python
import sys

class FastReader:
    def __init__(self):
        self.tokens = iter(sys.stdin.read().split())
    
    def next(self):
        return next(self.tokens)
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())

def main():
    sc = FastReader()
    k = sc.nextInt() - 1
    b = sc.nextInt() - 1

    print(k * b)

if __name__ == "__main__":
    main()
```
