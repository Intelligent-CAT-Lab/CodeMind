```python
import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.buffer.read().split()
        self.idx = 0

    def next(self):
        self.idx += 1
        return self.inp[self.idx - 1].decode()

    def nextInt(self):
        return int(self.next())

def main():
    sc = FastScanner()
    n = sc.nextInt()
    m = sc.nextInt()
    if n % 2 == 0:
        print("0", end="")
        for i in range(1, n//2 + 1):
            print(" 0", end="")
        for i in range(n//2 + 1, n):
            print(" " + str(m), end="")
    else:
        print("0", end="")
        for i in range(1, n//2 + 1):
            print(" 0", end="")
        for i in range(n//2 + 1, n):
            print(" " + str(m), end="")
    print()

if __name__ == "__main__":
    main()
```

