Here is the Python equivalent of the Java code you provided:

```python
import math

class FastScanner:
    def __init__(self):
        self.br = open(0)
        self.st = ""

    def next(self):
        while not self.st:
            self.st = self.br.readline().strip()
        return self.st.split()[0]

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLong(self):
        return int(self.next())

    def nextline(self):
        return self.br.readline().strip()


def main():
    sc = FastScanner()
    s = sc.next()
    t = sc.next()
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b*b == a:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    main()
```

Please note that in Python, we don't need to close the file after reading it, so I removed the `br.close()` line. Also, Python doesn't have a built-in `StringTokenizer` class, so I replaced it with a simple space-based splitting of the string.
