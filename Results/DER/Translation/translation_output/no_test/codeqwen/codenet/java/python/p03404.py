Here is the Python equivalent of the Java code:

```python
import sys

def main():
    a = int(input()) - 1
    b = int(input()) - 1
    grid = [['#' if i < 49 else '.' for _ in range(99)] for _ in range(98)]
    for i in range(a):
        grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'
    for i in range(b):
        grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'
    print("98 99")
    for row in grid:
        print(''.join(row))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, subtracts 1 from each, and then creates a 98x99 grid filled with '#' characters. Then it modifies the grid according to the values of 'a' and 'b'. Finally, it prints the grid to the standard output.
