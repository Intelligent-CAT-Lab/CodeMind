Here's the translated Python code, which behaves in the same way as the Java code:

```python
s = input()

for i in range(len(s)):
    print("x", end="")

```

Note that Python's `print` function by default ends with a newline. To mimic Java's `System.out.print`, the `end` argument needs to be set to an empty string to prevent the addition of a newline after each print statement.
