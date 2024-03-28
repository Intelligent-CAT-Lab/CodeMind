```python
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = None

    def nextLine(self):
        return self.br.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def next(self):
        while self.st is None or not self.st:
            self.st = self.br.readline().strip().split()
        return self.st.pop(0)


def main():
    s = FastReader()
    sum = 0
    h = s.nextLong()
    if h == 1:
        print(1)
    else:
        count = 1
        while h > 1:
            h = h // 2
            sum += 2 ** count
            count += 1
        print(sum + 1)


if __name__ == "__main__":
    main()
```
