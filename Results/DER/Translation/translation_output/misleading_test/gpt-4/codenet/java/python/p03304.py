Here's the equivalent Python code for the given Java code:

```python
import sys

def main():
    n, m, d = map(int, input().split())

    s = n if d == 0 else ((n - d) * 2)
    print((s/n/n)*(m-1))

if __name__ == "__main__":
    main()
```

This Python code can be run in a similar environment where standard input is provided and it will produce the expected output. The input is read using `input().split()`, which by default splits the string by whitespace, and then it is converted to integers with `map(int, ...)`. The calculation and output formatting mimic the behavior of the original Java code.
