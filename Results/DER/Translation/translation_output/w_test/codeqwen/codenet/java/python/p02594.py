Here is the Python equivalent of the Java code:

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

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it's greater than or equal to 30, and prints "Yes" or "No" accordingly. The `FastScanner` class is a simple wrapper around the standard input that provides a more convenient interface for reading integers and strings.
