Below is the translated Python code. The Python code will follow a similar logic but uses Python's concise syntax and built-in functions.

```python
def solve(s):
    from_index = s.find('A')
    to_index = s.rfind('Z')
    return to_index - from_index + 1

# Test input
test_input = "QWERTYASDFZXCV"
# Expected output: 5

print(solve(test_input))
```

This code snippet defines a function `solve` that takes a string `s` and calculates the length of the substring from the first occurrence of 'A' to the last occurrence of 'Z'. The Python `find` method is used to find the first index of 'A', while `rfind` locates the last index of 'Z'. It returns the length of the substring by subtracting the indices and adding 1, just like in the Java code. The test input and expected output remain the same, and we test the function with a print statement.
