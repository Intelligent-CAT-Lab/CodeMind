```python
import sys

class Scanner:
    def __init__(self, input_func=input):
        self.input_func = input_func
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            self.tokenizer = iter(self.input_func().split())
        return next(self.tokenizer)

    def next_int(self):
        return int(self.next())

def main():
    scanner = Scanner()
    s = list(scanner.next())
    n = len(s)
    count = 0
    i = 0
    while i < n:
        count += 1
        if i + 1 >= n:
            break
        if s[i] == s[i + 1]:
            if i + 2 >= n:
                break
            i += 2
            count += 1
        i += 1

    print(count)

if __name__ == "__main__":
    main()
```
Test the translated code with the following sample test case:
```python
import io
sys.stdin = io.StringIO("aabbaa")
main()
```
