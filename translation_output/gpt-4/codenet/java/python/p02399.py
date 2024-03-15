Here's the translated code from Java to Python:

```python
# We don't need to import any scanner, as Python has built-in input functionality.

a = int(input())
b = int(input())

d = a // b  # Integer division
r = a % b
f = f"{a / b:.5f}"  # Floating-point division formatted to 5 decimal places

print(f"{d} {r} {f}")
```

This Python script does not explicitly close the standard input like in the Java code, since Python automatically handles resource cleanup for file handles and standard input/output streams when the script ends or when the objects are garbage collected.
