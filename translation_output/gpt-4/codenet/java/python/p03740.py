Here's the equivalent Python code using the `input` function for reading from standard input. In Python, exception handling is done with `try` and `except` blocks:

```python
try:
    x, y = map(int, input().split())
    print("Brown" if abs(x - y) <= 1 else "Alice")
except Exception as e:
    print(e)
``` 

Note that Python doesn't require an explicit import for the `abs` function, as it's built-in. Also, the `Scanner` from Java is replaced by the `input` function in Python, and I use `map` to convert the input strings to integers simultaneously. The ternary operator `(condition ? true_value : false_value)` from Java is translated to the inline if-else in Python `(true_value if condition else false_value)`. Also, there's no need to create a class or define a `main` function for this snippet to work in a scripting context.
