Here is the Python equivalent of your Java code:

```python
import sys

# Read input
n = int(sys.stdin.readline())

# Initialize array
array = [[0]*10 for _ in range(10)]

# Count occurrences of each digit pair
for i in range(1, n+1):
    head = int(str(i)[0])
    tail = i % 10
    array[head][tail] += 1

# Count occurrences where the first digit is the same as the last digit
keta = len(str(n))
result = 0
for i in range(1, n+1):
    head = int(str(i)[0])
    tail = i % 10
    if tail == 0:
        continue
    result += array[tail][head]

# Print result
print(result)
```

This Python code does the same thing as your Java code. It reads an integer `n` from the standard input, counts the occurrences of each digit pair in the range from 1 to `n`, and then counts the occurrences where the first digit is the same as the last digit. The result is then printed to the standard output.
