```python
import sys

class Scanner:
    def __init__(self, input_source=sys.stdin):
        self.input_source = input_source
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            self.tokenizer = iter(input().split())
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

def main():
    in_stream = Scanner()
    out_stream = sys.stdout

    a = in_stream.nextInt()
    b = in_stream.nextInt()
    c = in_stream.nextInt()
    x = in_stream.nextInt()
    y = in_stream.nextInt()

    if a + b < 2 * c:
        out_stream.write(str(x * a + y * b) + '\n')
    else:
        min_val = min(x, y)
        max_val = max(x, y)
        res = 0
        res += 2 * c * min_val
        if max_val == x:
            res += min(a, 2 * c) * (max_val - min_val)
        else:
            res += min(b, 2 * c) * (max_val - min_val)
        out_stream.write(str(res) + '\n')

if __name__ == "__main__":
    main()
```
