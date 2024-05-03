Here is the Python equivalent of the Java code:

```python
class FastReader:
    def __init__(self):
        self.br = open(0)
        self.st = ''

    def next(self):
        while not self.st:
            self.st = self.br.readline().strip()
        self.st, self.st = self.st.split(' ', 1)
        return self.st

    def readArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

def codeforces_669_A():
    fr = FastReader()
    n = fr.nextInt()
    sum = 0
    total = 0
    i = 1
    if n == 2:
        print(1)
        return
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    print(total)

codeforces_669_A()
```

Please note that in Python, we don't need to close the file after reading it. The file is automatically closed when the program ends. Also, Python doesn't have a built-in class for reading input from the console, so we use the `open(0)` function to read from standard input.
