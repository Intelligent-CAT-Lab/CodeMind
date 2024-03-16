Here's the Java code translated into Python:

```python
# The original code uses a Scanner to read from System.in.
# In Python, we use input() to read from standard input.

N = int(input()) + 1

# Convert the number to string to work with it as in the Java code
s = str(N)
length = len(s)
c = int(s[0])  # First digit of the number
max_value = (c - 1) + 9 * (length - 1)

print(max_value)

# Test input example
# if __name__ == "__main__":
#     assert 18 == max_value, f"Expected output is 18 but got {max_value}"
```

When you run the code in a Python environment, it will expect an integer input from the user. After inputting `100` and executing it, you should obtain the output `18`. 

The assertion at the bottom is commented out, but it could be used if we were running the test within a script and wanted to validate the output automatically. You would need to set `N` explicitly in the code before running the assertion in that case.
