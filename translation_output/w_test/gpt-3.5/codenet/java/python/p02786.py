```python
import sys

class FastReader:
    def __init__(self):
        self.lines = iter(sys.stdin.readlines())
        self.tokenizer = iter([])

    def next_line(self):
        return next(self.lines)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next(self):
        while not self.tokenizer:
            try:
                self.tokenizer = iter(next(self.lines).split())
            except StopIteration:
                return None
        return next(self.tokenizer)

def main():
    s = FastReader()
    sum = 0
    h = s.next_long()
    if h == 1:
        print(1)
    else:
        count = 1
        while h > 1:
            h = h // 2
            sum += 2**count
            count += 1
        print(sum + 1)

if __name__ == "__main__":
    main()
```

