Here is the Python equivalent of the Java code:

```python
def to_string(x):
    return bin(x)[2:].zfill(32)

a, b = map(int, input().split())
print(int(to_string(a & b), 2))
print(int(to_string(a | b), 2))
print(int(to_string(a ^ b), 2))
```

This Python code does the same thing as the Java code. It reads two integers from the user, converts them to binary strings, performs the bitwise operations, and then converts the results back to integers. The `zfill(32)` function is used to ensure that the binary strings are 32 characters long, padding with zeros if necessary. The `bin()` function is used to convert an integer to a binary string, and the `int()` function is used to convert a binary string back to an integer.
