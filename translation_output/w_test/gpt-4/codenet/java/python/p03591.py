Here is the Python version of the provided Java code:

```python
# Your sample test case is provided below:
# Test input: YAKINIKU
# Expected output: Yes

s = input().strip()

if len(s) < 4:
    print("No")
else:
    s2 = s[:4]
    if s2 == "YAKI":
        print("Yes")
    else:
        print("No")
```

This Python code performs the same function as the Java code: It reads a string from the user, checks if the first four characters equal "YAKI", and prints "Yes" if they do or "No" if they don't. Note that the `strip()` method is used when taking input to ensure any leading or trailing whitespace is removed, which is a common practice in Python when reading strings.
