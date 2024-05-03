Here is the Python equivalent of the Java code you provided:

```python
import sys

class AAccepted:
    def solve(self, testNumber, inp, out):
        s = inp.readline().strip()
        n = s.count('1')
        out.write(str(n) + '\n')

if __name__ == "__main__":
    inp = sys.stdin
    out = sys.stdout
    solver = AAccepted()
    solver.solve(1, inp, out)
    out.close()
```

This Python code does the same thing as the Java code: it reads a string from the standard input, counts the number of '1's in the string, and writes the count to the standard output. The `sys.stdin` and `sys.stdout` objects are used to interact with the standard input and output streams in Python.
