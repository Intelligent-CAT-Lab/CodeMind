Here is the equivalent Python code for the provided Java code:

```python
import sys

MOD = 10**9 + 7
dp = [[False for _ in range(100)] for _ in range(100)]
visited = [[False for _ in range(100)] for _ in range(100)]

def printlnYN(b):
    print("Brown" if b else "Alice")

def dfs(x, y):
    if visited[x][y]:
        return dp[x][y]
    if x <= 1 and y <= 1:
        dp[x][y] = False
        visited[x][y] = True
        return False

    for i in range(2, x + 1, 2):
        if not dfs(x-i, y+i//2):
            dp[x][y] = True
            visited[x][y] = True
            return True

    for i in range(2, y + 1, 2):
        if not dfs(x+i//2, y-i):
            dp[x][y] = True
            visited[x][y] = True
            return True

    dp[x][y] = False
    visited[x][y] = True
    return False

def solve():
    X, Y = map(int, input().split())
    printlnYN(abs(X-Y) <= 1)

if __name__ == '__main__':
    solve()
```

This code includes a translation of the necessary functionality from the original Java code to Python:
- The `FastScanner` class in Java is replaced by directly reading from standard input using `input().split()` in Python.
- The Java `printWriter` functionality is replaced by a simple `print()` in Python.
- The `solve` function and `printlnYN` function are directly translated.
- Commented out code related to the `FastScanner` class and its methods in Java is omitted in Python because Python provides built-in functions to handle console input efficiently.
- The loops and logic structures are directly translatable between Java and Python.

To test the Python code against the given test input, you can simply run the script and input `2 1` into the console. The expected output, "Brown", should be printed.
