Below is the translated Java code in Python:

```python
import sys
import math
from collections import defaultdict

def main():
    # Python uses sys.stdin to read from standard input and sys.stdout for standard output
    sc = Scanner(sys.stdin)
    out = sys.stdout

    n, x, y = sc.nextInt(), sc.nextInt() - 1, sc.nextInt() - 1
    edges = defaultdict(int)

    for i in range(n):
        for j in range(i + 1, n):
            edge = min(j - i, min(abs(x - i) + abs(j - y), abs(y - i) + abs(j - x)) + 1)
            edges[edge] += 1

    for i in range(1, n):
        out.write(str(edges[i]) + '\n')

    out.flush()

class Scanner:
    def __init__(self, in_stream):
        self.br = in_stream
        self.st = None

    def next(self):
        while self.st is None or not self.st:
            self.st = self.br.readline().strip().split()
        return self.st.pop(0)

    def nextLine(self):
        return self.br.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def inArr(self, n):
        arr = list(map(int, self.br.readline().strip().split()))
        return arr

if __name__ == "__main__":
    main()
```

Please note a few changes required to adapt the Java code to Pythonic idiom:
- In Python, we don't declare the type of variables, nor do we need to initialize the `Scanner` and `PrinterWriter` as in Java. Instead, we use `sys.stdin` and `sys.stdout`.
- The `print` function in Python (used as `out.write` in this case) already adds a newline by default, so we add `'\n'` when we want to print each edge count on a new line and then flush the content.
- Instead of using ArrayList, we use Python's `defaultdict` from the `collections` module to handle the edge frequencies.
- Unlike Java, Python does not feature method overloading based on parameter type or count, hence we don't have separate methods like `next`, `nextInt`, `nextDouble` in the Scanner class; we just convert the string to the required type when calling the method.
- In Python, main method functionality is usually encapsulated within a `if __name__ == "__main__":` block to ensure that it runs only when the script is executed directly, not when imported as a module.
