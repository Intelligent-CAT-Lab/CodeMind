Here's the Java code translated into Python:

```python
import sys

class FastScanner:
    def __init__(self):
        self.iterator = iter(map(int, sys.stdin.readline().split()))

    def next(self):
        return next(self.iterator)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

class Solver:
    def __init__(self, sc):
        self.sc = sc

    def run(self):
        a = self.sc.next_long()
        b = self.sc.next_long()
        c = self.sc.next_long()
        d = c - a - b
        if d > 0 and 4 * a * b < d * d:
            print("Yes")
        else:
            print("No")

def main():
    sc = FastScanner()
    solver = Solver(sc)
    solver.run()

if __name__ == '__main__':
    main()
```

Here is the Python code that does the equivalent to the Java code. The Scanner is replaced with a custom `FastScanner` class that reads from the standard input. We don't need a `PrintWriter` in Python because the print function can directly output to the standard output.

Please note that for input/output operations, this Python code is assuming that all the inputs are space-separated and given on a single line which is what the Java code expects too. If inputs are in another format, the `FastScanner` class may need modification to properly parse the inputs.

You can use the script as follows:

```shell
echo "2 3 9" | python3 script.py
```

Replace `script.py` with the actual filename where the code above is saved.
