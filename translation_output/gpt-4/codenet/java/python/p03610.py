Sure, here is the equivalent code in Python:

```python
s = input()
array = list(s)

for i in range(0, len(s), 2):
    print(array[i], end='')

# Adding an extra newline at the end to match Java's default behavior
print()
```

Note that in Python, when we use the `input()` function, it returns the entire input line as a string, so there is no need for a `Scanner` like in Java. Also, the `split("")` operation in Java corresponds to converting the string into a list of characters in Python, which can be done with `list(s)`. Lastly, `print` without an ending newline is achieved with `print(value, end='')`, which avoids adding a new line after the output.
