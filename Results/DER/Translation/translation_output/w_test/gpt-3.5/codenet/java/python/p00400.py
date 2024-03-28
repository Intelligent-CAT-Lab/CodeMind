```python
import sys
import string

class p00400:
    def __init__(self):
        self.systemin = sys.stdin
        self.result = sys.stdout

    def main(self):
        N = ord(input())
        r = 0
        if 'A' <= N <= 'Z':
            r = 1
        elif 'a' <= N <= 'z':
            r = 2
        self.result.write(f"{r}\n")

if __name__ == '__main__':
    p = p00400()
    p.main()
```

