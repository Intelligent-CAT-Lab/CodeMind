Here is the Python equivalent of the Java code:

```python
import sys

n = int(sys.stdin.readline())
eratosu = [0] * 100000

for i in range(1, 101):
    for j in range(1, 101):
        for k in range(1, 101):
            if i * i + j * j + k * k >= 100000:
                continue
            result = i * i + j * j + k * k + i * j + j * k + k * i
            eratosu[result] += 1

for i in range(1, n + 1):
    print(eratosu[i])
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the sum of squares of three integers up to 100, and stores the result in the `eratosu` list. Then it prints the elements of the `eratosu` list up to the `n`th element.
