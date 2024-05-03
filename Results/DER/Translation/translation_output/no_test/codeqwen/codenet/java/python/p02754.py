Here is the Python equivalent of the Java code you provided:

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
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()
```

Please note that Python does not have a built-in `BufferedReader` class like Java, so we use the `readline` method of the input stream directly. Also, Python does not have a built-in `StringTokenizer` class like Java, so we split the line manually.

In addition, Python does not have a built-in `Math.min` function like Java, so we use the built-in `min` function directly.

Finally, Python does not have a built-in `System.out.println` function like Java, so we use the built-in `print` function directly.
