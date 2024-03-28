Here's the translated Python code for the provided JAVA code:

```python
def print_grid(grid):
    for row in grid:
        print("".join(row))

def main():
    a, b = map(lambda x: int(x) - 1, input().split())
    grid = [['#' if i < 49 else '.' for _ in range(99)] for i in range(98)]
    
    for i in range(a):
        grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'
    
    for i in range(b):
        grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'
    
    print("98 99")
    print_grid(grid)

if __name__ == "__main__":
    main()
```

Now, let's test this code with your sample test case.

Test Input:
```
2 3
```

Expected Output:
```
98 99
3 3
##.
..#
#.#
```
