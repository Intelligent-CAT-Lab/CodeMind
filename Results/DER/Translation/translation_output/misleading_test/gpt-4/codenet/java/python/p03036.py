Here is the translated Python code:

```python
import sys

def solve(r, d, x):
    for _ in range(10):
        x = r * x - d
        print(x)

def main():
    r, d, x = map(int, sys.stdin.readline().split())
    solve(r, d, x)

if __name__ == '__main__':
    main()
```

This Python script expects input from standard input (`sys.stdin`). It reads a line, splits the input by spaces, maps the split strings to integers, and then calls the `solve` function with these values.

To replicate the behavior of the Java code, you would run this Python script and provide the test input "2 10 20", which should give you the expected output specified in your test case.
