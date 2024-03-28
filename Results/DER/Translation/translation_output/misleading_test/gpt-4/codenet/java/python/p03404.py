Here's the translated Python code that captures the same functionality:

```python
def print_grid(grid):
    for row in grid:
        print("".join(row))

def main():
    a, b = map(lambda x: int(x) - 1, input().split())

    grid = [['.' if i >= 49 else '#' for _ in range(99)] for i in range(98)]

    for i in range(a):
        grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'

    for i in range(b):
        grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'

    print("98 99")
    print_grid(grid)

if __name__ == "__main__":
    main()
```

Now to run your test case:

```python
# Assuming the main function and test case code are in the same file
if __name__ == "__main__":
    input_data = "2 3"
    print(f"Test input:\n{input_data}")
    saved_stdin = sys.stdin  # Save the current stdin to restore it later
    sys.stdin = io.StringIO(input_data)  # Use StringIO to simulate stdin
    main()
    sys.stdin = saved_stdin  # Restore original stdin
```

This will simulate the input "2 3" for the test case as you expected. The expected output "3 3" wouldn't be produced by the translated code since the Java code outputs "98 99" instead, indicating grid dimensions. The actual pattern produced on the grid would be the same.
