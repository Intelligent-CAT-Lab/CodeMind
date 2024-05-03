Here is the Python version of the provided Java code:

```python
import sys

class Reader:
    def __init__(self):
        self.inp = sys.stdin.readline

    def nextInt(self):
        return int(self.inp().strip())

    def nextLine(self):
        return self.inp().strip()

    def close(self):
        sys.stdin.close()

def main():
    sc = Reader()
    a = sc.nextInt()
    b = sc.nextInt()
    c = sc.nextInt()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60 * i + c) % d and (60 * i + c) % d <= a:
            e = i
            break
    if e == -1:
        print(-1)
    else:
        print(60 * e + c)
    sc.close()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the sum of the first two integers, and then finds the smallest integer `i` such that `(60 * i + c) % d` is between 0 and `a` (inclusive). If such an integer `i` is found, it prints `60 * i + c`; otherwise, it prints `-1`. The `Reader` class is a simple wrapper around `sys.stdin.readline` that provides a method for reading integers and lines. The `main` function is the entry point of the program, which calls `Reader.close` to ensure that the input stream is closed when the program finishes.
