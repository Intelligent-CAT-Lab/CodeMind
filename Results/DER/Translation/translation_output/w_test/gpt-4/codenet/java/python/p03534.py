The following Python code performs the same logic as the Java code provided:

```python
def check_string(str):
    abc = [0, 0, 0]
    for i in str:
        if i in "abc":
            abc[ord(i) - ord('a')] += 1

    abc.sort()

    return "YES" if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2) else "NO"

# Test input
input_str = "abac"
# Expected output
print(check_string(input_str))
```

In Python, we don't need a separate Scanner object for input purposes as in Java; we can simply use `input()` for user input. In the above conversion, I abstracted the original code's logic into the `check_string` function and then tested it with the provided test input.
