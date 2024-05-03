Here is the Python equivalent of the Java code:

```python
import sys

class Scanner:
    def __init__(self):
        self.reader = sys.stdin.readline
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader().split()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

scanner = Scanner()

def main():
    s = scanner.next()
    n = len(s)
    count = 0
    for i in range(n):
        count += 1
        if i + 1 >= n:
            break
        if s[i] == s[i + 1]:
            if i + 2 >= n:
                break
            i += 2
            count += 1
    print(count)

if __name__ == "__main__":
    main()
```

Please note that Python does not have a built-in `Scanner` class like Java, so I've created a custom `Scanner` class to read input from the standard input. The `next()` method reads the next token from the input, and the `next_int()`, `next_long()`, and `next_double()` methods convert the next token to an integer, long, and double, respectively. The `main()` function is the equivalent of the `main()` method in the Java code.
