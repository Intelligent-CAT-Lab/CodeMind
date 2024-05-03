Here is the Python equivalent of the Java code:

```python
import sys

a, b = map(int, sys.stdin.readline().split())
a -= 1
b -= 1

grid = [['#' for _ in range(99)] for _ in range(98)]

for i in range(a):
    grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'

for i in range(b):
    grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'

print("98 99")
for row in grid:
    print(''.join(row))
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, subtracts 1 from each, and then creates a 98x99 grid filled with '#'. It then iterates over the first integer and sets the corresponding cell to '.'. It then iterates over the second integer and sets the corresponding cell to '#'. Finally, it prints the grid in the required format.
