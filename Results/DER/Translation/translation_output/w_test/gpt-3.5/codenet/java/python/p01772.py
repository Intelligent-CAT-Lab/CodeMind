```python
import sys

class MyScanner:
    def __init__(self):
        self.stream = sys.stdin.buffer.read().decode("utf8")
        self.pointer = 0

    def next(self):
        res = ""
        while True:
            if self.stream[self.pointer] == " " or self.stream[self.pointer] == "\n":
                self.pointer += 1
                break
            res += self.stream[self.pointer]
            self.pointer += 1
        return res


def main():
    sc = MyScanner()

    c = list(sc.next())
    n = len(c)
    s = []
    for i in range(n):
        if c[i] == 'A' or c[i] == 'Z':
            s.append(c[i])
    c = s
    n = len(c)
    s = []
    for i in range(n):
        if len(s) == 0 or s[-1] != c[i]:
            s.append(c[i])
    if len(s) > 0 and s[0] == 'Z':
        s.pop(0)
    if len(s) > 0 and s[-1] == 'A':
        s.pop()
    if len(s) > 0:
        print("".join(s))
    else:
        print(-1)


if __name__ == "__main__":
    main()
```
This Python code translates the given Java code into Python. It reads input from standard input and outputs the result.
