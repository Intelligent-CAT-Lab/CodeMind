Here is the translated code in Python:

```python
import sys

for line in sys.stdin:
    a, b, c, d = map(int, line.split())
    start = max(a, c)
    end = min(b, d)
    print(max(0, end - start))
```

This Python code reads lines from standard input (just like `System.in` in Java), splits each line into integers, and then calculates the overlapping length between interval [a, b] and interval [c, d]. The result is printed out, which is either the length of the overlap or 0 if there's no overlap.
