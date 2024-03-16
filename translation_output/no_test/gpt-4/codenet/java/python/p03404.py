Below is the Python translation of the given Java code:

```python
def main():
    a = int(input()) - 1
    b = int(input()) - 1
    grid = [['#' if i < 49 else '.' for _ in range(99)] for i in range(98)]

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

This Python code replicates the functionality of the Java code. It creates a grid pattern and modifies it based on the inputs `a` and `b`, then prints out the size of the grid followed by the pattern. Note that in Python, we use `print` to output text to the console and we manage the input directly with the `input()` function for reading from standard input. Also, list comprehensions are used to create the grid instead of the nested loop and `Arrays.fill` used in the Java version.
