```python
import sys

class FastScanner:
    def __init__(self):
        self.tokens = []

    def next(self):
        if not self.tokens:
            self.tokens = input().strip().split()
        return self.tokens.pop(0)

    def nextLine(self):
        return input().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

def main():
    sc = FastScanner()
    s = sc.next()
    chars = set(s)
    if len(chars) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
```python
main()
```
Test input:
```
STOP
```

Expected output:
```
No
```
