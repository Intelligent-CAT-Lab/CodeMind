Here is the Python equivalent of the Java code:

```python
import sys

x1, y1, x2, y2 = map(int, sys.stdin.readline().split())

if x1 == x2:
    dif = abs(y1 - y2)
    print(x1 + dif, y1, x1 + dif, y2)
elif y1 == y2:
    dif = abs(x1 - x2)
    print(x1, y1 + dif, x2, y2 + dif)
elif abs(x1 - x2) == abs(y1 - y2):
    print(x1, y2, x2, y1)
else:
    print(-1)
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, and then checks if the four integers are all equal, or if the absolute difference between the first two integers is equal to the absolute difference between the second two integers. If none of these conditions are met, it prints -1.
