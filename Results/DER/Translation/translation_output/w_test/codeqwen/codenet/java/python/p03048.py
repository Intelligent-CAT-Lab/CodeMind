Here is the Python version of the provided Java code:

```python
import sys
import math

R = int(sys.stdin.readline())
G = int(sys.stdin.readline())
B = int(sys.stdin.readline())
N = int(sys.stdin.readline())

f = 0
for r in range(N // R + 1):
    for g in range((N - r * R) // G + 1):
        if (N - r * R - g * G) % B == 0:
            f += 1

print(f)
sys.stdout.flush()
sys.stdout.close()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the number of combinations where the sum of the three integers is less than or equal to N, and prints the result. The `sys.stdout.flush()` and `sys.stdout.close()` lines are used to ensure that the output is flushed to the standard output and then closed.
