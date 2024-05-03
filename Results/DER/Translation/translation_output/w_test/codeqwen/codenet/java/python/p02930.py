Here is the Python equivalent of the Java code:

```python
import sys

def solve():
    n = int(input())

    ret = [[0]*n for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n-1):
        print(' '.join(str(ret[i][j]) for j in range(i+1, n)))

def dfs(left, right, level, ret):
    if left + 1 >= right:
        return

    center = (left + right) // 2

    for i in range(left, center):
        for j in range(center, right):
            ret[i][j] = level
            ret[j][j] = level

    dfs(left, center, level + 1, ret)
    dfs(center, right, level + 1, ret)

if __name__ == "__main__":
    if len(sys.argv) > 1:
        with open(sys.argv[1], 'r') as f:
            sys.stdin = f

    solve()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, creates a 2D array, and then fills it using a depth-first search algorithm. Finally, it prints out the resulting 2D array.

The `solve` function reads the input, calls `dfs` to fill the array, and then prints out the array. The `dfs` function is a recursive function that fills the array using a depth-first search algorithm.

The `if __name__ == "__main__":` block checks if the script is being run directly, and if so, it reads the input from a file if a command-line argument is provided. Otherwise, it reads the input from the standard input.
