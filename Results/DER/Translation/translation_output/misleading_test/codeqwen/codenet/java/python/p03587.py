Here is the Python equivalent of the Java code:

```python
def solve(testNumber, inp, out):
    s = inp.readline().strip()
    n = s.count('1')
    out.write(str(n) + '\n')

if __name__ == "__main__":
    import sys
    solve(1, sys.stdin, sys.stdout)
```

This Python code does the same thing as the Java code: it reads a line of input, counts the number of '1's in the line, and writes the count to the output. The `sys.stdin` and `sys.stdout` objects are used to read from and write to the standard input and output streams, respectively.
