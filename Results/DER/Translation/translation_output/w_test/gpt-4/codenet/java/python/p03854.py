Below is the Python version of the Java code you provided:

```python
def check_string(S):
    S = S.replace("eraser", "")
    S = S.replace("erase", "")
    S = S.replace("dreamer", "")
    S = S.replace("dream", "")
    if len(S) == 0:
        return "YES"
    else:
        return "NO"

# Test case
input_string = "erasedream"
print(check_string(input_string))
```

This Python code defines a function `check_string(S)` that takes a string `S` and performs the same steps as the original Java code provided, returning "YES" if the resulting string is empty, or "NO" otherwise.

Please note that the Python `str.replace` function doesn't modify the original string (since strings in Python are immutable) but instead returns a new string with the specified replacements. Hence, there's no need for the "-"'s as placeholders.

The test case calls the function with the provided input string and prints the result.
