Here is the equivalent code in Python:

```python
import sys

class FastScanner:
    
    def __init__(self):
        self._buffer = []

    def next(self):
        while not self._buffer:
            self._buffer = input().split()
        return self._buffer.pop(0)

    def next_line(self):
        return input()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())  # In Python, there's no practical limit to the size of an integer.

    def next_int_array(self, n):
        arr = []
        for _ in range(n):
            arr.append(self.next_int())
        return arr

    def next_long_array(self, n):
        arr = []
        for _ in range(n):
            arr.append(self.next_long())
        return arr

def solve(fs):
    a = fs.next_int()
    b = fs.next_int()
    c = fs.next_int()

    if a == b and b == c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    fs = FastScanner()
    solve(fs)
```

Please note that in the Python script, I've defined the `solve` function such that it accepts the `FastScanner` object as an argument, instead of making it a method of a class as in the Java code. Python does not usually encapsulate the `main` functionality into a class. Additionally, since Python's integers are arbitrary precision, you do not need to distinguish between `int` and `long` as in Java—simply using `int` will suffice for both cases.
