```python
import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = self.reader.readline().split()
            except Exception as e:
                raise

        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

class TaskA:
    def solve(self, n):
        x = n // 1000
        y = n % 1000
        if y == 0:
            print(0)
        else:
            ans = 1000 * (x + 1) - n
            print(ans)

if __name__ == "__main__":
    reader = InputReader(sys.stdin)
    n = reader.nextInt()
    solver = TaskA()
    solver.solve(n)
```
```
