Here is the Python equivalent of the Java code:

```python
import sys

for line in sys.stdin:
    numbers = list(map(float, line.split()))
    print(numbers[0] * numbers[1] / 3.305785)
```

This Python code reads from the standard input (which is the console in this case) and processes each line. It splits the line into a list of numbers, converts them to floats, and then calculates the result. The result is printed to the standard output.
