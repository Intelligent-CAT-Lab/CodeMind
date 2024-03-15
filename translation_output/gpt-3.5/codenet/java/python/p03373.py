```python
import sys

class Scanner:
    def __init__(self, input_file=None):
        if input_file:
            with open(input_file, 'r') as f:
                self.lines = f.readlines()
            self.idx = 0
        else:
            self.lines = sys.stdin.readlines()
            self.idx = 0

    def next(self):
        line = self.lines[self.idx]
        self.idx += 1
        return line.strip()

    def nextInt(self):
        return int(self.next())


class Printer:
    def __init__(self):
        self.buffer = []

    def println(self, line):
        self.buffer.append(str(line))

    def flush(self):
        print('\n'.join(self.buffer))


def solve():
    a = sc.nextInt()
    b = sc.nextInt()
    c = sc.nextInt()
    x = sc.nextInt()
    y = sc.nextInt()

    min_cost = float('inf')
    for i in range(max(x, y) + 1):
        cost = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
        min_cost = min(min_cost, cost)

    pr.println(min_cost)


if __name__ == "__main__":
    sc = Scanner()
    pr = Printer()

    solve()

    pr.flush()
```

