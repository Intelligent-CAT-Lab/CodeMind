Here is the Python equivalent of the Java code:

```python
x = int(input())
i = 1
while i * (i + 1) // 2 < x:
    i += 1
print(i)
```

In this Python code, we use the `input()` function to get the input from the user, convert it to an integer using `int()`, and assign it to the variable `x`. We then initialize `i` to 1.

We use a `while` loop to keep incrementing `i` until `i * (i + 1) // 2` is less than `x`. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java.

Finally, we print the value of `i` using the `print()` function.
