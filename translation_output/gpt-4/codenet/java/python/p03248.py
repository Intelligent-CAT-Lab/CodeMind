Here's the translated version of the provided Java code into Python, with corresponding Python idioms and libraries.

```python
from sys import stdin, stdout
from math import gcd

mod = 1000000007


def main():
    reader = Reader(stdin)
    c = reader.next_string()
    l = len(c)

    if c[0] == '0' or c[l - 1] == '1':
        print(-1)
        return
    else:
        for i in range(l // 2):
            if c[i] != c[l - i - 2]:
                print(-1)
                return

    print(1, 2)

    s = 2
    for i in range(3, l + 1):
        print(s, i)
        if c[i - 2] == '1':
            s = i


def db(*args):
    print(*args, file=stderr)


class P:
    def __init__(self, id, d):
        self.id = id
        self.d = d

    def __lt__(self, other):
        return self.d > other.d  # descending order


class Reader:
    def __init__(self, stream):
        self.reader = stream
        self.st = None

    def next_string(self):
        while not self.st or not self.st.hasMoreTokens():
            self.st = self.reader.readline().strip().split()
        return self.st.pop(0)

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return int(self.next_string())  # python int has no limit

    def next_double(self):
        return float(self.next_string())


if __name__ == '__main__':
    main()
"""

Note that Python doesn't have a direct equivalent to Java's `PrintWriter` with a `flush` method. Instead, in Python, you generally print and then flush to `sys.stdout`. The `print` function in Python does this automatically when you reach the end of a line unless you tell it not to with `end=""`, or manually flush using `sys.stdout.flush()`.

The custom `Reader` class in Python doesn't need to be as complex as the Java version since Python's file reading capabilities are more straightforward. However, I've translated it as closely as possible to maintain the structure.

The `Comparable` interface in Java correlates to implementing the `__lt__` method in a Python class. Also, I've changed the `gcd` function to directly use the one available from the `math` library in Python.

Lastly, note there are no semicolons in Python to terminate the statements, and the structure is defined by indentation rather than braces.
```
