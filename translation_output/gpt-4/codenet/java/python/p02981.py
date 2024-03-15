Here's the translated Python code:

```python
def solve(n, a, b):
    return min(a * n, b)

def main():
    n, a, b = map(int, input().split())
    print(solve(n, a, b))

if __name__ == "__main__":
    main()
```

This Python code will read three integers from the standard input (just like the Java version reads from an `InputStream`), which correspond to `n`, `a`, and `b` in the Java version. The `solve` function in the Python code replicates the functionality of the `solve` method in the Java code, calculating the minimum of `a * n` and `b`. The `print` function is used in place of a `PrintStream object` to output the result to the standard output.
