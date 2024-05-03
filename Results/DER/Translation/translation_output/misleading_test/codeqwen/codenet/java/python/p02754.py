Here is the Python equivalent of the Java code:

```python
class FastScanner:
    def __init__(self, stream):
        self.br = stream.readline
        self.st = None

    def next(self):
        while self.st is None or not self.st:
            self.st = self.br().split()
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

def main():
    sc = FastScanner(sys.stdin)
    n = sc.nextLong()
    a = sc.nextLong()
    b = sc.nextLong()
    ans = 0
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()
```

Please note that the `sys.stdin` is used to read from the standard input in Python. The `main()` function is the entry point of the program. The `FastScanner` class is a custom class that mimics the behavior of the `FastScanner` class in Java. The `next()` method reads the next token from the input stream, the `nextInt()` and `nextLong()` methods parse the next token as an integer and a long integer respectively, and the `main()` function is where the main logic of the program is implemented.
