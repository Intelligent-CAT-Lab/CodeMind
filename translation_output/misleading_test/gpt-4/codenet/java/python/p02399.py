Here's the Python translation of the provided Java code. Note that the format for the input and printing results is a little different in Python.

```python
# Test input from user
a, b = map(int, input().split())

d = a // b
r = a % b
f = "{:.5f}".format(a/b)

print(f"{d} {r} {f}")
```

You can use this Python code to perform the same functionality as the Java code for the given test case. Running the code with input `3 2` should produce the output `1 1 1.50000`.
