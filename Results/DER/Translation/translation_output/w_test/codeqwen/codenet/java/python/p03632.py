Here is the Python equivalent of the Java code:

```python
import sys

for line in sys.stdin:
    inp = list(map(int, line.split()))
    a = inp[0]
    b = inp[1]
    c = inp[2]
    d = inp[3]

    start = max(a, c)
    end = min(b, d)
    print(end - start if end - start > 0 else 0)
```

This Python code reads input from the standard input (stdin), splits each line into integers, and then calculates the difference between the maximum and minimum values of the four integers. If the difference is greater than 0, it prints the difference; otherwise, it prints 0.
