Here's the translated Python code for the given Java code:

```python
# Read the string from user input
s = input()

# Using list slicing to get every second character
result = s[::2]

# Print the result
print(result)

# Test the function with the provided test case
if __name__ == "__main__":
    test_input = "atcoder"
    expected_output = "acdro"
    assert result == expected_output, f"Test failed: expected {expected_output}, got {result}"
    print("Test passed!")
```

In Python, we can achieve the behavior of the Java code by utilizing slicing. The `s[::2]` notation means we start at the beginning of the string (`0` index by default), go to the end (default when no end index is specified), and use a step of `2`, grabbing every second character. Also, Python does not require explicit import of a Scanner or other class to read from standard input, as it provides the built-in `input()` function.
