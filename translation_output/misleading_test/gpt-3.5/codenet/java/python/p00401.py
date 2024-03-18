```python
import sys

class FastScanner:
    def __init__(self, reader):
        self.reader = reader
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = iter(next(self.reader).strip().split())
            except StopIteration:
                pass
        return next(self.tokenizer)

    def nextLine(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                return next(self.reader).strip()
            except StopIteration:
                pass
        return next(self.tokenizer, "").replace('\n', '')

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())


def main():
    sc = FastScanner(sys.stdin)
    input_val = sc.nextInt()
    ans = 1
    while input_val >= ans * 2:
        ans *= 2
    print(ans)

if __name__ == "__main__":
    main()
```

