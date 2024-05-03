Here is the Python version of the Java code:

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

sc = Reader()
out = sys.stdout

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
    out.write(str(-1) + '\n')
else:
    out.write(str(60 * e + c) + '\n')

out.flush()
sc.close()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the sum of the first two integers, and then finds the smallest integer `i` such that `(60 * i + c) % d` is between 0 and `a` (inclusive). If such an integer is found, it is printed to the standard output; otherwise, `-1` is printed. The `Reader` class is a simple wrapper around `sys.stdin.readline` that provides a method for reading integers and lines. The `close` method is used to close the standard input stream.
