Here's the equivalent Python code using the built-in `min` and `max` functions:

```python
a = int(input())
b = int(input())
c = int(input())
min_value = min(a, b)
max_value = max(a, b)
print(f"{min(min_value, c)} {max(max_value, c)}")
``` 

Note that in Python, `input()` reads a string, so we need to convert it to an integer with `int()`. Additionally, the `print` statement has been adapted to Python syntax.
