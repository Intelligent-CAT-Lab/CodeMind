Below is the translated code from Java to Python:

```python
import sys

for line in sys.stdin:
    line = line.strip()
    if not line:
        break

    c1 = c2 = c3 = 0

    if len(line) < 6:
        print("INVALID")
    else:
        for c in line:
            if '0' <= c <= '9':
                c1 += 1
            elif 'A' <= c <= 'Z':
                c2 += 1
            else:
                c3 += 1

        if c1 > 0 and c2 > 0 and c3 > 0:
            print("VALID")
        else:
            print("INVALID")
```

This code will read lines from the standard input, just as the original Java code does, and performs the same checks and output. In Python, we don't need to import any additional modules to read from standard input, since this functionality is included in the `sys` module that comes with Python's standard library. Also, note that `sys.stdin` behaves like a file object, so we can iterate over its lines directly.
