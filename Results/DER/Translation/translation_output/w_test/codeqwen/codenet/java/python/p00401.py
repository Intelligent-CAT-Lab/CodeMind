Here is the Python equivalent of the Java code:

```python
class FastScanner:
    def __init__(self, inp):
        self.reader = inp.readline
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader().split()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_line(self):
        if self.tokenizer is None or not self.tokenizer:
            return self.reader()

        return self.tokenizer.pop(0)


def main():
    inp = FastScanner(sys.stdin)
    out = sys.stdout

    input = inp.next_int()
    ans = 1
    while input >= ans * 2:
        ans *= 2

    out.write(str(ans))
    out.flush()


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads an integer from the standard input, finds the largest power of 2 that is less than or equal to the input, and writes that power of 2 to the standard output.
