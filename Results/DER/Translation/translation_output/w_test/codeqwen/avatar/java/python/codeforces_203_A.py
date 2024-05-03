Here is the Python equivalent of the Java code:

```python
class ATwoProblems:
    def solve(self, testNumber, inp, out):
        points = inp.nextInt()
        t = inp.nextInt()
        a = inp.nextInt()
        b = inp.nextInt()
        ta = inp.nextInt()
        tb = inp.nextInt()
        for i in range(t):
            for j in range(t):
                if points == a - i * ta + b - j * tb or (points == 0) or points == a - ta * i or points == b - tb * j:
                    out.write("YES\n")
                    return
        out.write("NO\n")

class InputReader:
    def __init__(self, stream):
        self.reader = stream.readline
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = self.reader().split()
            except:
                raise EOFError()
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

def main():
    inp = InputReader(sys.stdin)
    out = sys.stdout
    solver = ATwoProblems()
    solver.solve(1, inp, out)
    out.close()

if __name__ == "__main__":
    import sys
    main()
```

Please note that the Python code assumes that the input is coming from the standard input (sys.stdin). If you want to read from a file, you can replace sys.stdin with an open file object.
