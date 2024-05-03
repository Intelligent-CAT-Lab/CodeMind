Here is the Python version of the provided Java code:

```python
import sys
import math
import heapq

class P:
    def __init__(self, x, d):
        self.x = x
        self.d = d

    def __lt__(self, other):
        return self.d < other.d

def main():
    n = int(sys.stdin.readline())
    lis = []
    a, b = 9, 10
    for i in range(1, 10):
        lis.append(P(i, -11 + i))
    lis.append(P(19, -1))
    for i in range(1, 15):
        for w in range(1, 1000):
            x = w * b + a
            y = x
            e = 0
            while x > 0:
                e += x % 10
                x //= 10
            lis.append(P(y, y / e))
        b *= 10
        a *= 10
        a += 9
    heapq.heapify(lis)
    max_val = 0
    while n > 0:
        p = heapq.heappop(lis)
        if max_val < p.x:
            print(p.x)
            n -= 1
            max_val = p.x

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, creates a list of `P` objects, and then uses a heap to find the `n` smallest `x` values. The `P` class is a simple class with two attributes: `x` and `d`. The `__lt__` method is used to define the comparison behavior of the `P` objects, which is used by the heap to sort the objects. The `main` function is the entry point of the program, and it calls the `main` function to execute the program.
