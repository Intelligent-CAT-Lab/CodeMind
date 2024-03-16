Certainly, here is the Java code translated into Python:

```python
K = int(input())
X = int(input())

for i in range(X - K + 1, X + K):
    if i != X + K - 1:
        print(i, end=" ")
    else:
        print(i)
```

The translation includes the Python equivalents to the Java constructs:

- Instead of importing `Scanner` and creating a new instance, Python uses the built-in `input()` function to read from stdin.
- Python `print` function is used with the `end=" "` parameter to print on the same line with a space, mimicking Java's `System.out.print`.
- The `for` loop uses Python's `range()` function to iterate over the sequence of numbers.
- The translated code lacks type declarations and a `main` method structure; as a script-based language, Python executes the provided code directly.
- Python doesn't require explicit semicolons at the end of each statement.
