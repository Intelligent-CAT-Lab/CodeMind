Here's the translated code in Python:

```python
def main():
    n, k = map(int, input().split())
    ans = min(n % k, k - (n % k))
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code performs the same logic as the given Java code: it reads two integers from the standard input (interpreted as `n` and `k`), computes the minimum between `n % k` and `k - (n % k)`, and prints the result. Python's `input()` function is used to take input from the standard input, and `print()` is used for output instead of `System.out.println`. The code snippet is placed inside a `main()` function following Python convention, with a check to ensure it's the main module being executed.
