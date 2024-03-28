```python
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = None

    def next(self):
        while self.st is None or not self.st:
            self.st = self.br.readline().split()
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.br.readline()

if __name__ == "__main__":
    sc = FastReader()
    out = sys.stdout
    k = sc.nextInt() - 1
    b = sc.nextInt() - 1

    out.write(str(k * b) + '\n')
    out.flush()
```
