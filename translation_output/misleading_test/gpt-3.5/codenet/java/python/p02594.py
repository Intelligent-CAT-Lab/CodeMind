```python
import sys

class FastScanner:
    def __init__(self):
        self.input_buffer = sys.stdin.read().splitlines()
        self.token_idx = 0
        self.tokens = []

    def next(self):
        if self.token_idx >= len(self.tokens):
            self.tokens = self.input_buffer.pop(0).split()
            self.token_idx = 0
        self.token_idx += 1
        return self.tokens[self.token_idx - 1]

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLong(self):
        return int(self.next())

def main():
    fs = FastScanner()
    x = fs.nextInt()
    if x >= 30:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
Test input:
```python
25
```

Expected output:
```
No
```
