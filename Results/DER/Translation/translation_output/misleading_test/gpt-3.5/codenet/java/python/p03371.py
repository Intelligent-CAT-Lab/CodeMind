```python
import sys

class Scanner:
    def __init__(self, input_source=sys.stdin):
        self.input_source = input_source
        self.tokens = iter(input_source.read().split())

    def next(self):
        return next(self.tokens)

    def nextInt(self):
        return int(self.next())

def main():
    in_stream = Scanner()
    a = in_stream.nextInt()
    b = in_stream.nextInt()
    c = in_stream.nextInt()
    x = in_stream.nextInt()
    y = in_stream.nextInt()

    if a + b < 2 * c:
        print(x * a + y * b)
    else:
        mini = min(x, y)
        maxi = max(x, y)
        res = 0
        res += 2 * c * mini
        if maxi == x:
            res += min(a, 2 * c) * (maxi - mini)
        else:
            res += min(b, 2 * c) * (maxi - mini)
        print(res)

if __name__ == "__main__":
    main()
```

