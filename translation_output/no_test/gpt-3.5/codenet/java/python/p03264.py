```python
import sys

class FScanner:
    def __init__(self):
        self.sc = sys.stdin
    def hasNextLine(self):
        return True
    def readInt(self):
        i = int(input())
        return i
    def readLong(self):
        i = int(input())
        return i
    def readIntL(self):
        buf = input().split(" ")
        num = [int(x) for x in buf]
        return num
    def readString(self):
        return input()
    def readStringL(self, dlm):
        s = input().split(dlm)
        return s

def solve():
    pass

def disp(data):
    for item in data:
        print(item, end=' ')
    print()

def p03264():
    sc = FScanner()
    n = sc.readInt()

    o = 0
    e = 0

    for i in range(1, n+1):
        if i % 2 == 1:
            o += 1
        else:
            e += 1

    print(o * e)

if __name__ == "__main__":
    p03264()
```

