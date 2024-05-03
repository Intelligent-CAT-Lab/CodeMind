Here is the Python equivalent of the Java code you provided:

```python
class FastScanner:
    def __init__(self):
        self.br = open(0)
        self.st = ""

    def next(self):
        while not self.st:
            self.st = self.br.readline().strip()
        token, self.st = self.st.split(" ", 1)
        return token

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

Please note that in Python, we don't have a built-in `BufferedReader` or `StringTokenizer` like in Java. Instead, we use the `open` function to read from the standard input (which is equivalent to `System.in` in Java). We also don't have a built-in `String` class like in Java, but we can use Python's built-in `str` class. The `split` method in Python is equivalent to `StringTokenizer` in Java.
