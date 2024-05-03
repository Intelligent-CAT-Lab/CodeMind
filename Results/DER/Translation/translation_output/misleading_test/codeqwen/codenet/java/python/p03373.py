Here is the Python equivalent of the Java code:

```python
import sys

def solve():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    x = int(sys.stdin.readline())
    y = int(sys.stdin.readline())

    min = float('inf')
    for i in range(max(x, y) + 1):
        tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
        min = min(min, tmp)

    print(min)

if __name__ == "__main__":
    solve()
```

This Python code reads the input from the standard input (stdin) and performs the same operations as the Java code. The `solve` function reads the input, calculates the minimum value, and prints it. The `if __name__ == "__main__":` block calls the `solve` function when the script is run directly.
